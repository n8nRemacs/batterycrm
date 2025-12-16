package androidx.compose.foundation.lazy.layout;

import androidx.collection.R0;
import androidx.collection.S0;
import androidx.collection.i1;
import androidx.collection.k1;
import androidx.compose.foundation.lazy.layout.T;
import androidx.compose.ui.graphics.InterfaceC22264l0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.v;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: LazyLayoutItemAnimator.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/layout/T;", "T", "", "<init>", "()V", "DisplayingDisappearingItemsElement", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public I f29318b;

    /* renamed from: c, reason: collision with root package name */
    public int f29319c;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public InterfaceC22438u f29326j;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0<Object, LazyLayoutItemAnimator<T>.b> f29317a = i1.b();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final S0<Object> f29320d = k1.a();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f29321e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f29322f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f29323g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f29324h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f29325i = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.v f29327k = new DisplayingDisappearingItemsElement(this);

    /* compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DisplayingDisappearingItemsElement extends AbstractC22430p0<a> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LazyLayoutItemAnimator<?> f29328b;

        public DisplayingDisappearingItemsElement(@Y61.k LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.f29328b = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.node.AbstractC22430p0
        public final v.d a() {
            a aVar = new a();
            aVar.f29329p = this.f29328b;
            return aVar;
        }

        @Override // androidx.compose.ui.node.AbstractC22430p0
        public final void b(v.d dVar) {
            a aVar = (a) dVar;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = aVar.f29329p;
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator2 = this.f29328b;
            if (kotlin.jvm.internal.L.f(lazyLayoutItemAnimator, lazyLayoutItemAnimator2) || !aVar.f42880b.f42893o) {
                return;
            }
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator3 = aVar.f29329p;
            lazyLayoutItemAnimator3.e();
            lazyLayoutItemAnimator3.f29318b = null;
            lazyLayoutItemAnimator3.f29319c = -1;
            lazyLayoutItemAnimator2.f29326j = aVar;
            aVar.f29329p = lazyLayoutItemAnimator2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && kotlin.jvm.internal.L.f(this.f29328b, ((DisplayingDisappearingItemsElement) obj).f29328b);
        }

        public final int hashCode() {
            return this.f29328b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.f29328b + ')';
        }
    }

    /* compiled from: LazyLayoutItemAnimator.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$a;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/u;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends v.d implements InterfaceC22438u {

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public LazyLayoutItemAnimator<?> f29329p;

        public a() {
            throw null;
        }

        @Override // androidx.compose.ui.v.d
        public final void c2() {
            this.f29329p.f29326j = this;
        }

        @Override // androidx.compose.ui.v.d
        public final void d2() {
            LazyLayoutItemAnimator<?> lazyLayoutItemAnimator = this.f29329p;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.f29318b = null;
            lazyLayoutItemAnimator.f29319c = -1;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f29329p, ((a) obj).f29329p);
        }

        public final int hashCode() {
            return this.f29329p.hashCode();
        }

        @Override // androidx.compose.ui.node.InterfaceC22438u
        public final void t(@Y61.k androidx.compose.ui.node.P p12) {
            ArrayList arrayList = this.f29329p.f29325i;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                C20737p c20737p = (C20737p) arrayList.get(i12);
                C22267c c22267c = c20737p.f29495n;
                if (c22267c != null) {
                    long j12 = c20737p.f29494m;
                    q.a aVar = androidx.compose.ui.unit.q.f42862b;
                    long j13 = c22267c.f39595t;
                    float f12 = ((int) (j12 >> 32)) - ((int) (j13 >> 32));
                    float f13 = ((int) (j12 & 4294967295L)) - ((int) (4294967295L & j13));
                    androidx.compose.ui.graphics.drawscope.a aVar2 = p12.f40671b;
                    aVar2.f39478c.f39485a.f(f12, f13);
                    try {
                        androidx.compose.ui.graphics.layer.h.a(p12, c22267c);
                    } finally {
                        aVar2.f39478c.f39485a.f(-f12, -f13);
                    }
                }
            }
            p12.y1();
        }

        @Y61.k
        public final String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.f29329p + ')';
        }
    }

    /* compiled from: LazyLayoutItemAnimator.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$b;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public C22712b f29331b;

        /* renamed from: c, reason: collision with root package name */
        public int f29332c;

        /* renamed from: d, reason: collision with root package name */
        public int f29333d;

        /* renamed from: f, reason: collision with root package name */
        public int f29335f;

        /* renamed from: g, reason: collision with root package name */
        public int f29336g;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public C20737p[] f29330a = C20744x.f29552a;

        /* renamed from: e, reason: collision with root package name */
        public int f29334e = 1;

        /* compiled from: LazyLayoutItemAnimator.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/T;", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ LazyLayoutItemAnimator<T> f29338l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LazyLayoutItemAnimator<T> lazyLayoutItemAnimator) {
                super(0);
                this.f29338l = lazyLayoutItemAnimator;
            }

            @Override // Y41.a
            public final kotlin.G0 invoke() {
                InterfaceC22438u interfaceC22438u = this.f29338l.f29326j;
                if (interfaceC22438u != null) {
                    C22440v.a(interfaceC22438u);
                }
                return kotlin.G0.f406611a;
            }
        }

        public b() {
        }

        public static void b(b bVar, T t12, kotlinx.coroutines.T t13, InterfaceC22264l0 interfaceC22264l0, int i12, int i13) {
            long j12;
            LazyLayoutItemAnimator.this.getClass();
            long jO2 = t12.o(0);
            if (t12.getF29648d()) {
                q.a aVar = androidx.compose.ui.unit.q.f42862b;
                j12 = jO2 >> 32;
            } else {
                q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
                j12 = jO2 & 4294967295L;
            }
            bVar.a(t12, t13, interfaceC22264l0, i12, i13, (int) j12);
        }

        public final void a(@Y61.k T t12, @Y61.k kotlinx.coroutines.T t13, @Y61.k InterfaceC22264l0 interfaceC22264l0, int i12, int i13, int i14) {
            C20737p[] c20737pArr = this.f29330a;
            int length = c20737pArr.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    this.f29335f = i12;
                    this.f29336g = i13;
                    break;
                } else {
                    C20737p c20737p = c20737pArr[i15];
                    if (c20737p != null && c20737p.f29488g) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            int length2 = this.f29330a.length;
            for (int iD2 = t12.d(); iD2 < length2; iD2++) {
                C20737p c20737p2 = this.f29330a[iD2];
                if (c20737p2 != null) {
                    c20737p2.d();
                }
            }
            if (this.f29330a.length != t12.d()) {
                this.f29330a = (C20737p[]) Arrays.copyOf(this.f29330a, t12.d());
            }
            this.f29331b = C22712b.a(t12.getF29655k());
            this.f29332c = i14;
            this.f29333d = t12.getF29649e();
            this.f29334e = t12.getF29650f();
            int iD3 = t12.d();
            for (int i16 = 0; i16 < iD3; i16++) {
                Object objN = t12.n(i16);
                C20723i c20723i = objN instanceof C20723i ? (C20723i) objN : null;
                if (c20723i == null) {
                    C20737p c20737p3 = this.f29330a[i16];
                    if (c20737p3 != null) {
                        c20737p3.d();
                    }
                    this.f29330a[i16] = null;
                } else {
                    C20737p c20737p4 = this.f29330a[i16];
                    if (c20737p4 == null) {
                        c20737p4 = new C20737p(t13, interfaceC22264l0, new a(LazyLayoutItemAnimator.this));
                        this.f29330a[i16] = c20737p4;
                    }
                    c20737p4.f29485d = c20723i.f29422p;
                    c20737p4.f29486e = c20723i.f29423q;
                    c20737p4.f29487f = c20723i.f29424r;
                }
            }
        }
    }

    public static void c(T t12, int i12, b bVar) {
        int i13 = 0;
        long jO2 = t12.o(0);
        long jB2 = t12.getF29648d() ? androidx.compose.ui.unit.q.b(0, i12, jO2, 1) : androidx.compose.ui.unit.q.b(i12, 0, jO2, 2);
        C20737p[] c20737pArr = bVar.f29330a;
        int length = c20737pArr.length;
        int i14 = 0;
        while (i13 < length) {
            C20737p c20737p = c20737pArr[i13];
            int i15 = i14 + 1;
            if (c20737p != null) {
                c20737p.f29493l = androidx.compose.ui.unit.q.e(jB2, androidx.compose.ui.unit.q.d(t12.o(i14), jO2));
            }
            i13++;
            i14 = i15;
        }
    }

    public static int h(int[] iArr, T t12) {
        int iB2 = t12.getF29649e();
        int iL2 = t12.getF29650f() + iB2;
        int iMax = 0;
        while (iB2 < iL2) {
            int iJ2 = t12.getF29658n() + iArr[iB2];
            iArr[iB2] = iJ2;
            iMax = Math.max(iMax, iJ2);
            iB2++;
        }
        return iMax;
    }

    @Y61.l
    public final C20737p a(int i12, @Y61.k Object obj) {
        C20737p[] c20737pArr;
        LazyLayoutItemAnimator<T>.b bVarE = this.f29317a.e(obj);
        if (bVarE == null || (c20737pArr = bVarE.f29330a) == null) {
            return null;
        }
        return c20737pArr[i12];
    }

    public final long b() {
        androidx.compose.ui.unit.u.f42871b.getClass();
        ArrayList arrayList = this.f29325i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C20737p c20737p = (C20737p) arrayList.get(i12);
            C22267c c22267c = c20737p.f29495n;
            if (c22267c != null) {
                long j12 = c20737p.f29493l;
                q.a aVar = androidx.compose.ui.unit.q.f42862b;
                jMax = (Math.max((int) (jMax & 4294967295L), ((int) (c20737p.f29493l & 4294967295L)) + ((int) (c22267c.f39596u & 4294967295L))) & 4294967295L) | (Math.max((int) (jMax >> 32), ((int) (j12 >> 32)) + ((int) (c22267c.f39596u >> 32))) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r48, int r49, int r50, @Y61.k java.util.ArrayList r51, @Y61.k androidx.compose.foundation.lazy.layout.I r52, @Y61.k androidx.compose.foundation.lazy.layout.V r53, boolean r54, boolean r55, int r56, boolean r57, int r58, int r59, @Y61.k kotlinx.coroutines.T r60, @Y61.k androidx.compose.ui.graphics.InterfaceC22264l0 r61) {
        /*
            Method dump skipped, instructions count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.d(int, int, int, java.util.ArrayList, androidx.compose.foundation.lazy.layout.I, androidx.compose.foundation.lazy.layout.V, boolean, boolean, int, boolean, int, int, kotlinx.coroutines.T, androidx.compose.ui.graphics.l0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r15 = this;
            androidx.collection.R0<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r0 = r15.f29317a
            int r1 = r0.f25725e
            if (r1 == 0) goto L5b
            java.lang.Object[] r1 = r0.f25723c
            long[] r2 = r0.f25721a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L58
            r4 = 0
            r5 = r4
        L11:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2b:
            if (r10 >= r8) goto L51
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4d
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r11 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r11
            androidx.compose.foundation.lazy.layout.p[] r11 = r11.f29330a
            int r12 = r11.length
            r13 = r4
        L41:
            if (r13 >= r12) goto L4d
            r14 = r11[r13]
            if (r14 == 0) goto L4a
            r14.d()
        L4a:
            int r13 = r13 + 1
            goto L41
        L4d:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2b
        L51:
            if (r8 != r9) goto L58
        L53:
            if (r5 == r3) goto L58
            int r5 = r5 + 1
            goto L11
        L58:
            r0.g()
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.e():void");
    }

    public final void f(Object obj) {
        C20737p[] c20737pArr;
        LazyLayoutItemAnimator<T>.b bVarK = this.f29317a.k(obj);
        if (bVarK == null || (c20737pArr = bVarK.f29330a) == null) {
            return;
        }
        for (C20737p c20737p : c20737pArr) {
            if (c20737p != null) {
                c20737p.d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(T r19, boolean r20) {
        /*
            r18 = this;
            java.lang.Object r0 = r19.getF29646b()
            r1 = r18
            androidx.collection.R0<java.lang.Object, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<T>$b> r2 = r1.f29317a
            java.lang.Object r0 = r2.e(r0)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r0
            androidx.compose.foundation.lazy.layout.p[] r0 = r0.f29330a
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L13:
            if (r3 >= r2) goto L81
            r11 = r0[r3]
            int r12 = r4 + 1
            r13 = r19
            if (r11 == 0) goto L77
            long r14 = r13.o(r4)
            long r4 = r11.f29493l
            androidx.compose.foundation.lazy.layout.p$b r6 = androidx.compose.foundation.lazy.layout.C20737p.f29480s
            r6.getClass()
            long r6 = androidx.compose.foundation.lazy.layout.C20737p.f29481t
            boolean r6 = androidx.compose.ui.unit.q.c(r4, r6)
            if (r6 != 0) goto L70
            boolean r6 = androidx.compose.ui.unit.q.c(r4, r14)
            if (r6 != 0) goto L70
            long r4 = androidx.compose.ui.unit.q.d(r14, r4)
            androidx.compose.animation.core.R0 r7 = r11.f29486e
            if (r7 != 0) goto L3f
            goto L70
        L3f:
            androidx.compose.runtime.y1 r6 = r11.f29498q
            androidx.compose.runtime.i3 r6 = (androidx.compose.runtime.C22082i3) r6
            java.lang.Object r6 = r6.getF42167b()
            androidx.compose.ui.unit.q r6 = (androidx.compose.ui.unit.q) r6
            long r8 = r6.f42864a
            long r8 = androidx.compose.ui.unit.q.d(r8, r4)
            r11.h(r8)
            r4 = 1
            r11.g(r4)
            r4 = r20
            r11.f29488g = r4
            androidx.compose.foundation.lazy.layout.r r10 = new androidx.compose.foundation.lazy.layout.r
            r16 = 0
            r5 = r10
            r6 = r11
            r17 = r0
            r0 = r10
            r10 = r16
            r5.<init>(r6, r7, r8, r10)
            kotlinx.coroutines.T r5 = r11.f29482a
            r6 = 3
            r7 = 0
            kotlinx.coroutines.C43259k.d(r5, r7, r7, r0, r6)
            goto L74
        L70:
            r4 = r20
            r17 = r0
        L74:
            r11.f29493l = r14
            goto L7b
        L77:
            r4 = r20
            r17 = r0
        L7b:
            int r3 = r3 + 1
            r4 = r12
            r0 = r17
            goto L13
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.g(androidx.compose.foundation.lazy.layout.T, boolean):void");
    }
}
