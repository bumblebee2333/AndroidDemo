package com.lxy.handlerdemo;


import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public class Client extends Thread{
    private static final String TAG = "Client";
    public static Handler clientHandler;
    //在run执行之前返回的是null
    public Handler getHandle(){
        return clientHandler;
    }

    @Override
    public void run() {
        Looper.prepare();
        clientHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                Log.e(TAG,"已进入run方法");
                switch (msg.what){
                    case 1:
                        Log.e(TAG,"已收到来自服务器的消息！！！");
                        default:
                            Log.e(TAG,"啊哦，什么都没有啊...");
                }
            }
        };
        Looper.loop();
    }
}
