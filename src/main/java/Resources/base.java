package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
public WebDriver driver;
	
	public WebDriver initiateDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\deepak.kapoor\\eclipse-workspace\\E2EProject\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\deepak.kapoor\\chromedriver_win32\\chromedriver.exe" );
			driver = new ChromeDriver();
		}
		else
		{
			
		}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

}

	
}
