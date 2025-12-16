package com.google.common.cache;

import com.google.common.base.D;
import com.google.common.base.F;
import com.google.common.base.b0;
import com.google.common.cache.l;
import com.google.common.collect.AbstractC37412t1;
import java.util.Arrays;

/* compiled from: CacheBuilderSpec.java */
@XY0.c
@com.google.common.cache.h
/* loaded from: classes6.dex */
public final class e {

    /* compiled from: CacheBuilderSpec.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f359103a;

        static {
            int[] iArr = new int[l.t.values().length];
            f359103a = iArr;
            try {
                iArr[l.t.f359211d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f359103a[l.t.f359210c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CacheBuilderSpec.java */
    public static class b extends d {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static class c extends f {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static abstract class d implements m {
    }

    /* compiled from: CacheBuilderSpec.java */
    /* renamed from: com.google.common.cache.e$e, reason: collision with other inner class name */
    public static class C10655e extends f {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static abstract class f implements m {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static class g implements m {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static abstract class h implements m {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static class i extends h {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static class j extends h {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static class k implements m {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static class l extends d {
    }

    /* compiled from: CacheBuilderSpec.java */
    public interface m {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static class n implements m {
    }

    /* compiled from: CacheBuilderSpec.java */
    public static class o extends d {
    }

    static {
        b0.a(',').e();
        b0.a('=').e();
        AbstractC37412t1.b bVar = new AbstractC37412t1.b();
        bVar.c("initialCapacity", new C10655e());
        bVar.c("maximumSize", new i());
        bVar.c("maximumWeight", new j());
        bVar.c("concurrencyLevel", new c());
        l.t.a aVar = l.t.f359209b;
        bVar.c("weakKeys", new g());
        bVar.c("softValues", new n());
        bVar.c("weakValues", new n());
        bVar.c("recordStats", new k());
        bVar.c("expireAfterAccess", new b());
        bVar.c("expireAfterWrite", new o());
        bVar.c("refreshAfterWrite", new l());
        bVar.c("refreshInterval", new l());
        bVar.a(true);
    }

    public final boolean equals(@I41.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        ((e) obj).getClass();
        return F.a(null, null) && F.a(null, null) && F.a(null, null) && F.a(null, null) && F.a(null, null) && F.a(null, null) && F.a(null, null) && F.a(null, null) && F.a(null, null) && F.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null, null, null, null, null, null, null, null});
    }

    public final String toString() {
        D.b bVarB = D.b(this);
        bVarB.d(null);
        return bVarB.toString();
    }
}
