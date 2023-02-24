package com.example.gamescore2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score1 = 0;
    private int score2 = 0;
    private TextView textViewForTeam1;
    private TextView textViewForTeam2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewForTeam1 = findViewById(R.id.textViewForTeam1);
        textViewForTeam2 = findViewById(R.id.textViewForTeam2);

        if(savedInstanceState != null)
        {
            score1 = savedInstanceState.getInt("score1");
            score2 = savedInstanceState.getInt("score2");
        }

        UpdateScore1();
        UpdateScore2();

        textViewForTeam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","clicked textViewForTeam1");
                UpdateScore1();


            }
        });
        textViewForTeam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity","clicked textViewForTeam2");
                UpdateScore2();


            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private void UpdateScore1(){
        textViewForTeam1.setText(String.valueOf(++score1));
    }
    private void UpdateScore2(){
        textViewForTeam2.setText(String.valueOf(++score2));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score1",score1);
        outState.putInt("score2",score2);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}