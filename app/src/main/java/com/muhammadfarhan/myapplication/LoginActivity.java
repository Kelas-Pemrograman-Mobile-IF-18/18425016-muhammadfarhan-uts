package com.muhammadfarhan.myapplication.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.ornach.nobobutton.NoboButton;
import com.muhammadfarhan.myapplication.R;
import com.muhammadfarhan.myapplication.admin.HomeAdmin;

public class LoginActivity extends AppCompatActivity {

    Button btnRegis;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnRegis = (Button) findViewById(R.id.btnRegis);
        btnLogin = (NoboButton) findViewById(R.id.LoginBtn);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, com.muhammadfarhan.myapplication.user.RegisActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdmin.class);
                startActivity(i);
                finish();
            }
        });
    }
}