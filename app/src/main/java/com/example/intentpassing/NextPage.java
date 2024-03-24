package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        Intent from=getIntent();
        String title=from.getStringExtra("title");
        String name=from.getStringExtra("Student name");
        int rollno=from.getIntExtra("Roll no",0);
        char section=from.getCharExtra("Section",'N');


        TextView student;
        student=findViewById(R.id.studentinfo);
        student.setText("Name : "+name+" , Roll no. : "+rollno+" , Section : "+section);
        getSupportActionBar().setTitle(title);
    }
}