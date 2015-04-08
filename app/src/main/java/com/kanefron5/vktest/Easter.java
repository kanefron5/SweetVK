package com.kanefron5.vktest;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Роман on 06.04.2015.
 */
public class Easter extends Start {
    MediaPlayer mPlay;
    private int x;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        {
            setContentView(R.layout.easter);
            mPlay = MediaPlayer.create(this, R.raw.music);
            mPlay.start();
            mPlay.setLooping(true);
        }


    }


    @Override
    public void onDestroy() {

        mPlay.stop();
        onStop();

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Easter.this, Start.class);
        startActivity(i);
        mPlay.stop();

    }

    public void onYaClick(View view) {
        mPlay.stop();
        x++;
        if (x>3)
            x=0;
        Intent chainglog = new Intent(Easter.this, Chaing.class);
        startActivity(chainglog);
    }


}







