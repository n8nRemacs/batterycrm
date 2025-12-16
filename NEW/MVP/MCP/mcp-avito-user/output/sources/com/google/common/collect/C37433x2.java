package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.base.AbstractC37270n;
import com.google.common.base.C37257c;
import com.google.common.base.D;
import com.google.common.collect.ConcurrentMapC37438y2;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: MapMaker.java */
@XY0.b
@InterfaceC37329f0
@XY0.d
/* renamed from: com.google.common.collect.x2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37433x2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f360063a;

    /* renamed from: b, reason: collision with root package name */
    public int f360064b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f360065c = -1;

    /* renamed from: d, reason: collision with root package name */
    @I41.a
    public ConcurrentMapC37438y2.q f360066d;

    /* renamed from: e, reason: collision with root package name */
    @I41.a
    public ConcurrentMapC37438y2.q f360067e;

    /* renamed from: f, reason: collision with root package name */
    @I41.a
    public AbstractC37270n<Object> f360068f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapMaker.java */
    /* renamed from: com.google.common.collect.x2$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f360069b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f360070c;

        static {
            a aVar = new a("VALUE", 0);
            f360069b = aVar;
            f360070c = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360070c.clone();
        }
    }

    public final ConcurrentMapC37438y2.q a() {
        return (ConcurrentMapC37438y2.q) com.google.common.base.D.a(this.f360066d, ConcurrentMapC37438y2.q.f360136b);
    }

    public final ConcurrentMapC37438y2.q b() {
        return (ConcurrentMapC37438y2.q) com.google.common.base.D.a(this.f360067e, ConcurrentMapC37438y2.q.f360136b);
    }

    public final <K, V> ConcurrentMap<K, V> c() {
        if (!this.f360063a) {
            int i12 = this.f360064b;
            if (i12 == -1) {
                i12 = 16;
            }
            int i13 = this.f360065c;
            if (i13 == -1) {
                i13 = 4;
            }
            return new ConcurrentHashMap(i12, 0.75f, i13);
        }
        ConcurrentMapC37438y2.C37439a c37439a = ConcurrentMapC37438y2.f360085k;
        ConcurrentMapC37438y2.q qVarA = a();
        ConcurrentMapC37438y2.q.a aVar = ConcurrentMapC37438y2.q.f360136b;
        if (qVarA == aVar && b() == aVar) {
            return new ConcurrentMapC37438y2(this, ConcurrentMapC37438y2.t.a.f360142a);
        }
        if (a() == aVar && b() == ConcurrentMapC37438y2.q.f360137c) {
            return new ConcurrentMapC37438y2(this, ConcurrentMapC37438y2.v.a.f360145a);
        }
        ConcurrentMapC37438y2.q qVarA2 = a();
        ConcurrentMapC37438y2.q.b bVar = ConcurrentMapC37438y2.q.f360137c;
        if (qVarA2 == bVar && b() == aVar) {
            return new ConcurrentMapC37438y2(this, ConcurrentMapC37438y2.C.a.f360099a);
        }
        if (a() == bVar && b() == bVar) {
            return new ConcurrentMapC37438y2(this, ConcurrentMapC37438y2.E.a.f360103a);
        }
        throw new AssertionError();
    }

    public final void d(ConcurrentMapC37438y2.q qVar) {
        ConcurrentMapC37438y2.q qVar2 = this.f360066d;
        com.google.common.base.M.p("Key strength was already set to %s", qVar2 == null, qVar2);
        qVar.getClass();
        this.f360066d = qVar;
        if (qVar != ConcurrentMapC37438y2.q.f360136b) {
            this.f360063a = true;
        }
    }

    @XY0.c
    @InterfaceC19845a
    public final void e() {
        d(ConcurrentMapC37438y2.q.f360137c);
    }

    public final String toString() {
        D.b bVarB = com.google.common.base.D.b(this);
        int i12 = this.f360064b;
        if (i12 != -1) {
            bVarB.c("initialCapacity", String.valueOf(i12));
        }
        int i13 = this.f360065c;
        if (i13 != -1) {
            bVarB.c("concurrencyLevel", String.valueOf(i13));
        }
        ConcurrentMapC37438y2.q qVar = this.f360066d;
        if (qVar != null) {
            bVarB.b(C37257c.b(qVar.toString()), "keyStrength");
        }
        ConcurrentMapC37438y2.q qVar2 = this.f360067e;
        if (qVar2 != null) {
            bVarB.b(C37257c.b(qVar2.toString()), "valueStrength");
        }
        if (this.f360068f != null) {
            bVarB.d("keyEquivalence");
        }
        return bVarB.toString();
    }
}
