package org.stepdefinition;

import org.junit.Assert;
import org.pom.ObjectRepository;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	ObjectRepository o;

	@Given("User need to be in facebook login page")
	public void user_need_to_be_in_facebook_login_page() {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maximizeWindow();
	}

	@When("User need to enter username and password")
	public void user_need_to_enter_username_and_password() {
		o = new ObjectRepository();

		fillText(o.getTypeEmail(), "abuthurab@gamil");
		fillText(o.getTypepassword(), "abuthurab33");
		System.out.println("Success");

	}

	@When("user need to click login button")
	public void user_need_to_click_login_button() {
		o = new ObjectRepository();
		click(o.getClick());

	}

	@Then("User need to get valid message for invalid credentials")
	public void user_need_to_get_valid_message_for_invalid_credentials() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Is invalid", url.contains("privacy_mutation_token"));

	}

}
