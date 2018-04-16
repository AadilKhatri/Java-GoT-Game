/*
Aadil Khatri
4/11/2018
Assignment 8
Obj. Oritented Programming
 */

package aadilkhatri.cs3354.txstate.edu.gotv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button TrueButton;
    private Button FalseButton;
    private TextView question_id;
    private ArrayList<Question> questionBank;
    int currentIndex = 0;

    private void initialize() {
        questionBank = new ArrayList<Question>();
        questionBank.add (new Question(R.string.q1, true));
        questionBank.add (new Question(R.string.q2, false));
        questionBank.add (new Question(R.string.q3, true));
        questionBank.add (new Question(R.string.q4, true));
        questionBank.add (new Question(R.string.q5, false));
        questionBank.add (new Question(R.string.q6, false));
        questionBank.add (new Question(R.string.q7, true));
        questionBank.add (new Question(R.string.q8, false));
        questionBank.add (new Question(R.string.q9, false));
        questionBank.add (new Question(R.string.q10, true));
        questionBank.add (new Question(R.string.q11, false));
        questionBank.add (new Question(R.string.q12, true));
        questionBank.add (new Question(R.string.q13, false));
    }

    private void checkAnswer(boolean userPressedButton) {
        if(userPressedButton == questionBank.get(currentIndex).isTrueQuestion()) {
            Toast.makeText(MainActivity.this, R.string.correct_toast,
                    Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, R.string.incorrect_toast,
                    Toast.LENGTH_SHORT).show();
        }
    }

    private void updateQuestion() {
        int question = questionBank.get(currentIndex).getQuestion();
        question_id.setText(question);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

        question_id = (TextView) findViewById(R.id.question_id);

        question_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = (currentIndex + 1) % questionBank.size();
                updateQuestion();
            }
        });
        TrueButton = (Button) findViewById(R.id.true_button);

        TrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                checkAnswer(true);
            }
        });

        FalseButton = (Button) findViewById(R.id.false_button);
        FalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(false);
            }
        });
    }

    }

