package com.example.dell.test;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;


 public class StudentEntry extends AppCompatActivity {
    Button btn1,btn2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miniproject1);
        btn1 = findViewById(R.id.add_button);
        btn2=findViewById(R.id.display_button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent = new Intent(
                    StudentEntry.this,
                    SecondActivity.class);

            startActivity(intent);
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        StudentEntry.this,
                        ThirdActivity.class);

                startActivity(intent);
            }

        });

    }
 }






