package com.fatihpeker.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imageView=findViewById(R.id.imageView);
        TextView landmarkNametext=findViewById(R.id.landmarkNametext);
        TextView countryNameText=findViewById(R.id.countryNameText);
        Intent intent=getIntent();
        String landmarkName=intent.getStringExtra("name");
        String countryName=intent.getStringExtra("country");
        landmarkNametext.setText(landmarkName);
        countryNameText.setText(countryName);
        Singleton singleton=Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());
    }
}
