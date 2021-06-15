package com.example.custom_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv2;
    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv2 = findViewById(R.id.iv2);
        tv2 = findViewById(R.id.tv2);

        Intent intent = getIntent();

        int image = intent.getIntExtra("image", R.drawable.father);
        iv2.setImageResource(image);

        String name = intent.getStringExtra("name");
        tv2.setText(name);
    }
}