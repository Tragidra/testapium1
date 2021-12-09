package example;
import io.cucumber.java.Before;
import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
        features = "src/test/resources",
        glue = "steps",
        tags = "@naselenide"
)
public class MainTest {
    @BeforeClass
    static public void setupTime() {
        Configuration.headless = true;
    }
}
