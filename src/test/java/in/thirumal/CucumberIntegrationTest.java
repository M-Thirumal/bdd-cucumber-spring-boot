/**
 * 
 */
package in.thirumal;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Thirumal
 *
 */
@RunWith(Cucumber.class)
//@CucumberContextConfiguration
//@SpringBootTest(classes = { BddCucumberSpringBootApplication.class,
//		CucumberIntegrationTest.class }, webEnvironment = WebEnvironment.DEFINED_PORT)
@CucumberOptions(plugin = { "pretty" }, features = "src/test/resources")
public class CucumberIntegrationTest extends SpringIntegrationTest {

}
