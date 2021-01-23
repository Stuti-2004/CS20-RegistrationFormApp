package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Join Us!");
    }

    public void onBtnClick(View view) {
        // Launch new activity
        Intent activity = new Intent(this, submitPage.class);
        activity.putExtra("test", "BOB");

        // finding values
        EditText editFirstName = findViewById(R.id.firstName);
        EditText editLastName = findViewById(R.id.lastName);
        EditText editEmail = findViewById(R.id.email);

        // Passing to Activity
        activity.putExtra("FirstName", (editFirstName.getText().toString()));
        activity.putExtra("LastName", (editLastName.getText().toString()));
        activity.putExtra("Email", (editEmail.getText().toString()));

        // start activity
        startActivity(activity);
    }
}