package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class LoginTest extends BaseClass
{
	
	// txt,properties - no dependency
	// xml,json,excel,opencsv,yml - dependency
	
	@Test(description = "This test will verify valid login scenario")
	public void validLoginTest()
	{
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		
		driver.findElement(By.className("submit-btn")).click();
		
		Assert.assertTrue(driver.findElement(By.className("welcomeMessage")).isDisplayed());
		
		
	}

}
