package androidx.compose.runtime;

import androidx.compose.runtime.InterfaceC22074h0;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.C22176v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DerivedState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/g0;", "T", "Landroidx/compose/runtime/snapshots/W;", "Landroidx/compose/runtime/h0;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22069g0<T> extends androidx.compose.runtime.snapshots.W implements InterfaceC22074h0<T> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<T> f38402c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22116k3<T> f38403d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public a<T> f38404e = new a<>(C22176v.j().getF38722b());

    /* compiled from: DerivedState.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/g0$a;", "T", "Landroidx/compose/runtime/snapshots/X;", "Landroidx/compose/runtime/h0$a;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.g0$a */
    public static final class a<T> extends androidx.compose.runtime.snapshots.X implements InterfaceC22074h0.a<T> {

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final C1653a f38405h = new C1653a(null);

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public static final Object f38406i = new Object();

        /* renamed from: c, reason: collision with root package name */
        public long f38407c;

        /* renamed from: d, reason: collision with root package name */
        public int f38408d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public androidx.collection.M0 f38409e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public Object f38410f;

        /* renamed from: g, reason: collision with root package name */
        public int f38411g;

        /* compiled from: DerivedState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/g0$a$a;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.g0$a$a, reason: collision with other inner class name */
        public static final class C1653a {
            public /* synthetic */ C1653a(C42822w c42822w) {
                this();
            }

            public C1653a() {
            }
        }

        public a(long j12) {
            super(j12);
            this.f38409e = androidx.collection.Y0.f25657a;
            this.f38410f = f38406i;
        }

        @Override // androidx.compose.runtime.snapshots.X
        public final void a(@Y61.k androidx.compose.runtime.snapshots.X x12) {
            a aVar = (a) x12;
            this.f38409e = aVar.f38409e;
            this.f38410f = aVar.f38410f;
            this.f38411g = aVar.f38411g;
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final androidx.compose.runtime.snapshots.X b() {
            return new a(C22176v.j().getF38722b());
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final androidx.compose.runtime.snapshots.X c(long j12) {
            return new a(j12);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean d(@Y61.k androidx.compose.runtime.InterfaceC22074h0<?> r7, @Y61.k androidx.compose.runtime.snapshots.AbstractC22167l r8) {
            /*
                r6 = this;
                java.lang.Object r0 = androidx.compose.runtime.snapshots.C22176v.f38750c
                monitor-enter(r0)
                long r1 = r6.f38407c     // Catch: java.lang.Throwable -> L1a
                long r3 = r8.getF38722b()     // Catch: java.lang.Throwable -> L1a
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1c
                int r1 = r6.f38408d     // Catch: java.lang.Throwable -> L1a
                int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
                if (r1 == r4) goto L18
                goto L1c
            L18:
                r1 = r3
                goto L1d
            L1a:
                r7 = move-exception
                goto L49
            L1c:
                r1 = r2
            L1d:
                monitor-exit(r0)
                java.lang.Object r4 = r6.f38410f
                java.lang.Object r5 = androidx.compose.runtime.C22069g0.a.f38406i
                if (r4 == r5) goto L2f
                if (r1 == 0) goto L30
                int r4 = r6.f38411g
                int r7 = r6.e(r7, r8)
                if (r4 != r7) goto L2f
                goto L30
            L2f:
                r2 = r3
            L30:
                if (r2 == 0) goto L48
                if (r1 == 0) goto L48
                monitor-enter(r0)
                long r3 = r8.getF38722b()     // Catch: java.lang.Throwable -> L45
                r6.f38407c = r3     // Catch: java.lang.Throwable -> L45
                int r7 = r8.h()     // Catch: java.lang.Throwable -> L45
                r6.f38408d = r7     // Catch: java.lang.Throwable -> L45
                kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L45
                monitor-exit(r0)
                goto L48
            L45:
                r7 = move-exception
                monitor-exit(r0)
                throw r7
            L48:
                return r2
            L49:
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22069g0.a.d(androidx.compose.runtime.h0, androidx.compose.runtime.snapshots.l):boolean");
        }

        public final int e(@Y61.k InterfaceC22074h0<?> interfaceC22074h0, @Y61.k AbstractC22167l abstractC22167l) throws Throwable {
            androidx.collection.M0 m02;
            int i12;
            int i13;
            long[] jArr;
            long[] jArr2;
            int i14;
            androidx.compose.runtime.snapshots.X xR2;
            int i15 = 1;
            synchronized (C22176v.f38750c) {
                m02 = this.f38409e;
            }
            char c12 = 7;
            if (!(m02.f25651e != 0)) {
                return 7;
            }
            androidx.compose.runtime.collection.e<InterfaceC22079i0> eVarC = C22126m3.c();
            InterfaceC22079i0[] interfaceC22079i0Arr = eVarC.f38260b;
            int i16 = eVarC.f38262d;
            for (int i17 = 0; i17 < i16; i17++) {
                interfaceC22079i0Arr[i17].start();
            }
            try {
                Object[] objArr = m02.f25648b;
                int[] iArr = m02.f25649c;
                long[] jArr3 = m02.f25647a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int iIdentityHashCode = 7;
                    int i18 = 0;
                    while (true) {
                        long j12 = jArr3[i18];
                        if ((((~j12) << c12) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8;
                            int i22 = 8 - ((~(i18 - length)) >>> 31);
                            int i23 = 0;
                            while (i23 < i22) {
                                if ((j12 & 255) < 128) {
                                    int i24 = (i18 << 3) + i23;
                                    androidx.compose.runtime.snapshots.V v12 = (androidx.compose.runtime.snapshots.V) objArr[i24];
                                    if (iArr[i24] != i15) {
                                        jArr2 = jArr3;
                                    } else {
                                        if (v12 instanceof C22069g0) {
                                            try {
                                                C22069g0 c22069g0 = (C22069g0) v12;
                                                xR2 = c22069g0.r((a) C22176v.i(c22069g0.f38404e, abstractC22167l), abstractC22167l, false, c22069g0.f38402c);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                InterfaceC22079i0[] interfaceC22079i0Arr2 = eVarC.f38260b;
                                                int i25 = eVarC.f38262d;
                                                for (int i26 = 0; i26 < i25; i26++) {
                                                    interfaceC22079i0Arr2[i26].a();
                                                }
                                                throw th;
                                            }
                                        } else {
                                            xR2 = C22176v.i(v12.d(), abstractC22167l);
                                        }
                                        jArr2 = jArr3;
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(xR2)) * 31) + Long.hashCode(xR2.f38674a);
                                    }
                                    i14 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i14 = i19;
                                }
                                j12 >>= i14;
                                i23++;
                                i19 = i14;
                                i15 = 1;
                                jArr3 = jArr2;
                            }
                            i13 = i15;
                            jArr = jArr3;
                            if (i22 != i19) {
                                break;
                            }
                        } else {
                            i13 = i15;
                            jArr = jArr3;
                        }
                        if (i18 == length) {
                            break;
                        }
                        i18 += i13;
                        i15 = i13;
                        jArr3 = jArr;
                        c12 = 7;
                    }
                    i12 = iIdentityHashCode;
                } else {
                    i12 = 7;
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
                InterfaceC22079i0[] interfaceC22079i0Arr3 = eVarC.f38260b;
                int i27 = eVarC.f38262d;
                for (int i28 = 0; i28 < i27; i28++) {
                    interfaceC22079i0Arr3[i28].a();
                }
                return i12;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* compiled from: DerivedState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.g0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22069g0<T> f38412l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.internal.D f38413m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.collection.M0<androidx.compose.runtime.snapshots.V> f38414n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f38415o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C22069g0<T> c22069g0, androidx.compose.runtime.internal.D d12, androidx.collection.M0<androidx.compose.runtime.snapshots.V> m02, int i12) {
            super(1);
            this.f38412l = c22069g0;
            this.f38413m = d12;
            this.f38414n = m02;
            this.f38415o = i12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Object obj) {
            if (obj == this.f38412l) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof androidx.compose.runtime.snapshots.V) {
                int i12 = this.f38413m.f38422a - this.f38415o;
                androidx.collection.M0<androidx.compose.runtime.snapshots.V> m02 = this.f38414n;
                int iA2 = m02.a(obj);
                m02.h(Math.min(i12, iA2 >= 0 ? m02.f25649c[iA2] : Integer.MAX_VALUE), obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C22069g0(@Y61.k Y41.a<? extends T> aVar, @Y61.l InterfaceC22116k3<T> interfaceC22116k3) {
        this.f38402c = aVar;
        this.f38403d = interfaceC22116k3;
    }

    @Override // androidx.compose.runtime.snapshots.V
    @Y61.k
    public final androidx.compose.runtime.snapshots.X d() {
        return this.f38404e;
    }

    @Override // androidx.compose.runtime.I3
    /* renamed from: getValue */
    public final T getF42167b() {
        AbstractC22167l.f38720e.getClass();
        Y41.l<Object, kotlin.G0> lVarE = C22176v.j().e();
        if (lVarE != null) {
            lVarE.invoke(this);
        }
        AbstractC22167l abstractC22167lJ = C22176v.j();
        return (T) r((a) C22176v.i(this.f38404e, abstractC22167lJ), abstractC22167lJ, true, this.f38402c).f38410f;
    }

    @Override // androidx.compose.runtime.InterfaceC22074h0
    @Y61.l
    public final InterfaceC22116k3<T> h() {
        return this.f38403d;
    }

    @Override // androidx.compose.runtime.snapshots.V
    public final void j(@Y61.k androidx.compose.runtime.snapshots.X x12) {
        this.f38404e = (a) x12;
    }

    @Override // androidx.compose.runtime.InterfaceC22074h0
    @Y61.k
    public final a o() {
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lJ = C22176v.j();
        return r((a) C22176v.i(this.f38404e, abstractC22167lJ), abstractC22167lJ, false, this.f38402c);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public final a<T> r(a<T> aVar, AbstractC22167l abstractC22167l, boolean z12, Y41.a<? extends T> aVar2) {
        InterfaceC22116k3<T> interfaceC22116k3;
        int i12;
        int i13;
        a<T> aVar3 = aVar;
        int i14 = 1;
        if (!aVar3.d(this, abstractC22167l)) {
            int i15 = 0;
            androidx.collection.M0 m02 = new androidx.collection.M0(0, 1, null);
            androidx.compose.runtime.internal.N<androidx.compose.runtime.internal.D> n12 = C22131n3.f38510a;
            androidx.compose.runtime.internal.D dA2 = n12.a();
            if (dA2 == null) {
                dA2 = new androidx.compose.runtime.internal.D(0);
                n12.b(dA2);
            }
            int i16 = dA2.f38422a;
            androidx.compose.runtime.collection.e<InterfaceC22079i0> eVarC = C22126m3.c();
            InterfaceC22079i0[] interfaceC22079i0Arr = eVarC.f38260b;
            int i17 = eVarC.f38262d;
            for (int i18 = 0; i18 < i17; i18++) {
                interfaceC22079i0Arr[i18].start();
            }
            try {
                dA2.f38422a = i16 + 1;
                AbstractC22167l.a aVar4 = AbstractC22167l.f38720e;
                b bVar = new b(this, dA2, m02, i16);
                aVar4.getClass();
                Object objC = AbstractC22167l.a.c(aVar2, bVar);
                dA2.f38422a = i16;
                InterfaceC22079i0[] interfaceC22079i0Arr2 = eVarC.f38260b;
                int i19 = eVarC.f38262d;
                while (i15 < i19) {
                    interfaceC22079i0Arr2[i15].a();
                    i15++;
                }
                Object obj = C22176v.f38750c;
                synchronized (obj) {
                    try {
                        AbstractC22167l.f38720e.getClass();
                        AbstractC22167l abstractC22167lJ = C22176v.j();
                        Object obj2 = aVar3.f38410f;
                        a.f38405h.getClass();
                        if (obj2 == a.f38406i || (interfaceC22116k3 = this.f38403d) == 0 || !interfaceC22116k3.a(objC, aVar3.f38410f)) {
                            a<T> aVar5 = this.f38404e;
                            synchronized (obj) {
                                androidx.compose.runtime.snapshots.X xL2 = C22176v.l(aVar5, this);
                                xL2.a(aVar5);
                                xL2.f38674a = abstractC22167lJ.getF38722b();
                                aVar3 = (a) xL2;
                                aVar3.f38409e = m02;
                                aVar3.f38411g = aVar3.e(this, abstractC22167lJ);
                                aVar3.f38410f = objC;
                            }
                            return aVar3;
                        }
                        aVar3.f38409e = m02;
                        aVar3.f38411g = aVar3.e(this, abstractC22167lJ);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                androidx.compose.runtime.internal.D dA3 = C22131n3.f38510a.a();
                if (dA3 != null && dA3.f38422a == 0) {
                    C22176v.j().m();
                    synchronized (obj) {
                        AbstractC22167l abstractC22167lJ2 = C22176v.j();
                        aVar3.f38407c = abstractC22167lJ2.getF38722b();
                        aVar3.f38408d = abstractC22167lJ2.h();
                        kotlin.G0 g02 = kotlin.G0.f406611a;
                    }
                }
                return aVar3;
            } catch (Throwable th3) {
                InterfaceC22079i0[] interfaceC22079i0Arr3 = eVarC.f38260b;
                int i22 = eVarC.f38262d;
                while (i15 < i22) {
                    interfaceC22079i0Arr3[i15].a();
                    i15++;
                }
                throw th3;
            }
        }
        if (z12) {
            androidx.compose.runtime.collection.e<InterfaceC22079i0> eVarC2 = C22126m3.c();
            InterfaceC22079i0[] interfaceC22079i0Arr4 = eVarC2.f38260b;
            int i23 = eVarC2.f38262d;
            for (int i24 = 0; i24 < i23; i24++) {
                interfaceC22079i0Arr4[i24].start();
            }
            try {
                androidx.collection.M0 m03 = aVar3.f38409e;
                androidx.compose.runtime.internal.N<androidx.compose.runtime.internal.D> n13 = C22131n3.f38510a;
                androidx.compose.runtime.internal.D dA4 = n13.a();
                if (dA4 == null) {
                    dA4 = new androidx.compose.runtime.internal.D(0);
                    n13.b(dA4);
                }
                int i25 = dA4.f38422a;
                Object[] objArr = m03.f25648b;
                int[] iArr = m03.f25649c;
                long[] jArr = m03.f25647a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i26 = 0;
                    while (true) {
                        long j12 = jArr[i26];
                        long[] jArr2 = jArr;
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i27 = 8;
                            int i28 = 8 - ((~(i26 - length)) >>> 31);
                            int i29 = 0;
                            while (i29 < i28) {
                                if ((j12 & 255) < 128) {
                                    int i32 = (i26 << 3) + i29;
                                    androidx.compose.runtime.snapshots.V v12 = (androidx.compose.runtime.snapshots.V) objArr[i32];
                                    dA4.f38422a = i25 + iArr[i32];
                                    Y41.l<Object, kotlin.G0> lVarE = abstractC22167l.e();
                                    if (lVarE != null) {
                                        lVarE.invoke(v12);
                                    }
                                    i13 = 8;
                                } else {
                                    i13 = i27;
                                }
                                j12 >>= i13;
                                i29++;
                                i27 = i13;
                                i14 = 1;
                            }
                            int i33 = i27;
                            i12 = i14;
                            if (i28 != i33) {
                                break;
                            }
                        } else {
                            i12 = i14;
                        }
                        if (i26 == length) {
                            break;
                        }
                        i26 += i12;
                        i14 = i12;
                        jArr = jArr2;
                    }
                }
                dA4.f38422a = i25;
                kotlin.G0 g03 = kotlin.G0.f406611a;
                InterfaceC22079i0[] interfaceC22079i0Arr5 = eVarC2.f38260b;
                int i34 = eVarC2.f38262d;
                for (int i35 = 0; i35 < i34; i35++) {
                    interfaceC22079i0Arr5[i35].a();
                }
            } catch (Throwable th4) {
                InterfaceC22079i0[] interfaceC22079i0Arr6 = eVarC2.f38260b;
                int i36 = eVarC2.f38262d;
                for (int i37 = 0; i37 < i36; i37++) {
                    interfaceC22079i0Arr6[i37].a();
                }
                throw th4;
            }
        }
        return aVar3;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        a aVar = (a) C22176v.h(this.f38404e);
        AbstractC22167l.f38720e.getClass();
        sb2.append(aVar.d(this, C22176v.j()) ? String.valueOf(aVar.f38410f) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
