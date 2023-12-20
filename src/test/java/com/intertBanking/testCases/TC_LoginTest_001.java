package com.intertBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inertBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass1 {
	@Test
	public void logintest() {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);

		logger.info("User name entered");
		lp.setPassword(password);

		logger.info("Password entered");
		lp.clickBtn();

		if (driver.getTitle().equals("Guru9 Bank Manager HomePage")) {
			Assert.assertTrue(true);

			logger.info("Loggin test passed");

		} else {
			Assert.assertTrue(false);

			logger.info("Loggin test failed");
		}

	}

}
