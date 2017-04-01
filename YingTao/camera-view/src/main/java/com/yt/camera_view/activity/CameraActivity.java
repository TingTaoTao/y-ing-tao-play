package com.yt.camera_view.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.yt.camera_view.JCameraView;
import com.yt.camera_view.R;
import com.yt.camera_view.utils.CheckPermissionsUtil;
import com.yt.camera_view.utils.FileUtil;

/**
 * Created by jiatao on 2017/4/1.
 */

public class CameraActivity extends AppCompatActivity {
    private JCameraView mJCameraView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //////////////////////////////////////////////////////////////////
        //Andriod6.0 running permission
        CheckPermissionsUtil checkPermissionsUtil = new CheckPermissionsUtil(this);
        checkPermissionsUtil.requestAllPermission(this);
        mJCameraView = (JCameraView) findViewById(R.id.cameraview);
        //设置视频保存路径（如果不设置默认为Environment.getExternalStorageDirectory().getPath()）
        mJCameraView.setAutoFoucs(false);
        mJCameraView.setSaveVideoPath(Environment.getExternalStorageDirectory().getPath());
        mJCameraView.setCameraViewListener(new JCameraView.CameraViewListener() {
            @Override
            public void quit() {
                finish();
            }
            @Override
            public void captureSuccess(Bitmap bitmap) {
                FileUtil.saveBitmap(bitmap);
                Toast.makeText(CameraActivity.this, "获取到照片Bitmap:" + bitmap.getHeight(), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void recordSuccess(String url) {
                Toast.makeText(CameraActivity.this, "获取到视频路径:" + url, Toast.LENGTH_SHORT).show();
            }
        });
        //////////////////////////////////////////////////////////////////
    }


    @Override
    protected void onResume() {
        super.onResume();
        mJCameraView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mJCameraView.onPause();
    }
}
