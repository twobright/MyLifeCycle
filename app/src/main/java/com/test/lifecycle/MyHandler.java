package com.test.lifecycle;

import android.os.Handler;

import com.test.lifecycle.utils.LogUtil;

/**
 * Author：Xll
 * Create 2020/9/20 13:55
 *
 * @Description TODO
 **/
public  class MyHandler extends Handler implements LifeCycleInterface {


    @Override
    public void onResume() {
        LogUtil.d("MyHandler onResume :");
    }

    @Override
    public void pause() {
        LogUtil.d("MyHandler pause :");
    }

    @Override
    public void onDestroy() {
        LogUtil.d(" MyHandler onDestroy :");
        removeCallbacksAndMessages(null);

    }
}
