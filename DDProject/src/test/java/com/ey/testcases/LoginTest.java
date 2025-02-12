package com.ey.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ey.base.TestBase;

public class LoginTest extends TestBase{
	
	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		driver.findElement(By.cssSelector(OR.getProperty("bml_Btn"))).click();
		Thread.sleep(1000);
	}

}
