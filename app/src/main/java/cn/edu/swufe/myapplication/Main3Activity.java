package cn.edu.swufe.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity{

    private Button score_A_1;
    private Button score_A_2;
    private Button score_A_3;
    private Button score_B_1;
    private Button score_B_2;
    private Button score_B_3;
    private Button btn_re;
    private TextView team_a;
    private TextView team_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        score_A_1 = findViewById(R.id.button4);
        score_A_2 = findViewById(R.id.button3);
        score_A_3 = findViewById(R.id.button2);
        score_B_1 = findViewById(R.id.button7);
        score_B_2= findViewById(R.id.button6);
        score_B_3 = findViewById(R.id.button5);
        btn_re = findViewById(R.id.button8);
        team_a = findViewById(R.id.a_score);
        team_b = findViewById(R.id.b_score);
    }
    public void onClick_A(View view){
        if(view == score_A_1)
            add_A(1);
        else if(view == score_A_2)
            add_A(2);
        else
            add_A(3);

    }
    public void onClick_B(View view){
        if(view == score_B_1)
            add_B(1);
        else if(view == score_B_2)
            add_B(2);
        else
            add_B(3);
    }
    public void add_A(int num){
        int score;
        String str = team_a.getText().toString();
        score = Integer.parseInt(str) + num;
        team_a.setText(score+"");
    }
    public void add_B(int num){
        int score;
        String str = team_b.getText().toString();
        score = Integer.parseInt(str) + num;
        team_b.setText(score+"");
    }
    public void onClick_reset(View view){
        team_a.setText(0+"");
        team_b.setText(0+"");
    }




}
