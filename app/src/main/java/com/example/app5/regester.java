package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class regester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regester);
    }


    public void getNext(View view) {
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }

    public void backLogin(View view) {
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }
}
