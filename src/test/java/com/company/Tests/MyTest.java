package com.company.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MyTest extends BaseTest {

    @Test
    public void testMailLogin() {
        WebDriver driver = app.common.getDriver();
        app.login.loginValidUser();
        String userName = app.home.getUserName();
        Assert.assertEquals(userName, validUser.getUserName(), "user is not login");
    }
}
