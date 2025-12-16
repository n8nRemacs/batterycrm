package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
final class hh {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f386134c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    private final mn f386135a;

    /* renamed from: b, reason: collision with root package name */
    private String f386136b;

    public hh(kt ktVar) {
        this.f386135a = ktVar;
    }

    @j.l0
    public final void a(long j12) throws ln {
        try {
            String hexString = Long.toHexString(j12);
            this.f386136b = "ExoPlayerCacheFileMetadata" + hexString;
            if (ke1.a(this.f386135a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f386135a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    ke1.a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f386136b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f386136b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw new ln(th3);
        }
    }

    @j.l0
    public final void a(String str, long j12, long j13) throws ln {
        this.f386136b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f386135a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j12));
            contentValues.put("last_touch_timestamp", Long.valueOf(j13));
            writableDatabase.replaceOrThrow(this.f386136b, null, contentValues);
        } catch (Throwable th2) {
            throw new ln(th2);
        }
    }

    @j.l0
    public final void a(String str) throws ln {
        this.f386136b.getClass();
        try {
            this.f386135a.getWritableDatabase().delete(this.f386136b, "name = ?", new String[]{str});
        } catch (Throwable th2) {
            throw new ln(th2);
        }
    }

    @j.l0
    public final void a(Set<String> set) throws ln {
        this.f386136b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f386135a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f386136b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            throw new ln(th3);
        }
    }

    @j.l0
    public final HashMap a() throws ln {
        try {
            this.f386136b.getClass();
            Cursor cursorQuery = this.f386135a.getReadableDatabase().query(this.f386136b, f386134c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new gh(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (Throwable th2) {
            throw new ln(th2);
        }
    }
}
