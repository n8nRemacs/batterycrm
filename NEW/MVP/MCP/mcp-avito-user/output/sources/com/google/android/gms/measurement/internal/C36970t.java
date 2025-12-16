package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36970t {
    @j.l0
    public static HashSet a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    public static void b(S1 s12, SQLiteDatabase sQLiteDatabase) {
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        U1 u12 = s12.f354892i;
        if (!readable) {
            u12.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            u12.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            u12.b("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        u12.b("Failed to turn on database write permission for owner");
    }

    @j.l0
    public static void c(S1 s12, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLException {
        boolean zMoveToFirst;
        U1 u12 = s12.f354892i;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
            } catch (SQLiteException e12) {
                u12.a(str, "Error querying for table", e12);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                zMoveToFirst = false;
            }
            if (!zMoveToFirst) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                HashSet hashSetA = a(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!hashSetA.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i12 = 0; i12 < strArr.length; i12 += 2) {
                        if (!hashSetA.remove(strArr[i12])) {
                            sQLiteDatabase.execSQL(strArr[i12 + 1]);
                        }
                    }
                }
                if (hashSetA.isEmpty()) {
                    return;
                }
                u12.a(str, "Table has extra columns. table, columns", TextUtils.join(", ", hashSetA));
            } catch (SQLiteException e13) {
                s12.f354889f.c("Failed to verify columns on table that was just created", str);
                throw e13;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }
}
