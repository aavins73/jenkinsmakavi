package sanity;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import basepkg.BaseTest;

public class FBClass {
  @Test
  public void launchFB() {
	  BaseTest baseTest = new BaseTest();
	  try {
		baseTest.lunch("https://www.facebook.com");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("FB launched");
	  baseTest.quit();
  }
}
