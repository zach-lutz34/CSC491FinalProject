package com.example.cscseniorseminarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private Button button;

    EditText username, password, repass;
    Button signup;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.reguser);
        password = (EditText) findViewById(R.id.regpass);
        repass = (EditText) findViewById(R.id.regrepass);

        //linking register button back to sign in page
        Button mButton = (Button)findViewById(R.id.Login_Reg);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Register.this, MainActivity.class));
            }
        });
    }

    public void buttonSignup(View view) {

        String user = username.getText().toString();
        String pass = password.getText().toString();
        String repeatpass = repass.getText().toString();
        DB = new DBHelper(this);

        //initializing the Registering using SQLite
        if(user.equals("") || pass.equals("") || repeatpass.equals(""))
            Toast.makeText(Register.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
        else{
            if (pass.equals(repeatpass)){
                Boolean checkUser = DB.checkUsername(user);
                if(checkUser == false){
                    Boolean insert = DB.insertData(user, pass);
                    if(insert == true){
                        Toast.makeText(Register.this,"User Registered Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(Register.this, "Registration failed", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Register.this, "User already exists! Please Log in.", Toast.LENGTH_SHORT).show();
                }
            }
            else {
                Toast.makeText(Register.this, "Passwords don't match", Toast.LENGTH_SHORT).show();
            }
        }
    }
}