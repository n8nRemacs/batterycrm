package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public abstract class J7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final O7 f378565a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38673a8 f378566b;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final ContentValues f378570f = new ContentValues();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final AtomicLong f378567c = new AtomicLong(d());

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final AtomicLong f378568d = new AtomicLong(a(Long.MAX_VALUE));

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final AtomicLong f378569e = new AtomicLong(a());

    public J7(@j.N O7 o72, @j.N C38673a8 c38673a8) {
        this.f378565a = o72;
        this.f378566b = c38673a8;
    }

    private long d() {
        try {
            SQLiteDatabase readableDatabase = this.f378565a.getReadableDatabase();
            if (readableDatabase != null) {
                return C38689b.a(readableDatabase, e());
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public abstract long a();

    public synchronized void a(long j12, String str) {
        try {
            SQLiteDatabase writableDatabase = this.f378565a.getWritableDatabase();
            if (writableDatabase != null) {
                this.f378570f.clear();
                this.f378570f.put("incremental_id", Long.valueOf(this.f378569e.get() + 1));
                this.f378570f.put("timestamp", Long.valueOf(j12));
                this.f378570f.put("data", str);
                if (writableDatabase.insert(e(), null, this.f378570f) != -1) {
                    this.f378567c.incrementAndGet();
                    this.f378569e.incrementAndGet();
                    b(this.f378569e.get());
                    if (this.f378568d.get() > j12) {
                        this.f378568d.set(j12);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public long b() {
        return this.f378568d.get();
    }

    public abstract void b(long j12);

    public long c() {
        return this.f378567c.get();
    }

    public abstract String e();

    @j.N
    public C38673a8 f() {
        return this.f378566b;
    }

    public synchronized int b(int i12) {
        int iDelete = 0;
        if (i12 < 1) {
            return 0;
        }
        String str = String.format(Locale.US, "%1$s <= (select max(%1$s) from (select %1$s from %2$s order by %1$s limit ?))", "incremental_id", e());
        try {
            SQLiteDatabase writableDatabase = this.f378565a.getWritableDatabase();
            if (writableDatabase != null && (iDelete = writableDatabase.delete(e(), str, new String[]{String.valueOf(i12)})) > 0) {
                this.f378567c.getAndAdd(-iDelete);
                this.f378568d.set(a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return iDelete;
    }

    public synchronized int c(long j12) {
        int iDelete;
        Locale locale = Locale.US;
        iDelete = 0;
        try {
            SQLiteDatabase writableDatabase = this.f378565a.getWritableDatabase();
            if (writableDatabase != null && (iDelete = writableDatabase.delete(e(), "incremental_id <= ?", new String[]{String.valueOf(j12)})) > 0) {
                this.f378567c.getAndAdd(-iDelete);
                this.f378568d.set(a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return iDelete;
    }

    public long a(long j12) {
        Locale locale = Locale.US;
        String strF = androidx.camera.camera2.internal.G.f("Select min(timestamp) from ", e());
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f378565a.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(strF, null);
                if (cursorRawQuery.moveToFirst()) {
                    long j13 = cursorRawQuery.getLong(0);
                    if (j13 != 0) {
                        j12 = j13;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        A2.a(cursorRawQuery);
        return j12;
    }

    @j.N
    public synchronized Map<Long, String> a(int i12) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f378565a.getReadableDatabase();
            if (readableDatabase != null) {
                cursorQuery = readableDatabase.query(e(), new String[]{"incremental_id", "data"}, null, null, null, null, "incremental_id ASC", String.valueOf(i12));
                while (cursorQuery.moveToNext()) {
                    this.f378570f.clear();
                    try {
                        C38689b.a(cursorQuery, this.f378570f);
                    } catch (Throwable unused) {
                    }
                    Long asLong = this.f378570f.getAsLong("incremental_id");
                    String asString = this.f378570f.getAsString("data");
                    if (asLong != null && asString != null) {
                        linkedHashMap.put(asLong, asString);
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        A2.a(cursorQuery);
        return linkedHashMap;
    }
}
