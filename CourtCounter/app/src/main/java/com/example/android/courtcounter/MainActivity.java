package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counterA=0,counterB=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(counterA);
        displayForTeamB(counterB);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThree(View view) {
        counterA+=3;
        displayForTeamA(counterA);
    }

    public void addTwo(View view) {
        counterA+=2;
        displayForTeamA(counterA);
    }

    public void addFree(View view) {
        counterA+=1;
        displayForTeamA(counterA);
    }

    public void addThreeB(View view) {
        counterB+=3;
        displayForTeamB(counterB);
    }

    public void addTwoB(View view) {
        counterB+=2;
        displayForTeamB(counterB);
    }

    public void addFreeB(View view) {
        counterB+=1;
        displayForTeamB(counterB);
    }
    public void reset(View view) {
        counterA=0;
        counterB=0;
        displayForTeamA(counterA);
        displayForTeamB(counterB);
    }
}
