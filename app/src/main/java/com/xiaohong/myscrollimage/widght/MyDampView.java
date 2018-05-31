package com.xiaohong.myscrollimage.widght;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Scroller;

/**
 * Created by XIAOHONG
 * Author: XIAOHONG.
 * Date: 2018/5/31.
 */

public class MyDampView extends ScrollView {

    private Scroller mScroller;

    // 记录 手指最后的位置
    private int mLastX;
    private int mLastY;

    // 记录滑动的距离
    private int dx;
    private int dy;

    private ImageView mImageView;


    public void setImageView(ImageView imageView) {
        mImageView = imageView;
    }

    public MyDampView(Context context) {
        super(context);
        init(context);
    }

    public MyDampView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyDampView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mScroller = new Scroller(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        // 记录手指放下的位置
        int x = (int) ev.getX();
        int y = (int) ev.getY();


        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (mScroller.isFinished()) {
                    super.onTouchEvent(ev);
                }
                break;
            case MotionEvent.ACTION_MOVE:


                break;
            case MotionEvent.ACTION_UP:
                // 会弹
                mScroller.startScroll(mLastX, mLastY, dx, dy, 1000);
                postInvalidate();
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void computeScroll() {
        // 判断滚动是否 结束
        if (mScroller.computeScrollOffset()) {
            invalidate();
        }
    }
}
