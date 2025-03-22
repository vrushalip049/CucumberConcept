package cucumberScenarioOutline;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class Stepdefinition { 
   WebDriver driver = null; 
	
   @Given("^user navigates to Facebook$") 
   public void goToFacebook() { 
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		 driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		  driver.navigate().to("https://www.facebook.com/");
   } 
	
   @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) throws InterruptedException {
	   Thread.sleep(2000);
	      driver.findElement(By.id("email")).sendKeys(arg1);
	      try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      driver.findElement(By.id("pass")).sendKeys(arg2);
	      try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	      driver.findElement(By.name("login")).click(); 
   } 
	
   @Then("^login should be unsuccessful$") 
   public void validateRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
      "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
         System.out.println("Test Pass"); 
      } else { 
         System.out.println("Test Failed"); 
      } 
      
   }    
}

//Scenario outline basically replaces variable/keywords with the value from the table. Each row in the table is considered to be a scenario.

/*
 * Let’s continue with the same example of Facebook login feature. So far we
 * have been executing one scenario: Upon providing the correct user name, login
 * is successful. Now, suppose we want to check if login is successful for all
 * three possible types of inputs, which are username, email address, or phone
 * number. To achieve this, we will need to write three different scenarios,
 * where each scenario will vary with the type of input, login is successful. In
 * this case, scenarios will look like the following.
 */


/* Step result 1 to 5 will be re-executed for username2 and password2. */