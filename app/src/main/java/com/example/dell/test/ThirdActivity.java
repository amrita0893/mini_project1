
package com.example.dell.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity
        implements Recycler.ListItemClickListener{

    RecyclerView recyclerView;

//    Student2 student2;

    Recycler recycler;
    Database db = new Database(this);
    List<Student> student2ArrayList = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_layout);
        recyclerView = findViewById(R.id.recycler);
        student2ArrayList.addAll(db.allStudentsDetails());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recycler = new Recycler(student2ArrayList, this);

        recyclerView.setAdapter(recycler);
    }

    public void onListItemClickListener(int clickedItemIndex) {
        Toast.makeText(getApplicationContext(), student2ArrayList.get(clickedItemIndex).name, Toast.LENGTH_SHORT).show();
      
    }


}

