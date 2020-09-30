package com.example.carmaintenace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CommanderMenu extends AppCompatActivity {

    ImageButton oilButton;
    ImageButton brakeButton;
    ImageButton wheelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commander_menu);


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
                wheelDialog();
            }
        });


    }

        public void openOilDialog(){

            OilDialog oilDialogCommander = new OilDialog("6 Quarts 5W-20");
            oilDialogCommander.show(getSupportFragmentManager(),"Oil Dialog");
        }



        public void openBrakeDialog() {
            BrakeDialog brakeDialogCommander = new BrakeDialog("N/A");
            brakeDialogCommander.show(getSupportFragmentManager(), "Brake Dialog");
        }

        public void wheelDialog() {
           WheelDialog wheelDialogCommander = new WheelDialog("N/A");
           wheelDialogCommander.show(getSupportFragmentManager(),"Lug Nut Torque Spec");
        }




}