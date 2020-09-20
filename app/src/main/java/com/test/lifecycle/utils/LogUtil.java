package com.test.lifecycle.utils;

import android.util.Log;

/**
 * o
 * Author：Xll
 * Create 2020/9/20 14:18
 *
 * @Description TODO
 **/
public class LogUtil {
    static String TAG = "LogUtil";

    public  static  void d(String msg) {
        Log.d(TAG, msg);
    }

    public static void d(String tag, String msg) {
        Log.d(tag, msg);
    }
}
