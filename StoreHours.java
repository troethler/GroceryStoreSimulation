package com.example.ddfinalprojectv2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class StoreHours extends AppCompatActivity {
    private int startCount = 8;
    private int endCount = 8;
    private String amStartCounter = "am";
    private String pmEndCounter = "pm";
    private TextView startShowCount;
    private TextView endShowCount;
    private TextView am;
    private TextView pm;
    private TextView alert;
    private Button next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_hours);
        startShowCount = findViewById(R.id.start_time);
        endShowCount = findViewById(R.id.end_time);
        am = findViewById(R.id.am);
        pm = findViewById(R.id.pm);
        next = (Button) findViewById(R.id.next_button);
        alert = (TextView) findViewById(R.id.alert);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(StoreHours.this);
                builder.setCancelable(true);
                builder.setTitle("Incompatible Time Choices");
                builder.setMessage("End time cannot be bigger than start time.");

                if(startCount> endCount) {
                    if(pmEndCounter == "am") {
                        builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                        builder.show();
                    }
                }
            }
        });
    }

    public void countStartUp(View view){
        startCount++;
        if (amStartCounter == "am") {
            if(startCount == 13){
                startCount = 1;
                am.setText("pm");
                amStartCounter = "pm";
            }
        }else if(amStartCounter != "am" ){
            if(startCount == 13){
                startCount = 1;
                am.setText("am");
                amStartCounter = "am";
            }
        }
        startShowCount.setText(Integer.toString(startCount));
    }

    public void countStartDown(View view){
        startCount--;
        if (amStartCounter == "am") {
            if(startCount == 0){
                startCount = 12;
                am.setText("pm");
                amStartCounter = "pm";
            }
        }else if(amStartCounter != "am" ){
            if(startCount == 0){
                startCount = 12;
                am.setText("am");
                amStartCounter = "am";
            }
        }
        startShowCount.setText(Integer.toString(startCount));
    }

    public void countEndUp(View view){
        endCount++;
        if (pmEndCounter == "am") {
            if(endCount == 13){
                endCount = 1;
                pm.setText("pm");
                pmEndCounter = "pm";
            }
        }else if(pmEndCounter != "am" ){
            if(endCount == 13){
                endCount = 1;
                pm.setText("am");
                pmEndCounter = "am";
            }
        }
        endShowCount.setText(Integer.toString(endCount));
    }

    public void countEndDown(View view){
        endCount--;
        if (pmEndCounter == "am") {
            if(endCount == 0){
                endCount = 12;
                pm.setText("pm");
                pmEndCounter = "pm";
            }
        }else if(pmEndCounter != "am" ){
            if(endCount == 0){
                endCount = 12;
                pm.setText("am");
                pmEndCounter = "am";
            }
        }
        endShowCount.setText(Integer.toString(endCount));
    }


    public void goToDailySummary(View view) {
        Intent intent = new Intent(StoreHours.this, DailySummary.class);
        startActivity(intent);
    }
}
