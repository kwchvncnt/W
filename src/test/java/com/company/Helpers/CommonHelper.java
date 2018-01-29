package com.company.Helpers;

import com.company.Pages.BasePage;
import org.openqa.selenium.WebDriver;

public class CommonHelper extends BasePage {
    public void closeApp() {
        driver.quit();}

        public WebDriver getDriver () {
            return driver;
        }
    }

