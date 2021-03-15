package in.thirumal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.springframework.http.HttpStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs extends SpringIntegrationTest {

	@When("^the client calls /hello$")
    public void the_client_issues_GET_version() throws Throwable {
        executeGet("http://localhost:8080/hello");
    }
	
	@Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " + latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    }
	
}
