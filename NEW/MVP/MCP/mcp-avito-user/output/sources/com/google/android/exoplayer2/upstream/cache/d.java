package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.database.DatabaseIOException;
import j.l0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: CacheFileMetadataIndex.java */
/* loaded from: classes6.dex */
final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f347838c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.database.f f347839a;

    /* renamed from: b, reason: collision with root package name */
    public String f347840b;

    public d(com.google.android.exoplayer2.database.f fVar) {
        this.f347839a = fVar;
    }

    @l0
    public final HashMap a() {
        try {
            this.f347840b.getClass();
            Cursor cursorQuery = this.f347839a.getReadableDatabase().query(this.f347840b, f347838c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new c(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (SQLException e12) {
            throw new DatabaseIOException(e12);
        }
    }

    @l0
    public final void b(long j12) {
        com.google.android.exoplayer2.database.f fVar = this.f347839a;
        try {
            String hexString = Long.toHexString(j12);
            this.f347840b = "ExoPlayerCacheFileMetadata" + hexString;
            if (com.google.android.exoplayer2.database.g.a(fVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = fVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    com.google.android.exoplayer2.database.g.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f347840b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f347840b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
        } catch (SQLException e12) {
            throw new DatabaseIOException(e12);
        }
    }

    @l0
    public final void c(Set<String> set) {
        this.f347840b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f347839a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f347840b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e12) {
            throw new DatabaseIOException(e12);
        }
    }

    @l0
    public final void d(long j12, long j13, String str) {
        this.f347840b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f347839a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j12));
            contentValues.put("last_touch_timestamp", Long.valueOf(j13));
            writableDatabase.replaceOrThrow(this.f347840b, null, contentValues);
        } catch (SQLException e12) {
            throw new DatabaseIOException(e12);
        }
    }
}
