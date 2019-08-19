package com.lemubit.lemuel.lemubitacademynotificationtut;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textViewState = findViewById(R.id.state);
        SharedPreferences sharedPref = getSharedPreferences("lemubitApp",Context.MODE_PRIVATE);
        String  valueState = sharedPref.getString("lemubit", "Not Active");
        textViewState.setText(valueState);

    }
}
