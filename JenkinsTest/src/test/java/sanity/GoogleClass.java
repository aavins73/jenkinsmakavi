package sanity;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import basepkg.BaseTest;

public class GoogleClass {
  @Test
  public void launchGoogle() {
	  BaseTest baseTest = new BaseTest();
	  try {
		baseTest.lunch("https://www.google.com");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("Google launched");
	  baseTest.quit();
  }
}
