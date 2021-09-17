
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "json:build/reports.json"},
        features = "src/test/resources/smoke.feature",
        glue = "stepdefinitions"
)
public class RunnerTests {
}