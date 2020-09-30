package com.example.carmaintenace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TaurusMenu extends AppCompatActivity {

    ImageButton oilButton;
    ImageButton brakeButton;
    ImageButton wheelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taurus_menu);

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

        OilDialog OilDialogTaurus = new OilDialog("5 Quarts 5W-30");
        OilDialogTaurus.show(getSupportFragmentManager(), "Oil Dialog");

    }

    public void openBrakeDialog() {

        BrakeDialog BrakeDialogTaurus = new BrakeDialog("N/A");
        BrakeDialogTaurus.show(getSupportFragmentManager(), "Brake Dialog");

    }

    public void openWheelDialog() {

        WheelDialog wheelDialogTaurus = new WheelDialog("100 ft/lbs");
        wheelDialogTaurus.show(getSupportFragmentManager(), "Lug Nut Torque Spec");

    }


}