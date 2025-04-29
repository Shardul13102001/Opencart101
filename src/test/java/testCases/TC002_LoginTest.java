package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test (groups = {"Sanity","Master"})
	public void verify_login() {
		logger.info("****** Starting TC002_LoginTest ******");

		try {
			// Home Page
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			// Login Page
			LoginPage lp = new LoginPage(driver);
			logger.info("Provide Login credentioals");
			lp.setEmail(p.getProperty("email")); // Email from properties file
			lp.setPassword(p.getProperty("password")); // Password from properties file
			lp.clickLogin();

			// My Account Page
			logger.info("Move to login page");
			MyAccountPage macc = new MyAccountPage(driver);
			boolean targetPage = macc.isMyAccountPageExists();

			Assert.assertTrue(targetPage, "Login failed - My Account page not displayed");
			logger.info("****** Login Successful ******");
			
		} catch (Exception e) {
			logger.error("Login test failed due to exception: " + e.getMessage());
			Assert.fail();
		}

		logger.info("****** Finished TC002_LoginTest ******");
	}
}
