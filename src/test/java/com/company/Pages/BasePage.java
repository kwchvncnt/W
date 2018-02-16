package com.company.Pages;

import com.company.Driver.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected Logger log = LogManager.getLogger(this.getClass());
    protected static WebDriver driver = DriverFactory.getDriver();


    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
