package com.example.songt.password;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainGame extends AppCompatActivity {

    private WordBank mWordBank = new WordBank();

    //Score for both Teams Variables ------------------------------------------------------------------------
    private TextView mBlueScoreView;
    private TextView mRedScoreView;

    private Button mPlusBlueScore;
    private Button mPlusRedScore;
    private Button mMinusBlueScore;
    private Button mMinusRedScore;

    private int mBlueScore = 0;
    private int mRedScore = 0;

    //Next round button variables
    private TextView mWordView;
    private TextView mRoundNumberView;

    private Button mNextButton;

    private int mRoundNumber = 1;
    private int mWordNumber;

    //reset game section variables

    private Button mResetButton;

    //hide word section variables
    private Button mHideButton;

    private boolean mWordHidden = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        mBlueScoreView = (TextView) findViewById(R.id.blueScore);
        mRedScoreView = (TextView) findViewById(R.id.redScore);

        mWordView = (TextView) findViewById(R.id.word);
        mRoundNumberView = (TextView) findViewById(R.id.roundNumber);

        mMinusBlueScore = (Button) findViewById(R.id.minusBlueScore);
        mPlusBlueScore = (Button) findViewById(R.id.plusBlueScore);
        mMinusRedScore = (Button) findViewById(R.id.minusRedScore);
        mPlusRedScore = (Button) findViewById(R.id.plusRedScore);

        mNextButton = (Button) findViewById(R.id.nextButton);

        mResetButton = (Button) findViewById(R.id.resetButton);

        mHideButton = (Button) findViewById(R.id.hideButton);

        updateWordView();

        //Scoreboard Section ---------------------------------------------------------------------------------------

        mMinusBlueScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mBlueScore == 0){

                }
                else{
                    mBlueScore = mBlueScore-1;
                    updateBlueScore(mBlueScore);
                }
            }
        });

        mPlusBlueScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mBlueScore = mBlueScore+1;
               updateBlueScore(mBlueScore);
            }
        });
        mMinusRedScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mRedScore == 0){

                }
                else{
                    mRedScore = mRedScore-1;
                    updateRedScore(mRedScore);
                }
            }
        });

        mPlusRedScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRedScore = mRedScore+1;
                updateRedScore(mRedScore);
            }
        });

        //next section --------------------------------------------------------------------------------------------
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRoundNumber = mRoundNumber+1;
                updateRoundNumber(mRoundNumber);
                updateWordView();
            }
        });

        //reset section ----------------------------------------------------------------------------------------------
        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //hide word section -------------------------------------------------------------------------------------------
        mHideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mWordHidden == false){
                    hideWordView();
                    mWordHidden = true;
                }
                else if(mWordHidden == true){
                    unhideWordView();
                    mWordHidden = false;
                }
            }
        });
    }
    private void updateWordView(){
        Random r = new Random();
        mWordNumber = r.nextInt(mWordBank.wordBankLength() - 1) +1;
        mWordView.setText(mWordBank.getWord(mWordNumber));
    }
    private void hideWordView(){
        mWordView.setText("");
    }
    private void unhideWordView(){
        mWordView.setText(mWordBank.getWord(mWordNumber));
    }
    private void updateRoundNumber(int roundNumber){mRoundNumberView.setText(""+mRoundNumber);}
    private void updateBlueScore(int bluePoint){mBlueScoreView.setText(""+mBlueScore);}
    private void updateRedScore(int redPoint){mRedScoreView.setText(""+mRedScore);}
}
