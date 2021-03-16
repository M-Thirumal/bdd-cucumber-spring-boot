package in.thirumal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.springframework.http.HttpStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs extends SpringIntegrationTest {
	
	@Given(value = "^I want to write a step with precondition$")
	public void given() throws Throwable {
		System.out.println("I want to write a step with precondition");
	}

	@When(value = "^the client calls /hello$")
    public void the_client_issues_GET_version() throws Throwable {
        executeGet("http://localhost:8080/hell");
    }
	
	@Then(value = "^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " + latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    }
	
	@Then(value = "^the client receives string Hello World$")
	public void the_client_receives_string_Hello_World() throws Throwable {
		System.out.println("Received Hello World");
	}
	
}
