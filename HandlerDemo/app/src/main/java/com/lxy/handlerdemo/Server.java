package com.lxy.handlerdemo;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class Server extends Thread{
    private static final String TAG = "Server";

    @Override
    public void run() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Message msg = Message.obtain();
        msg.what = 1;
        Client client = new Client();
        Handler handler = client.getHandle();
        handler.sendMessage(msg);
        Log.e(TAG,"服务端在发消息了");
    }
}
