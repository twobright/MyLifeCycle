package com.test.lifecycle;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.test.lifecycle.utils.LogUtil;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyHandler myHandler = new MyHandler();
        getLifecycle().addObserver(myHandler);
        myHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_LONG).show();
            }
        }, 2000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
     LogUtil.d("OnDestroy :");
    }
}