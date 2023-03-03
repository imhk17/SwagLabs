package com.ds.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;




import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;

	
	@BeforeTest
	public void start() 
	{
		logger = Logger.getLogger("SwagLabs Framework Started");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Framework Execution Started");
	}
		
	@AfterTest
	public void end()
	{
		logger.info("Framework Execution Stopped");
	}
	
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br)
	{
		 	if (br.equalsIgnoreCase("chrome"))
		 	{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		 	}
		
			else if(br.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
		  		driver= new FirefoxDriver();
			}
			else if(br.equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
		  		driver= new FirefoxDriver();
			}
			else
			{
				System.out.println("Please provide correct browser name");
			}
		 	
		 	
		 
		}
		
		@AfterMethod
		public void browserClose() 
		{
			driver.quit();
		}
			}

