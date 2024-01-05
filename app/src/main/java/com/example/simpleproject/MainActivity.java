package com.example.simpleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,email,phone,date,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void display(View v)

    {
        name = (EditText) findViewById(R.id.t1);
        email = (EditText) findViewById(R.id.t2);
        phone = (EditText) findViewById(R.id.t3);
        date = (EditText) findViewById(R.id.t4);
        pass = (EditText) findViewById(R.id.t5);

        Toast.makeText(getApplicationContext(),"Hello "+name.getText().toString()+"\n your password is "+email.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}