package com.example.aniqa.funtasticquizapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;


public class QuizActivity extends AppCompatActivity {
    private  Questionnaire questionnaire=new Questionnaire();

    private TextView mScoreView = findViewById(R.id.score);
    private TextView mQuestionView = (TextView)findViewById(R.id.questionText);
    private Button buttonChoice1;
    private Button buttonChoice2;
    private Button buttonChoice3;
    private Button buttonChoice4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        buttonChoice1=(Button)findViewById(R.id.btn_one);
        buttonChoice2=(Button)findViewById(R.id.btn_two);
        buttonChoice3=(Button)findViewById(R.id.btn_three);
        buttonChoice4=(Button)findViewById(R.id.btn_four);
        updateQuestion();

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonChoice1.getText() ==mAnswer ) {
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "correct" , Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this, "wrong" , Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonChoice2.getText() ==mAnswer ) {
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "correct" , Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this, "wrong" , Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonChoice3.getText() ==mAnswer ) {
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "correct" , Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this, "wrong" , Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonChoice4.getText() ==mAnswer ) {
                    mScore = mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "correct" , Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(QuizActivity.this, "wrong" , Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    public void updateQuestion()
    {
        mQuestionView.setText(questionnaire.getQuestion(mQuestionNumber));
        buttonChoice1.setText(questionnaire.getchoice1(mQuestionNumber));
        buttonChoice2.setText(questionnaire.getchoice2(mQuestionNumber));
        buttonChoice3.setText(questionnaire.getchoice3(mQuestionNumber));
        buttonChoice4.setText(questionnaire.getchoice4(mQuestionNumber));
        mAnswer=questionnaire.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }
    private  void updateScore(int point)
    {
    mScoreView.setText("" + mScore);
    }
}
