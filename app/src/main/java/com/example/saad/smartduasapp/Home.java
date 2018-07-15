package com.example.saad.smartduasapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    public TextView arabictext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Give path to the Font location
        String Path2font = "DroidNaskh-Regular.ttf";
        // Give label to TextView object defined in layout
        arabictext = (TextView) findViewById(R.id.arabicphrase);

        // Load the Font and define typeface accordingly
        Typeface tf = Typeface.createFromAsset(getAssets(), Path2font);

        // Apply the font to your TextView object
        arabictext.setTypeface(tf);
        arabictext.setText("احب الاطفال");

    }

}
