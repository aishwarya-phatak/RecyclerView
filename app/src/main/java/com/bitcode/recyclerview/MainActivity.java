package com.bitcode.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerCities;
    private ArrayList<String> cities;
    private CitiesAdapter citiesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initCities();
        initViews();
    }

    private void initCities(){
        cities = new ArrayList<>();
        for (int i = 0; i<5;i++){
            cities.add("Pune" + i);
            cities.add("Mumbai" + i);
            cities.add("Delhi" + i);
            cities.add("Nagpur"+i);
            cities.add("Nashik"+i);
        }
    }

    private void initViews(){
        recyclerCities = findViewById(R.id.recyclerCities);
        recyclerCities.setLayoutManager(
                new LinearLayoutManager(
                        this,
                        LinearLayoutManager.VERTICAL,
                        false)
        );
        citiesAdapter = new CitiesAdapter(cities);
        recyclerCities.setAdapter(citiesAdapter);
    }
}