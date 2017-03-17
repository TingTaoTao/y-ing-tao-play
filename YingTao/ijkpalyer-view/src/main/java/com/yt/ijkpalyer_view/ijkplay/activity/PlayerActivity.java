package com.yt.ijkpalyer_view.ijkplay.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.yt.ijkpalyer_view.R;
import com.yt.ijkpalyer_view.ijkplay.common.PlayerManager;

public class PlayerActivity extends AppCompatActivity implements PlayerManager.PlayerStateListener{
    private String url1 = "rtmp://203.207.99.19:1935/live/CCTV1";
    private String url2 = "rtmp://203.207.99.19:1935/live/CCTV2";
    private String url3 = "rtmp://203.207.99.19:1935/live/CCTV3";
    private String url5 = "rtmp://203.207.99.19:1935/live/CCTV5";
    private String url6 = "rtmp://203.207.99.19:1935/live/CCTV7";

    private String url_2 = "http://zv.3gv.ifeng.com/live/zhongwen800k.m3u8";
    private String url_3 = "rtsp://184.72.239.149/vod/mp4:BigBuckBunny_115k.mov";
    private String url_4 = "http://42.96.249.166/live/24035.m3u8";

    private String url_cctv1 = "rtmp://202.117.80.19:1935/live/live4";


    private PlayerManager player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        initPlayer();
    }

    private void initPlayer() {
        player = new PlayerManager(this);
        player.setFullScreenOnly(true);
        player.setScaleType(PlayerManager.SCALETYPE_FILLPARENT);
        player.playInFullScreen(true);
        player.setPlayerStateListener(this);
        player.play(url1);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (player.gestureDetector.onTouchEvent(event))
            return true;
        return super.onTouchEvent(event);
    }

    @Override
    public void onComplete() {
    }

    @Override
    public void onError() {
    }

    @Override
    public void onLoading() {
    }

    @Override
    public void onPlay() {
    }
}
