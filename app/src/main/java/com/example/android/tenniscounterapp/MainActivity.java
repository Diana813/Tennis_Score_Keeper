package com.example.android.tenniscounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayer1set = 0;
    int scorePlayer2set = 0;

    int scorePlayer1gem = 0;
    int scorePlayer2gem = 0;

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    String Points = "Points";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Player1 set.
     */
    public void displayForPlayer1set(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_set_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Player2 set.
     */
    public void displayForPlayer2set(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_set_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Player1 gem.
     */
    public void displayForPlayer1gem(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_gem_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Player2 gem.
     */
    public void displayForPlayer2gem(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_gem_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player1.
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Player2.
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the title Points for Player1.
     */
    public void displayForPoints1(String text) {
        TextView textView = (TextView) findViewById(R.id.Points1);
        textView.setText(String.valueOf(text));
    }

    /**
     * Displays the title Points for Player2.
     */
    public void displayForPoints2(String text) {
        TextView textView = (TextView) findViewById(R.id.Points2);
        textView.setText(String.valueOf(text));
    }

    /**
     * Reset button.
     */

    public void resetBtn(View view) {
        scorePlayer1set = 0;
        scorePlayer2set = 0;
        scorePlayer1gem = 0;
        scorePlayer2gem = 0;
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer1set(scorePlayer1set);
        displayForPlayer2set(scorePlayer2set);
        displayForPlayer1gem(scorePlayer1gem);
        displayForPlayer2gem(scorePlayer2gem);
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
    }

    public void setPlayer1(View view) {
        scorePlayer1set = scorePlayer1set + 1;
        displayForPlayer1set(scorePlayer1set);

    }

    public void setPlayer2(View view) {
        scorePlayer2set = scorePlayer2set + 1;
        displayForPlayer2set(scorePlayer2set);

    }


    public void gemPlayer1(View view) {
        scorePlayer1gem = scorePlayer1gem + 1;
        displayForPlayer1gem(scorePlayer1gem);

    }

    public void gemPlayer2(View view) {
        scorePlayer2gem = scorePlayer2gem + 1;
        displayForPlayer2gem(scorePlayer2gem);

    }

    /**
     * Add scores Player 1 button.
     */

    public void Player1(View view) {

        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);

        if (scorePlayer1gem != 6 || scorePlayer2gem != 6) {

            Points = "Points";
            displayForPoints1(Points);

            if (scorePlayer1 == 1) {
                displayForPlayer1(15);
            }

            if (scorePlayer1 == 2) {
                displayForPlayer1(30);
            }

            if (scorePlayer1 == 3) {
                displayForPlayer1(40);
            }

            if (scorePlayer1 >= 4 && scorePlayer1 >= scorePlayer2 + 2) {

                scorePlayer1gem = scorePlayer1gem + 1;
                displayForPlayer1gem(scorePlayer1gem);
                scorePlayer2 = 0;
                scorePlayer1 = 0;
                displayForPlayer2(scorePlayer2);
                displayForPlayer1(scorePlayer1);

                if (scorePlayer1gem > 5 && scorePlayer1gem >= scorePlayer2gem + 2) {
                    scorePlayer1set = scorePlayer1set + 1;
                    displayForPlayer1set(scorePlayer1set);
                }

                if (scorePlayer2gem > 5 && scorePlayer2gem >= scorePlayer1gem + 2) {
                    scorePlayer2set = scorePlayer2set + 1;
                    displayForPlayer2set(scorePlayer2set);
                }
                if (scorePlayer1gem > 5 && scorePlayer1gem >= scorePlayer2gem + 2) {
                    scorePlayer1gem = 0;
                    scorePlayer2gem = 0;
                    scorePlayer2 = 0;
                    scorePlayer1 = 0;
                    displayForPlayer1gem(scorePlayer1gem);
                    displayForPlayer2gem(scorePlayer2gem);
                    displayForPlayer1(scorePlayer1);
                    displayForPlayer2(scorePlayer2);
                }
            }
            if (scorePlayer1 >= 4 && scorePlayer1 == scorePlayer2 + 1){
                if (scorePlayer1 == scorePlayer2 + 1){
                    String Ad = "Ad";
                    displayForPlayer1(Ad);
                }

            }
            if (scorePlayer1 >= 4 && scorePlayer1 == scorePlayer2){
                displayForPlayer1(40);
                displayForPlayer2(40);
            }
            if (scorePlayer1 >= 4 && scorePlayer1 >= scorePlayer2 + 2){
                scorePlayer1gem = scorePlayer1gem + 1;
                displayForPlayer1gem(scorePlayer1gem);
                scorePlayer2 = 0;
                scorePlayer1 = 0;
                displayForPlayer2(scorePlayer2);
                displayForPlayer1(scorePlayer1);
            }


        }
        if (scorePlayer1gem == 6 && scorePlayer2gem == 6) {

            Points = "Tie - break";
            displayForPoints1(Points);
            displayForPoints2(Points);


            if (scorePlayer1 > 6 && scorePlayer1 >= scorePlayer2 + 2) {
                scorePlayer1set = scorePlayer1set + 1;
                displayForPlayer1set(scorePlayer1set);
            }
            if (scorePlayer2 > 6 && scorePlayer2 >= scorePlayer1 + 2) {
                scorePlayer2set = scorePlayer2set + 1;
                displayForPlayer2set(scorePlayer2set);
            }
            if (scorePlayer1 > 6 && scorePlayer1 >= scorePlayer2 + 2) {
                scorePlayer1gem = 0;
                scorePlayer2gem = 0;
                scorePlayer2 = 0;
                scorePlayer1 = 0;
                Points = "Points";
                displayForPoints1(Points);
                displayForPoints2(Points);
                displayForPlayer1gem(scorePlayer1gem);
                displayForPlayer2gem(scorePlayer2gem);
                displayForPlayer1(scorePlayer1);
                displayForPlayer2(scorePlayer2);
            }

        }
    }

    private void displayForPlayer1(String Ad) {
        TextView textView = (TextView) findViewById(R.id.player_1_score);
        textView.setText(String.valueOf(Ad));
    }

    /**
     * Add scores Player 2 button.
     */
    public void Player2(View view) {

        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);

        if (scorePlayer1gem != 6 || scorePlayer2gem != 6) {

            Points = "Points";
            displayForPoints2(Points);

            if (scorePlayer2 == 1) {
                displayForPlayer2(15);
            }

            if (scorePlayer2 == 2) {
                displayForPlayer2(30);
            }

            if (scorePlayer2 == 3) {
                displayForPlayer2(40);
            }

            if (scorePlayer2 >= 4 && scorePlayer2 >= scorePlayer1 + 2) {

                scorePlayer2gem = scorePlayer2gem + 1;
                displayForPlayer2gem(scorePlayer2gem);
                scorePlayer2 = 0;
                scorePlayer1 = 0;
                displayForPlayer2(scorePlayer2);
                displayForPlayer1(scorePlayer1);

                if (scorePlayer2gem > 5 && scorePlayer2gem >= scorePlayer1gem + 2) {
                    scorePlayer2set = scorePlayer2set + 1;
                    displayForPlayer2set(scorePlayer2set);
                }

                if (scorePlayer1gem > 5 && scorePlayer1gem >= scorePlayer2gem + 2) {
                    scorePlayer1set = scorePlayer1set + 1;
                    displayForPlayer1set(scorePlayer1set);
                }
                if (scorePlayer2gem > 5 && scorePlayer2gem >= scorePlayer1gem + 2) {
                    scorePlayer2gem = 0;
                    scorePlayer1gem = 0;
                    scorePlayer2 = 0;
                    scorePlayer1 = 0;
                    displayForPlayer1gem(scorePlayer1gem);
                    displayForPlayer2gem(scorePlayer2gem);
                    displayForPlayer1(scorePlayer1);
                    displayForPlayer2(scorePlayer2);
                }
            }
            if (scorePlayer2 >= 4 && scorePlayer2 == scorePlayer1 + 1){
                if (scorePlayer2 == scorePlayer1 + 1){
                    String Ad = "Ad";
                    displayForPlayer2(Ad);
                }

            }
            if (scorePlayer2 >= 4 && scorePlayer1 == scorePlayer2){
                displayForPlayer1(40);
                displayForPlayer2(40);
            }
            if (scorePlayer2 >= 4 && scorePlayer2 >= scorePlayer1 + 2){
                scorePlayer2gem = scorePlayer2gem + 1;
                displayForPlayer2gem(scorePlayer2gem);
                scorePlayer2 = 0;
                scorePlayer1 = 0;
                displayForPlayer2(scorePlayer2);
                displayForPlayer1(scorePlayer1);
            }
        }

        if (scorePlayer1gem == 6 && scorePlayer2gem == 6) {

            Points = "Tie - break";
            displayForPoints2(Points);
            displayForPoints1(Points);


            if (scorePlayer2 > 6 && scorePlayer2 >= scorePlayer1 + 2) {
                scorePlayer2set = scorePlayer2set + 1;
                displayForPlayer2set(scorePlayer2set);
            }
            if (scorePlayer1 > 6 && scorePlayer1 >= scorePlayer2 + 2) {
                scorePlayer1set = scorePlayer1set + 1;
                displayForPlayer1set(scorePlayer1set);
            }
            if (scorePlayer2 > 6 && scorePlayer2 >= scorePlayer1 + 2) {
                scorePlayer1gem = 0;
                scorePlayer2gem = 0;
                scorePlayer2 = 0;
                scorePlayer1 = 0;
                Points = "Points";
                displayForPoints1(Points);
                displayForPoints2(Points);
                displayForPlayer1gem(scorePlayer1gem);
                displayForPlayer2gem(scorePlayer2gem);
                displayForPlayer1(scorePlayer1);
                displayForPlayer2(scorePlayer2);
            }
        }
    }

    private void displayForPlayer2(String Ad) {
        TextView textView = (TextView) findViewById(R.id.player_2_score);
        textView.setText(String.valueOf(Ad));
    }
}







