package StepDef;

import PageObject.PageObjectStartButton;
import PageObject.RegNumberPage;
import Util.BrowserSetUp;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegNumber {

	BrowserSetUp browsersetup = new BrowserSetUp();
	PageObjectStartButton homepage = new PageObjectStartButton();
	RegNumberPage reg_number_page = new RegNumberPage();

	@Before
	public void start_session() {
		browsersetup.set_driver("firefox");
	}

	@Given("^am on the \"([^\"]*)\" page$")
	public void am_on_the_page(String BaseUrl) throws Throwable {
		reg_number_page.baseurl();
	}

	@Given("^I click \"([^\"]*)\" button$")
	public void i_click_button(String button) throws Throwable {
		if (button.equalsIgnoreCase("Start")) {
			homepage = new PageObjectStartButton();
			homepage.click_start_button();
		} else {
			reg_number_page = new RegNumberPage();
			reg_number_page.click_continue_button();
		}
	}

	@When("^I Enter any \"([^\"]*)\" details as \"([^\"]*)\"$")
	public void i_Enter_any_details_as(String details, String value) throws Throwable {
		reg_number_page = new RegNumberPage();
		if (details.equalsIgnoreCase("Car registration")) {
			reg_number_page.reg_textfield(value);
		} else {
			System.out.println("details is not available");
		}
	}

	@Then("^the \"([^\"]*)\" is displayed as \"([^\"]*)\"$")
	public void the_is_displayed_as(String confirm_reg, String value) throws Throwable {
		reg_number_page = new RegNumberPage();
		if (confirm_reg.equalsIgnoreCase("Registration number")) {
			reg_number_page.confirm_displayed_reg(confirm_reg, value);
		} else {
			System.out.println("not available to confirm");
		}
	}

	@After
	public void closesession() {
		browsersetup.closebrowser();
	}
}
