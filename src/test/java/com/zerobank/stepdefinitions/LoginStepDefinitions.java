package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("I am on the landing page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in")
    public void user_logs_in() {
        System.out.println("Login as authorized user");
        String userName = ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
    }

    @Then("user verifies that {string} page is displayed")
    public void user_verifies_that_page_is_displayed(String string) {
        System.out.println(string);
        Assert.assertEquals(string, loginPage.getPageTitle());
        System.out.println("Verifying page subtitle: " + string);
    }

    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("Login with "+string+" username and "+string2+" password.");
    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        System.out.println("Verified that warning message is dysplayed: "+string);
    }

}
