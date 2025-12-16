package androidx.compose.runtime;

import android.os.Trace;
import androidx.compose.runtime.C22069g0;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.snapshots.C22164i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;

/* compiled from: Composition.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/M;", "Landroidx/compose/runtime/d0;", "Landroidx/compose/runtime/E2;", "Landroidx/compose/runtime/g2;", "Landroidx/compose/runtime/Z;", "Landroidx/compose/runtime/H1;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M implements InterfaceC22053d0, E2, InterfaceC22071g2, Z, H1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I f38024b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22078i<?> f38025c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<Object> f38026d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f38027e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Set<B2> f38028f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final L2 f38029g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<Object, Object> f38030h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.S0<C22039c2> f38031i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.S0<C22039c2> f38032j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<Object, Object> f38033k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.changelist.a f38034l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.changelist.a f38035m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<Object, Object> f38036n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public androidx.collection.R0<Object, Object> f38037o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f38038p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public M f38039q;

    /* renamed from: r, reason: collision with root package name */
    public int f38040r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final W f38041s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final B f38042t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final CoroutineContext f38043u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f38044v;

    public M() {
        throw null;
    }

    public M(I i12, InterfaceC22078i interfaceC22078i, CoroutineContext coroutineContext, int i13, C42822w c42822w) {
        C42822w c42822w2 = null;
        coroutineContext = (i13 & 4) != 0 ? null : coroutineContext;
        this.f38024b = i12;
        this.f38025c = interfaceC22078i;
        this.f38026d = new AtomicReference<>(null);
        this.f38027e = new Object();
        int i14 = 0;
        int i15 = 1;
        Set<B2> setF = new androidx.collection.S0(i14, i15, c42822w2).f();
        this.f38028f = setF;
        L2 l22 = new L2();
        if (i12.d()) {
            l22.f38022l = new androidx.collection.A0<>(i14, i15, c42822w2);
        }
        if (i12.getF37918c()) {
            l22.b();
        }
        this.f38029g = l22;
        this.f38030h = androidx.collection.i1.b();
        this.f38031i = new androidx.collection.S0<>(i14, i15, c42822w2);
        this.f38032j = new androidx.collection.S0<>(i14, i15, c42822w2);
        this.f38033k = androidx.collection.i1.b();
        androidx.compose.runtime.changelist.a aVar = new androidx.compose.runtime.changelist.a();
        this.f38034l = aVar;
        androidx.compose.runtime.changelist.a aVar2 = new androidx.compose.runtime.changelist.a();
        this.f38035m = aVar2;
        this.f38036n = androidx.collection.i1.b();
        this.f38037o = androidx.collection.i1.b();
        this.f38041s = new W(null, false, 3, null);
        B b12 = new B(interfaceC22078i, i12, l22, setF, aVar, aVar2, this);
        i12.p(b12);
        this.f38042t = b12;
        this.f38043u = coroutineContext;
        boolean z12 = i12 instanceof Recomposer;
        r.f38547a.getClass();
        C22096n c22096n = r.f38548b;
    }

    public final void A(Object obj) {
        Object objE = this.f38030h.e(obj);
        if (objE == null) {
            return;
        }
        boolean z12 = objE instanceof androidx.collection.S0;
        androidx.collection.R0<Object, Object> r02 = this.f38036n;
        if (!z12) {
            C22039c2 c22039c2 = (C22039c2) objE;
            if (c22039c2.b(obj) == InvalidationResult.f37984e) {
                androidx.compose.runtime.collection.i.a(r02, obj, c22039c2);
                return;
            }
            return;
        }
        androidx.collection.S0 s02 = (androidx.collection.S0) objE;
        Object[] objArr = s02.f25730b;
        long[] jArr = s02.f25729a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j12 = jArr[i12];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j12) < 128) {
                        C22039c2 c22039c22 = (C22039c2) objArr[(i12 << 3) + i14];
                        if (c22039c22.b(obj) == InvalidationResult.f37984e) {
                            androidx.compose.runtime.collection.i.a(r02, obj, c22039c22);
                        }
                    }
                    j12 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    @Override // androidx.compose.runtime.H
    public final boolean A7() {
        boolean z12;
        synchronized (this.f38027e) {
            z12 = this.f38037o.f25725e > 0;
        }
        return z12;
    }

    public final androidx.compose.runtime.tooling.e B() {
        W w12 = this.f38041s;
        if (w12.f38160b) {
            return w12.f38159a;
        }
        W wJ2 = this.f38024b.getF37919d();
        androidx.compose.runtime.tooling.e eVar = wJ2 != null ? wJ2.f38159a : null;
        if (!kotlin.jvm.internal.L.f(eVar, w12.f38159a)) {
            w12.f38159a = eVar;
        }
        return eVar;
    }

    @Override // androidx.compose.runtime.InterfaceC22053d0, androidx.compose.runtime.InterfaceC22071g2
    public final void a(@Y61.k Object obj) {
        C22039c2 c22039c2F0;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 1;
        B b12 = this.f38042t;
        if (b12.f37872A <= 0 && (c22039c2F0 = b12.f0()) != null) {
            c22039c2F0.e();
            C42822w c42822w = null;
            int i17 = 0;
            if ((c22039c2F0.f38181a & 32) == 0) {
                androidx.collection.M0<Object> m02 = c22039c2F0.f38186f;
                if (m02 == null) {
                    m02 = new androidx.collection.M0<>(i17, i16, c42822w);
                    c22039c2F0.f38186f = m02;
                }
                int i18 = c22039c2F0.f38185e;
                int iE2 = m02.e(obj);
                if (iE2 < 0) {
                    iE2 = ~iE2;
                    i15 = -1;
                } else {
                    i15 = m02.f25649c[iE2];
                }
                m02.f25648b[iE2] = obj;
                m02.f25649c[iE2] = i18;
                if (i15 == c22039c2F0.f38185e) {
                    return;
                }
            }
            if (obj instanceof androidx.compose.runtime.snapshots.W) {
                int i19 = C22164i.f38715b;
                ((androidx.compose.runtime.snapshots.W) obj).q(1);
            }
            androidx.compose.runtime.collection.i.a(this.f38030h, obj, c22039c2F0);
            if (obj instanceof InterfaceC22074h0) {
                InterfaceC22074h0<?> interfaceC22074h0 = (InterfaceC22074h0) obj;
                C22069g0.a aVarO = interfaceC22074h0.o();
                androidx.collection.R0<Object, Object> r02 = this.f38033k;
                androidx.compose.runtime.collection.i.d(r02, obj);
                androidx.collection.M0 m03 = aVarO.f38409e;
                Object[] objArr = m03.f25648b;
                long[] jArr = m03.f25647a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i22 = 0;
                    while (true) {
                        long j12 = jArr[i22];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i23 = 8;
                            int i24 = 8 - ((~(i22 - length)) >>> 31);
                            int i25 = 0;
                            while (i25 < i24) {
                                if ((j12 & 255) < 128) {
                                    androidx.compose.runtime.snapshots.V v12 = (androidx.compose.runtime.snapshots.V) objArr[(i22 << 3) + i25];
                                    if (v12 instanceof androidx.compose.runtime.snapshots.W) {
                                        int i26 = C22164i.f38715b;
                                        i13 = 1;
                                        ((androidx.compose.runtime.snapshots.W) v12).q(1);
                                    } else {
                                        i13 = 1;
                                    }
                                    androidx.compose.runtime.collection.i.a(r02, v12, obj);
                                    i14 = 8;
                                } else {
                                    i13 = i16;
                                    i14 = i23;
                                }
                                j12 >>= i14;
                                i25 += i13;
                                i23 = i14;
                                i16 = i13;
                            }
                            i12 = i16;
                            if (i24 != i23) {
                                break;
                            }
                        } else {
                            i12 = i16;
                        }
                        if (i22 == length) {
                            break;
                        }
                        i22 += i12;
                        i16 = i12;
                    }
                } else {
                    i12 = 1;
                }
                Object obj2 = aVarO.f38410f;
                androidx.collection.R0<InterfaceC22074h0<?>, Object> r03 = c22039c2F0.f38187g;
                if (r03 == null) {
                    r03 = new androidx.collection.R0<>(0, i12, null);
                    c22039c2F0.f38187g = r03;
                }
                r03.m(interfaceC22074h0, obj2);
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC22053d0
    public final void b(@Y61.k Y41.a<kotlin.G0> aVar) {
        B b12 = this.f38042t;
        if (b12.f37877F) {
            G.c("Preparing a composition while composing is not supported");
        }
        b12.f37877F = true;
        try {
            ((C22120l2) aVar).invoke();
        } finally {
            b12.f37877F = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC22053d0
    public final void c(@Y61.k ArrayList arrayList) {
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                if (!((C22183t1) ((kotlin.Q) arrayList.get(i12)).f406619b).f38767c.equals(this)) {
                    G.c("Check failed");
                    break;
                }
                i12++;
            }
        }
        try {
            B b12 = this.f38042t;
            b12.getClass();
            try {
                b12.h0(arrayList);
                b12.R();
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                b12.P();
                throw th2;
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.InterfaceC22071g2
    public final void d() {
        this.f38038p = true;
    }

    @Override // androidx.compose.runtime.E2
    public final void deactivate() {
        synchronized (this.f38027e) {
            try {
                boolean z12 = this.f38029g.f38013c > 0;
                if (z12 || !this.f38028f.isEmpty()) {
                    androidx.compose.runtime.internal.U.f38447a.getClass();
                    Trace.beginSection("Compose:deactivate");
                    try {
                        androidx.compose.runtime.internal.L l12 = new androidx.compose.runtime.internal.L(this.f38028f);
                        if (z12) {
                            this.f38025c.getClass();
                            O2 o2E = this.f38029g.e();
                            try {
                                G.e(o2E, l12);
                                kotlin.G0 g02 = kotlin.G0.f406611a;
                                o2E.e(true);
                                this.f38025c.b();
                                l12.b();
                            } catch (Throwable th2) {
                                o2E.e(false);
                                throw th2;
                            }
                        }
                        l12.a();
                        kotlin.G0 g03 = kotlin.G0.f406611a;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        androidx.compose.runtime.internal.U.f38447a.getClass();
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.f38030h.g();
                this.f38033k.g();
                this.f38037o.g();
                this.f38034l.f38190a.b();
                this.f38035m.f38190a.b();
                B b12 = this.f38042t;
                b12.f37876E.clear();
                b12.f37907s.clear();
                b12.f37894f.f38190a.b();
                b12.f37910v = null;
                kotlin.G0 g04 = kotlin.G0.f406611a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // androidx.compose.runtime.H
    public final void dispose() {
        synchronized (this.f38027e) {
            try {
                if (this.f38042t.f37877F) {
                    P1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f38044v) {
                    this.f38044v = true;
                    r.f38547a.getClass();
                    C22096n c22096n = r.f38549c;
                    androidx.compose.runtime.changelist.a aVar = this.f38042t.f37883L;
                    if (aVar != null) {
                        t(aVar);
                    }
                    boolean z12 = this.f38029g.f38013c > 0;
                    if (z12 || !this.f38028f.isEmpty()) {
                        androidx.compose.runtime.internal.L l12 = new androidx.compose.runtime.internal.L(this.f38028f);
                        if (z12) {
                            this.f38025c.getClass();
                            O2 o2E = this.f38029g.e();
                            try {
                                G.h(o2E, l12);
                                kotlin.G0 g02 = kotlin.G0.f406611a;
                                o2E.e(true);
                                this.f38025c.clear();
                                this.f38025c.b();
                                l12.b();
                            } catch (Throwable th2) {
                                o2E.e(false);
                                throw th2;
                            }
                        }
                        l12.a();
                    }
                    this.f38042t.U();
                }
                kotlin.G0 g03 = kotlin.G0.f406611a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f38024b.t(this);
    }

    @Override // androidx.compose.runtime.InterfaceC22053d0
    public final boolean e() {
        boolean zL02;
        synchronized (this.f38027e) {
            try {
                w();
                try {
                    androidx.collection.R0<Object, Object> r02 = this.f38037o;
                    this.f38037o = androidx.collection.i1.b();
                    try {
                        androidx.compose.runtime.tooling.e eVarB = B();
                        if (eVarB != null) {
                            androidx.compose.runtime.collection.i.b(r02);
                            eVarB.b();
                        }
                        zL02 = this.f38042t.l0(r02);
                        if (!zL02) {
                            x();
                        }
                        if (eVarB != null) {
                            eVarB.a();
                        }
                    } catch (Exception e12) {
                        this.f38037o = r02;
                        throw e12;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zL02;
    }

    @Override // androidx.compose.runtime.InterfaceC22071g2
    @Y61.k
    public final InvalidationResult f(@Y61.k C22039c2 c22039c2, @Y61.l Object obj) {
        M m12;
        int i12 = c22039c2.f38181a;
        if ((i12 & 2) != 0) {
            c22039c2.f38181a = i12 | 4;
        }
        C22068g c22068g = c22039c2.f38183c;
        if (c22068g == null || !c22068g.a()) {
            return InvalidationResult.f37981b;
        }
        if (this.f38029g.g(c22068g)) {
            return c22039c2.f38184d != null ? z(c22039c2, c22068g, obj) : InvalidationResult.f37981b;
        }
        synchronized (this.f38027e) {
            m12 = this.f38039q;
        }
        if (m12 != null) {
            B b12 = m12.f38042t;
            if (b12.f37877F && b12.D0(c22039c2, obj)) {
                return InvalidationResult.f37984e;
            }
        }
        return InvalidationResult.f37981b;
    }

    @Override // androidx.compose.runtime.E2
    public final void g(@Y61.k C22096n c22096n) {
        B b12 = this.f38042t;
        b12.f37914z = 100;
        b12.f37913y = true;
        if (this.f38044v) {
            P1.b("The composition is disposed");
        }
        this.f38024b.a(this, c22096n);
        if (b12.f37877F || b12.f37914z != 100) {
            P1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        b12.f37914z = -1;
        b12.f37913y = false;
    }

    @Override // androidx.compose.runtime.InterfaceC22053d0
    public final void h() {
        synchronized (this.f38027e) {
            try {
                for (Object obj : this.f38029g.f38014d) {
                    C22039c2 c22039c2 = obj instanceof C22039c2 ? (C22039c2) obj : null;
                    if (c22039c2 != null) {
                        c22039c2.invalidate();
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.H
    /* renamed from: i, reason: from getter */
    public final boolean getF38044v() {
        return this.f38044v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.InterfaceC22053d0
    public final void j(@Y61.k androidx.compose.runtime.collection.g gVar) {
        androidx.compose.runtime.collection.g gVar2;
        while (true) {
            Object obj = this.f38026d.get();
            if (obj == null ? true : obj.equals(N.f38052a)) {
                gVar2 = gVar;
            } else if (obj instanceof Set) {
                gVar2 = new Set[]{obj, gVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f38026d).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = gVar;
                gVar2 = CopyOf;
            }
            AtomicReference<Object> atomicReference = this.f38026d;
            while (!atomicReference.compareAndSet(obj, gVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f38027e) {
                    x();
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    @Override // androidx.compose.runtime.InterfaceC22053d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(@Y61.k java.util.Set<? extends java.lang.Object> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof androidx.compose.runtime.collection.g
            androidx.collection.R0<java.lang.Object, java.lang.Object> r3 = r0.f38033k
            androidx.collection.R0<java.lang.Object, java.lang.Object> r4 = r0.f38030h
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            androidx.compose.runtime.collection.g r1 = (androidx.compose.runtime.collection.g) r1
            androidx.collection.j1<T> r1 = r1.f38269b
            java.lang.Object[] r2 = r1.f25730b
            long[] r1 = r1.f25729a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.M.k(java.util.Set):boolean");
    }

    @Override // androidx.compose.runtime.InterfaceC22053d0
    public final void l() {
        synchronized (this.f38027e) {
            try {
                t(this.f38034l);
                x();
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f38028f.isEmpty()) {
                            new androidx.compose.runtime.internal.L(this.f38028f).a();
                        }
                        throw th2;
                    } catch (Exception e12) {
                        q();
                        throw e12;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC22053d0
    public final void m() {
        synchronized (this.f38027e) {
            try {
                this.f38042t.f37910v = null;
                if (!this.f38028f.isEmpty()) {
                    new androidx.compose.runtime.internal.L(this.f38028f).a();
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f38028f.isEmpty()) {
                            new androidx.compose.runtime.internal.L(this.f38028f).a();
                        }
                        throw th2;
                    } catch (Exception e12) {
                        q();
                        throw e12;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC22053d0
    public final void n() {
        synchronized (this.f38027e) {
            try {
                if (this.f38035m.f38190a.f()) {
                    t(this.f38035m);
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f38028f.isEmpty()) {
                            new androidx.compose.runtime.internal.L(this.f38028f).a();
                        }
                        throw th2;
                    } catch (Exception e12) {
                        q();
                        throw e12;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC22053d0
    public final boolean o() {
        return this.f38042t.f37877F;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // androidx.compose.runtime.InterfaceC22053d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(@Y61.k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f38027e
            monitor-enter(r0)
            r14.A(r15)     // Catch: java.lang.Throwable -> L4f
            androidx.collection.R0<java.lang.Object, java.lang.Object> r1 = r14.f38033k     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.e(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof androidx.collection.S0     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            androidx.collection.S0 r15 = (androidx.collection.S0) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f25730b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f25729a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.h0 r10 = (androidx.compose.runtime.InterfaceC22074h0) r10     // Catch: java.lang.Throwable -> L4f
            r14.A(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L65
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            androidx.compose.runtime.h0 r15 = (androidx.compose.runtime.InterfaceC22074h0) r15     // Catch: java.lang.Throwable -> L4f
            r14.A(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            kotlin.G0 r15 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L65:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.M.p(java.lang.Object):void");
    }

    @Override // androidx.compose.runtime.InterfaceC22053d0
    public final void q() {
        this.f38026d.set(null);
        this.f38034l.f38190a.b();
        this.f38035m.f38190a.b();
        Set<B2> set = this.f38028f;
        if (set.isEmpty()) {
            return;
        }
        new androidx.compose.runtime.internal.L(set).a();
    }

    public final void r(Object obj, boolean z12) {
        int i12;
        Object objE = this.f38030h.e(obj);
        if (objE == null) {
            return;
        }
        boolean z13 = objE instanceof androidx.collection.S0;
        androidx.collection.S0<C22039c2> s02 = this.f38031i;
        androidx.collection.S0<C22039c2> s03 = this.f38032j;
        androidx.collection.R0<Object, Object> r02 = this.f38036n;
        if (!z13) {
            C22039c2 c22039c2 = (C22039c2) objE;
            if (androidx.compose.runtime.collection.i.c(r02, obj, c22039c2) || c22039c2.b(obj) == InvalidationResult.f37981b) {
                return;
            }
            if (c22039c2.f38187g == null || z12) {
                s02.e(c22039c2);
                return;
            } else {
                s03.e(c22039c2);
                return;
            }
        }
        androidx.collection.S0 s04 = (androidx.collection.S0) objE;
        Object[] objArr = s04.f25730b;
        long[] jArr = s04.f25729a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j12 = jArr[i13];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((255 & j12) < 128) {
                        C22039c2 c22039c22 = (C22039c2) objArr[(i13 << 3) + i16];
                        if (!androidx.compose.runtime.collection.i.c(r02, obj, c22039c22) && c22039c22.b(obj) != InvalidationResult.f37981b) {
                            if (c22039c22.f38187g == null || z12) {
                                s02.e(c22039c22);
                            } else {
                                s03.e(c22039c22);
                            }
                        }
                        i12 = 8;
                    } else {
                        i12 = i14;
                    }
                    j12 >>= i12;
                    i16++;
                    i14 = i12;
                }
                if (i15 != i14) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182 A[EDGE_INSN: B:69:0x0182->B:216:0x018c BREAK  A[LOOP:13: B:59:0x0148->B:70:0x0184]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.util.Set<? extends java.lang.Object> r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.M.s(java.util.Set, boolean):void");
    }

    public final void t(androidx.compose.runtime.changelist.a aVar) throws Throwable {
        androidx.compose.runtime.internal.L l12;
        long[] jArr;
        androidx.compose.runtime.internal.L l13;
        long[] jArr2;
        int i12;
        int i13;
        char c12;
        long j12;
        int i14;
        boolean zC2;
        long[] jArr3;
        long[] jArr4;
        int i15 = 1;
        androidx.compose.runtime.changelist.a aVar2 = this.f38035m;
        androidx.compose.runtime.internal.L l14 = new androidx.compose.runtime.internal.L(this.f38028f);
        try {
            if (aVar.f38190a.e()) {
                if (aVar2.f38190a.e()) {
                    l14.a();
                    return;
                }
                return;
            }
            try {
                androidx.compose.runtime.internal.U.f38447a.getClass();
                Trace.beginSection("Compose:applyChanges");
                try {
                    InterfaceC22078i<?> interfaceC22078i = this.f38025c;
                    interfaceC22078i.getClass();
                    O2 o2E = this.f38029g.e();
                    int i16 = 0;
                    try {
                        aVar.b(interfaceC22078i, o2E, l14);
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                        o2E.e(true);
                        interfaceC22078i.b();
                        Trace.endSection();
                        l14.b();
                        l14.c();
                        if (this.f38038p) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f38038p = false;
                                androidx.collection.R0<Object, Object> r02 = this.f38030h;
                                long[] jArr5 = r02.f25721a;
                                int length = jArr5.length - 2;
                                if (length >= 0) {
                                    int i17 = 0;
                                    while (true) {
                                        long j13 = jArr5[i17];
                                        char c13 = 7;
                                        long j14 = -9187201950435737472L;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i18 = 8;
                                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                                            while (i16 < i19) {
                                                if ((j13 & 255) < 128) {
                                                    int i22 = (i17 << 3) + i16;
                                                    Object obj = r02.f25722b[i22];
                                                    Object obj2 = r02.f25723c[i22];
                                                    if (obj2 instanceof androidx.collection.S0) {
                                                        androidx.collection.S0 s02 = (androidx.collection.S0) obj2;
                                                        Object[] objArr = s02.f25730b;
                                                        long[] jArr6 = s02.f25729a;
                                                        int length2 = jArr6.length - 2;
                                                        l13 = l14;
                                                        jArr2 = jArr5;
                                                        if (length2 >= 0) {
                                                            int i23 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j15 = jArr6[i23];
                                                                    i12 = length;
                                                                    i13 = i16;
                                                                    c12 = 7;
                                                                    j12 = -9187201950435737472L;
                                                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                                        int i25 = 0;
                                                                        while (i25 < i24) {
                                                                            if ((j15 & 255) < 128) {
                                                                                jArr4 = jArr6;
                                                                                int i26 = (i23 << 3) + i25;
                                                                                if (!((C22039c2) objArr[i26]).a()) {
                                                                                    s02.o(i26);
                                                                                }
                                                                            } else {
                                                                                jArr4 = jArr6;
                                                                            }
                                                                            j15 >>= 8;
                                                                            i25++;
                                                                            jArr6 = jArr4;
                                                                        }
                                                                        jArr3 = jArr6;
                                                                        if (i24 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr6;
                                                                    }
                                                                    if (i23 == length2) {
                                                                        break;
                                                                    }
                                                                    i23++;
                                                                    length = i12;
                                                                    i16 = i13;
                                                                    jArr6 = jArr3;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    androidx.compose.runtime.internal.U.f38447a.getClass();
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i12 = length;
                                                            i13 = i16;
                                                            c12 = 7;
                                                            j12 = -9187201950435737472L;
                                                        }
                                                        zC2 = s02.c();
                                                    } else {
                                                        l13 = l14;
                                                        jArr2 = jArr5;
                                                        i12 = length;
                                                        i13 = i16;
                                                        c12 = c13;
                                                        j12 = -9187201950435737472L;
                                                        zC2 = !((C22039c2) obj2).a();
                                                    }
                                                    if (zC2) {
                                                        r02.l(i22);
                                                    }
                                                    i14 = 8;
                                                } else {
                                                    l13 = l14;
                                                    jArr2 = jArr5;
                                                    i12 = length;
                                                    i13 = i16;
                                                    c12 = c13;
                                                    j12 = j14;
                                                    i14 = i18;
                                                }
                                                j13 >>= i14;
                                                i15 = 1;
                                                i16 = i13 + 1;
                                                i18 = i14;
                                                c13 = c12;
                                                j14 = j12;
                                                l14 = l13;
                                                jArr5 = jArr2;
                                                length = i12;
                                            }
                                            l12 = l14;
                                            jArr = jArr5;
                                            int i27 = length;
                                            if (i19 != i18) {
                                                break;
                                            } else {
                                                length = i27;
                                            }
                                        } else {
                                            l12 = l14;
                                            jArr = jArr5;
                                        }
                                        if (i17 == length) {
                                            break;
                                        }
                                        i17 += i15;
                                        l14 = l12;
                                        jArr5 = jArr;
                                        i16 = 0;
                                    }
                                } else {
                                    l12 = l14;
                                }
                                u();
                                kotlin.G0 g03 = kotlin.G0.f406611a;
                                androidx.compose.runtime.internal.U.f38447a.getClass();
                                Trace.endSection();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            l12 = l14;
                        }
                        if (aVar2.f38190a.e()) {
                            l12.a();
                        }
                    } catch (Throwable th4) {
                        try {
                            o2E.e(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            androidx.compose.runtime.internal.U.f38447a.getClass();
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                if (aVar2.f38190a.e()) {
                    l14.a();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public final void u() {
        long[] jArr;
        int i12;
        long[] jArr2;
        int i13;
        int i14;
        int i15;
        boolean zC2;
        long[] jArr3;
        Object[] objArr;
        long[] jArr4;
        androidx.collection.R0<Object, Object> r02 = this.f38033k;
        long[] jArr5 = r02.f25721a;
        int length = jArr5.length - 2;
        char c12 = 7;
        long j12 = -9187201950435737472L;
        int i16 = 8;
        if (length >= 0) {
            int i17 = 0;
            while (true) {
                long j13 = jArr5[i17];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j13 & 255) < 128) {
                            int i22 = (i17 << 3) + i19;
                            Object obj = r02.f25722b[i22];
                            Object obj2 = r02.f25723c[i22];
                            boolean z12 = obj2 instanceof androidx.collection.S0;
                            androidx.collection.R0<Object, Object> r03 = this.f38030h;
                            if (z12) {
                                androidx.collection.S0 s02 = (androidx.collection.S0) obj2;
                                Object[] objArr2 = s02.f25730b;
                                long[] jArr6 = s02.f25729a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i13 = length;
                                if (length2 >= 0) {
                                    int i23 = 0;
                                    while (true) {
                                        long j14 = jArr6[i23];
                                        i14 = i17;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                            int i25 = 0;
                                            while (i25 < i24) {
                                                int i26 = i25;
                                                Object[] objArr4 = objArr3;
                                                if ((j14 & 255) < 128) {
                                                    int i27 = (i23 << 3) + i26;
                                                    jArr4 = jArr6;
                                                    if (!r03.c((InterfaceC22074h0) objArr4[i27])) {
                                                        s02.o(i27);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                j14 >>= 8;
                                                i25 = i26 + 1;
                                                objArr3 = objArr4;
                                                jArr6 = jArr4;
                                            }
                                            jArr3 = jArr6;
                                            objArr = objArr3;
                                            if (i24 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr3 = jArr6;
                                            objArr = objArr3;
                                        }
                                        if (i23 == length2) {
                                            break;
                                        }
                                        i23++;
                                        objArr2 = objArr;
                                        i17 = i14;
                                        jArr6 = jArr3;
                                    }
                                } else {
                                    i14 = i17;
                                }
                                zC2 = s02.c();
                            } else {
                                jArr2 = jArr5;
                                i13 = length;
                                i14 = i17;
                                zC2 = !r03.c((InterfaceC22074h0) obj2);
                            }
                            if (zC2) {
                                r02.l(i22);
                            }
                            i15 = 8;
                        } else {
                            jArr2 = jArr5;
                            i13 = length;
                            i14 = i17;
                            i15 = i16;
                        }
                        j13 >>= i15;
                        i19++;
                        i16 = i15;
                        jArr5 = jArr2;
                        length = i13;
                        i17 = i14;
                    }
                    jArr = jArr5;
                    int i28 = length;
                    int i29 = i17;
                    if (i18 != i16) {
                        break;
                    }
                    length = i28;
                    i12 = i29;
                } else {
                    jArr = jArr5;
                    i12 = i17;
                }
                if (i12 == length) {
                    break;
                }
                i17 = i12 + 1;
                jArr5 = jArr;
                c12 = 7;
                j12 = -9187201950435737472L;
                i16 = 8;
            }
        }
        androidx.collection.S0<C22039c2> s03 = this.f38032j;
        if (!s03.d()) {
            return;
        }
        Object[] objArr5 = s03.f25730b;
        long[] jArr7 = s03.f25729a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i32 = 0;
        while (true) {
            long j15 = jArr7[i32];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i33 = 8 - ((~(i32 - length3)) >>> 31);
                for (int i34 = 0; i34 < i33; i34++) {
                    if ((j15 & 255) < 128) {
                        int i35 = (i32 << 3) + i34;
                        if (!(((C22039c2) objArr5[i35]).f38187g != null)) {
                            s03.o(i35);
                        }
                    }
                    j15 >>= 8;
                }
                if (i33 != 8) {
                    return;
                }
            }
            if (i32 == length3) {
                return;
            } else {
                i32++;
            }
        }
    }

    public final void v(@Y61.k C22096n c22096n) {
        androidx.collection.R0<Object, Object> r02;
        try {
            synchronized (this.f38027e) {
                try {
                    w();
                    r02 = this.f38037o;
                    this.f38037o = androidx.collection.i1.b();
                    androidx.compose.runtime.tooling.e eVarB = B();
                    if (eVarB != null) {
                        androidx.compose.runtime.collection.i.b(r02);
                        eVarB.b();
                    }
                    B b12 = this.f38042t;
                    if (!b12.f37894f.f38190a.e()) {
                        G.c("Expected applyChanges() to have been called");
                    }
                    b12.V(r02, c22096n);
                    if (eVarB != null) {
                        eVarB.a();
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    }
                } catch (Exception e12) {
                    this.f38037o = r02;
                    throw e12;
                } finally {
                }
            }
        } finally {
        }
    }

    public final void w() {
        AtomicReference<Object> atomicReference = this.f38026d;
        Object obj = N.f38052a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                G.d("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                s((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                G.d("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                s(set, true);
            }
        }
    }

    public final void x() {
        AtomicReference<Object> atomicReference = this.f38026d;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.L.f(andSet, N.f38052a)) {
            return;
        }
        if (andSet instanceof Set) {
            s((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                s(set, false);
            }
            return;
        }
        if (andSet == null) {
            G.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        G.d("corrupt pendingModifications drain: " + atomicReference);
        throw new KotlinNothingValueException();
    }

    public final void y() {
        AtomicReference<Object> atomicReference = this.f38026d;
        Object andSet = atomicReference.getAndSet(kotlin.collections.B0.f406639b);
        if (kotlin.jvm.internal.L.f(andSet, N.f38052a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            s((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            G.d("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            s(set, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9 A[Catch: all -> 0x0042, EDGE_INSN: B:82:0x00d9->B:68:0x00d9 BREAK  A[LOOP:0: B:49:0x0092->B:64:0x00d1], EDGE_INSN: B:83:0x00d9->B:68:0x00d9 BREAK  A[LOOP:0: B:49:0x0092->B:64:0x00d1], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0062, B:39:0x006d, B:41:0x0071, B:42:0x007a, B:44:0x0082, B:46:0x0086, B:49:0x0092, B:51:0x00a2, B:53:0x00ae, B:55:0x00b8, B:60:0x00c7, B:64:0x00d1, B:65:0x00d4, B:68:0x00d9), top: B:80:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.InvalidationResult z(androidx.compose.runtime.C22039c2 r21, androidx.compose.runtime.C22068g r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.M.z(androidx.compose.runtime.c2, androidx.compose.runtime.g, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    @Override // androidx.compose.runtime.H
    public final void z7(@Y61.k Y41.p<? super A, ? super Integer, kotlin.G0> pVar) {
        C22096n c22096n = (C22096n) pVar;
        if (this.f38044v) {
            P1.b("The composition is disposed");
        }
        this.f38024b.a(this, c22096n);
    }
}
