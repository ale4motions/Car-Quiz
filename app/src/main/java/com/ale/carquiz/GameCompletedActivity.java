package com.ale.carquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameCompletedActivity extends AppCompatActivity {
    private TextView textScreen, textQuestion, textTitle, textBtn;
    private ImageView bigboss;
    private Animation smalltobig;
    private Button backToHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_completed);

        backToHomeButton = (Button) findViewById(R.id.continueButton);
        backToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameCompletedActivity.this, HomeActivity.class));
            }
        });

    }
}
