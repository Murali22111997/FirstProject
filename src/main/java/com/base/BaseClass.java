package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static  WebDriver driver;
	
	public static void browser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("ie"))
		{	
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		}
		
		if(browsername.equalsIgnoreCase("firefox"))
		{	
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		
		if(browsername.equalsIgnoreCase("edge"))
		{	
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
	}
	
	public static void close()
	{
		driver.close();
	}
	
	public static void quit()
	{
		driver.quit();
	}

	public static void navigateto(String Url)
	{
		driver.navigate().to(Url);
	}
	
	public static void navigateback()
	{
		driver.navigate().back();
	}
	
	public static void navigateforward()
	{
		driver.navigate().forward();
	}
	
	public static void Navigaterefresh()
	{
		driver.navigate().refresh();
	}
	
	public static void geturl(String url)
	{
		driver.get(url);
	}
	public static void  maximise()
	{
		driver.manage().window().maximize();
	}
	
}

























