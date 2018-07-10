package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.*;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView)findViewById(R.id.imageBall);

        Button askButton = findViewById(R.id.askButton);

        final int[] ballArray = new int[]
                {
                    R.drawable.ball1,
                    R.drawable.ball2,
                    R.drawable.ball3,
                    R.drawable.ball4,
                    R.drawable.ball5
                };

        askButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Random rnd = new Random();
                int randNum = rnd.nextInt(5);
                ballDisplay.setImageResource(ballArray[randNum]);

            }
        });

    }
}
