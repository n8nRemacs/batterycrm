package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* loaded from: classes7.dex */
final class o1 {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f365712a = new String[1];

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteDatabase f365713b;

    /* renamed from: c, reason: collision with root package name */
    private final SQLiteStatement f365714c;

    /* renamed from: d, reason: collision with root package name */
    private final SQLiteStatement f365715d;

    /* renamed from: e, reason: collision with root package name */
    private final SQLiteStatement f365716e;

    /* renamed from: f, reason: collision with root package name */
    private final SQLiteStatement f365717f;

    public static abstract class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        final Cursor f365718a;

        public a(Cursor cursor) {
            this.f365718a = cursor;
        }

        public final boolean a() {
            return this.f365718a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f365718a.close();
            } catch (Throwable th2) {
                e2.b("TimeSpentDataBaseSQL: AbstractReader error: error while closing cursor", th2);
            }
        }

        public void finalize() throws Throwable {
            super.finalize();
            close();
        }
    }

    public static final class b extends a {
        public b(Cursor cursor) {
            super(cursor);
        }

        public byte[] b() {
            return this.f365718a.getBlob(2);
        }

        public long c() {
            return this.f365718a.getLong(0);
        }
    }

    private o1(SQLiteDatabase sQLiteDatabase) {
        this.f365713b = sQLiteDatabase;
        this.f365715d = sQLiteDatabase.compileStatement("SELECT COUNT(*) FROM table_tick_packet");
        this.f365714c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_tick_packet(timestamp, content) VALUES (?, ?)");
        this.f365716e = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id = ?");
        this.f365717f = sQLiteDatabase.compileStatement("DELETE FROM table_tick_packet WHERE packet_id IN (SELECT packet_id FROM table_tick_packet ORDER BY timestamp ASC LIMIT ?)");
    }

    public int a() {
        return (int) this.f365715d.simpleQueryForLong();
    }

    public b b(int i12) {
        this.f365712a[0] = String.valueOf(i12);
        return new b(this.f365713b.rawQuery("SELECT packet_id, timestamp, content FROM table_tick_packet ORDER BY timestamp DESC LIMIT ?", this.f365712a));
    }

    public int a(int i12) {
        this.f365717f.clearBindings();
        this.f365717f.bindLong(1, i12);
        int iExecuteUpdateDelete = this.f365717f.executeUpdateDelete();
        e2.a("TimeSpentDataBaseSQL: " + iExecuteUpdateDelete + " oldest tick packet(s) removed from database (reason: delete " + i12 + " oldest tick packets)");
        return iExecuteUpdateDelete;
    }

    public int a(long j12) {
        this.f365716e.clearBindings();
        this.f365716e.bindLong(1, j12);
        int iExecuteUpdateDelete = this.f365716e.executeUpdateDelete();
        e2.a("TimeSpentDataBaseSQL: " + iExecuteUpdateDelete + " tick packet removed from database (reason: delete tick packet with packetId = " + j12 + ")");
        return iExecuteUpdateDelete;
    }

    public long a(long j12, byte[] bArr) {
        this.f365713b.beginTransaction();
        try {
            this.f365714c.clearBindings();
            this.f365714c.bindLong(1, j12);
            this.f365714c.bindBlob(2, bArr);
            long jExecuteInsert = this.f365714c.executeInsert();
            if (jExecuteInsert < 0) {
                throw new Exception("TimeSpentDataBaseSQL: sql insert failed");
            }
            this.f365713b.setTransactionSuccessful();
            e2.a("TimeSpentDataBaseSQL: 1 tick packet (packetId = " + jExecuteInsert + ") inserted to database (reason: store tick packet)");
            return jExecuteInsert;
        } finally {
            this.f365713b.endTransaction();
        }
    }

    public static o1 a(String str, Context context) throws Exception {
        String strK = AK.c.k("mytracker_timespent_", str, ".db");
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(strK, 0, null);
        if (sQLiteDatabaseOpenOrCreateDatabase == null) {
            throw new Exception("TimeSpentDataBaseSQL: context.openOrCreateDatabase failed");
        }
        if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 1) {
            sQLiteDatabaseOpenOrCreateDatabase.close();
            context.deleteDatabase(strK);
            sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(strK, 0, null);
            sQLiteDatabaseOpenOrCreateDatabase.setVersion(1);
            sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_tick_packet(packet_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, timestamp INTEGER NOT NULL, content BLOB NOT NULL)");
            sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_tick_packettimestamp ON table_tick_packet(timestamp)");
        }
        return new o1(sQLiteDatabaseOpenOrCreateDatabase);
    }

    public void a(long[] jArr) {
        this.f365713b.beginTransaction();
        try {
            int iA2 = 0;
            for (long j12 : jArr) {
                iA2 += a(j12);
            }
            e2.a("TimeSpentDataBaseSQL: " + iA2 + " tick packet(s) removed from database (reason: delete " + jArr.length + " tick packets)");
            this.f365713b.setTransactionSuccessful();
            this.f365713b.endTransaction();
        } catch (Throwable th2) {
            this.f365713b.endTransaction();
            throw th2;
        }
    }
}
