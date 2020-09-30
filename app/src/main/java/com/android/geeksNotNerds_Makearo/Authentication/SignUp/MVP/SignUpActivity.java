package com.android.geeksNotNerds_Makearo.Authentication.SignUp.MVP;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.geeksNotNerds_Makearo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity implements SignUpContract.view
{
    SignUpContract.presenter presenter;

    @BindView(R.id.signUpPage_enterEmail)
    EditText nameSignupEditText;

    @BindView(R.id.signUpPage_enterPassword)
    EditText passwordSignupEditText;

    @BindView(R.id.signUpPage_enterRepeatPassword)
    EditText rPasswordSignupEditText;

    @BindView(R.id.signup_SignUpText)
    ImageButton signupButton;

    private String email;
    private String password;
    private String rPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        presenter = new SignUpPresenter(this);
        ButterKnife.bind(this);
        setup();

    }
    private void setup()
    {
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=nameSignupEditText.getText().toString();
                password=passwordSignupEditText.getText().toString();
                rPassword=rPasswordSignupEditText.getText().toString();
                if(email.length()==0)
                {
                    nameSignupEditText.setError("Please enter your email address");
                    nameSignupEditText.requestFocus();
                }
                else if(!password.equals(rPassword))
                {
                    passwordSignupEditText.setError("Repeat and password don't match");
                    passwordSignupEditText.requestFocus();
                }
                else if(password.length()==0)
                {
                    passwordSignupEditText.setError("Repeat and password don't match");
                    passwordSignupEditText.requestFocus();
                }
                else if(rPassword.length()==0)
                {
                    passwordSignupEditText.setError("Repeat and password don't match");
                    passwordSignupEditText.requestFocus();
                }
                else
                {

                }
            }
        });
    }
}
