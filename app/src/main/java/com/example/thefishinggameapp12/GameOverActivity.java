package com.example.thefishinggameapp12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {
    private Button StartAgain;
    private TextView Score;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        score =getIntent().getExtras().get("score").toString();
        StartAgain =(Button) findViewById(R.id.start_btn);
        Score =findViewById(R.id.score);
        StartAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainintent =new Intent(GameOverActivity.this,MainActivity.class);
                startActivity(mainintent);

            }
        });
        Score.setText("score=" +score);
    }
}
