package com.squareup.picasso;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;

@RestrictTo
/* loaded from: classes7.dex */
public final class PicassoProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@N Uri uri, @P String str, @P String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @P
    public final String getType(@N Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @P
    public final Uri insert(@N Uri uri, @P ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        getContext();
        return true;
    }

    @Override // android.content.ContentProvider
    @P
    public final Cursor query(@N Uri uri, @P String[] strArr, @P String str, @P String[] strArr2, @P String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@N Uri uri, @P ContentValues contentValues, @P String str, @P String[] strArr) {
        return 0;
    }
}
