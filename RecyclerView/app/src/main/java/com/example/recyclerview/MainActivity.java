package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Models.FoodModel;
import com.example.recyclerview.MyAdapter.FoodAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.reView);

        // Initialize the food item data
        ArrayList<FoodModel> arrayList = new ArrayList<>();
        arrayList.add(new FoodModel(R.drawable.img1, "Food 1"));
        arrayList.add(new FoodModel(R.drawable.img2, "Food 2"));
        arrayList.add(new FoodModel(R.drawable.img3, "Food 3"));

        // Initialize and set the adapter for the RecyclerView
        FoodAdapter adapter = new FoodAdapter(arrayList, this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }
}