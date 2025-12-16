package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* loaded from: classes7.dex */
final class q0 {

    /* renamed from: x, reason: collision with root package name */
    static long f365736x = -1;

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteDatabase f365738b;

    /* renamed from: d, reason: collision with root package name */
    private final SQLiteStatement f365740d;

    /* renamed from: e, reason: collision with root package name */
    private final SQLiteStatement f365741e;

    /* renamed from: f, reason: collision with root package name */
    private final SQLiteStatement f365742f;

    /* renamed from: g, reason: collision with root package name */
    private final SQLiteStatement f365743g;

    /* renamed from: h, reason: collision with root package name */
    private final SQLiteStatement f365744h;

    /* renamed from: i, reason: collision with root package name */
    private final SQLiteStatement f365745i;

    /* renamed from: j, reason: collision with root package name */
    private final SQLiteStatement f365746j;

    /* renamed from: k, reason: collision with root package name */
    private final SQLiteStatement f365747k;

    /* renamed from: l, reason: collision with root package name */
    private final SQLiteStatement f365748l;

    /* renamed from: m, reason: collision with root package name */
    private final SQLiteStatement f365749m;

    /* renamed from: n, reason: collision with root package name */
    private final SQLiteStatement f365750n;

    /* renamed from: o, reason: collision with root package name */
    private final SQLiteStatement f365751o;

    /* renamed from: p, reason: collision with root package name */
    private final SQLiteStatement f365752p;

    /* renamed from: q, reason: collision with root package name */
    private final SQLiteStatement f365753q;

    /* renamed from: r, reason: collision with root package name */
    private final SQLiteStatement f365754r;

    /* renamed from: s, reason: collision with root package name */
    private final SQLiteStatement f365755s;

    /* renamed from: t, reason: collision with root package name */
    private final SQLiteStatement f365756t;

    /* renamed from: u, reason: collision with root package name */
    private final SQLiteStatement f365757u;

    /* renamed from: v, reason: collision with root package name */
    private final SQLiteStatement f365758v;

    /* renamed from: w, reason: collision with root package name */
    private final SQLiteStatement f365759w;

    /* renamed from: a, reason: collision with root package name */
    private final String[] f365737a = new String[1];

    /* renamed from: c, reason: collision with root package name */
    private final h f365739c = new h();

    public static abstract class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        final Cursor f365760a;

        public a(Cursor cursor) {
            this.f365760a = cursor;
        }

        public final boolean a() {
            return this.f365760a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f365760a.close();
            } catch (Throwable th2) {
                e2.b("AbstractReader error: error while closing cursor", th2);
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

        public String b() {
            return this.f365760a.getString(1);
        }

        public long c() {
            return this.f365760a.getLong(0);
        }

        public String d() {
            return this.f365760a.getString(2);
        }

        public String e() {
            return this.f365760a.getString(3);
        }

        public int f() {
            return this.f365760a.getInt(4);
        }

        public long g() {
            return this.f365760a.getLong(5);
        }
    }

    public static final class c extends a {
        public c(Cursor cursor) {
            super(cursor);
        }

        public byte[] b() {
            return this.f365760a.getBlob(3);
        }

        public long c() {
            return this.f365760a.getLong(0);
        }

        public long d() {
            return this.f365760a.getLong(4);
        }

        public long e() {
            return this.f365760a.getLong(1);
        }
    }

    public static final class d extends a {
        public d(Cursor cursor) {
            super(cursor);
        }

        public long b() {
            return this.f365760a.getLong(1);
        }
    }

    public static final class e extends a {
        public e(Cursor cursor) {
            super(cursor);
        }

        public String b() {
            return this.f365760a.getString(1);
        }

        public long c() {
            return this.f365760a.getLong(0);
        }

        public String d() {
            return this.f365760a.getString(2);
        }

        public long e() {
            return this.f365760a.getLong(3);
        }
    }

    public static final class f extends a {
        public f(Cursor cursor) {
            super(cursor);
        }

        public long b() {
            return this.f365760a.getLong(0);
        }

        public String c() {
            return this.f365760a.getString(1);
        }

        public long d() {
            return this.f365760a.isNull(2) ? q0.f365736x : this.f365760a.getLong(2);
        }

