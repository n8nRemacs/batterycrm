package com.avito.android.timestamp_storage.data.database;

import V1.c;
import V1.h;
import Z1.e;
import androidx.media3.exoplayer.analytics.m;
import androidx.room.C;
import androidx.room.E0;
import androidx.room.RoomDatabase;
import androidx.room.Y;
import androidx.sqlite.db.framework.b;
import com.avito.android.timestamp_storage.data.dao.f;
import j.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class TimestampDatabase_Impl extends TimestampDatabase {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f301478o = 0;

    /* renamed from: n, reason: collision with root package name */
    public volatile f f301479n;

    public class a extends E0.b {
        public a() {
            super(1);
        }

        @Override // androidx.room.E0.b
        public final void a(@N b bVar) {
            bVar.P4("CREATE TABLE IF NOT EXISTS `timestamps` (`key` TEXT NOT NULL, `uid` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `inners` TEXT NOT NULL, PRIMARY KEY(`key`, `uid`))");
            bVar.P4("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.P4("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e49c6db389b86bf7056569aa263f3dc0')");
        }

        @Override // androidx.room.E0.b
        public final void b(@N b bVar) {
            bVar.P4("DROP TABLE IF EXISTS `timestamps`");
            int i12 = TimestampDatabase_Impl.f301478o;
            ArrayList arrayList = TimestampDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).a(bVar);
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void c() {
            int i12 = TimestampDatabase_Impl.f301478o;
            ArrayList arrayList = TimestampDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).getClass();
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void d(@N b bVar) {
            TimestampDatabase_Impl timestampDatabase_Impl = TimestampDatabase_Impl.this;
            int i12 = TimestampDatabase_Impl.f301478o;
            timestampDatabase_Impl.f54297a = bVar;
            TimestampDatabase_Impl.this.m(bVar);
            ArrayList arrayList = TimestampDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).b(bVar);
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void e(@N b bVar) {
            c.a(bVar);
        }

        @Override // androidx.room.E0.b
        @N
        public final E0.c f(@N b bVar) {
            HashMap map = new HashMap(4);
            map.put("key", new h.a(1, "key", "TEXT", null, true, 1));
            map.put("uid", new h.a(2, "uid", "TEXT", null, true, 1));
            map.put("timestamp", new h.a(0, "timestamp", "INTEGER", null, true, 1));
            h hVar = new h("timestamps", map, m.n(map, "inners", new h.a(0, "inners", "TEXT", null, true, 1), 0), new HashSet(0));
            h hVarA = h.a(bVar, "timestamps");
            return !hVar.equals(hVarA) ? new E0.c(false, m.k("timestamps(com.avito.android.timestamp_storage.data.model.TimestampEntity).\n Expected:\n", hVar, "\n Found:\n", hVarA)) : new E0.c(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final Y f() {
        return new Y(this, new HashMap(0), new HashMap(0), "timestamps");
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final e g(@N C c12) {
        E0 e02 = new E0(c12, new a(), "e49c6db389b86bf7056569aa263f3dc0", "b9f5cabe6dfc3561f5f20f615ed9ca80");
        e.b.a aVarA = e.b.a(c12.f54232a);
        aVarA.f19829b = c12.f54233b;
        aVarA.f19830c = e02;
        return c12.f54234c.c(aVarA.a());
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final List h() {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final Set<Class<? extends androidx.room.migration.a>> j() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final Map<Class<?>, List<Class<?>>> k() {
        HashMap map = new HashMap();
        map.put(com.avito.android.timestamp_storage.data.dao.a.class, Collections.emptyList());
        return map;
    }

    @Override // com.avito.android.timestamp_storage.data.database.TimestampDatabase
    public final com.avito.android.timestamp_storage.data.dao.a u() {
        f fVar;
        if (this.f301479n != null) {
            return this.f301479n;
        }
        synchronized (this) {
            try {
                if (this.f301479n == null) {
                    this.f301479n = new f(this);
                }
                fVar = this.f301479n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }
}
