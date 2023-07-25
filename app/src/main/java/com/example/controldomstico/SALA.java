package com.example.controldomstico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.ToggleButton;

public class SALA extends AppCompatActivity {
    ToggleButton toggleButton;
    SeekBar intensitySeekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sala);
        intensitySeekBar = findViewById(R.id.intensity_seekbar);
        toggleButton = findViewById(R.id.toggle_button3);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    intensitySeekBar.setVisibility(View.VISIBLE);
                } else {
                    intensitySeekBar.setVisibility(View.GONE);
                }
            }
        });
    }

}