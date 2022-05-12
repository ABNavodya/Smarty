package com.example.smarty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        Button butt1 = findViewById(R.id.btn11);
        Button butt2 = findViewById(R.id.btn12);
        Button butt3 = findViewById(R.id.btn13);
        Button butt4 = findViewById(R.id.btn14);

        butt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(page4.this,page5.class );
                startActivity(i);
            }


        });

        butt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent r= new Intent(page4.this,page3.class );
                startActivity(r);
            }


        });

        butt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent x= new Intent(page4.this,page7.class );
                startActivity(x);
            }


        });

        butt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent y= new Intent(page4.this,MainActivity.class );
                startActivity(y);
            }


        });


    }
}