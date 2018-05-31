package com.xiaohong.myscrollimage;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.xiaohong.myscrollimage.widght.DampView;

public class MainActivity extends AppCompatActivity {

    private DampView mDampView;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDampView = (DampView) findViewById(R.id.mian_view);
        mImageView = (ImageView) findViewById(R.id.iv_main);
        mDampView.setImageView(mImageView);
    }
}
