package com.android.geeksNotNerds_Makearo.Authentication.Login.MVP;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.geeksNotNerds_Makearo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

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
        setContentView(R.layout.activity_login);
        presenter=new LoginPresenter(this);
        ButterKnife.bind(this);
        setup();
    }
    private void setup()
    {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=mEmailLoginEditText.getText().toString();
                password=mPasswordLoginEditText.getText().toString();

                if(email.length()==0) {
                    mEmailLoginEditText.setError("Enter the required fields");
                }
                else if (password.length()<6){
                    mPasswordLoginEditText.setError("Please enter a valid user_password");
                }
                else
                {
                    presenter.doLogin(email,password);
                }

                }

        });
    }

}
