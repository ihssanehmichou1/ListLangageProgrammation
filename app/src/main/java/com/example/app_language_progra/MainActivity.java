package com.example.app_language_progra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lp = findViewById(R.id.programmation);
        ArrayList<String>programmation=new ArrayList<>();
        programmation.add("Java");
        programmation.add("C#");
        programmation.add("Kotlin");
        programmation.add("Python");
        programmation.add("Swift");


//        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,  android.R.layout.simple_list_item_1,programmation);
//        lp.setChoiceMode(ListView.CHOICE_MODE_NONE);
//        lp.setAdapter(adapter);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,  android.R.layout.simple_list_item_single_choice,programmation);
        lp.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lp.setAdapter(adapter);

//        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,  android.R.layout.simple_list_item_multiple_choice,programmation);
//        lp.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
//        lp.setAdapter(adapter);

    }
}