package com.thevery.processstartup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

import static com.thevery.processstartup.Logger.logd;

public class MainProcessContentProvider extends ContentProvider {
    public MainProcessContentProvider() {
        logd("MainProcessContentProvider()");
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        // Implement this to handle requests to delete one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public String getType(Uri uri) {
        logd("MainProcessContentProvider.getType()");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        // TODO: Implement this to handle requests to insert a new row.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void attachInfo(Context context, ProviderInfo info) {
        logd("MainProcessContentProvider.attachInfo()");
        super.attachInfo(context, info);
    }

    @Nullable
    @Override
    public Bundle call(String method, String arg, Bundle extras) {
        logd("MainProcessContentProvider.call()");
        return super.call(method, arg, extras);
    }

    @Override
    public boolean onCreate() {
        logd("MainProcessContentProvider.onCreate(); getContext() = " + getContext());
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        // TODO: Implement this to handle query requests from clients.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        // TODO: Implement this to handle requests to update one or more rows.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
