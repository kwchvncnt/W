package com.company.Users;

import java.util.ResourceBundle;

public class UserFactory {
    private static ResourceBundle bundle;
    static { bundle = ResourceBundle.getBundle("user");

    }

    public static User getValidUser() {
        return new User(bundle.getString("valid.userName"),
                bundle.getString("valid.login"),
                bundle.getString("valid.password"),
                bundle.getString("valid.email"));
    }

    public static User getNotValidUser() {
        return new User(bundle.getString("inValid.userName"),
                bundle.getString("inValid.login"),
                bundle.getString("inValid.password"),
                bundle.getString("inValid.email"));
    }
}
