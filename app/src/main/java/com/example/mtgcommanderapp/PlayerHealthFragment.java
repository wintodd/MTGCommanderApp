package com.example.mtgcommanderapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class PlayerHealthFragment extends Fragment {
    public PlayerHealthFragment() {
        // Required empty public constructor
    }

    Button subtractHealthButton;
    Button addHealthButton;
    EditText playerHealthEditText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_player_health, container, false);
    }

    @Override
    public void onViewCreated(View v, Bundle savedInstanceState) {
        subtractHealthButton = (Button) v.findViewById(R.id.subtractHealthButton);
        addHealthButton = (Button) v.findViewById(R.id.addHealthButton);
        playerHealthEditText = (EditText) v.findViewById(R.id.opponentOneHealth);

        subtractHealthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Change playerHealthEditText value from editable to int
                int health = Integer.parseInt(String.valueOf(playerHealthEditText.getText()));
                if(health > 0) {
                    playerHealthEditText.setText(String.valueOf(health - 1));
                }
            }
        });

        addHealthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Change playerHealthEditText value from editable to int
                int health = Integer.parseInt(String.valueOf(playerHealthEditText.getText()));
                playerHealthEditText.setText(String.valueOf(health + 1));
            }
        });

    }
}