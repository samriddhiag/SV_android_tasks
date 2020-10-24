package com.example.vibrate_anim_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btVibrate;
    Button hellorot;
    Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //rotateAnimation();
        hellorot = findViewById(R.id.hello);
        hellorot.startAnimation(
                AnimationUtils.loadAnimation(this,R.anim.rotate) );

        btVibrate = findViewById(R.id.bt_vibrate);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        btVibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(1000);
            }
        });


       /* private Animation rotateAnimation(){
            rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
            hellorot.startAnimation(rotateAnimation);
        }*/
    }
}
