package com.avito.android.db;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.camera.camera2.internal.G;
import j.N;
import j.P;

/* compiled from: DbUtils.java */
/* loaded from: classes12.dex */
public final class j {
    public static int a(@N SQLiteDatabase sQLiteDatabase, @N String str, @P String str2, @P String[] strArr) {
        return (int) DatabaseUtils.longForQuery(sQLiteDatabase, AK.c.k("select count(*) from ", str, !TextUtils.isEmpty(str2) ? G.f(" where ", str2) : ""), strArr);
    }
}
