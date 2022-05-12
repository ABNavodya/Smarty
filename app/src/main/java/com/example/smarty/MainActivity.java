package com.example.smarty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butt1 = findViewById(R.id.btn1);
        Button butt2 = findViewById(R.id.btn2);

        butt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,page2.class );
                startActivity(i);
            }


        });

        butt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent r= new Intent(MainActivity.this,page3.class );
                startActivity(r);
            }


        });


    }
}