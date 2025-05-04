package com.example.radiostation;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    RadioGroup mom;
    RadioButton red;
    RadioButton blue;
    RadioButton pink;
    RadioButton yelo;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apply = (Button) findViewById(R.id.apply);
        swt = (Switch) findViewById(R.id.swt);
        mom = (RadioGroup) findViewById(R.id.mom);
        red = (RadioButton) findViewById(R.id.red);
        blue = (RadioButton) findViewById(R.id.blue);
        pink = (RadioButton) findViewById(R.id.pink);
        yelo = (RadioButton) findViewById(R.id.yelo);

        layout = findViewById(R.id.main);

    }


    public void set_color(boolean red, boolean blue, boolean pink, boolean yellow) {
        if (red) {
            layout.setBackgroundColor(Color.parseColor("#d12648")); //red
        } else if (blue) {
            layout.setBackgroundColor(Color.parseColor("#5768fa")); //blue
        } else if (pink) {
            layout.setBackgroundColor(Color.parseColor("#FFC0CB")); //pink
        } else if (yellow) {
            layout.setBackgroundColor(Color.parseColor("#f5d833")); //yellow
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