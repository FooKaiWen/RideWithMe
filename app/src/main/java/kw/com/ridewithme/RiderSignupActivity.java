package kw.com.ridewithme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RiderSignupActivity extends AppCompatActivity {
    private EditText mEmailAddress, mPassword;
    private Button mLogin, mSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_signup);
//
//        mEmailAddress = (EditText) findViewById(R.id.emailS);
//        mPassword = (EditText) findViewById(R.id.passwordS);
//
//        mLogin = (Button) findViewById(R.id.login);
//        mSignup = (Button) findViewById(R.id.signupS);


    }
}
