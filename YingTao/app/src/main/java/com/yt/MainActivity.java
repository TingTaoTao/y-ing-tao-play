package com.yt;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.yt.ijkpalyer_view.ijkplay.activity.IjkPlayActivity;
import com.yt.ijkpalyer_view.ijkplay.activity.LivePlayActivity;
import com.yt.ijkpalyer_view.ijkplay.activity.OriginPlayActivity;
import com.yt.ijkpalyer_view.ijkplay.activity.PlayerActivity;
import com.yt.ijkpalyer_view.ijkplay.activity.VerPlayActivity;
import com.yt.ijkpalyer_view.videoplay.activity.ZZPlayerDemoActivity;
import com.yt.ijkplayer_self.ijkplay.activity.SelfPlayActivity;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.video_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ZZPlayerDemoActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.ijk_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IjkPlayActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.live_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LivePlayActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.origin_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OriginPlayActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.ver_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VerPlayActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.self_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SelfPlayActivity.class);
                startActivity(intent);
            }
        });
    }
}
