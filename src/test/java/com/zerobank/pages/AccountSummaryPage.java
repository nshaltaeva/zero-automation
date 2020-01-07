package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


public class AccountSummaryPage extends BasePage{

    @FindBy(css = "[class = 'board-header']")
    public List<WebElement> boardHeader;

    public List<String> getBoardHeadersNames(){

        return BrowserUtils.getListOfString(boardHeader);
    }


}
