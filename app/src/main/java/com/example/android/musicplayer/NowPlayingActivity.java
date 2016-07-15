package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    private Button albumButton;
    private Button searchButton;
    private Button artistButton;
    private Button storeButton;
    private Button playlistButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        albumButton = (Button)findViewById(R.id.album_button);
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(NowPlayingActivity.this,AlbumActivity.class);
                startActivity(i);
            }
        });

        searchButton = (Button)findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(NowPlayingActivity.this,SearchActivity.class);
                startActivity(i);
            }
        });

        artistButton = (Button)findViewById(R.id.artist_button);
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(NowPlayingActivity.this,ArtistActivity.class);
                startActivity(i);
            }
        });

        storeButton = (Button)findViewById(R.id.store_button);
        storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(NowPlayingActivity.this,StoreActivity.class);
                startActivity(i);
            }
        });

        playlistButton = (Button)findViewById(R.id.playlist_button);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(NowPlayingActivity.this,PlaylistActivity.class);
                startActivity(i);
            }
        });


    }

}
