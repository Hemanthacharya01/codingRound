package testcases;
import base.TestBase;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HotelBookingPage;

public class HotelBookingTest extends TestBase{

	@BeforeMethod
	public void setup(){
		init();
	}
    
    @Test
    public void shouldBeAbleToSearchForHotels() {
    	HotelBookingPage hotelBooking = new HotelBookingPage();
    	
        driver.get("https://www.cleartrip.com/");
        hotelBooking.getHotelLink().click();

        hotelBooking.getLocalityTextBox().sendKeys("Indiranagar, Bangalore");

        new Select(hotelBooking.getTravellerSelection()).selectByVisibleText("1 room, 2 adults");
        hotelBooking.getSearchButton().click();

    }

    @AfterMethod
	public void tearDown(){
    	//close the browser
        driver.quit();
    }
}
