package com.jep;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExample2 {
	@Parameters({"QA1_Config","Browser"})
	@BeforeSuite
	public void test1(String config, String  browser)
	{
		if("CHROME".equals(browser))
		{
			WebDriver drive= new FirefoxDriver();
		}
		System.out.println("BeforeSuit");
	}
	@BeforeTest
	public void test2()
	{
		System.out.println("before Test");
	}
	@BeforeClass
	public void test3()
	{
		System.out.println("before Class");
	}
	@BeforeMethod
	public void test4()
	{
		System.out.println("before Method");
	}
	@Test
	public void test5()
	{
		System.out.println("Test Case 1");
	}
	@Test
	public void test6()
	{
		System.out.println("Test Case 2");
	}
	@AfterMethod
	public void test7()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void test8()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void test9()
	{
		System.out.println("After test");
	}
	@AfterSuite
	public void test10()
	{
		System.out.println("After Suit");
	}
	
	
	
	
	

}
