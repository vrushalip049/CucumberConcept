package Background;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Admin\\eclipse-Automationworkspace\\CuccumberOrangeHRMProjectFramework\\src\\main\\java\\Background\\FeatureFile.feature"
		,glue={"Background"}
		, dryRun = false
		)

public class TestRunner {

}