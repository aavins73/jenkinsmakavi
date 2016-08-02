package sanity;

import org.testng.annotations.Test;

import basepkg.BaseTest;

public class FBClass {
  @Test
  public void launchFB() {
	  BaseTest baseTest = new BaseTest();
	  baseTest.lunch("https://www.facebook.com");
	  System.out.println("FB launched");
  }
}
