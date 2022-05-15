package com.example.ubayasecondryscool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CalendarView;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp,clover;
    LinearLayout splashText,homeText;
    Animation frombottom;
    GridLayout menus;
    CardView a,b,c,d;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        bgapp = findViewById(R.id.bgapp);
        clover = findViewById(R.id.clover);
        splashText = findViewById(R.id.splashText);
        homeText = findViewById(R.id.homeText);
        menus = findViewById(R.id.menus);

        bgapp.animate().translationY(-1000).setDuration(1000).setStartDelay(1000);
        clover.animate().alpha(0).setDuration(800).setStartDelay(600);
        splashText.animate().translationY(140).alpha(0).setDuration(1000).setStartDelay(1000);
        homeText.setAnimation(frombottom);
        menus.startAnimation(frombottom);

        a =findViewById(R.id.a);
        b =findViewById(R.id.b);
        c =findViewById(R.id.c);
        d =findViewById(R.id.d);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(getApplicationContext(), Courses.class);
                startActivity(intent);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(getApplicationContext(), Courses.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(getApplicationContext(), Courses.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(getApplicationContext(), Courses.class);
                startActivity(intent);
            }
        });
    }
}