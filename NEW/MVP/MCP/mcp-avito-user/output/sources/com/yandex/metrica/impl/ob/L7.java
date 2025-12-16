package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.yandex.metrica.impl.ob.C38897j8;
import com.yandex.metrica.impl.ob.C39037on;
import com.yandex.metrica.impl.ob.C39109s;
import com.yandex.metrica.impl.ob.C39176ui;
import com.yandex.metrica.impl.ob.K7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes7.dex */
public class L7 {

    /* renamed from: o, reason: collision with root package name */
    private static final HashSet<Integer> f378768o;

    /* renamed from: a, reason: collision with root package name */
    private final ReentrantReadWriteLock f378769a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f378770b;

    /* renamed from: c, reason: collision with root package name */
    private final Lock f378771c;

    /* renamed from: d, reason: collision with root package name */
    private final O7 f378772d;

    /* renamed from: e, reason: collision with root package name */
    private final a f378773e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f378774f;

    /* renamed from: g, reason: collision with root package name */
    private final List<ContentValues> f378775g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f378776h;

    /* renamed from: i, reason: collision with root package name */
    private final L3 f378777i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicLong f378778j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final List<InterfaceC39000nb> f378779k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final K7 f378780l;

    /* renamed from: m, reason: collision with root package name */
    private volatile qn<C39176ui.b, Object> f378781m;

    /* renamed from: n, reason: collision with root package name */
    private final rn<C39176ui.b, Object> f378782n;

    public class a extends Lm {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final L3 f378783b;

        public a(@j.N L3 l32) {
            this.f378783b = l32;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            while (isRunning()) {
                try {
                } catch (Throwable unused) {
                    stopRunning();
                }
                synchronized (this) {
                    try {
                        if (L7.a(L7.this)) {
                            wait();
                        }
                        synchronized (L7.this.f378774f) {
                            arrayList = new ArrayList(L7.this.f378775g);
                            L7.this.f378775g.clear();
                        }
                        L7.this.a(arrayList);
                        synchronized (this) {
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Integer.valueOf(L7.this.a((ContentValues) it.next())));
                                }
                                Iterator it2 = L7.this.f378779k.iterator();
                                while (it2.hasNext()) {
                                    ((InterfaceC39000nb) it2.next()).a(arrayList2);
                                }
                                this.f378783b.l().c();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    static {
        HashSet<Integer> hashSet = new HashSet<>();
        f378768o = hashSet;
        hashSet.add(Integer.valueOf(EnumC38666a1.EVENT_TYPE_INIT.b()));
        hashSet.add(Integer.valueOf(EnumC38666a1.EVENT_TYPE_START.b()));
    }

    public L7(@j.N L3 l32, O7 o72, @j.N K7 k72) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f378769a = reentrantReadWriteLock;
        this.f378770b = reentrantReadWriteLock.readLock();
        this.f378771c = reentrantReadWriteLock.writeLock();
        this.f378774f = new Object();
        this.f378775g = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f378778j = atomicLong;
        this.f378779k = new ArrayList();
        this.f378782n = new rn<>();
        this.f378772d = o72;
        this.f378776h = l32.g();
        this.f378777i = l32;
        this.f378780l = k72;
        atomicLong.set(d());
        a aVar = new a(l32);
        this.f378773e = aVar;
        aVar.setName(a(l32));
        a(l32.w());
    }

    public void e() {
        this.f378773e.start();
    }

    private void a(@j.N C39057pi c39057pi) {
        C39176ui.a aVar = null;
        C39176ui.a aVar2 = (!c39057pi.f().f379406o || c39057pi.Q() == null) ? null : c39057pi.Q().f381977b;
        if (c39057pi.f().f379406o && c39057pi.Q() != null) {
            aVar = c39057pi.Q().f381976a;
        }
        EnumMap enumMap = new EnumMap(C39176ui.b.class);
        enumMap.put((EnumMap) C39176ui.b.WIFI, (C39176ui.b) (aVar2 == null ? new sn() : new yn(new xn(new Bn(), new Cn()), new com.yandex.metrica.coreutils.services.e(), aVar2.f381978a, aVar2.f381979b)));
        enumMap.put((EnumMap) C39176ui.b.CELL, (C39176ui.b) (aVar == null ? new sn() : new yn(new xn(new C39037on.a(), new pn()), new com.yandex.metrica.coreutils.services.e(), aVar.f381978a, aVar.f381979b)));
        this.f378781m = new qn<>(enumMap);
    }

    private long d() {
        SQLiteDatabase readableDatabase;
        this.f378770b.lock();
        try {
            readableDatabase = this.f378772d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        long jA2 = readableDatabase != null ? C38689b.a(readableDatabase, "reports") : 0L;
        this.f378770b.unlock();
        return jA2;
    }

    @j.P
    public Cursor b(long j12, @j.N EnumC38796f6 enumC38796f6) {
        SQLiteDatabase readableDatabase;
        this.f378770b.lock();
        try {
            readableDatabase = this.f378772d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("reports", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j12), Integer.toString(enumC38796f6.a())}, null, null, "number ASC", null) : null;
        this.f378770b.unlock();
        return cursorQuery;
    }

    public long c() {
        this.f378770b.lock();
        try {
            return this.f378778j.get();
        } finally {
            this.f378770b.unlock();
        }
    }

    @j.N
    public List<ContentValues> b() {
        ArrayList arrayList = new ArrayList();
        this.f378770b.lock();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase readableDatabase = this.f378772d.getReadableDatabase();
                if (readableDatabase != null) {
                    cursorRawQuery = readableDatabase.rawQuery(C38897j8.e.f380862c, null);
                    while (cursorRawQuery.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    }
                }
            } finally {
                A2.a(cursorRawQuery);
                this.f378770b.unlock();
            }
        } catch (Throwable unused) {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    public long a(@j.N Set<Integer> set) {
        this.f378770b.lock();
        Cursor cursorRawQuery = null;
        long j12 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f378772d.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb2 = new StringBuilder("SELECT count() FROM reports");
                if (!set.isEmpty()) {
                    sb2.append(" WHERE ");
                }
                int i12 = 0;
                for (Integer num : set) {
                    if (i12 > 0) {
                        sb2.append(" OR ");
                    }
                    sb2.append("type == " + num);
                    i12++;
                }
                cursorRawQuery = readableDatabase.rawQuery(sb2.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    j12 = cursorRawQuery.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        A2.a(cursorRawQuery);
        this.f378770b.unlock();
        return j12;
    }

    public void b(@j.N C39057pi c39057pi) {
        a(c39057pi);
    }

    public void a(@j.N InterfaceC39000nb interfaceC39000nb) {
        this.f378779k.add(interfaceC39000nb);
    }

    private static String a(P3 p32) {
        return "DatabaseWorker [" + ((L3) p32).e().c() + "]";
    }

    public void a(long j12, EnumC38796f6 enumC38796f6, long j13) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(j12));
        contentValues.put("start_time", Long.valueOf(j13));
        contentValues.put("server_time_offset", Long.valueOf(C38812fm.c().a()));
        contentValues.put("obtained_before_first_sync", Boolean.valueOf(C38812fm.c().e()));
        contentValues.put("type", Integer.valueOf(enumC38796f6.a()));
        new C38865i0(this.f378776h).a(this.f378777i.m()).a(contentValues).a();
        this.f378771c.lock();
        try {
            SQLiteDatabase writableDatabase = this.f378772d.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValues);
            }
        } catch (Throwable unused) {
        }
        this.f378771c.unlock();
    }

