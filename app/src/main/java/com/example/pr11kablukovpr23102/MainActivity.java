package com.example.pr11kablukovpr23102;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView sunImageView = findViewById(R.id.sun);
        ImageView clockImageView = findViewById(R.id.clock);
        ImageView hourImageView = findViewById(R.id.hour_hand);
        ImageView cloud1ImageView = findViewById(R.id.cloud1);
        ImageView cloud2ImageView = findViewById(R.id.cloud2);

        // 1. Восход солнца (сразу начинается)
        Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
        sunImageView.startAnimation(sunRiseAnimation);

        // 3. Движение первого облака (через 4 секунды)
        Animation cloud1MoveAnimation = AnimationUtils.loadAnimation(this, R.anim.cloud1_move);
        cloud1ImageView.startAnimation(cloud1MoveAnimation);

        // 4. Движение второго облака (через 6 секунд)
        Animation cloud2MoveAnimation = AnimationUtils.loadAnimation(this, R.anim.cloud2_move);
        cloud2ImageView.startAnimation(cloud2MoveAnimation);

        // 5. Заход солнца (через 10 секунд)
//        Animation sunSetAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_set);
//        sunImageView.startAnimation(sunSetAnimation);

        Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
        clockImageView.startAnimation(clockTurnAnimation);

        Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
        hourImageView.startAnimation(hourTurnAnimation);
    }
}