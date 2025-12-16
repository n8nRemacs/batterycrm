package androidx.compose.runtime.snapshots;

import androidx.collection.S0;
import androidx.compose.runtime.internal.C22083a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.HashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: Snapshot.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22176v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<C22174t, G0> f38748a = a.f38759l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.internal.N<AbstractC22167l> f38749b = new androidx.compose.runtime.internal.N<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Object f38750c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static C22174t f38751d;

    /* renamed from: e, reason: collision with root package name */
    public static long f38752e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C22172q f38753f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final L<V> f38754g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static Object f38755h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static Object f38756i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final C22158c f38757j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final C22083a f38758k;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/t;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/snapshots/t;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.snapshots.v$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C22174t, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f38759l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C22174t c22174t) {
            return G0.f406611a;
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.snapshots.v$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Object, G0> f38760l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Object, G0> f38761m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l<Object, G0> lVar, Y41.l<Object, G0> lVar2) {
            super(1);
            this.f38760l = lVar;
            this.f38761m = lVar2;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            this.f38760l.invoke(obj);
            this.f38761m.invoke(obj);
            return G0.f406611a;
        }
    }

    static {
        C22174t.f38734f.getClass();
        C22174t c22174t = C22174t.f38735g;
        f38751d = c22174t;
        f38752e = 1 + 1;
        f38753f = new C22172q();
        f38754g = new L<>();
        C42784z0 c42784z0 = C42784z0.f406748b;
        f38755h = c42784z0;
        f38756i = c42784z0;
        long j12 = f38752e;
        f38752e = 1 + j12;
        C22158c c22158c = new C22158c(j12, c22174t, null, C22157b.f38693l);
        f38751d = f38751d.g(c22158c.f38722b);
        f38757j = c22158c;
        f38758k = new C22083a(0);
    }

    public static final Y41.l a(Y41.l lVar, Y41.l lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new C22177w(lVar, lVar2);
    }

    public static final HashMap b(long j12, C22160e c22160e, C22174t c22174t) {
        long[] jArr;
        C22174t c22174t2;
        long[] jArr2;
        C22174t c22174t3;
        int i12;
        X xR2;
        long j13 = j12;
        S0<V> s0X = c22160e.x();
        if (s0X != null) {
            C22174t c22174tE = c22160e.getF38721a().g(c22160e.getF38722b()).e(c22160e.f38707k);
            Object[] objArr = s0X.f25730b;
            long[] jArr3 = s0X.f25729a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return null;
            }
            int i13 = 0;
            HashMap map = null;
            loop0: while (true) {
                long j14 = jArr3[i13];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j14 & 255) < 128) {
                            V v12 = (V) objArr[(i13 << 3) + i16];
                            X xD2 = v12.d();
                            jArr2 = jArr3;
                            X xR3 = r(xD2, j13, c22174t);
                            if (xR3 == null || (xR2 = r(xD2, j13, c22174tE)) == null || xR3.equals(xR2)) {
                                c22174t3 = c22174tE;
                            } else {
                                c22174t3 = c22174tE;
                                X xR4 = r(xD2, c22160e.getF38722b(), c22160e.getF38721a());
                                if (xR4 == null) {
                                    q();
                                    throw null;
                                }
                                X xA2 = v12.a(xR2, xR3, xR4);
                                if (xA2 == null) {
                                    break loop0;
                                }
                                if (map == null) {
                                    map = new HashMap();
                                }
                                map.put(xR3, xA2);
                                map = map;
                            }
                            i12 = 8;
                        } else {
                            jArr2 = jArr3;
                            c22174t3 = c22174tE;
                            i12 = i14;
                        }
                        j14 >>= i12;
                        i16++;
                        i14 = i12;
                        jArr3 = jArr2;
                        c22174tE = c22174t3;
                        j13 = j12;
                    }
                    jArr = jArr3;
                    c22174t2 = c22174tE;
                    if (i15 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    c22174t2 = c22174tE;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                j13 = j12;
                jArr3 = jArr;
                c22174tE = c22174t2;
            }
            return map;
        }
        return null;
    }

    public static final void c(AbstractC22167l abstractC22167l) {
        long j12;
        if (f38751d.d(abstractC22167l.getF38722b())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(abstractC22167l.getF38722b());
        sb2.append(", disposed=");
        sb2.append(abstractC22167l.f38723c);
        sb2.append(", applied=");
        C22160e c22160e = abstractC22167l instanceof C22160e ? (C22160e) abstractC22167l : null;
        sb2.append(c22160e != null ? Boolean.valueOf(c22160e.f38710n) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f38750c) {
            C22172q c22172q = f38753f;
            j12 = c22172q.f38728a > 0 ? c22172q.f38729b[0] : -1L;
        }
        sb2.append(j12);
        throw new IllegalStateException(sb2.toString().toString());
    }

    @Y61.k
    public static final C22174t d(@Y61.k C22174t c22174t, long j12, long j13) {
        while (j12 < j13) {
            c22174t = c22174t.g(j12);
            j12++;
        }
        return c22174t;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T e(Y41.l<? super androidx.compose.runtime.snapshots.C22174t, ? extends T> r17) {
        /*
            r0 = 1
            androidx.compose.runtime.snapshots.c r1 = androidx.compose.runtime.snapshots.C22176v.f38757j
            java.lang.Object r2 = androidx.compose.runtime.snapshots.C22176v.f38750c
            monitor-enter(r2)
            androidx.collection.S0<androidx.compose.runtime.snapshots.V> r3 = r1.f38705i     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto Lf
            androidx.compose.runtime.internal.a r4 = androidx.compose.runtime.snapshots.C22176v.f38758k     // Catch: java.lang.Throwable -> L12
            r4.addAndGet(r0)     // Catch: java.lang.Throwable -> L12
        Lf:
            r4 = r17
            goto L15
        L12:
            r0 = move-exception
            goto L9b
        L15:
            java.lang.Object r4 = u(r1, r4)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            r2 = 0
            if (r3 == 0) goto L48
            r5 = -1
            java.lang.Object r6 = androidx.compose.runtime.snapshots.C22176v.f38755h     // Catch: java.lang.Throwable -> L3a
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Throwable -> L3a
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L3a
            r8 = r2
        L28:
            if (r8 >= r7) goto L3c
            java.lang.Object r9 = r6.get(r8)     // Catch: java.lang.Throwable -> L3a
            Y41.p r9 = (Y41.p) r9     // Catch: java.lang.Throwable -> L3a
            androidx.compose.runtime.collection.g r10 = new androidx.compose.runtime.collection.g     // Catch: java.lang.Throwable -> L3a
            r10.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            r9.invoke(r10, r1)     // Catch: java.lang.Throwable -> L3a
            int r8 = r8 + r0
            goto L28
        L3a:
            r0 = move-exception
            goto L42
        L3c:
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.snapshots.C22176v.f38758k
            r1.addAndGet(r5)
            goto L48
        L42:
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.snapshots.C22176v.f38758k
            r1.addAndGet(r5)
            throw r0
        L48:
            java.lang.Object r1 = androidx.compose.runtime.snapshots.C22176v.f38750c
            monitor-enter(r1)
            f()     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L97
            java.lang.Object[] r5 = r3.f25730b     // Catch: java.lang.Throwable -> L8a
            long[] r3 = r3.f25729a     // Catch: java.lang.Throwable -> L8a
            int r6 = r3.length     // Catch: java.lang.Throwable -> L8a
            int r6 = r6 + (-2)
            if (r6 < 0) goto L95
            r7 = r2
        L5a:
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L8a
            long r10 = ~r8     // Catch: java.lang.Throwable -> L8a
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L91
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L8a
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r2
        L74:
            if (r12 >= r10) goto L8f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L8a
            androidx.compose.runtime.snapshots.V r13 = (androidx.compose.runtime.snapshots.V) r13     // Catch: java.lang.Throwable -> L8a
            p(r13)     // Catch: java.lang.Throwable -> L8a
            goto L8c
        L8a:
            r0 = move-exception
            goto L99
        L8c:
            long r8 = r8 >> r11
            int r12 = r12 + r0
            goto L74
        L8f:
            if (r10 != r11) goto L95
        L91:
            if (r7 == r6) goto L95
            int r7 = r7 + r0
            goto L5a
        L95:
            kotlin.G0 r0 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L8a
        L97:
            monitor-exit(r1)
            return r4
        L99:
            monitor-exit(r1)
            throw r0
        L9b:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C22176v.e(Y41.l):java.lang.Object");
    }

    public static final void f() {
        L<V> l12 = f38754g;
        int i12 = l12.f38658a;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            androidx.compose.runtime.internal.Y<V> y12 = l12.f38660c[i13];
            V v12 = y12 != null ? y12.get() : null;
            if (v12 != null && o(v12)) {
                if (i14 != i13) {
                    l12.f38660c[i14] = y12;
                    int[] iArr = l12.f38659b;
                    iArr[i14] = iArr[i13];
                }
                i14++;
            }
            i13++;
        }
        for (int i15 = i14; i15 < i12; i15++) {
            l12.f38660c[i15] = null;
            l12.f38659b[i15] = 0;
        }
        if (i14 != i12) {
            l12.f38658a = i14;
        }
    }

    public static final AbstractC22167l g(AbstractC22167l abstractC22167l, Y41.l<Object, G0> lVar, boolean z12) {
        boolean z13 = abstractC22167l instanceof C22160e;
        if (z13 || abstractC22167l == null) {
            return new a0(z13 ? (C22160e) abstractC22167l : null, lVar, null, false, z12);
        }
        return new b0(abstractC22167l, lVar, z12);
    }

    @kotlin.X
    @Y61.k
    public static final <T extends X> T h(@Y61.k T t12) {
        T t13;
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lJ = j();
        T t14 = (T) r(t12, abstractC22167lJ.getF38722b(), abstractC22167lJ.getF38721a());
        if (t14 != null) {
            return t14;
        }
        synchronized (f38750c) {
            AbstractC22167l abstractC22167lJ2 = j();
            t13 = (T) r(t12, abstractC22167lJ2.getF38722b(), abstractC22167lJ2.getF38721a());
        }
        if (t13 != null) {
            return t13;
        }
        q();
        throw null;
    }

    @kotlin.X
    @Y61.k
    public static final <T extends X> T i(@Y61.k T t12, @Y61.k AbstractC22167l abstractC22167l) {
        T t13;
        T t14 = (T) r(t12, abstractC22167l.getF38722b(), abstractC22167l.getF38721a());
        if (t14 != null) {
            return t14;
        }
        synchronized (f38750c) {
            t13 = (T) r(t12, abstractC22167l.getF38722b(), abstractC22167l.getF38721a());
        }
        if (t13 != null) {
            return t13;
        }
        q();
        throw null;
    }

    @Y61.k
    public static final AbstractC22167l j() {
        AbstractC22167l abstractC22167lA = f38749b.a();
        return abstractC22167lA == null ? f38757j : abstractC22167lA;
    }

    public static final Y41.l<Object, G0> k(Y41.l<Object, G0> lVar, Y41.l<Object, G0> lVar2, boolean z12) {
        if (!z12) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new b(lVar, lVar2);
    }

    @Y61.k
    public static final <T extends X> T l(@Y61.k T t12, @Y61.k V v12) {
        X xD2 = v12.d();
        long j12 = f38752e;
        C22172q c22172q = f38753f;
        if (c22172q.f38728a > 0) {
            j12 = c22172q.f38729b[0];
        }
        long j13 = j12 - 1;
        C22174t.f38734f.getClass();
        C22174t c22174t = C22174t.f38735g;
        T t13 = null;
        X x12 = null;
        while (true) {
            if (xD2 == null) {
                break;
            }
            long j14 = xD2.f38674a;
            if (j14 == 0) {
                break;
            }
            if (j14 != 0 && j14 <= j13 && !c22174t.d(j14)) {
                if (x12 == null) {
                    x12 = xD2;
                } else {
                    if (xD2.f38674a < x12.f38674a) {
                        break;
                    }
                    t13 = (T) x12;
                }
            }
            xD2 = xD2.f38675b;
        }
        t13 = (T) xD2;
        if (t13 != null) {
            t13.f38674a = Long.MAX_VALUE;
            return t13;
        }
        T t14 = (T) t12.c(Long.MAX_VALUE);
        t14.f38675b = v12.d();
        v12.j(t14);
        return t14;
    }

    @kotlin.X
    public static final void m(@Y61.k AbstractC22167l abstractC22167l, @Y61.k V v12) {
        abstractC22167l.t(abstractC22167l.getF38704h() + 1);
        Y41.l<Object, G0> lVarI = abstractC22167l.i();
        if (lVarI != null) {
            lVarI.invoke(v12);
        }
    }

    @Y61.k
    public static final X n(@Y61.k X x12, @Y61.k W w12, @Y61.k AbstractC22167l abstractC22167l, @Y61.k X x13) {
        X xL2;
        if (abstractC22167l.f()) {
            abstractC22167l.n(w12);
        }
        long f38722b = abstractC22167l.getF38722b();
        if (x13.f38674a == f38722b) {
            return x13;
        }
        synchronized (f38750c) {
            xL2 = l(x12, w12);
        }
        xL2.f38674a = f38722b;
        if (x13.f38674a != 1) {
            abstractC22167l.n(w12);
        }
        return xL2;
    }

    public static final boolean o(V v12) {
        X x12;
        long j12 = f38752e;
        C22172q c22172q = f38753f;
        if (c22172q.f38728a > 0) {
            j12 = c22172q.f38729b[0];
        }
        X x13 = null;
        X xD2 = null;
        int i12 = 0;
        for (X xD3 = v12.d(); xD3 != null; xD3 = xD3.f38675b) {
            long j13 = xD3.f38674a;
            if (j13 != 0) {
                if (j13 >= j12) {
                    i12++;
                } else if (x13 == null) {
                    i12++;
                    x13 = xD3;
                } else {
                    if (j13 < x13.f38674a) {
                        x12 = x13;
                        x13 = xD3;
                    } else {
                        x12 = xD3;
                    }
                    if (xD2 == null) {
                        xD2 = v12.d();
                        X x14 = xD2;
                        while (true) {
                            if (xD2 == null) {
                                xD2 = x14;
                                break;
                            }
                            long j14 = xD2.f38674a;
                            if (j14 >= j12) {
                                break;
                            }
                            if (x14.f38674a < j14) {
                                x14 = xD2;
                            }
                            xD2 = xD2.f38675b;
                        }
                    }
                    x13.f38674a = 0L;
                    x13.a(xD2);
                    x13 = x12;
                }
            }
        }
        return i12 > 1;
    }

    public static final void p(V v12) {
        if (o(v12)) {
            L<V> l12 = f38754g;
            int i12 = l12.f38658a;
            int iIdentityHashCode = System.identityHashCode(v12);
            int i13 = -1;
            if (i12 > 0) {
                int i14 = l12.f38658a - 1;
                int i15 = 0;
                while (true) {
                    if (i15 > i14) {
                        i13 = -(i15 + 1);
                        break;
                    }
                    int i16 = (i15 + i14) >>> 1;
                    int i17 = l12.f38659b[i16];
                    if (i17 < iIdentityHashCode) {
                        i15 = i16 + 1;
                    } else if (i17 > iIdentityHashCode) {
                        i14 = i16 - 1;
                    } else {
                        androidx.compose.runtime.internal.Y<V> y12 = l12.f38660c[i16];
                        if (v12 == (y12 != null ? y12.get() : null)) {
                            i13 = i16;
                        } else {
                            int i18 = i16 - 1;
                            while (-1 < i18 && l12.f38659b[i18] == iIdentityHashCode) {
                                androidx.compose.runtime.internal.Y<V> y13 = l12.f38660c[i18];
                                if ((y13 != null ? y13.get() : null) == v12) {
                                    break;
                                } else {
                                    i18--;
                                }
                            }
                            int i19 = l12.f38658a;
                            i18 = i16 + 1;
                            while (true) {
                                if (i18 >= i19) {
                                    i18 = -(l12.f38658a + 1);
                                    break;
                                } else {
                                    if (l12.f38659b[i18] != iIdentityHashCode) {
                                        i18 = -(i18 + 1);
                                        break;
                                    }
                                    androidx.compose.runtime.internal.Y<V> y14 = l12.f38660c[i18];
                                    if ((y14 != null ? y14.get() : null) == v12) {
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                            i13 = i18;
                        }
                    }
                }
                if (i13 >= 0) {
                    return;
                }
            }
            int i22 = -(i13 + 1);
            androidx.compose.runtime.internal.Y<V>[] yArr = l12.f38660c;
            int length = yArr.length;
            if (i12 == length) {
                int i23 = length * 2;
                androidx.compose.runtime.internal.Y<T>[] yArr2 = new androidx.compose.runtime.internal.Y[i23];
                int[] iArr = new int[i23];
                int i24 = i22 + 1;
                System.arraycopy(yArr, i22, yArr2, i24, i12 - i22);
                System.arraycopy(l12.f38660c, 0, yArr2, 0, i22);
                C42756l.k(i24, i22, i12, l12.f38659b, iArr);
                C42756l.p(0, i22, 6, l12.f38659b, iArr);
                l12.f38660c = yArr2;
                l12.f38659b = iArr;
            } else {
                int i25 = i22 + 1;
                System.arraycopy(yArr, i22, yArr, i25, i12 - i22);
                int[] iArr2 = l12.f38659b;
                C42756l.k(i25, i22, i12, iArr2, iArr2);
            }
            l12.f38660c[i22] = new androidx.compose.runtime.internal.Y<>(v12);
            l12.f38659b[i22] = iIdentityHashCode;
            l12.f38658a++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends X> T r(T t12, long j12, C22174t c22174t) {
        T t13 = null;
        while (t12 != null) {
            long j13 = t12.f38674a;
            if (j13 != 0 && j13 <= j12 && !c22174t.d(j13) && (t13 == null || t13.f38674a < t12.f38674a)) {
                t13 = t12;
            }
            t12 = (T) t12.f38675b;
        }
        if (t13 != null) {
            return t13;
        }
        return null;
    }

    @Y61.k
    public static final <T extends X> T s(@Y61.k T t12, @Y61.k V v12) {
        T t13;
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lJ = j();
        Y41.l<Object, G0> lVarE = abstractC22167lJ.getF38696h();
        if (lVarE != null) {
            lVarE.invoke(v12);
        }
        T t14 = (T) r(t12, abstractC22167lJ.getF38722b(), abstractC22167lJ.getF38721a());
        if (t14 != null) {
            return t14;
        }
        synchronized (f38750c) {
            AbstractC22167l abstractC22167lJ2 = j();
            t13 = (T) r(v12.d(), abstractC22167lJ2.getF38722b(), abstractC22167lJ2.getF38721a());
            if (t13 == null) {
                q();
                throw null;
            }
        }
        return t13;
    }

    public static final void t(int i12) {
        C22172q c22172q = f38753f;
        int i13 = c22172q.f38731d[i12];
        c22172q.b(i13, c22172q.f38728a - 1);
        c22172q.f38728a--;
        long[] jArr = c22172q.f38729b;
        long j12 = jArr[i13];
        int i14 = i13;
        while (i14 > 0) {
            int i15 = ((i14 + 1) >> 1) - 1;
            if (jArr[i15] <= j12) {
                break;
            }
            c22172q.b(i15, i14);
            i14 = i15;
        }
        long[] jArr2 = c22172q.f38729b;
        int i16 = c22172q.f38728a >> 1;
        while (i13 < i16) {
            int i17 = (i13 + 1) << 1;
            int i18 = i17 - 1;
            if (i17 < c22172q.f38728a) {
                long j13 = jArr2[i17];
                if (j13 < jArr2[i18]) {
                    if (j13 >= jArr2[i13]) {
                        break;
                    }
                    c22172q.b(i17, i13);
                    i13 = i17;
                }
            }
            if (jArr2[i18] >= jArr2[i13]) {
                break;
            }
            c22172q.b(i18, i13);
            i13 = i18;
        }
        c22172q.f38731d[i12] = c22172q.f38732e;
        c22172q.f38732e = i12;
    }

    public static final <T> T u(C22158c c22158c, Y41.l<? super C22174t, ? extends T> lVar) {
        long j12 = c22158c.f38722b;
        T tInvoke = lVar.invoke(f38751d.b(j12));
        long j13 = f38752e;
        f38752e = 1 + j13;
        C22174t c22174tB = f38751d.b(j12);
        f38751d = c22174tB;
        c22158c.f38722b = j13;
        c22158c.f38721a = c22174tB;
        c22158c.f38704h = 0;
        c22158c.f38705i = null;
        c22158c.o();
        f38751d = f38751d.g(j13);
        return tInvoke;
    }

    @kotlin.X
    @Y61.k
    public static final <T extends X> T v(@Y61.k T t12, @Y61.k V v12, @Y61.k AbstractC22167l abstractC22167l) {
        T t13;
        if (abstractC22167l.f()) {
            abstractC22167l.n(v12);
        }
        long f38722b = abstractC22167l.getF38722b();
        T t14 = (T) r(t12, f38722b, abstractC22167l.getF38721a());
        if (t14 == null) {
            q();
            throw null;
        }
        if (t14.f38674a == abstractC22167l.getF38722b()) {
            return t14;
        }
        synchronized (f38750c) {
            t13 = (T) r(v12.d(), f38722b, abstractC22167l.getF38721a());
            if (t13 == null) {
                q();
                throw null;
            }
            if (t13.f38674a != f38722b) {
                X xL2 = l(t13, v12);
                xL2.a(t13);
                xL2.f38674a = abstractC22167l.getF38722b();
                t13 = (T) xL2;
            }
        }
        if (t14.f38674a != 1) {
            abstractC22167l.n(v12);
        }
        return t13;
    }
}
