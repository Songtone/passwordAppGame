package com.example.songt.password;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

    private Button mResetWordButton;

    private EditText mEditText1;
    private EditText mEditText2;
    private EditText mEditText3;
    private EditText mEditText4;
    private EditText mEditText5;
    private EditText mEditText6;
    private EditText mEditText7;
    private EditText mEditText8;
    private EditText mEditText9;
    private EditText mEditText10;
    private EditText mEditText11;
    private EditText mEditText12;
    private EditText mEditText13;
    private EditText mEditText14;

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

        mResetWordButton = (Button) findViewById(R.id.resetWordButton);

        mHideButton = (Button) findViewById(R.id.hideButton);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
        mEditText3 = (EditText) findViewById(R.id.editText3);
        mEditText4 = (EditText) findViewById(R.id.editText4);
        mEditText5 = (EditText) findViewById(R.id.editText5);
        mEditText6 = (EditText) findViewById(R.id.editText6);
        mEditText7 = (EditText) findViewById(R.id.editText7);
        mEditText8 = (EditText) findViewById(R.id.editText8);
        mEditText9 = (EditText) findViewById(R.id.editText9);
        mEditText10 = (EditText) findViewById(R.id.editText10);
        mEditText11 = (EditText) findViewById(R.id.editText11);
        mEditText12 = (EditText) findViewById(R.id.editText12);
        mEditText13 = (EditText) findViewById(R.id.editText13);
        mEditText14 = (EditText) findViewById(R.id.editText14);


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
                mEditText1.setText("");
                mEditText2.setText("");
                mEditText3.setText("");
                mEditText4.setText("");
                mEditText5.setText("");
                mEditText6.setText("");
                mEditText7.setText("");
                mEditText8.setText("");
                mEditText9.setText("");
                mEditText10.setText("");
                mEditText11.setText("");
                mEditText12.setText("");
                mEditText13.setText("");
                mEditText14.setText("");
            }
        });

        //reset section ----------------------------------------------------------------------------------------------
        mResetWordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateWordView();
                mEditText1.setText("");
                mEditText2.setText("");
                mEditText3.setText("");
                mEditText4.setText("");
                mEditText5.setText("");
                mEditText6.setText("");
                mEditText7.setText("");
                mEditText8.setText("");
                mEditText9.setText("");
                mEditText10.setText("");
                mEditText11.setText("");
                mEditText12.setText("");
                mEditText13.setText("");
                mEditText14.setText("");
            }
        });

        //hide word section -------------------------------------------------------------------------------------------
        mHideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mWordHidden == false){
                    hideWordView();
                    mWordHidden = true;
                    mHideButton.setText("UNHIDE WORD");
                }
                else if(mWordHidden == true){
                    unhideWordView();
                    mWordHidden = false;
                    mHideButton.setText("HIDE WORD");
                }
            }
        });
    }

    //functions being used -----------------------------------------------------------------------------------------------
    private void updateWordView(){
        Random r = new Random();
        mWordNumber = r.nextInt(mWordBank.wordBankLength() - 1) +1;
        mWordView.setText(mWordBank.getWord(mWordNumber));
        mWordHidden = false;
    }
    private void hideWordView(){
        mWordView.setText("");
        mWordHidden = false;
    }
    private void unhideWordView(){
        mWordView.setText(mWordBank.getWord(mWordNumber));
        mWordHidden = false;
    }
    private void updateRoundNumber(int roundNumber){mRoundNumberView.setText(""+mRoundNumber);}
    private void updateBlueScore(int bluePoint){mBlueScoreView.setText(""+mBlueScore);}
    private void updateRedScore(int redPoint){mRedScoreView.setText(""+mRedScore);}
}
