package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class steps {
    @Given("User is on login Page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("User enters valid username and Password")
    public void user_enters_valid_username_and_password() {
        System.out.println("User entered valid UserName and Password");
    }

    @When("Clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Clicked on login button");
    }

    @Then("User successfully logs in")
    public void user_successfully_logs_in() {
        System.out.println("User successfully logged in");
    }
}
