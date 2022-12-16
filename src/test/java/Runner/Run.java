package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/firstTest.feature",
        glue = "stepDefinitions",
        dryRun = false
)
public class Run extends AbstractTestNGCucumberTests {
}
