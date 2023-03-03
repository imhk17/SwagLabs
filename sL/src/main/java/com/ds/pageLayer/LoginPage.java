package com.ds.pageLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ds.testBase.TestBase;

public class LoginPage extends TestBase{

	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement userNameBox;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordBox;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginBtn;
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	public void enterUsername(String loginUsername)
	{
		try{
			userNameBox.sendKeys(loginUsername);
		}
		catch(Exception e) {
			
		}
		
	}
	
	public void enterPassword(String loginPassword)
	{
		try{
			passwordBox.sendKeys(loginPassword);
		}
		catch(Exception e) {
			
		}
		
	}
	
	public void clickOnLoginBtn()
	{
		try{
			loginBtn.click();
		}
		catch(Exception e) {
			
		}
		;
	}
	

}
