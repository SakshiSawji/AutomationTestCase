package com.tka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage {

	@Test
	public void TestMainHeading() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String ActResult = driver.findElement(By.xpath("/html/body/div/div/h1")).getText();
		System.out.println(ActResult);
		String ExpResult = "Welcome here";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test
	public void TestTitle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		String ExpResult = "Loign to TKA";
		driver.close();
		Assert.assertEquals(ActTitle, ExpResult);
	}

	@Test
	public void TestValidLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
		String ExpResult = "Admin Panel";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 6)
	public void TestWrongUsername() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Invalid username or password";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 7)
	public void TestInvalidPassword() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Login invalid";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 8)
	public void TestBlankUsername() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Login invalid";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 9)
	public void TestBlankPassword() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Login invalid";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 10)
	public void TestBlankUsernamePassword() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Login invalid";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 11)
	public void TestWrongUsernamePassword() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("&832");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("#2!8");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
		String ExpResult = "Login invalid";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 12)
	public void TestAdminPanel() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
		String ExpResult = "Get Text succesfuly";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 13)
	public void TestAddcategory() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"category-name\"]")).sendKeys("English");
		driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();
		String ActResult = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[3]/td[2]")).getText();
		String ExpResult = "English";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 14)
	public void TestAddcategory2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"add-category\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"category-name\"]")).sendKeys("Biology");
		driver.findElement(By.xpath("//*[@id=\"category-form\"]/div/button[1]")).click();
		String ActResult = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[3]/td[2]")).getText();
		String ExpResult = "Biology";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 15)
	public void TestAddSubcategory() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"subcategory-name\"]")).sendKeys("Health Awareness");
		driver.findElement(By.xpath("//*[@id=\"subcategory-form\"]/div/button[1]")).click();

		String ActResult = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[3]/td[2]")).getText();
		String ExpResult = "Login Succesfully";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 16)
	public void TestAddSubcategory2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"subcategory-name\"]")).sendKeys("Sports");
		driver.findElement(By.xpath("//*[@id=\"subcategory-form\"]/div/button[1]")).click();

		String ActResult = driver.findElement(By.xpath("//*[@id=\"subcategories-table\"]/tbody/tr[3]/td[2]")).getText();
		String ExpResult = "Login Succesfully";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 17)
	public void TestAddSubcategory3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"subcategory-name\"]")).sendKeys("Research Methodology");
		driver.findElement(By.xpath("//*[@id=\"subcategory-form\"]/div/button[1]")).click();

		String ActResult = driver.findElement(By.xpath("//*[@id=\"subcategories-table\"]/tbody/tr[3]/td[2]")).getText();
		String ExpResult = "Research Methodology";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 18)
	public void TestLogoHeading() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("/html/body/header/div/img")).getText();
		String ExpResult = "Login Succesfully";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 19)
	public void TestDelete() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr/td[5]/button[2]"))
				.getText();
		String ExpResult = "Delete Succesfully";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}

	@Test(priority = 20)
	public void TestLogout() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String ActResult = driver.findElement(By.xpath("/html/body/header/nav/a[3]")).getText();
		String ExpResult = "Logout Succesfully";
		driver.close();
		Assert.assertEquals(ActResult, ExpResult);
	}
}