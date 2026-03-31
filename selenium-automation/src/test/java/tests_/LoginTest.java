package tests_;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.Log;

public class LoginTest extends BaseTest {

	@Test
	public void testValidLogin() {

		Log.info("Starting login test...");
		test = ExtentReportManager.createTest("Login Test");

		test.info("Navigating to URL...test...");
		LoginPage loginpage = new LoginPage(driver);

		Log.info("Adding Credentials...");
		test.info("Adding Credential...test...");
		loginpage.enterUsername("standard_user");
		loginpage.enterPassword("secret_sauce");

		test.info("Clicking on Login button...test...");
		loginpage.clickLogin();

		System.out.println("Page title is: " + driver.getTitle());

		Log.info("Verifying page title");

		test.info("Verifying page title ...test...");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");

		test.pass("Login Successful");

	}

	@Test
	public void testWithInvalidTitle() {

		Log.info("Starting login test...");
		test = ExtentReportManager.createTest("Login Test with wrong title information");

		test.info("Navigating to URL...test...");
		LoginPage loginpage = new LoginPage(driver);

		Log.info("Adding Credentials...");
		test.info("Adding Credential...test...");
		loginpage.enterUsername("standard_user");
		loginpage.enterPassword("secret_sauce");

		test.info("Clicking on Login button...test...");
		loginpage.clickLogin();

		System.out.println("Page title is: " + driver.getTitle());

		Log.info("Verifying page title");

		test.info("Verifying page title ...test...");
		Assert.assertEquals(driver.getTitle(), "Swag Labs 776");

		test.pass("Login Successful");

	}

}
