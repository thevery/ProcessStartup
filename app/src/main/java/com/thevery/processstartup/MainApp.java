package com.thevery.processstartup;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;

import static com.thevery.processstartup.Logger.logd;

public class MainApp extends Application {
    @Override
    public void onCreate() {
        logd("MainApp.onCreate()>>>");
        for (int i = 0; i < 5; i++) {
            SystemClock.sleep(100);
            logd("MainApp.onCreate()>>");
        }
        logd("MainApp.onCreate()>");
        super.onCreate();
        logd("MainApp.onCreate()<");
        for (int i = 0; i < 5; i++) {
            SystemClock.sleep(100);
            logd("MainApp.onCreate()<<");
        }
        logd("MainApp.onCreate()<<<");
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        logd("MainApp.attachBaseContext(): " + base);
    }
}
