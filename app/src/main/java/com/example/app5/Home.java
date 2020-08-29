package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {
     Animation anim,anim1,anim2;
     ImageView splashImg;
     Button getBtn;
     TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getBtn=findViewById(R.id.getBtn);
        splashImg=findViewById(R.id.imgV1);
        tv1=findViewById(R.id.splashTv);
        tv2=findViewById(R.id.subSplashTv);

        //load animation
        anim= AnimationUtils.loadAnimation(this,R.anim.atgo);
        splashImg.startAnimation(anim); //passing animation
        anim1=AnimationUtils.loadAnimation(this,R.anim.gotaone);
        tv1.startAnimation(anim1);
        tv2.startAnimation(anim1);

        anim2=AnimationUtils.loadAnimation(this,R.anim.gotatow);
        getBtn.startAnimation(anim2);




    }

    public void goToTimer(View view) {
        Intent i=new Intent(this,timerActivity.class);
        startActivity(i);
    }
}
