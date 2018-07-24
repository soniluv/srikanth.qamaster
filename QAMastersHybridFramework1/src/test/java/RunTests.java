import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by madduris on 29/06/2018.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/automationPractice/features/", plugin = "json:target/cucumberreport.json",
        tags = {"@validLogin,@basket"})
public class RunTests {

}
