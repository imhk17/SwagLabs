package com.ds.pageLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ds.testBase.TestBase;

public class CheckoutPage extends TestBase{
	
	public CheckoutPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement continueShoppingBtn;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement checkoutBtn;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	
	public void clickOncontinueShoppingBtn()
	{
		try{
			continueShoppingBtn.click();
		}
		catch(Exception e) {
			
		}
	
	}
	
	public void clickOncheckoutBtn()
	{
		try{
			checkoutBtn.click();
		}
		catch(Exception e) {
			
		}
	
	}
	
	

}
