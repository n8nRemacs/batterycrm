package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes8.dex */
public final class ke1 {
    static {
        st.a("goog.exo.database");
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i12, String str, int i13) throws ln, SQLException {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i12));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i13));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e12) {
            throw new ln(e12);
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str) throws ln {
        try {
            if (pc1.a(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
            }
        } catch (SQLException e12) {
            throw new ln(e12);
        }
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i12, String str) throws ln {
        try {
            if (!pc1.a(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i12), str}, null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i13 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i13;
            } finally {
            }
        } catch (SQLException e12) {
            throw new ln(e12);
        }
    }
}
