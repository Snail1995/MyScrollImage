package com.xiaohong.myscrollimage.widght;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/**
 * Created by XIAOHONG
 * Author: XIAOHONG.
 * Date: 2018/5/31.
 */

public class MyDampView extends ScrollView {
    private int mLast

    public MyDampView(Context context) {
        super(context);
    }

    public MyDampView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyDampView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        return true;
    }

    @Override
        public void computeScroll() {
        super.computeScroll();
    }
}
