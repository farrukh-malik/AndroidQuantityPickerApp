package com.example.syedinkisarahmed.quantitypicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity=0;
    boolean a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void increment(View v){
        quantity = quantity+1;
        display(quantity);
    }



    public void decrement (View v){
        quantity = quantity-1;
        display(quantity);
    }



    public void display(int x){
        TextView txt = (TextView) findViewById(R.id.txt1);
        txt.setText(x+"");


    }




    public void order(View v){
        TextView txt = (TextView) findViewById(R.id.txt2);

        CheckBox bx =(CheckBox) findViewById(R.id.chk);
        CheckBox bx1 =(CheckBox) findViewById(R.id.chkchocko);
        a=bx.isChecked();
        boolean b = bx1.isChecked();
        txt.setText("Name: Lyla the Labyrinth\nAdd whipped Cream? "+a+"\nAdd Chockolate "+b+"\nQuantity: "+quantity+"\nTotal: $"+(quantity*5)+"\nThank you!");
    }
}
