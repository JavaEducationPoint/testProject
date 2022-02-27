package com.jep;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample6 {
	
	public static Logger logger;
	@BeforeClass
	public void setup()
	{
		logger=Logger.getLogger(TestExample6.class);
		/*
		 * Layout layout= new PatternLayout("%d{yyyy-MM} %p  %C %m %n"); Appender ap=new
		 * ConsoleAppender(layout); logger.addAppender(ap);
		 */
	}
	
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("Test1 from class 1");
		logger.info("Info Message");
		logger.debug("Debug");
		logger.error("Error");
		logger.warn("Warning");
	}

}
