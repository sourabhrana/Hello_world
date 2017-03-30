package com.example.rana.justjava;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends Activity {
    int quantity=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view) {

        quantity=quantity+1;
        display(quantity);

    }
    public void decrement(View view) {

        quantity=quantity-1;
        display(quantity);

    }
    public void submitOrder(View view) {
        int price=quantity*5;
        String msg="Have a good day sir!";
        String pmsg="Total $:"+price+"\"n";
        displaymessage(pmsg+msg);

    }
    public void displaymessage(String message){
            TextView pricetextview= (TextView)findViewById(R.id.price_text_view);
        pricetextview.setText(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(" " + number);
    }


}
