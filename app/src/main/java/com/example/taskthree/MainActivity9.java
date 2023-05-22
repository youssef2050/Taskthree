package com.example.taskthree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity9 extends AppCompatActivity {
    int level = 0;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        ImageView wifi = findViewById(R.id.iv_wifi);
//        TransitionDrawable transitionDrawable = (TransitionDrawable) wifi.getDrawable();
        LevelListDrawable levelListDrawable = (LevelListDrawable) wifi.getDrawable();
//        ClipDrawable clipDrawable = (ClipDrawable) wifi.getDrawable();
//        wifi.setOnClickListener(view -> {
//            level += 6;
//            if (level > 25)
//                level = 0;
//            levelListDrawable.setLevel(level);
//        });


//        wifi.setOnClickListener(view -> {
//            if (flag) {
//                transitionDrawable.startTransition(500);
//            } else {
//                transitionDrawable.reverseTransition(500);
//            }
//            flag = !flag;
//        });

        new Thread(() -> {
            for (int i = 0; i <= 25; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
                //setLevel
                levelListDrawable.setLevel(i);
                if (i == 25)
                    i = 0;

            }
        }).start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_menu, menu);
        return true;
    }
}