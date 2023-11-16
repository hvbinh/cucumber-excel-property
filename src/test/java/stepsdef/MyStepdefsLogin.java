package stepsdef;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefsLogin {
    @Given("i naviagete to {string}")
    public void iNaviageteTo(String arg0) {

    }

    @When("i input to username textbox with value {string}")
    public void iInputToUsernameTextboxWithValue(String arg0) {
    }

    @And("i input to password textbox with value {string}")
    public void iInputToPasswordTextboxWithValue(String arg0) {
    }

    @And("i click to Login button")
    public void iClickToLoginButton() {
    }

    @Then("the system navigate to Home page")
    public void theSystemNavigateToHomePage() {
    }
}
