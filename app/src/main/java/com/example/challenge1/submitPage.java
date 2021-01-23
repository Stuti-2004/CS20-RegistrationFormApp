package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class submitPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_page);

        Intent i = getIntent();
        ((TextView)findViewById(R.id.Name1)).setText("First Name: "+i.getStringExtra("FirstName"));
        ((TextView)findViewById(R.id.Name2)).setText("Last Name: "+i.getStringExtra("LastName"));
        ((TextView)findViewById(R.id.Name3)).setText("Email: "+i.getStringExtra("Email"));
    }




}