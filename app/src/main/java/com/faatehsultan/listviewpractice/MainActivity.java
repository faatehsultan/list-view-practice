package com.faatehsultan.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Musa");
        studentList.add("Saad");
        studentList.add("Shahid");
        studentList.add("Ibrahim");
        studentList.add("Mahad");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_main, studentList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

        setContentView(R.layout.activity_main);
    }
}