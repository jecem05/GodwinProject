package PageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.BrowserSetUp;

//Examples for page factory
public class RegNumberPage extends BrowserSetUp {

	public RegNumberPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Vrm")
	WebElement Reg_no_textfield;

	@FindBy(name = "Continue")
	WebElement Continue_Button;

	@FindBy(css = ".reg-mark")
	WebElement Displayed_registration;

	public void baseurl() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.gov.uk/get-vehicle-information-from-dvla");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void reg_textfield(String value) {
		Reg_no_textfield.sendKeys(value);
	}

	public void click_continue_button() {
		Continue_Button.click();
	}

	public void confirm_displayed_reg(String actual_text, String expected_text) throws Exception {
		String Actual_text = Displayed_registration.getText();
		String Expected_text = expected_text;
		Assert.assertEquals(Actual_text, Expected_text);
	}

}
