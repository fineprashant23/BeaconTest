package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "resources/features/test.feature",
 glue={"stepDefs"},
 format={"pretty","html:test-output"}
 )

public class TestRunner {

}
