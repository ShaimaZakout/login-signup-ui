package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class timerActivity extends AppCompatActivity {

     ImageView clickImgV;
     Button startBtn,stopBtn;
     Animation roundingalone;
    Chronometer timerHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        clickImgV=findViewById(R.id.circlImgV);
        startBtn=findViewById(R.id.startBtn);
        stopBtn=findViewById(R.id.stopBtn);
        stopBtn.setAlpha(0);
        roundingalone= AnimationUtils.loadAnimation(this,R.anim.roundingalone);
        timerHere=findViewById(R.id.timerHere);


    }

    public void getAnimation(View view) {
        clickImgV.startAnimation(roundingalone);
        stopBtn.animate().setDuration(300).alpha(1).start();

        //start count
        timerHere.setBase(SystemClock.elapsedRealtime());
        timerHere.start();
    }
}
