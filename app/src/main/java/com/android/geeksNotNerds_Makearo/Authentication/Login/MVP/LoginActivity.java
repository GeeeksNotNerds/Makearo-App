package com.android.geeksNotNerds_Makearo.Authentication.Login.MVP;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.geeksNotNerds_Makearo.R;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity implements LoginContract.view
{
    LoginContract.presenter presenter;
    String access_token,return_email;

    @BindView(R.id.loginPage_EmailText)
    EditText mEmailLoginEditText;
    @BindView(R.id.loginPage_enterPassword)
    EditText mPasswordLoginEditText;
    @BindView(R.id.loginPage_Login_button)
    Button loginButton;

    private String email;
    private String password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
