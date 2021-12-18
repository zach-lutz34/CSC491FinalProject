package com.example.cscseniorseminarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class trackProgress extends AppCompatActivity {

    //listing each exercise in a String
    //** Developer would create a database for these exercises **
    private Button SaveButton;
    Spinner spinner_e;
    String[] exerciseNames = {" ", "1 Arm 1 Leg Dumbbell RDL", "Bench Press", "1 Leg Barbell RDL",
    "Barbell Deadlift", "Dumbbell Floor Press", "Dumbbell Bench Press", "Trap Bar Deadlift",
    "Alternating Dumbbell Bench Press", "1 Arm Barbell Push Press", "Dumbbell Row", "Band Resisted Trap Bar Deadlift",
    "Bicep Curls", "Tricep Extensions"};
    ArrayAdapter<String>arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_progress);

        //linking save button
        Button mButton = (Button)findViewById(R.id.savebutton);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(trackProgress.this, HomeActivity.class));
            }
        });

        //creating a spinner list
        spinner_e = (Spinner)findViewById(R.id.spin_exercise);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                exerciseNames);
        spinner_e.setAdapter(arrayAdapter);


        spinner_e.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Your exercise was: " + exerciseNames[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}