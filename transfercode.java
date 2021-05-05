package com.example.grocerystoregame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.BreakIterator;

public class DailySummary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_summary);
    }

    public void goToDailyInsights(View view) {
        Intent intent = new Intent(DailySummary.this, DailyGoal.class);
        startActivity(intent);
    }
    public void goToWeeklySummary(View view) {
        Intent intent = new Intent(DailySummary.this, WeeklySummary.class);
        startActivity(intent);
    }

    public void getFruitPrice(View view) {
        Intent intent = getIntent();
        String fruitPrice = intent.getStringExtra("tpPrice");
        TextView textView = (TextView) findViewById(R.id.textView19);
        fruitPrice = textView.getText() + fruitPrice;
        textView.setText(fruitPrice);
    }

    public void getVegPrice(View view) {
        Intent intent = getIntent();
        String vegPrice = intent.getStringExtra("vegPrice");
        TextView textView = (TextView) findViewById(R.id.textView20);
        vegPrice = textView.getText() + vegPrice;
        textView.setText(vegPrice);
    }

    public void getChipPrice(View view) {
        Intent intent = getIntent();
        String chipPrice = intent.getStringExtra("chipPrice");
        TextView textView = (TextView) findViewById(R.id.textView32);
        chipPrice = textView.getText() + chipPrice;
        textView.setText(chipPrice);
    }

    public void getCandyPrice(View view) {
        Intent intent = getIntent();
        String candyPrice = intent.getStringExtra("candyPrice");
        TextView textView = (TextView) findViewById(R.id.textView23);
        candyPrice = textView.getText() + candyPrice;
        textView.setText(candyPrice);
    }

    public void getBeefPrice(View view) {
        Intent intent = getIntent();
        String beefPrice = intent.getStringExtra("beefPrice");
        TextView textView = (TextView) findViewById(R.id.textView25);
        beefPrice = textView.getText() + beefPrice;
        textView.setText(beefPrice);
    }

    public void getPoultryPrice(View view) {
        Intent intent = getIntent();
        String poultryPrice = intent.getStringExtra("poultryPrice");
        TextView textView = (TextView) findViewById(R.id.textView26);
        poultryPrice = textView.getText() + poultryPrice;
        textView.setText(poultryPrice);
    }

    public void getMilkPrice(View view) {
        Intent intent = getIntent();
        String milkPrice = intent.getStringExtra("milkPrice");
        TextView textView = (TextView) findViewById(R.id.textView28);
        milkPrice = textView.getText() + milkPrice;
        textView.setText(milkPrice);
    }

    public void getCheesePrice(View view) {
        Intent intent = getIntent();
        String cheesePrice = intent.getStringExtra("cheesePrice");
        TextView textView = (TextView) findViewById(R.id.textView29);
        cheesePrice = textView.getText() + cheesePrice;
        textView.setText(cheesePrice);
    }

    public void getTPPrice(View view) {
        Intent intent = getIntent();
        String tpPrice = intent.getStringExtra("tpPrice");
        TextView textView = (TextView) findViewById(R.id.textView31);
        tpPrice = textView.getText() + tpPrice;
        textView.setText(tpPrice);
    }

    public void getSanitizerPrice(View view) {
        Intent intent = getIntent();
        String hsPrice = intent.getStringExtra("hsPrice");
        TextView textView = (TextView) findViewById(R.id.textView33);
        hsPrice = textView.getText() + hsPrice;
        textView.setText(hsPrice);
    }
}

Send Code:
public void send/*ex.tpPrice or startTime*/Price(View view){
        Intent intent = new Intent(getApplicationContext(),DailySummary.class);
        TextView txtView = (TextView)findViewById(R.id./*name of location ex. textview1*/);
        intent.putExtra(/* name ex. tpPrice or startTime */, txtView.getText().toString());
        startActivity(intent);
    }
