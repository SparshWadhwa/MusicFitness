package com.example.deepanshibansal.musicfitness;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click=(Button)findViewById(R.id.click);
        click.setOnClickListener(this);


    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.click :
                startActivity(new Intent(this,music.class));
                break;
        }
    }

}
