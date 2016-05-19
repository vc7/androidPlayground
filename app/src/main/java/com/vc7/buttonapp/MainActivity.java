package com.vc7.buttonapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.listView = (ListView) findViewById(R.id.listView);
        String[] mNames = new String[10];
        for (int i = 0; i <= 10; i++) {
            mNames[i] = "index: " + i;
        }
        ListAdapter mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mNames);
        this.listView.setAdapter(mAdapter);
    }
}
