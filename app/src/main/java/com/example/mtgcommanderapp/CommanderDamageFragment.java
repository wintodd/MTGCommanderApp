package com.example.mtgcommanderapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class CommanderDamageFragment extends Fragment {

    Button o1subtractHealthButton;
    Button o2subtractHealthButton;
    Button o3subtractHealthButton;
    Button o1addHealthButton;
    Button o2addHealthButton;
    Button o3addHealthButton;
    EditText o1playerHealthEditText;
    EditText o2playerHealthEditText;
    EditText o3playerHealthEditText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_commander_damage, container, false);
    }

    @Override
    public void onViewCreated(View v, Bundle savedInstanceState) {
        o1subtractHealthButton = (Button) v.findViewById(R.id.opponentOneSubtractHealthButton);
        o1addHealthButton = (Button) v.findViewById(R.id.opponentOneAddHealthButton);
        o1playerHealthEditText = (EditText) v.findViewById(R.id.opponentOneHealth);

        o2subtractHealthButton = (Button) v.findViewById(R.id.opponentTwoSubtractHealthButton);
        o2addHealthButton = (Button) v.findViewById(R.id.opponentTwoAddHealthButton);
        o2playerHealthEditText = (EditText) v.findViewById(R.id.opponentTwoHealth);

        o3subtractHealthButton = (Button) v.findViewById(R.id.opponentThreeSubtractHealthButton);
        o3addHealthButton = (Button) v.findViewById(R.id.opponentThreeAddHealthButton);
        o3playerHealthEditText = (EditText) v.findViewById(R.id.opponentThreeHealth);

        o1subtractHealthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Change playerHealthEditText value from editable to int
                int health = Integer.parseInt(String.valueOf(o1playerHealthEditText.getText()));
                if(health > 0) {
                    o1playerHealthEditText.setText(String.valueOf(health - 1));
                }
            }
        });

        o1addHealthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Change playerHealthEditText value from editable to int
                int health = Integer.parseInt(String.valueOf(o1playerHealthEditText.getText()));
                o1playerHealthEditText.setText(String.valueOf(health + 1));
            }
        });

        o2subtractHealthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Change playerHealthEditText value from editable to int
                int health = Integer.parseInt(String.valueOf(o2playerHealthEditText.getText()));
                if(health > 0) {
                    o2playerHealthEditText.setText(String.valueOf(health - 1));
                }
            }
        });

        o2addHealthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Change playerHealthEditText value from editable to int
                int health = Integer.parseInt(String.valueOf(o2playerHealthEditText.getText()));
                o2playerHealthEditText.setText(String.valueOf(health + 1));
            }
        });

        o3subtractHealthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Change playerHealthEditText value from editable to int
                int health = Integer.parseInt(String.valueOf(o3playerHealthEditText.getText()));
                if(health > 0) {
                    o3playerHealthEditText.setText(String.valueOf(health - 1));
                }
            }
        });

        o3addHealthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Change playerHealthEditText value from editable to int
                int health = Integer.parseInt(String.valueOf(o3playerHealthEditText.getText()));
                o3playerHealthEditText.setText(String.valueOf(health + 1));
            }
        });
    }
}
