package com.example.dell.test;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;
import java.lang.String;
import java.lang.Long;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity

    {
        EditText edit_text1,edit_text2,edit_text3,edit_text4;
        Button studentadd;
        Database database;

        ArrayList<Student> studentArrayList = new ArrayList<>();
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry);
            Intent intent = getIntent();
            edit_text1 = findViewById(R.id.edit_text1);
            edit_text2 = findViewById(R.id.edit_text2);
            edit_text3 = findViewById(R.id.edit_text3);
            edit_text4=findViewById(R.id.edit_text4);
            studentadd = findViewById(R.id.addstudentbtn);

            database = new Database(this);


            studentadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    /*
                     * On the click of the button, getting values from
                     * the user input.*/
                    String name = edit_text1.getText().toString();
                    String collegeName=edit_text2.getText().toString();
                    long phoneNumber = Long.parseLong(edit_text3.getText().toString());
                    int fees = Integer.parseInt(edit_text4 .getText().toString());

                    /*
                     * Storing the new values into the arrayList using the
                     * Student class object.*/
                    database.addNewStudent(new Student(name, collegeName, phoneNumber, fees));

                    /*
                     * Showing a success message once the data has been saved into arrayList*/
                    Toast.makeText(getApplicationContext(), "Student data saved successfully", Toast.LENGTH_LONG).show();
                }
            });



        }
    }


