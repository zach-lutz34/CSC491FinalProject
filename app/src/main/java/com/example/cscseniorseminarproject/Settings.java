package com.example.cscseniorseminarproject;

import static android.content.res.Configuration.UI_MODE_NIGHT_YES;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    private Switch switch_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button saveButton2 = findViewById(R.id.SaveButton2);

        switch_Btn = findViewById(R.id.switch_Btn);

        switch_Btn.setChecked(isDarkModeOn());

        //setting light and dark modes based on user input
        switch_Btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                else {
                    getDelegate().setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });

        //displaying prompts based on user input
        saveButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Username and Password Changed", Toast.LENGTH_LONG).show();
            }
        });

        Button button3 = findViewById(R.id.buttonSignout);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Logout Successful", Toast.LENGTH_LONG).show();
                startActivity(new Intent(Settings.this, MainActivity.class));
            }
        });

    }
    //making dark mode interface viewable by all pages
    public boolean isDarkModeOn()  {
        int currNightMode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK; {
            return currNightMode == UI_MODE_NIGHT_YES;
    }
}};