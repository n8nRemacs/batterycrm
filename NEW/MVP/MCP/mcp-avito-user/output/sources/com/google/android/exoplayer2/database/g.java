package com.google.android.exoplayer2.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.util.U;

/* compiled from: VersionTable.java */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f344203a = 0;

    static {
        H.a("goog.exo.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i12, String str) throws DatabaseIOException {
        try {
            if (!U.P(sQLiteDatabase, "ExoPlayerVersions")) {
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
            throw new DatabaseIOException(e12);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i12, String str) throws SQLException, DatabaseIOException {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i12));
            contentValues.put("instance_uid", str);
            contentValues.put("version", (Integer) 1);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e12) {
            throw new DatabaseIOException(e12);
        }
    }
}
