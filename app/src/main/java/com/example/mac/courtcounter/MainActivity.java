package com.example.mac.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int scoreBoardTeamA=0;
    public int scoreBoardTeamB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayValue(int teamValue)
    {
        TextView counterTextA=(TextView) findViewById(R.id.scoreTeamA);
        TextView counterTextB=(TextView) findViewById(R.id.scoreTeamB);
        if(teamValue==1)
        {
                counterTextA.setText(Integer.toString(scoreBoardTeamA));
        }
        else if(teamValue==2)
        {
            counterTextB.setText(Integer.toString(scoreBoardTeamB));
        }
        else
        {
            counterTextA.setText(Integer.toString(scoreBoardTeamA));
            counterTextB.setText(Integer.toString(scoreBoardTeamB));
        }
    }

    /**Team A Buttons*/

    public void threePointsForTeamA(View view)
    {
        scoreBoardTeamA+=3;
        displayValue(1);
    }

    public void twoPointsForTeamA(View view)
    {
        scoreBoardTeamA+=2;
        displayValue(1);
    }


    /*Team B Buttons*/
    public void threePointsForTeamB(View view)
    {
        scoreBoardTeamB+=3;
        displayValue(2);
    }

    public void twoPointsForTeamB(View view)
    {
        scoreBoardTeamB+=2;
        displayValue(2);
    }

    /*For Both Teams*/
    public void freePointsForTeams(View view)
    {
        scoreBoardTeamA+=1;
        scoreBoardTeamB+=1;
        displayValue(0);
    }

    public  void resetScores(View view)
    {
        scoreBoardTeamA=0;
        scoreBoardTeamB=0;
        displayValue(0);
    }
}
