package basepkg;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTest {
	 DesiredCapabilities dr = new DesiredCapabilities();
	 WebDriver driver;
	public void lunch(String url) throws MalformedURLException
	{
		
		URL url1 = null;
		try {
			url1 = new URL("http://192.168.1.2:4444/wd/hub");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	System.setProperty("webdriver.chrome.driver","D:/Sele_Drivers/chromedriver.exe");
	 dr = DesiredCapabilities.chrome();
	driver = new RemoteWebDriver(url1,dr);
	//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dr);
	driver.manage().window().maximize();
	driver.get(url);
	}
	
	public void quit(){
		driver.quit();
	}
}
