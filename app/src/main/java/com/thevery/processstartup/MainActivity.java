package com.thevery.processstartup;

import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.thevery.processstartup.Logger.logd;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logd("MainActivity.onCreate");
        setContentView(R.layout.activity_main);
        logd("MainActivity.call on mainprocess cp");
        getContentResolver().call(Uri.parse("content://com.thevery.processstartup.mainprocess"), "", null, null);
        logd("MainActivity.call on otherprocess cp");
        getContentResolver().call(Uri.parse("content://com.thevery.processstartup.otherprocess"), "", null, null);
    }
}
