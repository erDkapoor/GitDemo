package Automation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import junit.framework.Assert;
import pageObject.LandingPage;

public class HomePage extends base{
public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initiate() throws IOException {
		log.info("hi");
		driver=initiateDriver();
		driver.get("https://www.rahulshettyacademy.com");
	}
	
	@Test(dataProvider="getData")
	public void homePageNavigation(String email, int password) throws IOException
	{
		log.info("new testkjhjhj");
		LandingPage lp =new LandingPage(driver);
		lp.classes().click();
		System.out.println(email);
		System.out.println(password);
		
		Assert.assertEquals("Author", lp.author().getText());
	
		
	}

	@AfterTest
	public void ending() throws IOException {
		driver.close();
		log.info("hu");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[2][2];
		
		data[0][0]="abc";
		data[0][1]=1;
		
		data[1][0]="xyz";
		data[1][1]=2;
		
		return data;
				
		
	}
}
