package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetUp {

	public static WebDriver driver;

	public void set_driver(String browser) {
		if (driver == null) {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\DVLA\\DVLA\\src\\test\\java\\Driver_exe\\geckodriver.exe");
				driver = new FirefoxDriver();

			}
		}
	}

	public void closebrowser() {
		driver.quit();
		driver = null;
	}
}
