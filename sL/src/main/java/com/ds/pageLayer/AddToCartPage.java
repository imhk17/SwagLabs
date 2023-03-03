package com.ds.pageLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ds.testBase.TestBase;

public class AddToCartPage extends TestBase{
	
	public AddToCartPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
	WebElement sauceLabsBackpackProduct;
	
	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']")
	WebElement sauceLabsBikeLightProduct;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement sauceLabsBackpackAddToCartBtn;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement sauceLabsBikeLightAddToCartBtn;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	
	public void clickOnSauceLabsBackpackAddToCartBtn()
	{
		try{
			sauceLabsBackpackAddToCartBtn.click();
		}
		catch(Exception e) {
			
		}
		
	}
	
	public void clickOnsauceLabsBikeLightAddToCartBtn(String loginpassword)
	{
		try{
			sauceLabsBikeLightAddToCartBtn.click();
		}
		catch(Exception e) {
			
		}
		
	}
	
	public void clickOnSauceLabsBackpackProductBtn()
	{
		try{
			sauceLabsBackpackProduct.click();
		}
		catch(Exception e) {
			
		}
		
	}
	
	public void clickOnsauceLabsBikeLightProductBtn()
	{
		try{
			sauceLabsBikeLightProduct.click();
		}
		catch(Exception e) {
			
		}
		
	}
	
	

}
