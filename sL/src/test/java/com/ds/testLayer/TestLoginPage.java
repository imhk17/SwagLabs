package com.ds.testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.ds.pageLayer.LoginPage;
import com.ds.testBase.TestBase;

public class TestLoginPage extends TestBase {
	
	public static WebDriver driver;

	
	
		
		@Test
		public void validLoginCheck() throws InterruptedException {
			
		LoginPage loginPage_obj = new LoginPage(driver);
		loginPage_obj.enterUsername("standard_user");
		loginPage_obj.enterPassword("secret_sauce");
		loginPage_obj.clickOnLoginBtn();
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		Thread.sleep(3000);
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
		}
	

}
