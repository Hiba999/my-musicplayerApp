package com.example.tp4_player;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;
import android.media.MediaPlayer;

public class ServiceMusic extends Service {
    private MediaPlayer mediaPlayer;
    public ServiceMusic() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;

    }

    @Override
    public void onCreate(){
        super.onCreate();
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.song);
      //  Toast.makeText(this, "Service created", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        mediaPlayer.release();
        super.onDestroy();
        //Toast.makeText(this, "Service destroyed", Toast.LENGTH_LONG).show();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();
        return START_STICKY;
        //Toast.makeText(this, "Service started", Toast.LENGTH_LONG).show();
    }




}