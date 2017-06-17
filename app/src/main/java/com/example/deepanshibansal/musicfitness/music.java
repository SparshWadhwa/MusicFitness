package com.example.deepanshibansal.musicfitness;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View;
import android.widget.Button;

public class music extends AppCompatActivity implements View.OnClickListener {
    Button play1;
    Button play2;
    Button pause1;
    Button pause2;
    MediaPlayer humma;
    MediaPlayer nashe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        Button play1=(Button)findViewById(R.id.play1);
        Button play2=(Button)findViewById(R.id.play2);
        Button pause1=(Button)findViewById(R.id.pause1);
        Button pause2=(Button)findViewById(R.id.pause2);
        humma = MediaPlayer.create(this,R.raw.humma);
        nashe = MediaPlayer.create(this,R.raw.nashe);
        play1.setOnClickListener(this);
        play2.setOnClickListener(this);
        pause1.setOnClickListener(this);
        pause2.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.play1:

                humma.start();
                break;
            case R.id.play2:
                nashe.start();
                break;
            case R.id.pause1:
                if (humma.isPlaying())
                    humma.pause();
                break;
            case R.id.pause2:
                if (nashe.isPlaying())
                    nashe.pause();
                break;

        }
    }
}