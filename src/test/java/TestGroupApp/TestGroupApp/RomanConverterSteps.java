package TestGroupApp.TestGroupApp;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RomanConverterSteps {
	@Given("^I have number (\\d+)$")
	public void i_have_number(int arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^I convert$")
	public void i_convert() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^I should get \"([^\"]*)\"$")
	public void i_should_get(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
}
