package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By usernameTextBox = By.name("user-name");
	private By passwordTextBox = By.id("password");
	private By loginButton = By.xpath("//*[@id=\"login-button\"]");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void enterUsername(String username)
	{	
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
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
