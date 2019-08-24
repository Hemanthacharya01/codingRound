package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class FlightBookingPage extends TestBase{

	@FindBy(id = "OneWay")
	private WebElement radioButtonOneWay;
	
	@FindBy(id = "FromTag")
	private WebElement textBoxFromTag;
	
	@FindBy(id = "toTag")
	private WebElement textBoxToTag;
	
	@FindBy(xpath = "//ul[@id='ui-id-1']/li")
	private List<WebElement> originOptions;
	
	@FindBy(xpath = "//ul[@id='ui-id-2']/li")
	private List<WebElement> destinationOptions;
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
	private WebElement datePicker;
	
	@FindBy(id = "SearchBtn")
	private WebElement buttonSearch;
	
	private By searchSummary = By.className("searchSummary");
	
	
	
	public WebElement getRadioButtonOneWay() {
		return radioButtonOneWay;
	}



	public WebElement getTextBoxFromTag() {
		return textBoxFromTag;
	}



	public WebElement getTextBoxToTag() {
		return textBoxToTag;
	}



	public List<WebElement> getOriginOptions() {
		return originOptions;
	}



	public List<WebElement> getDestinationOptions() {
		return destinationOptions;
	}



	public WebElement getDatePicker() {
		return datePicker;
	}



	public WebElement getButtonSearch() {
		return buttonSearch;
	}



	public By getSearchSummary() {
		return searchSummary;
	}



	public FlightBookingPage(){
		PageFactory.initElements(driver, this);
	}
}
