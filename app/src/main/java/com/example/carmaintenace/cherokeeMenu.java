package com.example.carmaintenace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class cherokeeMenu extends AppCompatActivity {

    ImageButton oilButton;
    ImageButton brakeButton;
    ImageButton wheelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cherokee_menu);

        oilButton = (ImageButton) findViewById(R.id.oilButton);
        oilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOilDialog();
            }
        });

        brakeButton = (ImageButton) findViewById(R.id.brakeButton);
        brakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBrakeDialog();
            }
        });

        wheelButton = (ImageButton) findViewById(R.id.wheelButton);
        wheelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWheelDialog();
            }
        });
    }
        public void openOilDialog() {
            OilDialog oilDialogCherokee = new OilDialog("N/A");
            oilDialogCherokee.show(getSupportFragmentManager(),"Oil Spec");
        }

    public void openBrakeDialog() {
        BrakeDialog brakeDialogCherokee = new BrakeDialog("N/A");
        brakeDialogCherokee.show(getSupportFragmentManager(),"Oil Spec");
    }

    public void openWheelDialog() {
        WheelDialog wheelDialogCherokee = new WheelDialog("N/A");
        wheelDialogCherokee.show(getSupportFragmentManager(),"Oil Spec");
    }




}