package Tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        monochrome = false,
        features = "C:/Users/wesle/IdeaProjects/TesteSst/src/test/resources/features/Cenarios.feature",
        glue = "Tests",
        plugin = {
                "pretty",
                "html:target/Relatorio-html.html"
        }
)
public class Runner {
}
