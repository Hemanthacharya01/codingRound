package testcases;
import base.TestBase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.SignInPage;

public class SignInTest extends TestBase{

	@BeforeMethod
	public void setup(){
		init();
	}
	
    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
    	SignInPage signIn = new SignInPage();

        driver.get("https://www.cleartrip.com/");
        waitFor(2000);

        signIn.getLinkYourTrips().click();
        signIn.getLinkSignIn().click();

        signIn.getButtonSignIn().click();

        String errors1 = signIn.getLabelErrorMessageForBlankFields().getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));
    }

    @AfterMethod
	public void tearDown(){
    	//close the browser
        driver.quit();
    }


}
