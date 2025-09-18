package firstproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fisrstclass {
	
WebDriver driver = new EdgeDriver();
	
	
	@BeforeTest
	public void Mysetup  () {
		
		driver.get("https://www.saucedemo.com/");
		
		
		}
	
	@Test
	public void MyFirstTest () {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
	}
			}



/*
 * 
 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	//	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
//shopping_cart_link
	
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		//first-name
		driver.findElement(By.id("first-name")).sendKeys("esraa");
		driver.findElement(By.id("last-name")).sendKeys("Allidawi");
		//postal-code

		driver.findElement(By.id("postal-code")).sendKeys("0000");
		//continue
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
 */
