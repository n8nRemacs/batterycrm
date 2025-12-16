package com.avito.android.iac_dialer_watcher.impl_module.db;

import V1.h;
import Z1.e;
import androidx.room.E0;
import androidx.room.RoomDatabase;
import androidx.room.Y;
import j.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes14.dex */
public final class InAppCallsDatabase_Impl extends InAppCallsDatabase {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f167805o = 0;

    /* renamed from: n, reason: collision with root package name */
    public volatile z f167806n;

    public class a extends E0.b {
        public a() {
            super(1);
        }

        @Override // androidx.room.E0.b
        public final void a(@N androidx.sqlite.db.framework.b bVar) {
            androidx.media3.exoplayer.analytics.m.o(bVar, "CREATE TABLE IF NOT EXISTS `tb_lines` (`lineId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `log_session_id` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `line_text` TEXT NOT NULL)", "CREATE TABLE IF NOT EXISTS `tb_calls` (`log_session_id` INTEGER NOT NULL, `call_index_in_session` INTEGER NOT NULL, `call_id` TEXT NOT NULL, `scenario` TEXT NOT NULL, `started_at` INTEGER NOT NULL, `finished_at` INTEGER NOT NULL, `lines_limit_reached` INTEGER NOT NULL, `header` TEXT NOT NULL, PRIMARY KEY(`log_session_id`, `call_index_in_session`, `call_id`))", "CREATE TABLE IF NOT EXISTS `tb_sessions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `created_at` INTEGER NOT NULL, `calls_history` TEXT NOT NULL)", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.P4("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6c6d3560e0bd8412175830bbf25f049c')");
        }

        @Override // androidx.room.E0.b
        public final void b(@N androidx.sqlite.db.framework.b bVar) {
            bVar.P4("DROP TABLE IF EXISTS `tb_lines`");
            bVar.P4("DROP TABLE IF EXISTS `tb_calls`");
            bVar.P4("DROP TABLE IF EXISTS `tb_sessions`");
            int i12 = InAppCallsDatabase_Impl.f167805o;
            ArrayList arrayList = InAppCallsDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).a(bVar);
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void c() {
            int i12 = InAppCallsDatabase_Impl.f167805o;
            ArrayList arrayList = InAppCallsDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).getClass();
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void d(@N androidx.sqlite.db.framework.b bVar) {
            InAppCallsDatabase_Impl inAppCallsDatabase_Impl = InAppCallsDatabase_Impl.this;
            int i12 = InAppCallsDatabase_Impl.f167805o;
            inAppCallsDatabase_Impl.f54297a = bVar;
            InAppCallsDatabase_Impl.this.m(bVar);
            ArrayList arrayList = InAppCallsDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).b(bVar);
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void e(@N androidx.sqlite.db.framework.b bVar) {
            V1.c.a(bVar);
        }

        @Override // androidx.room.E0.b
        @N
        public final E0.c f(@N androidx.sqlite.db.framework.b bVar) {
            HashMap map = new HashMap(4);
            map.put("lineId", new h.a(1, "lineId", "INTEGER", null, true, 1));
            map.put("log_session_id", new h.a(0, "log_session_id", "INTEGER", null, true, 1));
            map.put("created_at", new h.a(0, "created_at", "INTEGER", null, true, 1));
            V1.h hVar = new V1.h("tb_lines", map, androidx.media3.exoplayer.analytics.m.n(map, "line_text", new h.a(0, "line_text", "TEXT", null, true, 1), 0), new HashSet(0));
            V1.h hVarA = V1.h.a(bVar, "tb_lines");
            if (!hVar.equals(hVarA)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("tb_lines(com.avito.android.iac_dialer_watcher.impl_module.db.IacLogDbLineEntity).\n Expected:\n", hVar, "\n Found:\n", hVarA));
            }
            HashMap map2 = new HashMap(8);
            map2.put("log_session_id", new h.a(1, "log_session_id", "INTEGER", null, true, 1));
            map2.put("call_index_in_session", new h.a(2, "call_index_in_session", "INTEGER", null, true, 1));
            map2.put("call_id", new h.a(3, "call_id", "TEXT", null, true, 1));
            map2.put("scenario", new h.a(0, "scenario", "TEXT", null, true, 1));
            map2.put("started_at", new h.a(0, "started_at", "INTEGER", null, true, 1));
            map2.put("finished_at", new h.a(0, "finished_at", "INTEGER", null, true, 1));
            map2.put("lines_limit_reached", new h.a(0, "lines_limit_reached", "INTEGER", null, true, 1));
            V1.h hVar2 = new V1.h("tb_calls", map2, androidx.media3.exoplayer.analytics.m.n(map2, "header", new h.a(0, "header", "TEXT", null, true, 1), 0), new HashSet(0));
            V1.h hVarA2 = V1.h.a(bVar, "tb_calls");
            if (!hVar2.equals(hVarA2)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("tb_calls(com.avito.android.iac_dialer_watcher.impl_module.db.IacLogDbCallEntity).\n Expected:\n", hVar2, "\n Found:\n", hVarA2));
            }
            HashMap map3 = new HashMap(3);
            map3.put("id", new h.a(1, "id", "INTEGER", null, true, 1));
            map3.put("created_at", new h.a(0, "created_at", "INTEGER", null, true, 1));
            V1.h hVar3 = new V1.h("tb_sessions", map3, androidx.media3.exoplayer.analytics.m.n(map3, "calls_history", new h.a(0, "calls_history", "TEXT", null, true, 1), 0), new HashSet(0));
            V1.h hVarA3 = V1.h.a(bVar, "tb_sessions");
            return !hVar3.equals(hVarA3) ? new E0.c(false, androidx.media3.exoplayer.analytics.m.k("tb_sessions(com.avito.android.iac_dialer_watcher.impl_module.db.IacLogDbSessionEntity).\n Expected:\n", hVar3, "\n Found:\n", hVarA3)) : new E0.c(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final Y f() {
        return new Y(this, new HashMap(0), new HashMap(0), "tb_lines", "tb_calls", "tb_sessions");
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final Z1.e g(@N androidx.room.C c12) {
        E0 e02 = new E0(c12, new a(), "6c6d3560e0bd8412175830bbf25f049c", "ee1adc8799614d6c42ec107169ff6ca1");
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
        map.put(InterfaceC30891a.class, Collections.emptyList());
        return map;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.db.InAppCallsDatabase
    public final InterfaceC30891a u() {
        z zVar;
        if (this.f167806n != null) {
            return this.f167806n;
        }
        synchronized (this) {
            try {
                if (this.f167806n == null) {
                    this.f167806n = new z(this);
                }
                zVar = this.f167806n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVar;
    }
}
