package com.google.android.datatransport.runtime.scheduling.persistence;

import CX0.a;
import GX0.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.scheduling.persistence.s;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import j.P;
import j.k0;
import j.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;

/* compiled from: SQLiteEventStore.java */
@Singleton
@l0
/* loaded from: classes10.dex */
public class s implements com.google.android.datatransport.runtime.scheduling.persistence.d, GX0.a, com.google.android.datatransport.runtime.scheduling.persistence.c {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.android.datatransport.c f343263g = new com.google.android.datatransport.c("proto");

    /* renamed from: b, reason: collision with root package name */
    public final v f343264b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343265c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343266d;

    /* renamed from: e, reason: collision with root package name */
    public final e f343267e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<String> f343268f;

    /* compiled from: SQLiteEventStore.java */
    public interface b<T, U> {
        U apply(T t12);
    }

    /* compiled from: SQLiteEventStore.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f343269a;

        /* renamed from: b, reason: collision with root package name */
        public final String f343270b;

        public c(String str, String str2, a aVar) {
            this.f343269a = str;
            this.f343270b = str2;
        }
    }

    /* compiled from: SQLiteEventStore.java */
    public interface d<T> {
    }

    @Inject
    public s(@com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, e eVar, v vVar, @Named("PACKAGE_NAME") Provider<String> provider) {
        this.f343264b = vVar;
        this.f343265c = aVar;
        this.f343266d = aVar2;
        this.f343267e = eVar;
        this.f343268f = provider;
    }

    @P
    public static Long g(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.r rVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(rVar.b(), String.valueOf(HX0.a.a(rVar.d()))));
        if (rVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(rVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = cursorQuery;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String j(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    @k0
    public static <T> T k(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final Iterable<k> A5(final com.google.android.datatransport.runtime.r rVar) {
        return (Iterable) h(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.o
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.s.b
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                s sVar = this.f343254a;
                e eVar = sVar.f343267e;
                int iC2 = eVar.c();
                com.google.android.datatransport.runtime.r rVar2 = rVar;
                ArrayList arrayListI = sVar.i(sQLiteDatabase, rVar2, iC2);
                for (Priority priority : Priority.values()) {
                    if (priority != rVar2.d()) {
                        int iC3 = eVar.c() - arrayListI.size();
                        if (iC3 <= 0) {
                            break;
                        }
                        arrayListI.addAll(sVar.i(sQLiteDatabase, rVar2.e(priority), iC3));
                    }
                }
                HashMap map = new HashMap();
                StringBuilder sb2 = new StringBuilder("event_id IN (");
                for (int i12 = 0; i12 < arrayListI.size(); i12++) {
                    sb2.append(((k) arrayListI.get(i12)).b());
                    if (i12 < arrayListI.size() - 1) {
                        sb2.append(',');
                    }
                }
                sb2.append(')');
                s.k(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new q(map, 1));
                ListIterator listIterator = arrayListI.listIterator();
                while (listIterator.hasNext()) {
                    k kVar = (k) listIterator.next();
                    if (map.containsKey(Long.valueOf(kVar.b()))) {
                        j.a aVarJ = kVar.a().j();
                        for (s.c cVar : (Set) map.get(Long.valueOf(kVar.b()))) {
                            aVarJ.a(cVar.f343269a, cVar.f343270b);
                        }
                        listIterator.set(new b(kVar.b(), kVar.c(), aVarJ.b()));
                    }
                }
                return arrayListI;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final void L1(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            f().compileStatement("DELETE FROM events WHERE _id in " + j(iterable)).execute();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final Iterable<com.google.android.datatransport.runtime.r> T4() {
        return (Iterable) h(new l(0));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final void X5(final long j12, final com.google.android.datatransport.runtime.r rVar) {
        h(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.p
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.s.b
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                com.google.android.datatransport.c cVar = s.f343263g;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j12));
                com.google.android.datatransport.runtime.r rVar2 = rVar;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{rVar2.b(), String.valueOf(HX0.a.a(rVar2.d()))}) < 1) {
                    contentValues.put("backend_name", rVar2.b());
                    contentValues.put("priority", Integer.valueOf(HX0.a.a(rVar2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public final void a() {
        h(new q(this, 0));
    }

    @Override // GX0.a
    public final <T> T b(a.InterfaceC0354a<T> interfaceC0354a) {
        SQLiteDatabase sQLiteDatabaseF = f();
        com.google.android.datatransport.runtime.time.a aVar = this.f343266d;
        long jO2 = aVar.O();
        while (true) {
            try {
                sQLiteDatabaseF.beginTransaction();
                try {
                    T tExecute = interfaceC0354a.execute();
                    sQLiteDatabaseF.setTransactionSuccessful();
                    return tExecute;
                } finally {
                    sQLiteDatabaseF.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e12) {
                if (aVar.O() >= this.f343267e.a() + jO2) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e12);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public final CX0.a c() {
        int i12 = CX0.a.f2207e;
        a.C0113a c0113a = new a.C0113a();
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseF = f();
        sQLiteDatabaseF.beginTransaction();
        try {
            CX0.a aVar = (CX0.a) k(sQLiteDatabaseF.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new n(this, map, c0113a, 2));
            sQLiteDatabaseF.setTransactionSuccessful();
            return aVar;
        } finally {
            sQLiteDatabaseF.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f343264b.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public final void d(final long j12, final LogEventDropped.Reason reason, final String str) {
        h(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.r
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.s.b
            public final Object apply(Object obj) throws SQLException {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                com.google.android.datatransport.c cVar = s.f343263g;
                int i12 = reason.f343162b;
                String string = Integer.toString(i12);
                String str2 = str;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string});
                try {
                    com.google.android.datatransport.c cVar2 = s.f343263g;
                    boolean z12 = cursorRawQuery.getCount() > 0;
                    cursorRawQuery.close();
                    long j13 = j12;
                    if (z12) {
                        sQLiteDatabase.execSQL(androidx.compose.ui.graphics.colorspace.e.i(j13, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str2, Integer.toString(i12)});
                    } else {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("log_source", str2);
                        contentValues.put("reason", Integer.valueOf(i12));
                        contentValues.put("events_dropped_count", Long.valueOf(j13));
                        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    }
                    return null;
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            }
        });
    }

    @k0
    public final SQLiteDatabase f() {
        v vVar = this.f343264b;
        Objects.requireNonNull(vVar);
        com.google.android.datatransport.runtime.time.a aVar = this.f343266d;
        long jO2 = aVar.O();
        while (true) {
            try {
                return vVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e12) {
                if (aVar.O() >= this.f343267e.a() + jO2) {
                    throw new SynchronizationException("Timed out while trying to open db.", e12);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    @P
    public final k f6(com.google.android.datatransport.runtime.r rVar, com.google.android.datatransport.runtime.j jVar) {
        Priority priorityD = rVar.d();
        jVar.h();
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(priorityD);
        }
        long jLongValue = ((Long) h(new n(this, jVar, rVar, 0))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new com.google.android.datatransport.runtime.scheduling.persistence.b(jLongValue, rVar, jVar);
    }

    @k0
    public final <T> T h(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseF = f();
        sQLiteDatabaseF.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseF);
            sQLiteDatabaseF.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseF.endTransaction();
        }
    }

    public final ArrayList i(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.r rVar, int i12) {
        ArrayList arrayList = new ArrayList();
        Long lG2 = g(sQLiteDatabase, rVar);
        if (lG2 == null) {
            return arrayList;
        }
        k(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lG2.toString()}, null, null, null, String.valueOf(i12)), new n(this, arrayList, rVar, 1));
        return arrayList;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final int s() {
        long jO2 = this.f343265c.O() - this.f343267e.b();
        SQLiteDatabase sQLiteDatabaseF = f();
        sQLiteDatabaseF.beginTransaction();
        try {
            String[] strArr = {String.valueOf(jO2)};
            Cursor cursorRawQuery = sQLiteDatabaseF.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            try {
                Cursor cursor = cursorRawQuery;
                while (cursor.moveToNext()) {
                    d(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                cursorRawQuery.close();
                int iDelete = sQLiteDatabaseF.delete("events", "timestamp_ms < ?", strArr);
                sQLiteDatabaseF.setTransactionSuccessful();
                return iDelete;
            } catch (Throwable th2) {
                cursorRawQuery.close();
                throw th2;
            }
        } finally {
            sQLiteDatabaseF.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final long s2(com.google.android.datatransport.runtime.r rVar) {
        Cursor cursorRawQuery = f().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{rVar.b(), String.valueOf(HX0.a.a(rVar.d()))});
        try {
            Cursor cursor = cursorRawQuery;
            Long lValueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            cursorRawQuery.close();
            return lValueOf.longValue();
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final boolean v2(com.google.android.datatransport.runtime.r rVar) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseF = f();
        sQLiteDatabaseF.beginTransaction();
        try {
            Long lG2 = g(sQLiteDatabaseF, rVar);
            if (lG2 == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = f().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG2.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            }
            sQLiteDatabaseF.setTransactionSuccessful();
            sQLiteDatabaseF.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th3) {
            sQLiteDatabaseF.endTransaction();
            throw th3;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final void v5(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + j(iterable);
            SQLiteDatabase sQLiteDatabaseF = f();
            sQLiteDatabaseF.beginTransaction();
            try {
                sQLiteDatabaseF.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseF.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = cursorRawQuery;
                    while (cursor.moveToNext()) {
                        d(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseF.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseF.setTransactionSuccessful();
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            } finally {
                sQLiteDatabaseF.endTransaction();
            }
        }
    }
}
