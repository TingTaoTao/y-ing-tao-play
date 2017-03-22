package com.yt.ijkplayer_self.ijkplay.activity;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import com.yt.ijkplayer_self.R;
import com.yt.ijkplayer_self.ijkplay.manager.GiraffePlayer;

/**
 * Created by jiatao on 2017/3/22.
 */

public class SelfPlayActivity extends Activity {
    GiraffePlayer player;
//    String url = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4";
    String url = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f30.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.self_play_activity);
        intPlayer();
    }

    private void intPlayer(){
        player = new GiraffePlayer(this);
        player.onComplete(new Runnable() {//视频播放完成
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "video play completed",Toast.LENGTH_SHORT).show();
            }
        });
        player.onError(new GiraffePlayer.OnErrorListener() {//视频播放出错
            @Override
            public void onError(int what, int extra) {
                Toast.makeText(getApplicationContext(), "video play error",Toast.LENGTH_SHORT).show();
            }
        });

        player.play(url);
        player.setTitle(url);
        player.setShowNavIcon(false);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (player != null) {
            player.onPause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (player != null) {
            player.onResume();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player.onDestroy();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (player != null) {
            player.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void onBackPressed() {
        if (player != null && player.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }
}
