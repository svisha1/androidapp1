package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();

        TextView twName = findViewById(R.id.NameView);
        TextView twAge = findViewById(R.id.AgeView);
        TextView twSex = findViewById(R.id.SexView);
        twName.setText(i.getStringExtra("iName"));
        twAge.setText(i.getStringExtra("iAge"));
        twSex.setText(i.getStringExtra("iSex"));
    }
    public void changeBg(View view){
        ConstraintLayout linLay = (ConstraintLayout) findViewById(R.id.secondPage);
        Random rand = new Random();
        int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        linLay.setBackgroundColor(color);
    }
    public void go(View view){
        Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(i);
    }
}