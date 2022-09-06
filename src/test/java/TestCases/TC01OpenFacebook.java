package TestCases;

import com.aventstack.extentreports.Status;
import common.TestBase;
import org.testng.annotations.Test;

public class TC01OpenFacebook extends TestBase {

    @Test
    public void tc01VerifyOpenURL() {

        test = extent.createTest("Verify URL", "Case 1: User needs to verify if Facebook homepage works as expected.")
                .assignCategory("Functional_testcase")
                .assignAuthor("Armelinda");
        logger.info("Verify URL");

        openURL("https://www.facebook.com/");
        test.log(Status.INFO, "Open URL");
        logger.info("Open URL");

        String expectedTitle = "Connect with friends and the world around you on Facebook.";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {

            test.log(Status.INFO, "Verification Successful - The correct title is displayed on the web page.");
            logger.info("Verification Successful - The correct title is displayed on the web page.");

        } else {
            test.log(Status.FAIL, "Verification Failed - An incorrect title is displayed on the web page.");
            logger.error("Verification Failed - An incorrect title is displayed on the web page.");
        }
    }
}
