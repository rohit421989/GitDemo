package com.framework.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
	
@Test

public void test1() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.quit();
	
}


@Test

public void test2() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.quit();
	
}


}
