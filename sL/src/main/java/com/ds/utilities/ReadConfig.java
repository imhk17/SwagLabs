package com.ds.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		String path = "C:\\Users\\91898\\eclipse-workspace\\DalalStreetProject\\src\\test\\resources\\configs\\Config.properties";
	
		
		try 
		{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public String getApplicationUrl()
	{
		return pro.getProperty("url");
	}
	public String getEmailAddress()
	{
		return pro.getProperty("email");
	}
	public String getPassword()
	{
		return pro.getProperty("password");
	}
}
