package com.Runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class) 
@CucumberOptions(features = "src\\test\\java\\com\\feature\\featurefile.feature",glue = "com.stepdefinition")


public class RunnersClass extends BaseClass {
	
	@BeforeClass
	public static void setup()
	{
		browser("edge");
	}
	
	
/*	public static void teardown()
	{
		close();
	}
*/
}
