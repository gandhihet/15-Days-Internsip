package com.example.custom_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class gridview extends AppCompatActivity {
    GridView lvname;
    int[] images= {R.drawable.father, R.drawable.mother, R.drawable.grandfather, R.drawable.grandmother, R.drawable.son, R.drawable.daughter};
    String[] name = {"Father", "Mother", "Grand Father", "Grand Mother", "Son", "Daughter"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        lvname = findViewById(R.id.lvname);

        MyAdapter myAdapter = new MyAdapter(images,name,gridview.this);
        lvname.setAdapter(myAdapter);

        lvname.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(gridview.this,MainActivity.class);
                intent.putExtra("image",images[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        });
    }
}