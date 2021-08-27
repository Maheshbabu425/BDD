package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//java//Features",
		glue="StepDefinitions"
		)
			

public class TestRunner {

}
