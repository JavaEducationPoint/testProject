package com.jep;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestExample4 {
	@Parameters({"QA1_Config"})
	@Test(groups= {"sanity"})
	public void test1(String config)
	{
		System.out.println("Test1 from class 1"+config);
	}
	
	@Test(groups= {"sanity"})
	public void test2()
	{
		System.out.println("Test2 from class 1");
	}
	@Test
	public void show()
	{
		System.out.println("Test3 from class 1");
	}

}
