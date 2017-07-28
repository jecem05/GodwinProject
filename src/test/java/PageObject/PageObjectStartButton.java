package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Util.BrowserSetUp;

//Examples here for page object
public class PageObjectStartButton {
	WebDriver driver;

	public PageObjectStartButton() {
		this.driver = BrowserSetUp.driver;
	}

	By Start_Button = By.cssSelector(".button");

	public void click_start_button() {
		driver.findElement(Start_Button).click();
	}

}
