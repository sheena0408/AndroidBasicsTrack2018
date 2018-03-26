package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counterB=0,counterA=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(counterA);
        displayForTeamA(counterB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayWinner(View view) {
        TextView winView = (TextView) findViewById(R.id.win);
        if(counterA > counterB)
            winView.setText("Team A Wins!");
        else if(counterB > counterA)
            winView.setText("Team B Wins!");
        else
            winView.setText("Draw");
        ;
    }

    public void addSixA(View view) {
        counterA+=6;
        displayForTeamA(counterA);
    }

    public void addThreeA(View view) {
        counterA+=3;
        displayForTeamA(counterA);
    }

    public void addTwoA(View view) {
        counterA+=2;
        displayForTeamA(counterA);
    }

    public void addOneA(View view) {
        counterA+=1;
        displayForTeamA(counterA);
    }

    public void addSixB(View view) {
        counterB+=6;
        displayForTeamB(counterB);
    }

    public void addThreeB(View view) {
        counterB+=3;
        displayForTeamB(counterB);
    }

    public void addTwoB(View view) {
        counterB+=2;
        displayForTeamB(counterB);
    }

    public void addOneB(View view) {
        counterB+=1;
        displayForTeamB(counterB);
    }
    public void reset(View view) {
        counterA=0;
        counterB=0;
        TextView winView = (TextView) findViewById(R.id.win);
        winView.setText("");
        displayForTeamA(counterA);
        displayForTeamB(counterB);
    }

}
