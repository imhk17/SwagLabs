package com.ds.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;


import com.ds.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test execution started :- " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test execution successful :- " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test execution failed :- " + result.getName());
		
		logger.info("Screenshot Captured");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test execution skipped :- " + result.getName());
	}
	
	

}
