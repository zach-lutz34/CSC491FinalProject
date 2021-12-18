package com.example.cscseniorseminarproject;

import static android.content.res.Configuration.UI_MODE_NIGHT_YES;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;


public class MainActivity extends AppCompatActivity {


    EditText username, passwd;
    Button login;
    DBHelper DB;

    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        passwd = findViewById(R.id.password);
        login = findViewById(R.id.Login);
        DB = new DBHelper(this);

        //setting validity of login for one person
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String password = passwd.getText().toString();

                //initializing the Database (SQLite)
                if(user.equals("") || password.equals(""))
                    Toast.makeText(MainActivity.this, "Please enter Your Log in Info", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkUserPass = DB.checkUserPassword(user, password);
                    if(checkUserPass == true) {
                        Toast.makeText(MainActivity.this, "Sign in Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }

                //saving the state of dark or light mode for user's next session
                SharedPreferences sharedPreferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE);
                final SharedPreferences.Editor editor = sharedPreferences.edit();
                final boolean isDarkModeTurnedOn = sharedPreferences.getBoolean("isDarkModeTurnedOn", false);

                //toggling dark mode for next session
                if(isDarkModeTurnedOn) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }


                //linking the sign up button to the register page
                Button button = (Button) findViewById(R.id.Signup);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, Register.class));
                    }
                });
            }
        });
    };

    public boolean isDarkModeOn()  {
        int currNightMode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK; {
            return currNightMode == UI_MODE_NIGHT_YES;
        }
}};