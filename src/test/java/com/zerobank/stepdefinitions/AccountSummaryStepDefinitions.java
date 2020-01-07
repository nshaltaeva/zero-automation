package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AccountSummaryStepDefinitions {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    LoginPage loginPage = new LoginPage();
    @Given("user logs in as an authorized user")
    public void user_logs_in_as_an_authorized_user() {
        System.out.println("Login as authorized user");
        String userName = ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
    }

    @Given("user verifies that {string} page title is displayed")
    public void user_verifies_that_page_title_is_displayed(String string) {
        System.out.println(string);
        Assert.assertEquals(string, loginPage.getPageTitle());
        System.out.println("Verifying page subtitle: " + string);
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

    }

    @Given("user logs in as {string}")
    public void user_logs_in_as(String string) {

    }

    @Then("account types should be {string}")
    public void account_types_should_be(String string) {
        System.out.println(string);
    }


}
