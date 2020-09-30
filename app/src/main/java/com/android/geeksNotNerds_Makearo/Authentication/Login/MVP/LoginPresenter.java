package com.android.geeksNotNerds_Makearo.Authentication.Login.MVP;

public class LoginPresenter implements LoginContract.presenter
{
    LoginContract.view mvpview;
    public LoginPresenter(LoginContract.view mvpview) {
        this.mvpview = mvpview;
    }

    @Override
    public void doLogin(String email, String password) {

    }
}
