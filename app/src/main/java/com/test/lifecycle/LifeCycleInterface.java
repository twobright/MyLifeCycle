package com.test.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Author：Xll
 * Create 2020/9/20 13:57
 *
 * @Description TODO
 **/
public interface LifeCycleInterface extends LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume();

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void pause();

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy();
}
