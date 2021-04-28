package com.example.grocerystoresim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class weeklysummary extends AppCompatActivity {
    private Button button2, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeklysummary);

        button1 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) { openweeklygoal(); }
        }));



    }

    public void openweeklygoal() {
        Intent intent = new Intent(this, weeklygoal.class);
        startActivity(intent);
    }

    public void opendailyinsights() {
        Intent intent = new Intent(this, weeklygoal.class);
        startActivity(intent);
    }
}
