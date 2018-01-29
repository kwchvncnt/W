package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(name = "login")
    private WebElement inputLogin;

    @FindBy(name = "pass")
    private WebElement inputPassword;

    @FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
    private WebElement btnSubmit;

    public void login(String name, String password) {
        inputLogin.sendKeys(name);
        inputPassword.sendKeys(password);
        btnSubmit.click();
    }
}

