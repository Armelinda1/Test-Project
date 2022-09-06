package TestCases;

import Pages.NopCommercePageMain;
import Pages.RegisterPage;
import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_TestNopCommercePage extends TestBase {

    @Test
    public void tc01VerifyOpenURL() {

        test = extent.createTest("Verify URL", "Open NopCommerce page.")
                .assignCategory("Functional_testcase")
                .assignAuthor("Armelinda");
        logger.info("Verify URL");

        openURL("https://demo.nopcommerce.com/");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");
    }

    @Test
    public void verifyClickLoginButton() {

        webdriver.clickOnButton(NopCommercePageMain.loginButton);
        test.log(Status.INFO, "Click Login button.");
        logger.info("Click Login button.");

        webdriver.clickOnButton(NopCommercePageMain.registerButton);
        test.log(Status.INFO, "Click Register button.");
        logger.info("Click Register button.");

        String registerUrl = driver.getCurrentUrl();
        System.out.println(registerUrl);

        webdriver.selectValueOnRadio(RegisterPage.genderMale);
        test.log(Status.INFO, "Click Male radio button.");
        logger.info("Click Male radio button.");

        webdriver.enterText(RegisterPage.firstName1, "Armelinda");
        test.log(Status.INFO, "Enter First Name.");
        logger.info("Enter First Name.");

        webdriver.enterText(RegisterPage.lastName, "Bali");
        test.log(Status.INFO, "Enter Last Name.");
        logger.info("Enter Last Name.");

        webdriver.selectValueOnDropDown(RegisterPage.day, "24");
        test.log(Status.INFO, "Enter day.");
        logger.info("Enter day.");

        webdriver.selectValueOnDropDown(RegisterPage.month1, "November");
        test.log(Status.INFO, "Enter month.");
        logger.info("Enter month.");

        webdriver.selectValueOnDropDown(RegisterPage.year, "1993");
        test.log(Status.INFO, "Enter year.");
        logger.info("Enter year.");

        webdriver.enterText(RegisterPage.email1, "armelinda.bali@yahoo.com");
        test.log(Status.INFO, "Enter email.");
        logger.info("Enter email.");

        webdriver.enterText(RegisterPage.company1, "Tester");
        test.log(Status.INFO, "Enter company.");
        logger.info("Enter company.");

        webdriver.enterText(RegisterPage.passwordNopCommerce, "Tester12345");
        test.log(Status.INFO, "Enter password.");
        logger.info("Enter password.");

        webdriver.enterText(RegisterPage.confirmPasswordNopCommerce, "Tester12345");
        test.log(Status.INFO, "Enter confirm password.");
        logger.info("Enter confirm password.");

        webdriver.clickOnButton(RegisterPage.registerButtonNopCommerce);
        test.log(Status.INFO, "Click on Register button.");
        logger.info("Click on Register button.");

        String ActualTitle = webdriver.getText(RegisterPage.successfulRegistrationText1);
        String ExpectedTitle = "Your registration completed";
        Assert.assertEquals(ExpectedTitle, ActualTitle);

        webdriver.clickOnButton(RegisterPage.logoutButton);
        test.log(Status.INFO, "Click on logout button.");
        logger.info("Click on logout button.");

        webdriver.clickOnButton(NopCommercePageMain.loginButton);
        test.log(Status.INFO, "Click on login button.");
        logger.info("Click on login button.");

        webdriver.enterText(RegisterPage.email1, "armelinda.bali@yahoo.com");
        test.log(Status.INFO, "Enter email.");
        logger.info("Enter email.");

        webdriver.enterText(RegisterPage.passwordNopCommerce, "Tester12345");
        test.log(Status.INFO, "Enter password.");
        logger.info("Enter password.");

        webdriver.clickOnButton(RegisterPage.loginButton);
        test.log(Status.INFO, "Click on login button.");
        logger.info("Click on login button.");
    }

}
