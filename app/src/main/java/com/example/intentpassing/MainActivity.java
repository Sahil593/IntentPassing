package com.example.intentpassing;

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

        Button btn;
        btn=findViewById(R.id.btn);

        Intent next;
        next=new Intent(MainActivity.this,NextPage.class);
        next.putExtra("title","Student Info");
        next.putExtra("Student name","Sahil Kushwaha");
        next.putExtra("Roll no",139);
        next.putExtra("Section",'C');

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(next);
            }
        });
    }
}