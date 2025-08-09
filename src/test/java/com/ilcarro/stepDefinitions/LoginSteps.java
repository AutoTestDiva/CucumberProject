package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Log in link")
    public void click_on_Login_link(){
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enter_valid_data(){
        new LoginPage(driver).enterData("viktor23121950@gmail.com","Pnata1978!");
    }
    @And("User clicks on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies log in message is displayed")
    public void verify_login_message(){
        new LoginPage(driver).isLoginMessageDisplayed();
    }
}
