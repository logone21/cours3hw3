package com.example.cours3hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> persons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyler_view);
        persons = new ArrayList<>();
        recyclerView.setAdapter(new PersonAdapter(persons));
        persons.add("Avengers team");
        persons.add("capitan america");
        persons.add("iron man");
        persons.add("black window");
        persons.add("halk");
        persons.add("thor");
        persons.add("arrow");
        }
    }