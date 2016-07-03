package com.example.seokjoo.serviceex;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service implements Runnable {

    int count;
    public MyService() {
    }

    @Override
    public void onCreate() {
        Log.i(Global.TAG,"onCreate");
        super.onCreate();
        count=0;
        Thread Mythread = new Thread(this);
        Mythread.start();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(Global.TAG,"isRUNNING : " + count);
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void run() {
        while(true) {
            try {
                Log.i(Global.TAG, "service called : " + count);
                count++;

                Thread.sleep(3000);

            } catch (Exception ex) {
                Log.i(Global.TAG, "exception : " + ex);
            }
        }
    }
}
