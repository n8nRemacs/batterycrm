package androidx.work.impl;

import V1.h;
import Z1.e;
import androidx.room.E0;
import androidx.room.RoomDatabase;
import androidx.work.impl.model.C23562d;
import androidx.work.impl.model.C23567i;
import androidx.work.impl.model.C23573o;
import androidx.work.impl.model.C23578u;
import androidx.work.impl.model.InterfaceC23560b;
import androidx.work.impl.model.InterfaceC23564f;
import androidx.work.impl.model.InterfaceC23568j;
import androidx.work.impl.model.InterfaceC23575q;
import androidx.work.impl.model.InterfaceC23582y;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
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
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f55543w = 0;

    /* renamed from: o, reason: collision with root package name */
    public volatile androidx.work.impl.model.e0 f55544o;

    /* renamed from: p, reason: collision with root package name */
    public volatile C23562d f55545p;

    /* renamed from: q, reason: collision with root package name */
    public volatile androidx.work.impl.model.t0 f55546q;

    /* renamed from: r, reason: collision with root package name */
    public volatile C23578u f55547r;

    /* renamed from: s, reason: collision with root package name */
    public volatile androidx.work.impl.model.A f55548s;

    /* renamed from: t, reason: collision with root package name */
    public volatile androidx.work.impl.model.G f55549t;

    /* renamed from: u, reason: collision with root package name */
    public volatile C23567i f55550u;

    /* renamed from: v, reason: collision with root package name */
    public volatile C23573o f55551v;

    public class a extends E0.b {
        public a() {
            super(23);
        }

        @Override // androidx.room.E0.b
        public final void a(@j.N androidx.sqlite.db.framework.b bVar) {
            androidx.media3.exoplayer.analytics.m.o(bVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            androidx.media3.exoplayer.analytics.m.o(bVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            androidx.media3.exoplayer.analytics.m.o(bVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.P4("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.P4("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.P4("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        @Override // androidx.room.E0.b
        public final void b(@j.N androidx.sqlite.db.framework.b bVar) {
            androidx.media3.exoplayer.analytics.m.o(bVar, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.P4("DROP TABLE IF EXISTS `WorkName`");
            bVar.P4("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.P4("DROP TABLE IF EXISTS `Preference`");
            int i12 = WorkDatabase_Impl.f55543w;
            ArrayList arrayList = WorkDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).a(bVar);
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void c() {
            int i12 = WorkDatabase_Impl.f55543w;
            ArrayList arrayList = WorkDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).getClass();
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void d(@j.N androidx.sqlite.db.framework.b bVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i12 = WorkDatabase_Impl.f55543w;
            workDatabase_Impl.f54297a = bVar;
            bVar.P4("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(bVar);
            ArrayList arrayList = WorkDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).b(bVar);
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void e(@j.N androidx.sqlite.db.framework.b bVar) {
            V1.c.a(bVar);
        }

        @Override // androidx.room.E0.b
        @j.N
        public final E0.c f(@j.N androidx.sqlite.db.framework.b bVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new h.a(1, "work_spec_id", "TEXT", null, true, 1));
            HashSet hashSetN = androidx.media3.exoplayer.analytics.m.n(map, "prerequisite_id", new h.a(2, "prerequisite_id", "TEXT", null, true, 1), 2);
            hashSetN.add(new h.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSetN.add(new h.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new h.f("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet.add(new h.f("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            V1.h hVar = new V1.h("Dependency", map, hashSetN, hashSet);
            V1.h hVarA = V1.h.a(bVar, "Dependency");
            if (!hVar.equals(hVarA)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", hVar, "\n Found:\n", hVarA));
            }
            HashMap map2 = new HashMap(32);
            map2.put("id", new h.a(1, "id", "TEXT", null, true, 1));
            map2.put(VoiceInfo.STATE, new h.a(0, VoiceInfo.STATE, "INTEGER", null, true, 1));
            map2.put("worker_class_name", new h.a(0, "worker_class_name", "TEXT", null, true, 1));
            map2.put("input_merger_class_name", new h.a(0, "input_merger_class_name", "TEXT", null, true, 1));
            map2.put("input", new h.a(0, "input", "BLOB", null, true, 1));
            map2.put("output", new h.a(0, "output", "BLOB", null, true, 1));
            map2.put("initial_delay", new h.a(0, "initial_delay", "INTEGER", null, true, 1));
            map2.put("interval_duration", new h.a(0, "interval_duration", "INTEGER", null, true, 1));
            map2.put("flex_duration", new h.a(0, "flex_duration", "INTEGER", null, true, 1));
            map2.put("run_attempt_count", new h.a(0, "run_attempt_count", "INTEGER", null, true, 1));
            map2.put("backoff_policy", new h.a(0, "backoff_policy", "INTEGER", null, true, 1));
            map2.put("backoff_delay_duration", new h.a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
            map2.put("last_enqueue_time", new h.a(0, "last_enqueue_time", "INTEGER", DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME, true, 1));
            map2.put("minimum_retention_duration", new h.a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
            map2.put("schedule_requested_at", new h.a(0, "schedule_requested_at", "INTEGER", null, true, 1));
            map2.put("run_in_foreground", new h.a(0, "run_in_foreground", "INTEGER", null, true, 1));
            map2.put("out_of_quota_policy", new h.a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
            map2.put("period_count", new h.a(0, "period_count", "INTEGER", "0", true, 1));
            map2.put("generation", new h.a(0, "generation", "INTEGER", "0", true, 1));
            map2.put("next_schedule_time_override", new h.a(0, "next_schedule_time_override", "INTEGER", "9223372036854775807", true, 1));
            map2.put("next_schedule_time_override_generation", new h.a(0, "next_schedule_time_override_generation", "INTEGER", "0", true, 1));
            map2.put("stop_reason", new h.a(0, "stop_reason", "INTEGER", "-256", true, 1));
            map2.put("trace_tag", new h.a(0, "trace_tag", "TEXT", null, false, 1));
            map2.put("required_network_type", new h.a(0, "required_network_type", "INTEGER", null, true, 1));
            map2.put("required_network_request", new h.a(0, "required_network_request", "BLOB", "x''", true, 1));
            map2.put("requires_charging", new h.a(0, "requires_charging", "INTEGER", null, true, 1));
            map2.put("requires_device_idle", new h.a(0, "requires_device_idle", "INTEGER", null, true, 1));
            map2.put("requires_battery_not_low", new h.a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
            map2.put("requires_storage_not_low", new h.a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
            map2.put("trigger_content_update_delay", new h.a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
            map2.put("trigger_max_content_delay", new h.a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
            HashSet hashSetN2 = androidx.media3.exoplayer.analytics.m.n(map2, "content_uri_triggers", new h.a(0, "content_uri_triggers", "BLOB", null, true, 1), 0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new h.f("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet2.add(new h.f("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            V1.h hVar2 = new V1.h("WorkSpec", map2, hashSetN2, hashSet2);
            V1.h hVarA2 = V1.h.a(bVar, "WorkSpec");
            if (!hVar2.equals(hVarA2)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", hVar2, "\n Found:\n", hVarA2));
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new h.a(1, "tag", "TEXT", null, true, 1));
            HashSet hashSetN3 = androidx.media3.exoplayer.analytics.m.n(map3, "work_spec_id", new h.a(2, "work_spec_id", "TEXT", null, true, 1), 1);
            hashSetN3.add(new h.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new h.f("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            V1.h hVar3 = new V1.h("WorkTag", map3, hashSetN3, hashSet3);
            V1.h hVarA3 = V1.h.a(bVar, "WorkTag");
            if (!hVar3.equals(hVarA3)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", hVar3, "\n Found:\n", hVarA3));
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new h.a(1, "work_spec_id", "TEXT", null, true, 1));
            map4.put("generation", new h.a(2, "generation", "INTEGER", "0", true, 1));
            HashSet hashSetN4 = androidx.media3.exoplayer.analytics.m.n(map4, "system_id", new h.a(0, "system_id", "INTEGER", null, true, 1), 1);
            hashSetN4.add(new h.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            V1.h hVar4 = new V1.h("SystemIdInfo", map4, hashSetN4, new HashSet(0));
            V1.h hVarA4 = V1.h.a(bVar, "SystemIdInfo");
            if (!hVar4.equals(hVarA4)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", hVar4, "\n Found:\n", hVarA4));
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new h.a(1, "name", "TEXT", null, true, 1));
            HashSet hashSetN5 = androidx.media3.exoplayer.analytics.m.n(map5, "work_spec_id", new h.a(2, "work_spec_id", "TEXT", null, true, 1), 1);
            hashSetN5.add(new h.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new h.f("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            V1.h hVar5 = new V1.h("WorkName", map5, hashSetN5, hashSet4);
            V1.h hVarA5 = V1.h.a(bVar, "WorkName");
            if (!hVar5.equals(hVarA5)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", hVar5, "\n Found:\n", hVarA5));
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new h.a(1, "work_spec_id", "TEXT", null, true, 1));
            HashSet hashSetN6 = androidx.media3.exoplayer.analytics.m.n(map6, "progress", new h.a(0, "progress", "BLOB", null, true, 1), 1);
            hashSetN6.add(new h.d("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            V1.h hVar6 = new V1.h("WorkProgress", map6, hashSetN6, new HashSet(0));
            V1.h hVarA6 = V1.h.a(bVar, "WorkProgress");
            if (!hVar6.equals(hVarA6)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", hVar6, "\n Found:\n", hVarA6));
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new h.a(1, "key", "TEXT", null, true, 1));
            V1.h hVar7 = new V1.h("Preference", map7, androidx.media3.exoplayer.analytics.m.n(map7, "long_value", new h.a(0, "long_value", "INTEGER", null, false, 1), 0), new HashSet(0));
            V1.h hVarA7 = V1.h.a(bVar, "Preference");
            return !hVar7.equals(hVarA7) ? new E0.c(false, androidx.media3.exoplayer.analytics.m.k("Preference(androidx.work.impl.model.Preference).\n Expected:\n", hVar7, "\n Found:\n", hVarA7)) : new E0.c(true, null);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.I A() {
        androidx.work.impl.model.e0 e0Var;
        if (this.f55544o != null) {
            return this.f55544o;
        }
        synchronized (this) {
            try {
                if (this.f55544o == null) {
                    this.f55544o = new androidx.work.impl.model.e0(this);
                }
                e0Var = this.f55544o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.q0 B() {
        androidx.work.impl.model.t0 t0Var;
        if (this.f55546q != null) {
            return this.f55546q;
        }
        synchronized (this) {
            try {
                if (this.f55546q == null) {
                    this.f55546q = new androidx.work.impl.model.t0(this);
                }
                t0Var = this.f55546q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t0Var;
    }

    @Override // androidx.room.RoomDatabase
    @j.N
    public final androidx.room.Y f() {
        return new androidx.room.Y(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    @j.N
    public final Z1.e g(@j.N androidx.room.C c12) {
        E0 e02 = new E0(c12, new a(), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0");
        e.b.a aVarA = e.b.a(c12.f54232a);
        aVarA.f19829b = c12.f54233b;
        aVarA.f19830c = e02;
        return c12.f54234c.c(aVarA.a());
    }

    @Override // androidx.room.RoomDatabase
    @j.N
    public final List h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new M());
        arrayList.add(new N());
        arrayList.add(new O());
        arrayList.add(new P());
        arrayList.add(new Q());
        arrayList.add(new S());
        arrayList.add(new T());
        arrayList.add(new U());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    @j.N
    public final Set<Class<? extends androidx.room.migration.a>> j() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @j.N
    public final Map<Class<?>, List<Class<?>>> k() {
        HashMap map = new HashMap();
        map.put(androidx.work.impl.model.I.class, Collections.emptyList());
        map.put(InterfaceC23560b.class, Collections.emptyList());
        map.put(androidx.work.impl.model.q0.class, Collections.emptyList());
        map.put(InterfaceC23575q.class, Collections.emptyList());
        map.put(InterfaceC23582y.class, Collections.emptyList());
        map.put(androidx.work.impl.model.C.class, Collections.emptyList());
        map.put(InterfaceC23564f.class, Collections.emptyList());
        map.put(InterfaceC23568j.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC23560b u() {
        C23562d c23562d;
        if (this.f55545p != null) {
            return this.f55545p;
        }
        synchronized (this) {
            try {
                if (this.f55545p == null) {
                    this.f55545p = new C23562d(this);
                }
                c23562d = this.f55545p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c23562d;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC23564f v() {
        C23567i c23567i;
        if (this.f55550u != null) {
            return this.f55550u;
        }
        synchronized (this) {
            try {
                if (this.f55550u == null) {
                    this.f55550u = new C23567i(this);
                }
                c23567i = this.f55550u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c23567i;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC23568j w() {
        C23573o c23573o;
        if (this.f55551v != null) {
            return this.f55551v;
        }
        synchronized (this) {
            try {
                if (this.f55551v == null) {
                    this.f55551v = new C23573o(this);
                }
                c23573o = this.f55551v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c23573o;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC23575q x() {
        C23578u c23578u;
        if (this.f55547r != null) {
            return this.f55547r;
        }
        synchronized (this) {
            try {
                if (this.f55547r == null) {
                    this.f55547r = new C23578u(this);
                }
                c23578u = this.f55547r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c23578u;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC23582y y() {
        androidx.work.impl.model.A a12;
        if (this.f55548s != null) {
            return this.f55548s;
        }
        synchronized (this) {
            try {
                if (this.f55548s == null) {
                    this.f55548s = new androidx.work.impl.model.A(this);
                }
                a12 = this.f55548s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a12;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final androidx.work.impl.model.C z() {
        androidx.work.impl.model.G g12;
        if (this.f55549t != null) {
            return this.f55549t;
        }
        synchronized (this) {
            try {
                if (this.f55549t == null) {
                    this.f55549t = new androidx.work.impl.model.G(this);
                }
                g12 = this.f55549t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g12;
    }
}
