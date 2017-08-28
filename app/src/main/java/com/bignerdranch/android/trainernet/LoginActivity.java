package com.bignerdranch.android.trainernet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import static com.bignerdranch.android.trainernet.R.styleable.View;

public class LoginActivity extends AppCompatActivity {
    private Button mLoginButton;
    private EditText mUsername;
    private EditText mPassword;
    private String mUsernameString;
    private String mPasswordString;
    private String mStoredUsername = getString(R.string.stored_username);
    private String mStoredPassword = getString(R.string.stored_password);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginButton = (Button) findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mUsername = (EditText)findViewById(R.id.username);
                mUsernameString = mUsername.getText().toString();
                mPassword = (EditText)findViewById(R.id.password);
                mPasswordString = mPassword.getText().toString();
                if (mUsernameString == mStoredUsername && mPasswordString == mStoredPassword) {
                    Toast.makeText(LoginActivity.this, R.string.successful_login, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(LoginActivity.this, R.string.unsuccessful_login, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
