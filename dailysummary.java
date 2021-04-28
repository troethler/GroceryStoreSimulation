package com.example.grocerystoresim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dailysummary extends AppCompatActivity {
    private Button button2, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dailysummary);

        button1 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) { opendailyinsights(); }
        }));

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openweeklysummarry();
            }
        });
    }

    public void openweeklysummarry() {
        Intent intent = new Intent(this, weeklysummary.class);
        startActivity(intent);
    }

    public void opendailyinsights() {
        Intent intent = new Intent(this, dailyinsights.class);
        startActivity(intent);
    }
}
