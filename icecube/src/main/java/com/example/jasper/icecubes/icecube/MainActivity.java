package com.example.jasper.icecubes.icecube;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton iceCubeBtn = (ImageButton) findViewById(R.id.iceCubeButton);
    //MediaPlayer mp = MediaPlayer.create(this, )

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iceCubeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Toast.makeText(getApplicationContext(), "Elmo you have " + count + " icecubes!", Toast.LENGTH_LONG).show();
                if (count == 5) {
                    Toast.makeText(getApplicationContext(), "Your a hero!!!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
