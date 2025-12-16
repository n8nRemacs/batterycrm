package com.google.common.cache;

import aZ0.InterfaceC19845a;
import com.google.common.base.AbstractC37270n;
import com.google.common.base.C37257c;
import com.google.common.base.D;
import com.google.common.base.M;
import com.google.common.base.e0;
import com.google.common.base.f0;
import com.google.common.base.i0;
import com.google.common.cache.a;
import com.google.common.cache.l;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: CacheBuilder.java */
@XY0.b
@h
/* loaded from: classes6.dex */
public final class d<K, V> {

    /* renamed from: o, reason: collision with root package name */
    public static final e0<? extends a.b> f359082o = f0.b(new a());

    /* renamed from: p, reason: collision with root package name */
    public static final i0 f359083p;

    /* renamed from: e, reason: collision with root package name */
    @I41.a
    public y<? super K, ? super V> f359088e;

    /* renamed from: f, reason: collision with root package name */
    @I41.a
    public l.t f359089f;

    /* renamed from: g, reason: collision with root package name */
    @I41.a
    public l.t f359090g;

    /* renamed from: j, reason: collision with root package name */
    @I41.a
    public AbstractC37270n<Object> f359093j;

    /* renamed from: k, reason: collision with root package name */
    @I41.a
    public AbstractC37270n<Object> f359094k;

    /* renamed from: l, reason: collision with root package name */
    @I41.a
    public u<? super K, ? super V> f359095l;

    /* renamed from: m, reason: collision with root package name */
    @I41.a
    public i0 f359096m;

    /* renamed from: a, reason: collision with root package name */
    public boolean f359084a = true;

    /* renamed from: b, reason: collision with root package name */
    public int f359085b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f359086c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f359087d = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f359091h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f359092i = -1;

    /* renamed from: n, reason: collision with root package name */
    public final e0<? extends a.b> f359097n = f359082o;

    /* compiled from: CacheBuilder.java */
    public class b implements e0<a.b> {
        @Override // com.google.common.base.e0
        public final a.b get() {
            return new a.C10653a();
        }
    }

    /* compiled from: CacheBuilder.java */
    public class c extends i0 {
        @Override // com.google.common.base.i0
        public final long a() {
            return 0L;
        }
    }

    /* compiled from: CacheBuilder.java */
    /* renamed from: com.google.common.cache.d$d, reason: collision with other inner class name */
    public static final class C10654d {

        /* renamed from: a, reason: collision with root package name */
        public static final Logger f359098a = Logger.getLogger(d.class.getName());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CacheBuilder.java */
    public static final class e implements u<Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f359099b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ e[] f359100c;

        static {
            e eVar = new e("INSTANCE", 0);
            f359099b = eVar;
            f359100c = new e[]{eVar};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f359100c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CacheBuilder.java */
    public static final class f implements y<Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f359101b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ f[] f359102c;

        static {
            f fVar = new f("INSTANCE", 0);
            f359101b = fVar;
            f359102c = new f[]{fVar};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) f359102c.clone();
        }
    }

    static {
        new b();
        f359083p = new c();
    }

    public final <K1 extends K, V1 extends V> k<K1, V1> a(CacheLoader<? super K1, V1> cacheLoader) {
        b();
        cacheLoader.getClass();
        return new l.n(new l(this, cacheLoader), null);
    }

    public final void b() {
        if (this.f359088e == null) {
            M.n("maximumWeight requires weigher", this.f359087d == -1);
        } else if (this.f359084a) {
            M.n("weigher requires maximumWeight", this.f359087d != -1);
        } else if (this.f359087d == -1) {
            C10654d.f359098a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    @XY0.c
    @InterfaceC19845a
    public final void c() {
        l.t.c cVar = l.t.f359211d;
        l.t tVar = this.f359089f;
        M.p("Key strength was already set to %s", tVar == null, tVar);
        cVar.getClass();
        this.f359089f = cVar;
    }

    public final String toString() {
        D.b bVarB = D.b(this);
        int i12 = this.f359085b;
        if (i12 != -1) {
            bVarB.c("concurrencyLevel", String.valueOf(i12));
        }
        long j12 = this.f359086c;
        if (j12 != -1) {
            bVarB.a(j12, "maximumSize");
        }
        long j13 = this.f359087d;
        if (j13 != -1) {
            bVarB.a(j13, "maximumWeight");
        }
        if (this.f359091h != -1) {
            bVarB.b(AK.c.j(this.f359091h, "ns", new StringBuilder()), "expireAfterWrite");
        }
        if (this.f359092i != -1) {
            bVarB.b(AK.c.j(this.f359092i, "ns", new StringBuilder()), "expireAfterAccess");
        }
        l.t tVar = this.f359089f;
        if (tVar != null) {
            bVarB.b(C37257c.b(tVar.toString()), "keyStrength");
        }
        l.t tVar2 = this.f359090g;
        if (tVar2 != null) {
            bVarB.b(C37257c.b(tVar2.toString()), "valueStrength");
        }
        if (this.f359093j != null) {
            bVarB.d("keyEquivalence");
        }
        if (this.f359094k != null) {
            bVarB.d("valueEquivalence");
        }
        if (this.f359095l != null) {
            bVarB.d("removalListener");
        }
        return bVarB.toString();
    }

    /* compiled from: CacheBuilder.java */
    public class a implements a.b {
        @Override // com.google.common.cache.a.b
        public final void a() {
        }

        @Override // com.google.common.cache.a.b
        public final void c() {
        }

        @Override // com.google.common.cache.a.b
        public final void d() {
        }

        @Override // com.google.common.cache.a.b
        public final void b(long j12) {
        }

        @Override // com.google.common.cache.a.b
        public final void e(long j12) {
        }
    }
}
