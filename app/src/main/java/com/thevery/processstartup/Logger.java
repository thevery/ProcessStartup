package com.thevery.processstartup;

import android.util.Log;

public class Logger {
    private static final String TAG = "ProcessStartup";

    public static void logd(String message) {
        Log.d(TAG, "[" + Thread.currentThread() + "/" + android.os.Process.myPid() + "]" + message);
    }
}
