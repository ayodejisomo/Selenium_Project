package tests_;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void testValidLogin() {
		
		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.enterUsername("standard_user");
		loginpage.enterPassword("secret_sauce");
		loginpage.clickLogin();
		
		System.out.println("Page title is: " + driver.getTitle() );
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
				
	}
	

}
