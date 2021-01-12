package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//rahulonlinetutor@gmail.com
public class portalHomePage {

	public WebDriver driver;

	By heading = By.xpath("//*[@id='hero']/div/h1");

	public portalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getHeading() {
		return driver.findElement(heading);

	}

}
