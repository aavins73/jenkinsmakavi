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
	public void lunch(String url) 
	{
		
	System.setProperty("webdriver.chrome.driver","D:/Sele_Drivers/chromedriver.exe");
	 dr = DesiredCapabilities.chrome();
	//WebDriver driver = new ChromeDriver();
	try {
		driver = new RemoteWebDriver(new URL("http://192.168.1.3"),dr);
		//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dr);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.manage().window().maximize();
	driver.get(url);
	}
	
	public void quit(){
		driver.quit();
	}
}
