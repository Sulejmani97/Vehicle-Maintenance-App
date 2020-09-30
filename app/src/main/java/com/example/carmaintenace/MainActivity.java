package com.example.carmaintenace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton taurusButton;
    ImageButton commanderButton;
    ImageButton cherokeeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taurusButton = (ImageButton) findViewById(R.id.taurusButton);

        taurusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, TaurusMenu.class);
                startActivity(intentLoadNewActivity);
            }
        });

        commanderButton = (ImageButton) findViewById(R.id.commanderButton);

        commanderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, CommanderMenu.class);
                startActivity(intentLoadNewActivity);
            }
        });

        cherokeeButton = (ImageButton) findViewById(R.id.cherokeeButton);

        cherokeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, cherokeeMenu.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}