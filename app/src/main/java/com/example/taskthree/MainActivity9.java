package com.example.taskthree;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity9 extends AppCompatActivity {
    int level = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        ImageView wifi = findViewById(R.id.iv_wifi);
        LevelListDrawable levelListDrawable = (LevelListDrawable) wifi.getDrawable();
        wifi.setOnClickListener(view -> {
            level +=6;
            if (level>25)
                level = 0;
        levelListDrawable.setLevel(level);
        });
    }
}