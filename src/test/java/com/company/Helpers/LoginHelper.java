package com.company.Helpers;

import com.company.Pages.LoginPage;
import com.company.Users.User;
import com.company.Users.UserFactory;

public class LoginHelper extends LoginPage {
    public void loginValidUser() {
        User validUser = UserFactory.getValidUser();
        login(validUser.getLogin(),validUser.getPassword());
    }
    public void loginNotValidUser() {
        User notValidUser = UserFactory.getNotValidUser();
        login(notValidUser.getLogin(),notValidUser.getPassword());
    }
}
