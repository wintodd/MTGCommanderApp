package com.example.mtgcommanderapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup playerRadioGroup;
    RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerRadioGroup = (RadioGroup)findViewById(R.id.playersRadioGroup);
        playerRadioGroup.check(R.id.player2RadioButton);
    }

    //Creates the correct intent to the correct activity based on the amount of players chosen
    public void createGameButtonClicked(View v) {
        /**Shows that create game button was clicked in log
        Log.d("mainPage", "createGameButtonClicked");
        //Shows create game button was clicked in app
        //Toast.makeText(this, "Create Game button clicked", Toast.LENGTH_LONG).show();
         */

        //get selected radio button id from radio group
        int selectedId = playerRadioGroup.getCheckedRadioButtonId();

        //assign the selected radio button to selectedRadioButton attribute with the id
        selectedRadioButton = (RadioButton)findViewById(selectedId);

        if(selectedId == findViewById(R.id.player2RadioButton).getId()) {

            //Creates an intent to launch new activity
            Intent twoPlayerIntent = new Intent(this, TwoPlayerActivity.class);

            //Start new Activity
            startActivity(twoPlayerIntent);
        } else {
            if (selectedId == findViewById(R.id.player3RadioButton).getId()) {
                Intent threePlayerIntent = new Intent(this, ThreePlayerActivity.class);
                startActivity(threePlayerIntent);
            } else {
                Intent fourPlayerIntent = new Intent(this, FourPlayerActivity.class);
                startActivity((fourPlayerIntent));
            }
        }

    }
}