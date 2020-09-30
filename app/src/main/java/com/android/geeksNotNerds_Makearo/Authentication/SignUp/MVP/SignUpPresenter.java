package com.android.geeksNotNerds_Makearo.Authentication.SignUp.MVP;

public class SignUpPresenter implements SignUpContract.presenter {
SignUpContract.view mpview;

public SignUpPresenter(SignUpContract.view mpview)
{
    this.mpview=mpview;
}
}
