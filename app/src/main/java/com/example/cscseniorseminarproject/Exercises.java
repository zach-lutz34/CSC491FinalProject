package com.example.cscseniorseminarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Exercises extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        //creating an ArrayList of the different exercises, along with an attached image and subtitle
        listView = findViewById(R.id.exercise_list);

        ArrayList<Exercise> arrayList = new ArrayList<>();

        arrayList.add(new Exercise(R.mipmap.leg_list_foreground, "1 Arm 1 Leg Dumbbell RDL",
                "Lower Body"));
        arrayList.add(new Exercise(R.mipmap.arm_list_foreground, "Bench Press",
                "Upper Body"));
        arrayList.add(new Exercise(R.mipmap.leg_list_foreground, "1 Leg Barbell RDL",
                "Lower Body"));
        arrayList.add(new Exercise(R.mipmap.leg_list_foreground, "Barbell Deadlift",
                "Lower Body"));
        arrayList.add(new Exercise(R.mipmap.arm_list_foreground, "Dumbbell Floor Press",
                "Upper Body"));
        arrayList.add(new Exercise(R.mipmap.arm_list_foreground, "Dumbbell Bench Press",
                "Upper Body"));
        arrayList.add(new Exercise(R.mipmap.leg_list_foreground, "Trap Bar Deadlift",
                "Lower Body"));
        arrayList.add(new Exercise(R.mipmap.arm_list_foreground, "Alternating Dumbbell Bench Press",
                "Upper Body"));
        arrayList.add(new Exercise(R.mipmap.leg_list_foreground, "1 Arm Barbell Push Press",
                "Lower Body"));
        arrayList.add(new Exercise(R.mipmap.arm_list_foreground, "Dumbbell Row",
                "Upper Body"));
        arrayList.add(new Exercise(R.mipmap.leg_list_foreground, "Band Resisted Trap Bar Deadlift",
                "Lower Body"));
        arrayList.add(new Exercise(R.mipmap.arm_list_foreground, "Bicep Curls",
                "Upper Body"));
        arrayList.add(new Exercise(R.mipmap.arm_list_foreground, "Tricep Extensions",
                "Upper Body"));

        ExerciseAdapter exerciseAdapter = new ExerciseAdapter(this, R.layout.list_view, arrayList);

        listView.setAdapter(exerciseAdapter);
    }
}