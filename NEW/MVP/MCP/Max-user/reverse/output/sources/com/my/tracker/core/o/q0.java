package com.my.tracker.core.o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
final class q0 {
    private final SQLiteDatabase a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;
    private final SQLiteStatement e;

    public static final class a implements f0 {
        private final Cursor a;

        public a(SQLiteDatabase sQLiteDatabase, String str) {
            this.a = sQLiteDatabase.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", new String[]{str});
        }

        @Override // com.my.tracker.core.o.f0
        public long a() {
            return this.a.getLong(0);
        }

        @Override // com.my.tracker.core.o.f0
        public long b() {
            return this.a.getLong(3);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.core.o.f0
        public long f() {
            return this.a.isNull(2) ? b0.i : this.a.getLong(2);
        }

        @Override // com.my.tracker.core.o.f0
        public String getName() {
            return this.a.getString(1);
        }

        @Override // com.my.tracker.core.o.f0
        public boolean moveToNext() {
            return this.a.moveToNext();
        }
    }

    public q0(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.c = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.d = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.e = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
    }

    public static void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
    }

    public void b() {
        this.e.executeUpdateDelete();
    }

    public f0 a(String str) {
        return new a(this.a, str);
    }

    public long a(String str, long j) {
        try {
            this.b.bindString(1, str);
            this.b.bindLong(2, j);
            return this.b.executeInsert();
        } finally {
            this.b.clearBindings();
        }
    }

    public void a(long j, long j2, long j3) {
        try {
            if (j2 != b0.i) {
                this.c.bindLong(1, j2);
            } else {
                this.c.bindNull(1);
            }
            this.c.bindLong(2, j3);
            this.c.bindLong(3, j);
            this.c.executeUpdateDelete();
            this.c.clearBindings();
        } catch (Throwable th) {
            this.c.clearBindings();
            throw th;
        }
    }

    public void a() {
        this.d.executeUpdateDelete();
    }
}
