package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
// import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Получим ссылку на солнце, небо, звезды 
    ImageView sunImageView = (ImageView) findViewById(R.id.sun);
    ImageView skyImageView = (ImageView) findViewById(R.id.sky);
    ImageView starsImageView = (ImageView) findViewById(R.id.stars);
    // Анимация для восхода солнца
    Animation sunRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sun_rise);
    Animation skyRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.sky_rise);
    Animation starsRiseAnimation = AnimationUtils.loadAnimation(this, R.anim.stars_rise);
    // Подключаем анимацию к нужному View
    sunImageView.startAnimation(sunRiseAnimation);
    skyImageView.startAnimation(skyRiseAnimation);
    starsImageView.startAnimation(starsRiseAnimation);
    
    // Получим ссылку на часы
    ImageView clockImageView = (ImageView) findViewById(R.id.clock);
    // анимация для вращения часов
    Animation clockTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.clock_turn);
    clockImageView.startAnimation(clockTurnAnimation);
    // получим ссылку на часовую стрелку
    ImageView hourImageView = (ImageView) findViewById(R.id.hour_hand);
    // анимация для стрелки
    Animation hourTurnAnimation = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
    // присоединяем анимацию
    hourImageView.startAnimation(hourTurnAnimation);
  }
}
