package com.example.tp4_player;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonPlay;
    private Button buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.buttonPlay = (Button) this.findViewById(R.id.button_start);
        this.buttonStop = (Button) this.findViewById(R.id.button_stop);
        this.buttonPlay.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                playSong();
            }
        });
        this.buttonStop.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                stopSong();
            }
        });

        }
        public void playSong()  {
            // Create Intent object for PlaySongService.
            Intent myIntent = new Intent(MainActivity.this, ServiceMusic.class);

            // Call startService with Intent parameter.
            this.startService(myIntent);
        }
        public void stopSong() {

            // Create Intent object
            Intent myIntent = new Intent(MainActivity.this, ServiceMusic.class);
            this.stopService(myIntent);
        }


    }


