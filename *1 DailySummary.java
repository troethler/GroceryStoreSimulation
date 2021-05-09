package com.example.grocerystoregame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.BreakIterator;

public class DailySummary extends AppCompatActivity {

    private double tpPrice;
    private double hsPrice;
    private double cheesePrice;
    private double milkPrice;
    private double beefPrice;
    private double poultryPrice;
    private double chipsPrice;
    private double candyPrice;
    private double vegPrice;
    private double fruitPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_summary);
    }

    public void goToSetStoreHours(View view) {
        Intent intent = new Intent(DailySummary.this, StoreHours.class);
        startActivity(intent);
    }

    public double getHours() {
      double openHours = getIntent().getDoubleExtra("openHours", 0.00);
        if (openHours < 7) {
            openHours = 7;
        }
      double closeHours = getIntent().getDoubleExtra("openHours", 0.00);
        if (closeHours > 7) {
            closeHours = 7.5;
        }
      openHours = 12 - openHours;
      double hoursOpen = openHours + closeHours;
      return hoursOpen;
    }


    public void getFruitPrice(View view) {
        Intent intent = getIntent();
        double fruitPrice = intent.getDoubleExtra("fruitPrice", 0.00);
        fruitPrice = ((getHours() + Math.floor(Math.random() * 2 + 1)) * fruitPrice);
        String fruitPrice1 = Double.toString(fruitPrice);
        TextView textView = (TextView) findViewById(R.id.textView19);
        fruitPrice1 = textView.getText() + fruitPrice1;
        textView.setText(fruitPrice1);
    }

    public void getVegPrice(View view) {
        Intent intent = getIntent();
        double vegPrice = intent.getDoubleExtra("vegPrice", 0.00);
        vegPrice = ((getHours() + Math.floor(Math.random() * 2 + 1)) * vegPrice);
        String vegPrice1 = Double.toString(vegPrice);
        TextView textView = (TextView) findViewById(R.id.textView20);
        vegPrice1 = textView.getText() + vegPrice1;
        textView.setText(vegPrice1);
    }

    public void getChipPrice(View view) {
        Intent intent = getIntent();
        double chipPrice = intent.getDoubleExtra("chipPrice", 0.00);
        chipPrice = ((getHours() - 1) * chipPrice);
        String chipPrice1 = Double.toString(chipPrice);
        TextView textView = (TextView) findViewById(R.id.textView32);
        chipPrice1 = textView.getText() + chipPrice1;
        textView.setText(chipPrice1);
    }

    public void getCandyPrice(View view) {
        Intent intent = getIntent();
        double candyPrice = intent.getDoubleExtra("candyPrice", 0.00);
        candyPrice = ((getHours() + Math.floor(Math.random() * 2 + 1)) * candyPrice);
        String candyPrice1 = Double.toString(candyPrice);
        TextView textView = (TextView) findViewById(R.id.textView23);
        candyPrice1 = textView.getText() + candyPrice1;
        textView.setText(candyPrice1);
    }

    public void getBeefPrice(View view) {
        Intent intent = getIntent();
        double beefPrice = intent.getDoubleExtra("beefPrice", 0.00);
        beefPrice = ((getHours() + Math.floor(Math.random() * 2 + 1)) * beefPrice);
        String beefPrice1 = Double.toString(beefPrice);
        TextView textView = (TextView) findViewById(R.id.textView25);
        beefPrice1 = textView.getText() + beefPrice1;
        textView.setText(beefPrice1);
    }

    public void getPoultryPrice(View view) {
        Intent intent = getIntent();
        double poultryPrice = intent.getDoubleExtra("poultryPrice", 0.00);
        poultryPrice = ((getHours() + Math.floor(Math.random() * 2 + 1)) * poultryPrice);
        String poultryPrice1 = Double.toString(poultryPrice);
        TextView textView = (TextView) findViewById(R.id.textView26);
        poultryPrice1 = textView.getText() + poultryPrice1;
        textView.setText(poultryPrice1);
    }

    public void getMilkPrice(View view) {
        Intent intent = getIntent();
        double milkPrice = intent.getDoubleExtra("milkPrice", 0.00);
        milkPrice = ((getHours() + Math.floor(Math.random() * 2 + 1)) * milkPrice);
        String milkPrice1 = Double.toString(milkPrice);
        TextView textView = (TextView) findViewById(R.id.textView28);
        milkPrice1 = textView.getText() + milkPrice1;
        textView.setText(milkPrice1);
    }

    public void getCheesePrice(View view) {
        Intent intent = getIntent();
        double cheesePrice = intent.getDoubleExtra("cheesePrice", 0.00);
        cheesePrice = ((getHours() -3) * cheesePrice);
        String cheesePrice1 = Double.toString(cheesePrice);
        TextView textView = (TextView) findViewById(R.id.textView29);
        cheesePrice1 = textView.getText() + cheesePrice1;
        textView.setText(cheesePrice1);
    }

    public void getTPPrice(View view) {
        Intent intent = getIntent();
        double tpPrice = intent.getDoubleExtra("tpPrice", 0.00);
        tpPrice = 0;
        String tpPrice1 = Double.toString(tpPrice);
        TextView textView = (TextView) findViewById(R.id.textView31);
        tpPrice1 = textView.getText() + tpPrice1;
        textView.setText(tpPrice1);
    }

    public void getSanitizerPrice(View view) {
        Intent intent = getIntent();
        double hsPrice = intent.getDoubleExtra("hsPrice", 0.00);
        hsPrice = 0;
        String hsPrice1 = Double.toString(hsPrice);
        TextView textView = (TextView) findViewById(R.id.textView33);
        hsPrice1 = textView.getText() + hsPrice1;
        textView.setText(hsPrice1);
    }

}
