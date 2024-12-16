package com.tka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFlipkartPage {
	
	@Test
	public void TestWebsite() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//String ActResult = driver.findElement(By.xpath(""))
		
	}

}
