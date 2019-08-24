package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HotelBookingPage extends TestBase{

	@FindBy(linkText = "Hotels")
    private WebElement hotelLink;

    @FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;

	public WebElement getHotelLink() {
		return hotelLink;
	}

	public WebElement getLocalityTextBox() {
		return localityTextBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getTravellerSelection() {
		return travellerSelection;
	}
    
	public HotelBookingPage(){
		PageFactory.initElements(driver, this);
	}

}
