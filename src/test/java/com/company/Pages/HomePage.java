package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@class='user_name']")
    private WebElement labUserName;


    public String getUserName() {
        return labUserName.getText().trim();

    }
}
