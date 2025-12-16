package com.avito.android.db;

import android.database.Cursor;
import j.N;
import pu.C47140a;

/* compiled from: SavedSearchDao.java */
@Deprecated
/* loaded from: classes12.dex */
public class l extends b {
    @N
    public static C47140a t(@N Cursor cursor) {
        C47140a c47140a = new C47140a();
        c47140a.f428823a = cursor.getLong(cursor.getColumnIndex("_id"));
        cursor.getString(cursor.getColumnIndex("title"));
        cursor.getString(cursor.getColumnIndex("description"));
        c47140a.f428824b = cursor.getString(cursor.getColumnIndex("search_params"));
        cursor.getString(cursor.getColumnIndex("human_readable_params"));
        cursor.getLong(cursor.getColumnIndex("timestamp"));
        cursor.getLong(cursor.getColumnIndex("latest_advert_value"));
        cursor.getInt(cursor.getColumnIndex("has_unread_changes"));
        return c47140a;
    }
}
