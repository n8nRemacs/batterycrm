package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import VY0.c;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@VY0.c
/* loaded from: classes10.dex */
public abstract class SchedulerConfig {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Flag {

        /* renamed from: b, reason: collision with root package name */
        public static final Flag f343176b;

        /* renamed from: c, reason: collision with root package name */
        public static final Flag f343177c;

        /* renamed from: d, reason: collision with root package name */
        public static final Flag f343178d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Flag[] f343179e;

        static {
            Flag flag = new Flag("NETWORK_UNMETERED", 0);
            f343176b = flag;
            Flag flag2 = new Flag("DEVICE_IDLE", 1);
            f343177c = flag2;
            Flag flag3 = new Flag("DEVICE_CHARGING", 2);
            f343178d = flag3;
            f343179e = new Flag[]{flag, flag2, flag3};
        }

        public Flag() {
            throw null;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) f343179e.clone();
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public com.google.android.datatransport.runtime.time.a f343180a;

        /* renamed from: b, reason: collision with root package name */
        public HashMap f343181b = new HashMap();
    }

    @VY0.c
    public static abstract class b {

        @c.a
        public static abstract class a {
        }

        public abstract long a();

        public abstract Set<Flag> b();

        public abstract long c();
    }

    public static SchedulerConfig b(com.google.android.datatransport.runtime.time.a aVar) {
        a aVar2 = new a();
        Priority priority = Priority.f342916b;
        d.b bVar = new d.b();
        Set<Flag> setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        bVar.f343190c = setEmptySet;
        bVar.f343188a = 30000L;
        bVar.f343189b = 86400000L;
        aVar2.f343181b.put(priority, bVar.a());
        Priority priority2 = Priority.f342918d;
        d.b bVar2 = new d.b();
        Set<Flag> setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        bVar2.f343190c = setEmptySet2;
        bVar2.f343188a = 1000L;
        bVar2.f343189b = 86400000L;
        aVar2.f343181b.put(priority2, bVar2.a());
        Priority priority3 = Priority.f342917c;
        d.b bVar3 = new d.b();
        Set<Flag> setEmptySet3 = Collections.emptySet();
        if (setEmptySet3 == null) {
            throw new NullPointerException("Null flags");
        }
        bVar3.f343190c = setEmptySet3;
        bVar3.f343188a = 86400000L;
        bVar3.f343189b = 86400000L;
        Set<Flag> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(Flag.f343177c)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        bVar3.f343190c = setUnmodifiableSet;
        aVar2.f343181b.put(priority3, bVar3.a());
        aVar2.f343180a = aVar;
        if (aVar == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (aVar2.f343181b.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        HashMap map = aVar2.f343181b;
        aVar2.f343181b = new HashMap();
        return new c(aVar2.f343180a, map);
    }

    public abstract com.google.android.datatransport.runtime.time.a a();

    public final long c(Priority priority, long j12, int i12) {
        long jO2 = j12 - a().O();
        b bVar = d().get(priority);
        long jA2 = bVar.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i12 - 1) * jA2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA2 > 1 ? jA2 : 2L) * r12))), jO2), bVar.c());
    }

    public abstract Map<Priority, b> d();
}
