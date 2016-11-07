package com.example.career.careerguide;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class GuideActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        String[] questions = {"1. Taking care of pets", "2. Repairing appliances", "3. Fishing"};
        ListAdapter careerAdaptor = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, questions);
        ListView careerListView = (ListView) findViewById(R.id.careerListView);
        careerListView.setAdapter(careerAdaptor);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }



}

