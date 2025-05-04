package com.example.radiostation;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button apply;
    Switch swt;
    CheckBox red;
    CheckBox blue;
    CheckBox pink;
    CheckBox yelo;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apply = (Button) findViewById(R.id.apply);
        swt = (Switch) findViewById(R.id.swt);
        red = (CheckBox) findViewById(R.id.red);
        blue = (CheckBox) findViewById(R.id.blue);
        pink = (CheckBox) findViewById(R.id.pink);
        yelo = (CheckBox) findViewById(R.id.yellow);

        layout = findViewById(R.id.main);

    }


    public void set_color(boolean red, boolean blue, boolean pink, boolean yellow) {

        if ((!red) && (!blue) && (!pink) && (!yellow)){
            layout.setBackgroundColor(Color.parseColor("#ffffff")); //white
        } else if ((!red) && (!blue) && (!pink) && (yellow)){
            layout.setBackgroundColor(Color.parseColor("#f5d833")); //yellow
        } else if ((!red) && (!blue) && (pink) && (!yellow)){
            layout.setBackgroundColor(Color.parseColor("#FFC0CB")); //pink
        } else if ((!red) && (!blue) && (pink) && (yellow)){
            layout.setBackgroundColor(Color.parseColor("#f59c27")); //orange
        } else if ((!red) && (blue) && (!pink) && (!yellow)){
            layout.setBackgroundColor(Color.parseColor("#5768fa")); //blue
        } else if ((!red) && (blue) && (!pink) && (yellow)){
            layout.setBackgroundColor(Color.parseColor("#27f25d")); //green
        } else if ((!red) && (blue) && (pink) && (!yellow)){
            layout.setBackgroundColor(Color.parseColor("#a14af7")); //violet
        } else if ((!red) && (blue) && (pink) && (yellow)){
            layout.setBackgroundColor(Color.parseColor("#c88094")); //grey pink
        } else if ((red) && (!blue) && (!pink) && (!yellow)){
            layout.setBackgroundColor(Color.parseColor("#c88094")); //red
        } else if ((red) && (!blue) && (!pink) && (yellow)){
            layout.setBackgroundColor(Color.parseColor("#db2a30")); //red
        } else if ((red) && (!blue) && (pink) && (!yellow)){
            layout.setBackgroundColor(Color.parseColor("#f75291")); //light pink
        } else if ((red) && (!blue) && (pink) && (yellow)){
            layout.setBackgroundColor(Color.parseColor("#faaf4d")); //light orange
        } else if ((red) && (blue) && (!pink) && (!yellow)){
            layout.setBackgroundColor(Color.parseColor("#7024f2")); //purple
        } else if ((red) && (blue) && (!pink) && (yellow)){
            layout.setBackgroundColor(Color.parseColor("#aa5555")); //muted reddish-brown.
        } else if ((red) && (blue) && (pink) && (!yellow)){
            layout.setBackgroundColor(Color.parseColor("#aa4098")); // dark magenta
        } else if ((red) && (blue) && (pink) && (yellow)){
            layout.setBackgroundColor(Color.parseColor("#bf7073")); // warm muted pink
        }

    }


    public void red_mode(View view) {
        if (swt.isChecked()) {
            set_color(red.isChecked(), blue.isChecked(), pink.isChecked(), yelo.isChecked());
        }
    }


    public void blue_mode(View view) {
        if (swt.isChecked()) {
            set_color(red.isChecked(), blue.isChecked(), pink.isChecked(), yelo.isChecked());
        }
    }

    public void pink_mode(View view) {
        if (swt.isChecked()) {
            set_color(red.isChecked(), blue.isChecked(), pink.isChecked(), yelo.isChecked());
        }
    }

    public void yelo_mode(View view) {
        if (swt.isChecked()) {
            set_color(red.isChecked(), blue.isChecked(), pink.isChecked(), yelo.isChecked());
        }
    }


    public void cheh(View view) {
        if (swt.isChecked()) {
            set_color(red.isChecked(), blue.isChecked(), pink.isChecked(), yelo.isChecked());
        }
    }

    public void apply(View view) {
        if (!swt.isChecked()) {
            set_color(red.isChecked(), blue.isChecked(), pink.isChecked(), yelo.isChecked());
        }
    }
}