        public long e() {
            return this.f365760a.getLong(3);
        }
    }

    public static final class g extends a {
        public g(Cursor cursor) {
            super(cursor);
        }

        public long b() {
            return this.f365760a.getLong(2);
        }

        public long c() {
            return this.f365760a.getLong(1);
        }

        public boolean d() {
            return this.f365760a.isNull(2);
        }
    }

    public static final class h implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        long f365761a;

        /* renamed from: b, reason: collision with root package name */
        byte[] f365762b;

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.f365761a);
            sQLiteQuery.bindBlob(2, this.f365762b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private q0(SQLiteDatabase sQLiteDatabase) {
        this.f365738b = sQLiteDatabase;
        this.f365740d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.f365741e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.f365742f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.f365743g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.f365744h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.f365745i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");
        this.f365746j = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_huawei_appgallery_raw_purchases(data, signature, signature_algorithm, source, ts) VALUES (?, ?, ?, ?, ?)");
        this.f365747k = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.f365748l = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.f365749m = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.f365750n = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.f365751o = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.f365755s = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.f365752p = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.f365753q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.f365756t = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.f365754r = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.f365757u = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.f365758v = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");
        this.f365759w = sQLiteDatabase.compileStatement("DELETE FROM table_huawei_appgallery_raw_purchases WHERE id=?");
    }

    public long a(int i12, byte[] bArr, boolean z12) {
        this.f365740d.bindLong(1, i12);
        this.f365740d.bindLong(2, z12 ? 1L : 0L);
        this.f365740d.bindBlob(3, bArr);
        return this.f365740d.executeInsert();
    }

    public long b(long j12, long j13) {
        this.f365756t.bindLong(1, j12);
        this.f365756t.bindLong(2, j13);
        return this.f365756t.executeUpdateDelete();
    }

    public long c(long j12) {
        this.f365737a[0] = String.valueOf(j12);
        Cursor cursorRawQuery = this.f365738b.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.f365737a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j13 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j13;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public d d(long j12) {
        this.f365737a[0] = String.valueOf(j12);
        return new d(this.f365738b.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.f365737a));
    }

    public long e(long j12) {
        this.f365737a[0] = String.valueOf(j12);
        Cursor cursorRawQuery = this.f365738b.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.f365737a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j13 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j13;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public long f() {
        Cursor cursorRawQuery = this.f365738b.rawQuery("SELECT COUNT(*) FROM table_huawei_appgallery_raw_purchases", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j12 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j12;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public b g() {
        return new b(this.f365738b.rawQuery("SELECT id, data, signature, signature_algorithm, source, ts FROM table_huawei_appgallery_raw_purchases", null));
    }

    public c h() {
        return new c(this.f365738b.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", null));
    }

    public long i() {
        Cursor cursorRawQuery = this.f365738b.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j12 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j12;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public e j() {
        return new e(this.f365738b.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", null));
    }

    public long k() {
        Cursor cursorRawQuery = this.f365738b.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j12 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j12;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public long a(long j12, long j13) {
        this.f365755s.bindLong(1, j12);
        this.f365755s.bindLong(2, j13);
        return this.f365755s.executeUpdateDelete();
    }

    public c b(long j12, byte[] bArr) {
        h hVar = this.f365739c;
        hVar.f365761a = j12;
        hVar.f365762b = bArr;
        return new c(this.f365738b.rawQueryWithFactory(hVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", null, null));
    }

    public void c() {
        this.f365752p.execute();
    }

    public void d() {
        this.f365753q.execute();
    }

    public void e() {
        this.f365754r.execute();
    }

    public long f(long j12) {
        this.f365737a[0] = String.valueOf(j12);
        Cursor cursorRawQuery = this.f365738b.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.f365737a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j13 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j13;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public g g(long j12) {
        this.f365737a[0] = String.valueOf(j12);
        return new g(this.f365738b.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.f365737a));
    }

    public long a(long j12, byte[] bArr) {
        h hVar = this.f365739c;
        hVar.f365761a = j12;
        hVar.f365762b = bArr;
        Cursor cursorRawQueryWithFactory = this.f365738b.rawQueryWithFactory(hVar, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", null, null);
        try {
            if (!cursorRawQueryWithFactory.moveToNext()) {
                cursorRawQueryWithFactory.close();
                return 0L;
            }
            long j13 = cursorRawQueryWithFactory.getLong(0);
            cursorRawQueryWithFactory.close();
            return j13;
        } catch (Throwable th2) {
            if (cursorRawQueryWithFactory != null) {
                try {
                    cursorRawQueryWithFactory.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Long b(String str) {
        String[] strArr = this.f365737a;
        strArr[0] = str;
        Cursor cursorRawQuery = this.f365738b.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return null;
            }
            Long lValueOf = Long.valueOf(cursorRawQuery.getLong(0));
            cursorRawQuery.close();
            return lValueOf;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void c(long j12, long j13) {
        this.f365741e.bindLong(1, j12);
        this.f365741e.bindLong(2, j13);
        this.f365741e.execute();
    }

    public void d(long j12, long j13) {
        this.f365747k.bindLong(1, j13);
        this.f365747k.bindLong(2, j12);
        this.f365747k.execute();
    }

    public long a(String str, long j12) {
        this.f365742f.bindString(1, str);
        this.f365742f.bindLong(2, j12);
        return this.f365742f.executeInsert();
    }

    public void b() {
        this.f365751o.execute();
    }

    public long a(String str, String str2, long j12) {
        this.f365745i.bindString(1, str);
        this.f365745i.bindString(2, str2);
        this.f365745i.bindLong(3, j12);
        return this.f365745i.executeInsert();
    }

    public void b(long j12) {
        this.f365758v.bindLong(1, j12);
        this.f365758v.execute();
    }

    public long a(String str, String str2, String str3, int i12, long j12) {
        this.f365746j.bindString(1, str);
        this.f365746j.bindString(2, str2);
        this.f365746j.bindString(3, str3);
        this.f365746j.bindLong(4, i12);
        this.f365746j.bindLong(5, j12);
        return this.f365746j.executeInsert();
    }

    public f a(String str) {
        String[] strArr = this.f365737a;
        strArr[0] = str;
        return new f(this.f365738b.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    public static q0 a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                e2.b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 9) {
                sQLiteDatabaseOpenOrCreateDatabase.close();
                context.deleteDatabase(str2);
                sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
                sQLiteDatabaseOpenOrCreateDatabase.setVersion(9);
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_huawei_appgallery_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, signature_algorithm TEXT NOT NULL, source INTEGER NOT NULL, ts INTEGER NOT NULL )");
            }
            return new q0(sQLiteDatabaseOpenOrCreateDatabase);
        } catch (Throwable th2) {
            e2.b("MyTrackerDatabase error: exception occurred while initialization database", th2);
            return null;
        }
    }

    public void a() {
        this.f365750n.execute();
    }

    public void a(long j12) {
        this.f365759w.bindLong(1, j12);
        this.f365759w.execute();
    }

    public void a(long j12, long j13, long j14) {
        if (j13 != f365736x) {
            this.f365748l.bindLong(1, j13);
        } else {
            this.f365748l.bindNull(1);
        }
        this.f365748l.bindLong(2, j14);
        this.f365748l.bindLong(3, j12);
        this.f365748l.execute();
    }

    public void a(long j12, long j13, boolean z12, long j14) {
        this.f365743g.bindLong(1, j12);
        this.f365743g.bindLong(2, j13);
        SQLiteStatement sQLiteStatement = this.f365743g;
        if (z12) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, j14);
        }
        this.f365743g.execute();
    }

    public void a(String str, Long l12) {
        SQLiteStatement sQLiteStatement;
        if (l12 == null) {
            this.f365757u.bindString(1, str);
            sQLiteStatement = this.f365757u;
        } else {
            long jLongValue = l12.longValue();
            this.f365744h.bindString(1, str);
            this.f365744h.bindLong(2, jLongValue);
            if (this.f365744h.executeInsert() != f365736x) {
                return;
            }
            this.f365749m.bindLong(1, jLongValue);
            this.f365749m.bindString(2, str);
            sQLiteStatement = this.f365749m;
        }
        sQLiteStatement.execute();
    }
}
