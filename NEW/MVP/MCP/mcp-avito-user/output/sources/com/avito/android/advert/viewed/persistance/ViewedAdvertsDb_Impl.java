package com.avito.android.advert.viewed.persistance;

import V1.h;
import Z1.e;
import androidx.room.C;
import androidx.room.E0;
import androidx.room.RoomDatabase;
import androidx.room.Y;
import j.N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class ViewedAdvertsDb_Impl extends ViewedAdvertsDb {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f81031o = 0;

    /* renamed from: n, reason: collision with root package name */
    public volatile c f81032n;

    public class a extends E0.b {
        public a() {
            super(1);
        }

        @Override // androidx.room.E0.b
        public final void a(@N androidx.sqlite.db.framework.b bVar) {
            androidx.media3.exoplayer.analytics.m.o(bVar, "CREATE TABLE IF NOT EXISTS `viewed_adverts` (`advert_string_id` TEXT NOT NULL, `add_time` INTEGER NOT NULL, PRIMARY KEY(`advert_string_id`))", "CREATE INDEX IF NOT EXISTS `index_viewed_adverts_advert_string_id` ON `viewed_adverts` (`advert_string_id`)", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b7442e28c195d9800953547c0da74efb')");
        }

        @Override // androidx.room.E0.b
        public final void b(@N androidx.sqlite.db.framework.b bVar) {
            bVar.P4("DROP TABLE IF EXISTS `viewed_adverts`");
            int i12 = ViewedAdvertsDb_Impl.f81031o;
            ArrayList arrayList = ViewedAdvertsDb_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).a(bVar);
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void c() {
            int i12 = ViewedAdvertsDb_Impl.f81031o;
            ArrayList arrayList = ViewedAdvertsDb_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).getClass();
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void d(@N androidx.sqlite.db.framework.b bVar) {
            ViewedAdvertsDb_Impl viewedAdvertsDb_Impl = ViewedAdvertsDb_Impl.this;
            int i12 = ViewedAdvertsDb_Impl.f81031o;
            viewedAdvertsDb_Impl.f54297a = bVar;
            ViewedAdvertsDb_Impl.this.m(bVar);
            ArrayList arrayList = ViewedAdvertsDb_Impl.this.f54303g;
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
            HashMap map = new HashMap(2);
            map.put("advert_string_id", new h.a(1, "advert_string_id", "TEXT", null, true, 1));
            HashSet hashSetN = androidx.media3.exoplayer.analytics.m.n(map, "add_time", new h.a(0, "add_time", "INTEGER", null, true, 1), 0);
            HashSet hashSet = new HashSet(1);
            hashSet.add(new h.f("index_viewed_adverts_advert_string_id", false, Arrays.asList("advert_string_id"), Arrays.asList("ASC")));
            V1.h hVar = new V1.h("viewed_adverts", map, hashSetN, hashSet);
            V1.h hVarA = V1.h.a(bVar, "viewed_adverts");
            return !hVar.equals(hVarA) ? new E0.c(false, androidx.media3.exoplayer.analytics.m.k("viewed_adverts(com.avito.android.advert.viewed.persistance.ViewedAdvertData).\n Expected:\n", hVar, "\n Found:\n", hVarA)) : new E0.c(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final Y f() {
        return new Y(this, new HashMap(0), new HashMap(0), "viewed_adverts");
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final Z1.e g(@N C c12) {
        E0 e02 = new E0(c12, new a(), "b7442e28c195d9800953547c0da74efb", "afa4987757928e98820374e06c902471");
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
        map.put(b.class, Collections.emptyList());
        return map;
    }

    @Override // com.avito.android.advert.viewed.persistance.ViewedAdvertsDb
    public final b u() {
        c cVar;
        if (this.f81032n != null) {
            return this.f81032n;
        }
        synchronized (this) {
            try {
                if (this.f81032n == null) {
                    this.f81032n = new c(this);
                }
                cVar = this.f81032n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
