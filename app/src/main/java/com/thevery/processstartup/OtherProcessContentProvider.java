package com.thevery.processstartup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;

import static com.thevery.processstartup.Logger.logd;

public class OtherProcessContentProvider extends ContentProvider {
    public OtherProcessContentProvider() {
        logd("OtherProcessContentProvider()");
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // Implement this to handle requests to delete one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public String getType(Uri uri) {
        logd("OtherProcessContentProvider.getType");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void attachInfo(Context context, ProviderInfo info) {
        logd("OtherProcessContentProvider.attachInfo()");
        super.attachInfo(context, info);
    }

    @Nullable
    @Override
    public Bundle call(String method, String arg, Bundle extras) {
        logd("OtherProcessContentProvider.call()>>>");
        for (int i = 0; i < 5; i++) {
            SystemClock.sleep(100);
            logd("OtherProcessContentProvider.call()>>");
        }
        Bundle call = super.call(method, arg, extras);
        for (int i = 0; i < 5; i++) {
            SystemClock.sleep(100);
            logd("OtherProcessContentProvider.call()<<");
        }
        logd("OtherProcessContentProvider.call()<<<");
        return call;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        // TODO: Implement this to handle requests to insert a new row.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean onCreate() {
        logd("OtherProcessContentProvider.onCreate(); getContext() = " + getContext());
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        logd("OtherProcessContentProvider.query()");
        return new MatrixCursor(new String[]{});
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        // TODO: Implement this to handle requests to update one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
