package com.jep;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class TestListtner implements ITestListener {
	
	@Override  
	public void onTestStart(ITestResult result) {  
	System.out.println("Test Start");
	}  
	  
	@Override  
	public void onTestSuccess(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("On test Sucess  : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailure(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("On test Failed  : "+result.getName());  
	}  
	  
	@Override  
	public void onTestSkipped(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("On test Skipped : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("onTestFailedButWithinSuccessPercentage : "+result.getName());  
	}  
	  
	@Override  
	public void onStart(ITestContext context) {  
	System.out.println("on start "); 
	}  
	  
	@Override  
	public void onFinish(ITestContext context) {  
	System.out.println("on Finish");
	}  

}
