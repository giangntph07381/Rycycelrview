package com.example.rycycelrview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         recyclerView =  findViewById(R.id.rv);

         models = new ArrayList<>();
         models.add(new Model(R.drawable.a1));
        models.add(new Model(R.drawable.a2));
        models.add(new Model(R.drawable.a1));
        models.add(new Model(R.drawable.a2));
        models.add(new Model(R.drawable.a1));
        models.add(new Model(R.drawable.a2));
        models.add(new Model(R.drawable.a1));
        models.add(new Model(R.drawable.a2));
        models.add(new Model(R.drawable.a1));
        models.add(new Model(R.drawable.a2));



        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvmanager = layoutManager;
        recyclerView.setLayoutManager(rvmanager);
        Adapter adapter =  new Adapter(this,models);
        recyclerView.setAdapter(adapter);

    }
}
