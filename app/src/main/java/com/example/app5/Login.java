package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void getNextActivity(View view) {
        Intent i=new Intent(this, Home.class);
             startActivity(i);
     }

    public void backSign(View view) {
        Intent i=new Intent(this,regester.class);
        startActivity(i);
    }
}
