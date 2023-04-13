package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features" ,
        glue = "Steps", // the name of the package where my stepDefinitions are
        dryRun=false)


public class runnerClass {

}


