package com.jep;

import org.testng.annotations.Test;

public class TestExample1 {
	
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("Test1 from class 1");
	}
	
	@Test
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