    public void a(@j.N Bm bm, int i12, @j.N C38721c6 c38721c6, @j.N C39109s.a aVar, @j.N O3 o32) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("number", Long.valueOf(c38721c6.a()));
        contentValues.put("global_number", Integer.valueOf(C39278z0.d(i12) ? o32.a() : 0));
        contentValues.put("number_of_type", Integer.valueOf(o32.a(i12)));
        contentValues.put(CrashHianalyticsData.TIME, Long.valueOf(c38721c6.b()));
        contentValues.put("session_id", Long.valueOf(c38721c6.c()));
        contentValues.put("session_type", Integer.valueOf(c38721c6.d().a()));
        new C38865i0(this.f378776h).a(this.f378777i.m()).a(contentValues).a(bm, aVar, f378768o.contains(Integer.valueOf(i12)) ? this.f378782n : this.f378781m);
        synchronized (this.f378774f) {
            this.f378775g.add(contentValues);
        }
        synchronized (this.f378773e) {
            this.f378773e.notifyAll();
        }
    }

    public int a(long j12) {
        SQLiteDatabase writableDatabase;
        this.f378771c.lock();
        try {
            int i12 = C38897j8.f380847a;
            writableDatabase = this.f378772d.getWritableDatabase();
        } catch (Throwable unused) {
        }
        int iDelete = writableDatabase != null ? writableDatabase.delete("sessions", C38897j8.e.f380863d, new String[]{String.valueOf(j12)}) : 0;
        this.f378771c.unlock();
        return iDelete;
    }

    public void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f378771c.lock();
            if (this.f378778j.get() > this.f378777i.m().J() && (writableDatabase = this.f378772d.getWritableDatabase()) != null) {
                this.f378778j.addAndGet(-a(writableDatabase));
            }
        } catch (Throwable unused) {
        }
        this.f378771c.unlock();
    }

    private int a(SQLiteDatabase sQLiteDatabase) {
        try {
            String str = String.format("%1$s IN (SELECT %1$s FROM %2$s ORDER BY CASE WHEN %3$s IN (%4$s) THEN 2 WHEN %3$s IN (%5$s) THEN 1 ELSE 0 END, %6$s LIMIT (SELECT count() FROM %2$s) / %7$s)", "id", "reports", "type", TextUtils.join(", ", C39278z0.f382293i), TextUtils.join(", ", C39278z0.f382294j), "id", 10);
            return this.f378780l.a(sQLiteDatabase, "reports", str, K7.b.DB_OVERFLOW, this.f378777i.e().a(), true).f378692b;
        } catch (Throwable th2) {
            ((C39006nh) C39031oh.a()).reportError("deleteExcessiveReports exception", th2);
            return 0;
        }
    }

    public void a(long j12, int i12, int i13, boolean z12) {
        List<ContentValues> list;
        if (i13 <= 0) {
            return;
        }
        this.f378771c.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j12), "session_type", Integer.toString(i12), "id", "reports", Integer.toString(i13 - 1));
            SQLiteDatabase writableDatabase = this.f378772d.getWritableDatabase();
            if (writableDatabase != null) {
                K7.a aVarA = this.f378780l.a(writableDatabase, "reports", str, K7.b.BAD_REQUEST, this.f378777i.e().a(), z12);
                if (aVarA.f378691a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ContentValues> it = aVarA.f378691a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(a(it.next())));
                    }
                    Iterator<InterfaceC39000nb> it2 = this.f378779k.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(arrayList);
                    }
                }
                if (this.f378777i.q().isEnabled() && (list = aVarA.f378691a) != null) {
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        a(list.get(i14), "Event removed from db");
                    }
                }
                this.f378778j.addAndGet(-aVarA.f378692b);
            }
        } catch (Throwable unused) {
        }
        this.f378771c.unlock();
    }

    @j.P
    public Cursor a(Map<String, String> map) {
        SQLiteDatabase readableDatabase;
        this.f378770b.lock();
        try {
            readableDatabase = this.f378772d.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, a("id >= ?", map), a(new String[]{Long.toString(0L)}, map), null, null, "id ASC", null) : null;
        this.f378770b.unlock();
        return cursorQuery;
    }

    @j.k0
    public void a(List<ContentValues> list) {
        SQLiteDatabase writableDatabase;
        if (list.isEmpty()) {
            return;
        }
        this.f378771c.lock();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = this.f378772d.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    writableDatabase.beginTransaction();
                    for (ContentValues contentValues : list) {
                        writableDatabase.insertOrThrow("reports", null, contentValues);
                        this.f378778j.incrementAndGet();
                        a(contentValues, "Event saved to db");
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f378778j.get();
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    writableDatabase = sQLiteDatabase;
                    A2.a(writableDatabase);
                    this.f378771c.unlock();
                }
            }
        } catch (Throwable unused2) {
        }
        A2.a(writableDatabase);
        this.f378771c.unlock();
    }

    public ContentValues a(long j12, EnumC38796f6 enumC38796f6) {
        ContentValues contentValues = new ContentValues();
        this.f378770b.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f378772d.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursorRawQuery = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j12 + " AND type = " + enumC38796f6.a() + " ORDER BY id DESC LIMIT 1", null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
            A2.a(cursorRawQuery);
            this.f378770b.unlock();
        } catch (Throwable unused) {
            A2.a(cursorRawQuery);
            this.f378770b.unlock();
        }
        return contentValues;
    }

    private static String a(String str, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder(str);
        for (String str2 : map.keySet()) {
            sb2.append(sb2.length() > 0 ? " AND " : "");
            sb2.append(str2 + " = ? ");
        }
        if (TextUtils.isEmpty(sb2.toString())) {
            return null;
        }
        return sb2.toString();
    }

    private static String[] a(String[] strArr, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (C39278z0.c(asInteger != null ? asInteger.intValue() : -1)) {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(": ");
            String asString = contentValues.getAsString("name");
            if (asString == null) {
                asString = "";
            }
            sb2.append(asString);
            String asString2 = contentValues.getAsString("value");
            String str2 = asString2 != null ? asString2 : "";
            if (C39278z0.e(a(contentValues)) && !TextUtils.isEmpty(str2)) {
                sb2.append(" with value ");
                sb2.append(str2);
            }
            this.f378777i.q().i(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(ContentValues contentValues) {
        return contentValues.getAsInteger("type").intValue();
    }

    public static boolean a(L7 l72) {
        boolean zIsEmpty;
        synchronized (l72.f378774f) {
            zIsEmpty = l72.f378775g.isEmpty();
        }
        return zIsEmpty;
    }
}
