package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.get("https://www.saucedemo.com");
		
		String pTitle = driver.getTitle();
		
		System.out.println("Page title is: " + pTitle );
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
		
		System.out.println("Text from LogninButton is: " + LoginButton.getAccessibleName());
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		
		
		//driver.close();
		driver.quit();
	}

}
