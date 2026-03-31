package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
	
	private WebDriver driver;
	
	private By usernameTextBox = By.name("user-name");
	private By passwordTextBox = By.id("password");
	private By loginButton = By.xpath("//*[@id=\"login-button\"]");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	@Test
	public void enterUsername(String username)
	{	
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}

	public void enterPassword(String password)
	{
		driver.findElement(passwordTextBox).clear();
		driver.findElement(passwordTextBox).sendKeys(password);
		
	}
	
	public void clickLogin()
	{
		
		driver.findElement(loginButton).click();
	}
	
	
	
}
