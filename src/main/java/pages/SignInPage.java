package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SignInPage extends TestBase{

	@FindBy(linkText = "Your trips")
    private WebElement linkYourTrips;
	
	@FindBy(linkText = "SignIn")
    private WebElement linkSignIn;
	
	@FindBy(linkText = "signInButton")
    private WebElement buttonSignIn;
	
	@FindBy(linkText = "errors1")
    private WebElement labelErrorMessageForBlankFields;
	
	public SignInPage(){
		PageFactory.initElements(driver, this);
	}

	public WebElement getLinkYourTrips() {
		return linkYourTrips;
	}

	public WebElement getLinkSignIn() {
		return linkSignIn;
	}

	public WebElement getButtonSignIn() {
		return buttonSignIn;
	}

	public WebElement getLabelErrorMessageForBlankFields() {
		return labelErrorMessageForBlankFields;
	}
	
	
}
