package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By Classes=By.cssSelector("a[href='https://courses.rahulshettyacademy.com/courses']");
	By Author=By.className("filter-label");

	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement classes()
	{
		return driver.findElement(Classes);
	}
	
	public WebElement author()
	{
		return driver.findElement(Author);
	}

}


