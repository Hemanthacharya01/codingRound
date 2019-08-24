package testcases;
import base.TestBase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FlightBookingPage;

public class FlightBookingTest extends TestBase{

	@BeforeMethod
	public void setup(){
		init();
	}

    @Test
    public void testThatResultsAppearForAOneWayJourney() {
        FlightBookingPage flightBooking = new FlightBookingPage();
    	
    	driver.get("https://www.cleartrip.com/");
        waitFor(2000);
        
        flightBooking.getRadioButtonOneWay().click();
        
        flightBooking.getTextBoxFromTag().clear();
        flightBooking.getTextBoxFromTag().sendKeys("Bangalore");

        //wait for the auto complete options to appear for the origin

        waitFor(2000);
        //select the first item from the origin auto complete list
        flightBooking.getOriginOptions().get(0).click();

        flightBooking.getTextBoxToTag().clear();
        flightBooking.getTextBoxToTag().sendKeys("Delhi");
        
        //wait for the auto complete options to appear for the destination

        waitFor(2000);
        //select the first item from the destination auto complete list
        
        flightBooking.getDestinationOptions().get(0).click();

        flightBooking.getDatePicker().click();

        //all fields filled in. Now click on search
        flightBooking.getButtonSearch().click();

        waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(flightBooking.getSearchSummary()));
    }
    
    @AfterMethod
	public void tearDown(){
    	//close the browser
        driver.quit();
    }
}
