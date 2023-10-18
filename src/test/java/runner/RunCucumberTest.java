package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepsdef"},
        plugin = {"pretty", "html:target/cucumber-html-report.html"},
        tags = "@login1"
)
@Test
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}
