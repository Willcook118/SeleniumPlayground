package Scenarios;

import helpers.BrowserCapabilities;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.annotations.Test;

public class NavigateToWebsite extends BrowserCapabilities {

    @Test
    @Given("^User navigates to the SeleniumEasy test website ")
    public void navigateToSeleniumEasy(){
        getDriverInstance("chrome");
        driver.get("https://www.seleniumeasy.com/test/");
    }




}
