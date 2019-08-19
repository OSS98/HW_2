package com.example.hw_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final Toast toast = Toast.makeText(LoginActivity.this,"Welcome to My ToDo application!",Toast.LENGTH_SHORT);
        toast.show();
    }
}
