package com.speed;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.speedtest.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div/div[2]/div[3]/div[1]/a/span[4]")).click();
		

	}

}
