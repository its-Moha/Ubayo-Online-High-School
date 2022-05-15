package com.example.ubayasecondryscool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Chapters extends AppCompatActivity {

    ExpandableListView expandableListView;

    ArrayList<String> listGroup = new ArrayList<>();
    HashMap<String,ArrayList<String>> listChild = new HashMap<>();
    Context context;
    MainAdapter adapter;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);



        expandableListView = findViewById(R.id.expandableListView);
        initData();
        adapter = new MainAdapter(listGroup, listChild, this);

        expandableListView.setAdapter(adapter);



    }

    private void initData () {
        listGroup = new ArrayList<>();
        listChild = new HashMap<>();

        listGroup.add("Chapter 1");
        listGroup.add("Chapter 2");
        listGroup.add("Chapter 3");
        listGroup.add("Chapter 4");
        listGroup.add("Chapter 5");

        ArrayList<String> chapter1 = new ArrayList<>();
        chapter1.add("Lesson a");
        chapter1.add("Lesson b");


        ArrayList<String> chapter2 = new ArrayList<>();
        chapter2.add("Lesson c");
        chapter2.add("Lesson d");
        chapter2.add("Lesson e");


        ArrayList<String> chapter3 = new ArrayList<>();
        chapter3.add("Lesson f");
        chapter3.add("Lesson g");
        chapter3.add("Lesson h");
        chapter3.add("Lesson i");

        ArrayList<String> chapter4 = new ArrayList<>();
        chapter4.add("Lesson j");
        chapter4.add("Lesson k");
        chapter4.add("Lesson l");
        chapter4.add("Lesson m");
        chapter4.add("Lesson n");


        ArrayList<String> chapter5 = new ArrayList<>();
        chapter5.add("Lesson o");
        chapter5.add("Lesson p");
        chapter5.add("Lesson q");
        chapter5.add("Lesson r");
        chapter5.add("Lesson s");
        chapter5.add("Lesson t");

        listChild.put(listGroup.get(0), chapter1);
        listChild.put(listGroup.get(1), chapter2);
        listChild.put(listGroup.get(2),chapter3);
        listChild.put(listGroup.get(3),chapter4);
        listChild.put(listGroup.get(4),chapter5);

    }
}



// String[] countryList = {"Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "Chapter 5", "Chapter 6"};

// simpleList = (ListView) findViewById(R.id.expandableListView);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_listview, R.id.textView, countryList);
//        simpleList.setAdapter(arrayAdapter);
//
//        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick (AdapterView<?> adapterView, View view, int i, long l) {
//
//                if(i == 0) {
//                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kISB5sum51Y")));
//                }
//            }
//        });



/** use for loop
 for (int g=0; g<=10; g++) {
 //add values in group list
 listGroup.add("Group" + g);
 ArrayList<String> arrayList = new ArrayList<>();
 //use for loop
 for (int c = 0; c <= 5; c++){
 //add values in arraylist
 arrayList.add("item" + c);
 }
 //put values in childList
 listChild.put(listGroup.get(g),arrayList);
 }
 adapter = new MainAdapter(listGroup,listChild,context);
 expandableListView.setAdapter(adapter);
 **/