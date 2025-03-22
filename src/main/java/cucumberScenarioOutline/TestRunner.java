package cucumberScenarioOutline;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Admin\\eclipse-Automationworkspace\\CuccumberOrangeHRMProjectFramework\\src\\main\\java\\cucumberScenarioOutline\\outline.feature"
		,glue={"cucumberScenarioOutline"}
		, dryRun = false
				 ,plugin= {"pretty","junit:Folder name/report/cucumber.xml"})
		

public class TestRunner {

}