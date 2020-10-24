package com.example.color_button_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    View view;
    //int clickcount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);
        view= this.getWindow(). getDecorView();
    }
    /*public void goRed(View v){
        view.setBackgroundResource(R.color.red);
    }
    public void goBlue(View v){
        view.setBackgroundResource(R.color.blue);
    }
    public void goYellow(View v){
        view.setBackgroundResource(R.color.yellow);
    }
    public void goGreen(View v){
        view.setBackgroundResource(R.color.green);
    }
    public void goPink(View v){
        view.setBackgroundResource(R.color.pink);
    }
    */
    // This code is written so that when a button is re-clicked bg turns white again but this works only when all the buttons are clicked thrice and screen is white when a new button is clicked :(

    int clickcount=0;

    public void goRed(View v){
        Button buttonred= findViewById(R.id.button);
        buttonred.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount%2==1)
                {
                    //first time clicked to do this
                    view.setBackgroundResource(R.color.red);
                }
                else
                {
                    //check how many times clicked and so on
                    view.setBackgroundResource(R.color.white);
                }
            } });
    }

    public void goBlue(View v){
        Button buttonblue= findViewById(R.id.button2);
        buttonblue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount%2==1)
                {
                    //first time clicked to do this
                    view.setBackgroundResource(R.color.blue);
                }
                else
                {
                    //check how many times clicked and so on
                    view.setBackgroundResource(R.color.white);
                }
            } });
    }

    public void goYellow(View v){
        Button buttonyell= findViewById(R.id.button3);
        buttonyell.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount%2==1)
                {
                    //first time clicked to do this
                    view.setBackgroundResource(R.color.yellow);
                }
                else
                {
                    //check how many times clicked and so on
                    view.setBackgroundResource(R.color.white);
                }
            } });
    }

    public void goGreen(View v){
        Button buttongrn= findViewById(R.id.button4);
        buttongrn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount%2==1)
                {
                    //first time clicked to do this
                    view.setBackgroundResource(R.color.green);
                }
                else
                {
                    //check how many times clicked and so on
                    view.setBackgroundResource(R.color.white);
                }
            } });
    }

    public void goPink(View v){
        Button buttonpink= findViewById(R.id.button5);
        buttonpink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount%2==1)
                {
                    //first time clicked to do this
                    view.setBackgroundResource(R.color.pink);
                }
                else
                {
                    //check how many times clicked and so on
                    view.setBackgroundResource(R.color.white);
                }
            } });
    }
    }

