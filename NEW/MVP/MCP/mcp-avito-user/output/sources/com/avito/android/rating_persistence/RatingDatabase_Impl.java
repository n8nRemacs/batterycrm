package com.avito.android.rating_persistence;

import V1.h;
import Z1.e;
import androidx.media3.exoplayer.analytics.m;
import androidx.room.C;
import androidx.room.E0;
import androidx.room.RoomDatabase;
import androidx.room.Y;
import com.avito.android.rating_persistence.llm_summary.f;
import j.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes16.dex */
public final class RatingDatabase_Impl extends RatingDatabase {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f249777q = 0;

    /* renamed from: n, reason: collision with root package name */
    public volatile f f249778n;

    /* renamed from: o, reason: collision with root package name */
    public volatile com.avito.android.rating_persistence.aspects.c f249779o;

    /* renamed from: p, reason: collision with root package name */
    public volatile com.avito.android.rating_persistence.sort.c f249780p;

    public class a extends E0.b {
        public a() {
            super(4);
        }

        @Override // androidx.room.E0.b
        public final void a(@N androidx.sqlite.db.framework.b bVar) {
            m.o(bVar, "CREATE TABLE IF NOT EXISTS `rating_llm_summary` (`summary_key` TEXT NOT NULL, `feedback_sending_timestamp` INTEGER NOT NULL, PRIMARY KEY(`summary_key`))", "CREATE TABLE IF NOT EXISTS `rating_aspects` (`aspect_key` TEXT NOT NULL, PRIMARY KEY(`aspect_key`))", "CREATE TABLE IF NOT EXISTS `rating_sort` (`sort_key` TEXT NOT NULL, PRIMARY KEY(`sort_key`))", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.P4("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6be5ef43c9f564f3c313682c9ad4a1e4')");
        }

        @Override // androidx.room.E0.b
        public final void b(@N androidx.sqlite.db.framework.b bVar) {
            bVar.P4("DROP TABLE IF EXISTS `rating_llm_summary`");
            bVar.P4("DROP TABLE IF EXISTS `rating_aspects`");
            bVar.P4("DROP TABLE IF EXISTS `rating_sort`");
            int i12 = RatingDatabase_Impl.f249777q;
            ArrayList arrayList = RatingDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).a(bVar);
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void c() {
            int i12 = RatingDatabase_Impl.f249777q;
            ArrayList arrayList = RatingDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).getClass();
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void d(@N androidx.sqlite.db.framework.b bVar) {
            RatingDatabase_Impl ratingDatabase_Impl = RatingDatabase_Impl.this;
            int i12 = RatingDatabase_Impl.f249777q;
            ratingDatabase_Impl.f54297a = bVar;
            RatingDatabase_Impl.this.m(bVar);
            ArrayList arrayList = RatingDatabase_Impl.this.f54303g;
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
            map.put("summary_key", new h.a(1, "summary_key", "TEXT", null, true, 1));
            h hVar = new h("rating_llm_summary", map, m.n(map, "feedback_sending_timestamp", new h.a(0, "feedback_sending_timestamp", "INTEGER", null, true, 1), 0), new HashSet(0));
            h hVarA = h.a(bVar, "rating_llm_summary");
            if (!hVar.equals(hVarA)) {
                return new E0.c(false, m.k("rating_llm_summary(com.avito.android.rating_persistence.llm_summary.RatingLLMSummaryEntity).\n Expected:\n", hVar, "\n Found:\n", hVarA));
            }
            HashMap map2 = new HashMap(1);
            h hVar2 = new h("rating_aspects", map2, m.n(map2, "aspect_key", new h.a(1, "aspect_key", "TEXT", null, true, 1), 0), new HashSet(0));
            h hVarA2 = h.a(bVar, "rating_aspects");
            if (!hVar2.equals(hVarA2)) {
                return new E0.c(false, m.k("rating_aspects(com.avito.android.rating_persistence.aspects.RatingAspectsEntity).\n Expected:\n", hVar2, "\n Found:\n", hVarA2));
            }
            HashMap map3 = new HashMap(1);
            h hVar3 = new h("rating_sort", map3, m.n(map3, "sort_key", new h.a(1, "sort_key", "TEXT", null, true, 1), 0), new HashSet(0));
            h hVarA3 = h.a(bVar, "rating_sort");
            return !hVar3.equals(hVarA3) ? new E0.c(false, m.k("rating_sort(com.avito.android.rating_persistence.sort.RatingSortEntity).\n Expected:\n", hVar3, "\n Found:\n", hVarA3)) : new E0.c(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final Y f() {
        return new Y(this, new HashMap(0), new HashMap(0), "rating_llm_summary", "rating_aspects", "rating_sort");
    }

    @Override // androidx.room.RoomDatabase
    @N
    public final e g(@N C c12) {
        E0 e02 = new E0(c12, new a(), "6be5ef43c9f564f3c313682c9ad4a1e4", "11fd45c69874e0642f42ce969b929a7a");
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
        map.put(com.avito.android.rating_persistence.llm_summary.a.class, Collections.emptyList());
        map.put(com.avito.android.rating_persistence.aspects.a.class, Collections.emptyList());
        map.put(com.avito.android.rating_persistence.sort.a.class, Collections.emptyList());
        return map;
    }

    @Override // com.avito.android.rating_persistence.RatingDatabase
    public final com.avito.android.rating_persistence.aspects.a u() {
        com.avito.android.rating_persistence.aspects.c cVar;
        if (this.f249779o != null) {
            return this.f249779o;
        }
        synchronized (this) {
            try {
                if (this.f249779o == null) {
                    this.f249779o = new com.avito.android.rating_persistence.aspects.c(this);
                }
                cVar = this.f249779o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // com.avito.android.rating_persistence.RatingDatabase
    public final com.avito.android.rating_persistence.llm_summary.a v() {
        f fVar;
        if (this.f249778n != null) {
            return this.f249778n;
        }
        synchronized (this) {
            try {
                if (this.f249778n == null) {
                    this.f249778n = new f(this);
                }
                fVar = this.f249778n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    @Override // com.avito.android.rating_persistence.RatingDatabase
    public final com.avito.android.rating_persistence.sort.a w() {
        com.avito.android.rating_persistence.sort.c cVar;
        if (this.f249780p != null) {
            return this.f249780p;
        }
        synchronized (this) {
            try {
                if (this.f249780p == null) {
                    this.f249780p = new com.avito.android.rating_persistence.sort.c(this);
                }
                cVar = this.f249780p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
