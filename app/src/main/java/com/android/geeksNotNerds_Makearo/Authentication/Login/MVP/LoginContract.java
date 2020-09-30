package com.android.geeksNotNerds_Makearo.Authentication.Login.MVP;

public class LoginContract {
    interface view{

    }
    interface presenter{

        void doLogin(String  email, String password);
    }
}
