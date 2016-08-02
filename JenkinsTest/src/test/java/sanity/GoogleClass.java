package sanity;

import org.testng.annotations.Test;

import basepkg.BaseTest;

public class GoogleClass {
  @Test
  public void launchGoogle() {
	  BaseTest baseTest = new BaseTest();
	  baseTest.lunch("https://www.google.com");
	  System.out.println("Google launched");
  }
}
