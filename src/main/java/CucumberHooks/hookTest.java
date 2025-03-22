package CucumberHooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class hookTest {
	   WebDriver driver = null; 
		
	   @Before public void setUp(){ 
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			 driver = new ChromeDriver(); 
			driver.manage().window().maximize();
	   } 
		
	   @Given("^user navigates to facebook$") 
	   public void goToFacebook() { 
	      driver.navigate().to("https://www.facebook.com/");
	   } 
		
	   @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
	   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
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
		
	   @After public void cleanUp(){ 
	      driver.close(); 
	   } 
	}

	/*
	 * Cucumber hook allows us to better manage the code workflow and helps us to
	 * reduce the code redundancy. We can say that it is an unseen step, which
	 * allows us to perform our scenarios or tests.
	 */


	/*
	 * So to bring optimization, hooks can be utilized. More often we use two types
	 * of hooks: “Before” hook and “After” hook. Method/function/piece of code,
	 * defined within Before and After hooks, always run, even if the scenario gets
	 * passed or failed.
	 */


	/*
	 * As the name suggests, before hook gets executed well before any other test
	 * scenarios, and after hook gets executed after executing all the scenarios.
	 */

	/* Hooks are defined within the step definition file only. */