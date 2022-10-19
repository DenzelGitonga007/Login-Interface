package com.example.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Making the input fields work
        TextView username = (TextView) findViewById(R.id.username); //Username
        TextView password = (TextView) findViewById(R.id.password); //Password
        MaterialButton login_btn = (MaterialButton) findViewById(R.id.login_btn); //Login btn

//        username and password = admin
//        The event listener and action
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")){
                    //this is correct password
                    //Toast success message
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                }else
                    //incorrect password
                    //Toast error login
                    Toast.makeText(MainActivity.this,"LOGIN ERROR!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}