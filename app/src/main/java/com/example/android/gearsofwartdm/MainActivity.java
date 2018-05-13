package com.example.android.gearsofwartdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView scoreViewHumans;
    private TextView scoreViewLocust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewHumans = (TextView) findViewById(R.id.cog_score);
        scoreViewLocust = (TextView) findViewById(R.id.locust_score);
    }

    //Tracks the score for the COG
    private int firstKillHumans = 0;
    //Tracks the score for the Locust
    private int firstKillLocust = 0;


    /**
     * Displays the given score for the COG
     */
    public void displayForCog(int score) {
        scoreViewHumans.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for the Locust
     */
    public void displayForLocust(int score) {
        scoreViewLocust.setText(String.valueOf(score));
    }


    /**
     * When you press the 1 Kill button for the COG
     */
    public void cogKill(View view) {
        firstKillHumans = firstKillHumans + 175;
        displayForCog(firstKillHumans);
    }


    /**
     * When you press the DBNO(down but not out) button for the COG
     */
    public void cogDown(View view) {
        firstKillHumans = firstKillHumans + 50;
        displayForCog(firstKillHumans);
    }


    /**
     * When you press the Assist button for the COG
     */

    public void cogAssist(View view) {
        firstKillHumans = firstKillHumans + 30;
        displayForCog(firstKillHumans);
    }


    /**
     * When you press the Revive button for the COG
     */
    public void cogSuicide(View view) {
        firstKillHumans = firstKillHumans - 100;
        displayForCog(firstKillHumans);
    }


    /**
     * When you press the 1 Kill button for the Locust
     */

    public void locustKill(View view) {
        firstKillLocust = firstKillLocust + 175;
        displayForLocust(firstKillLocust);
    }

    /**
     * When you press the DBNO(down but not out) button for the Locust
     */
    public void locustDown(View view) {
        firstKillLocust = firstKillLocust + 50;
        displayForLocust(firstKillLocust);
    }

    /**
     * When you press the Assist button for the Locust
     */
    public void locustAssist(View view) {
        firstKillLocust = firstKillLocust + 30;
        displayForLocust(firstKillLocust);
    }

    /**
     * When you press the Revive button for the Locust
     */
    public void locustSuicide(View view) {
        firstKillLocust = firstKillLocust - 100;
        displayForLocust(firstKillLocust);
    }

    /**
     * When you press the Restart Game button
     */
    public void rematch(View view) {
        firstKillHumans = 0;
        firstKillLocust = 0;
        displayForCog(firstKillHumans);
        displayForLocust(firstKillLocust);
    }
}


