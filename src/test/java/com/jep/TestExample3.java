package com.jep;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestExample3 {
	@Test(dataProvider="getData")
	public void scenario(String uname, String pwd)
	{
		System.out.println(uname+";"+pwd);
		
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj= new Object[2][2];
		obj[0][0]="test1";
		obj[0][1]="test2";
		obj[1][0]="test3";		
		obj[1][1]="test4";
		return obj;
	}
}
