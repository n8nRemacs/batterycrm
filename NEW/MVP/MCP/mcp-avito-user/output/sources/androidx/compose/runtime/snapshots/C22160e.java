package androidx.compose.runtime.snapshots;

import androidx.collection.S0;
import androidx.collection.k1;
import androidx.compose.runtime.P1;
import androidx.compose.runtime.snapshots.AbstractC22168m;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/e;", "Landroidx/compose/runtime/snapshots/l;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22160e extends AbstractC22167l {

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final int[] f38701o;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Object, G0> f38702f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Object, G0> f38703g;

    /* renamed from: h, reason: collision with root package name */
    public int f38704h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public S0<V> f38705i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public ArrayList f38706j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public C22174t f38707k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public int[] f38708l;

    /* renamed from: m, reason: collision with root package name */
    public int f38709m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f38710n;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/e$a;", "", "<init>", "()V", "", "EmptyIntArray", "[I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f38701o = new int[0];
    }

    public C22160e(long j12, @Y61.k C22174t c22174t, @Y61.l Y41.l<Object, G0> lVar, @Y61.l Y41.l<Object, G0> lVar2) {
        super(j12, c22174t, (C42822w) null);
        this.f38702f = lVar;
        this.f38703g = lVar2;
        C22174t.f38734f.getClass();
        this.f38707k = C22174t.f38735g;
        this.f38708l = f38701o;
        this.f38709m = 1;
    }

    public final void A(long j12) {
        synchronized (C22176v.f38750c) {
            this.f38707k = this.f38707k.g(j12);
            G0 g02 = G0.f406611a;
        }
    }

    public void B(@Y61.l S0<V> s02) {
        this.f38705i = s02;
    }

    @Y61.k
    public C22160e C(@Y61.l Y41.l<Object, G0> lVar, @Y61.l Y41.l<Object, G0> lVar2) {
        C22161f c22161f;
        if (this.f38723c) {
            P1.a("Cannot use a disposed snapshot");
        }
        if (this.f38710n && this.f38724d < 0) {
            P1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(getF38722b());
        Object obj = C22176v.f38750c;
        synchronized (obj) {
            long j12 = C22176v.f38752e;
            C22176v.f38752e = j12 + 1;
            C22176v.f38751d = C22176v.f38751d.g(j12);
            C22174t f38721a = getF38721a();
            r(f38721a.g(j12));
            c22161f = new C22161f(j12, C22176v.d(f38721a, getF38722b() + 1, j12), C22176v.k(lVar, getF38696h(), true), C22176v.a(lVar2, i()), this);
        }
        if (!this.f38710n && !this.f38723c) {
            long f38722b = getF38722b();
            synchronized (obj) {
                long j13 = C22176v.f38752e;
                C22176v.f38752e = j13 + 1;
                s(j13);
                C22176v.f38751d = C22176v.f38751d.g(getF38722b());
                G0 g02 = G0.f406611a;
            }
            r(C22176v.d(getF38721a(), f38722b + 1, getF38722b()));
        }
        return c22161f;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void b() {
        C22176v.f38751d = C22176v.f38751d.b(getF38722b()).a(this.f38707k);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public void c() {
        if (this.f38723c) {
            return;
        }
        super.c();
        l();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public boolean f() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    /* renamed from: h, reason: from getter */
    public int getF38704h() {
        return this.f38704h;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    @Y61.l
    public Y41.l<Object, G0> i() {
        return this.f38703g;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public void k() {
        this.f38709m++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f38709m
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            androidx.compose.runtime.P1.a(r1)
        Lc:
            int r1 = r0.f38709m
            int r1 = r1 + (-1)
            r0.f38709m = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f38710n
            if (r1 != 0) goto L94
            androidx.collection.S0 r1 = r17.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f38710n
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            androidx.compose.runtime.P1.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r17.getF38722b()
            java.lang.Object[] r4 = r1.f25730b
            long[] r1 = r1.f25729a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            androidx.compose.runtime.snapshots.V r13 = (androidx.compose.runtime.snapshots.V) r13
            androidx.compose.runtime.snapshots.X r13 = r13.d()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f38674a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            androidx.compose.runtime.snapshots.t r6 = r0.f38707k
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = kotlin.collections.C42745f0.r(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            Y41.l<androidx.compose.runtime.snapshots.t, kotlin.G0> r6 = androidx.compose.runtime.snapshots.C22176v.f38748a
            r14 = 0
            r13.f38674a = r14
        L83:
            androidx.compose.runtime.snapshots.X r13 = r13.f38675b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r17.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C22160e.l():void");
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public void m() {
        if (this.f38710n || this.f38723c) {
            return;
        }
        v();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public void n(@Y61.k V v12) {
        S0<V> s0X = x();
        if (s0X == null) {
            s0X = k1.a();
            B(s0X);
        }
        s0X.e(v12);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void p() {
        int length = this.f38708l.length;
        for (int i12 = 0; i12 < length; i12++) {
            C22176v.t(this.f38708l[i12]);
        }
        o();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public void t(int i12) {
        this.f38704h = i12;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    @Y61.k
    public AbstractC22167l u(@Y61.l Y41.l<Object, G0> lVar) {
        C22162g c22162g;
        if (this.f38723c) {
            P1.a("Cannot use a disposed snapshot");
        }
        if (this.f38710n && this.f38724d < 0) {
            P1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long f38722b = getF38722b();
        boolean z12 = this instanceof C22158c;
        A(getF38722b());
        Object obj = C22176v.f38750c;
        synchronized (obj) {
            long j12 = C22176v.f38752e;
            C22176v.f38752e = j12 + 1;
            C22176v.f38751d = C22176v.f38751d.g(j12);
            c22162g = new C22162g(j12, C22176v.d(getF38721a(), f38722b + 1, j12), C22176v.k(lVar, getF38696h(), true), this);
        }
        if (!this.f38710n && !this.f38723c) {
            long f38722b2 = getF38722b();
            synchronized (obj) {
                long j13 = C22176v.f38752e;
                C22176v.f38752e = j13 + 1;
                s(j13);
                C22176v.f38751d = C22176v.f38751d.g(getF38722b());
                G0 g02 = G0.f406611a;
            }
            r(C22176v.d(getF38721a(), f38722b2 + 1, getF38722b()));
        }
        return c22162g;
    }

    public final void v() {
        A(getF38722b());
        G0 g02 = G0.f406611a;
        if (this.f38710n || this.f38723c) {
            return;
        }
        long f38722b = getF38722b();
        synchronized (C22176v.f38750c) {
            long j12 = C22176v.f38752e;
            C22176v.f38752e = j12 + 1;
            s(j12);
            C22176v.f38751d = C22176v.f38751d.g(getF38722b());
        }
        r(C22176v.d(getF38721a(), f38722b + 1, getF38722b()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public AbstractC22168m w() {
        HashMap mapB;
        C42784z0 c42784z0;
        S0<V> s02;
        int i12;
        long j12;
        S0<V> s0X = x();
        if (s0X != null) {
            long j13 = C22176v.f38757j.f38722b;
            mapB = C22176v.b(j13, this, C22176v.f38751d.b(j13));
        } else {
            mapB = null;
        }
        C42784z0 c42784z02 = C42784z0.f406748b;
        synchronized (C22176v.f38750c) {
            try {
                C22176v.c(this);
                if (s0X == null || s0X.f25732d == 0) {
                    b();
                    C22158c c22158c = C22176v.f38757j;
                    S0<V> s03 = c22158c.f38705i;
                    C22176v.u(c22158c, C22176v.f38748a);
                    if (s03 == null || !s03.d()) {
                        c42784z0 = c42784z02;
                        s02 = null;
                    } else {
                        c42784z0 = C22176v.f38755h;
                        s02 = s03;
                    }
                } else {
                    C22158c c22158c2 = C22176v.f38757j;
                    AbstractC22168m abstractC22168mZ = z(C22176v.f38752e, s0X, mapB, C22176v.f38751d.b(c22158c2.f38722b));
                    if (!kotlin.jvm.internal.L.f(abstractC22168mZ, AbstractC22168m.b.f38725a)) {
                        return abstractC22168mZ;
                    }
                    b();
                    s02 = c22158c2.f38705i;
                    C22176v.u(c22158c2, C22176v.f38748a);
                    B(null);
                    c22158c2.f38705i = null;
                    c42784z0 = C22176v.f38755h;
                }
                G0 g02 = G0.f406611a;
                this.f38710n = true;
                if (s02 != null) {
                    androidx.compose.runtime.collection.g gVar = new androidx.compose.runtime.collection.g(s02);
                    if (!s02.c()) {
                        int size = c42784z0.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            ((Y41.p) c42784z0.get(i13)).invoke(gVar, this);
                        }
                    }
                }
                if (s0X != null && s0X.d()) {
                    androidx.compose.runtime.collection.g gVar2 = new androidx.compose.runtime.collection.g(s0X);
                    int size2 = c42784z0.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        ((Y41.p) c42784z0.get(i14)).invoke(gVar2, this);
                    }
                }
                synchronized (C22176v.f38750c) {
                    try {
                        p();
                        C22176v.f();
                        if (s02 != null) {
                            Object[] objArr = s02.f25730b;
                            long[] jArr = s02.f25729a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j14 = jArr[i15];
                                    long[] jArr2 = jArr;
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j14 & 255) < 128) {
                                                C22176v.p((V) objArr[(i15 << 3) + i17]);
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                    }
                                    if (i15 == length) {
                                        break;
                                    }
                                    i15++;
                                    jArr = jArr2;
                                }
                            }
                        }
                        if (s0X != null) {
                            Object[] objArr2 = s0X.f25730b;
                            long[] jArr3 = s0X.f25729a;
                            int length2 = jArr3.length - 2;
                            if (length2 >= 0) {
                                int i18 = 0;
                                while (true) {
                                    long j15 = jArr3[i18];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        for (int i22 = 0; i22 < i19; i22++) {
                                            if ((j15 & 255) < 128) {
                                                C22176v.p((V) objArr2[(i18 << 3) + i22]);
                                            }
                                            j15 >>= 8;
                                        }
                                        i12 = 1;
                                        j12 = 255;
                                        if (i19 != 8) {
                                            break;
                                        }
                                    } else {
                                        i12 = 1;
                                        j12 = 255;
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18 += i12;
                                }
                            }
                        }
                        ArrayList arrayList = this.f38706j;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i23 = 0; i23 < size3; i23++) {
                                C22176v.p((V) arrayList.get(i23));
                            }
                        }
                        this.f38706j = null;
                        G0 g03 = G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return AbstractC22168m.b.f38725a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Y61.l
    public S0<V> x() {
        return this.f38705i;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    @Y61.l
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Y41.l<Object, G0> getF38713f() {
        return this.f38702f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final AbstractC22168m z(long j12, @Y61.k S0 s02, @Y61.l HashMap map, @Y61.k C22174t c22174t) {
        ArrayList arrayList;
        ArrayList arrayListH0;
        ArrayList arrayList2;
        Object[] objArr;
        long[] jArr;
        int i12;
        int i13;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        long j13;
        int i15;
        X xA2;
        long j14 = j12;
        C22174t c22174tE = getF38721a().g(getF38722b()).e(this.f38707k);
        Object[] objArr3 = s02.f25730b;
        long[] jArr3 = s02.f25729a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i16 = 0;
            arrayList2 = null;
            arrayListH0 = null;
            while (true) {
                long j15 = jArr3[i16];
                C22174t c22174t2 = c22174tE;
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8;
                    int i18 = 8 - ((~(i16 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j15 & 255) < 128) {
                            V v12 = (V) objArr3[(i16 << 3) + i19];
                            objArr2 = objArr3;
                            X xD2 = v12.d();
                            jArr2 = jArr3;
                            X xR2 = C22176v.r(xD2, j14, c22174t);
                            if (xR2 != null) {
                                C22174t c22174t3 = c22174t2;
                                X xR3 = C22176v.r(xD2, getF38722b(), c22174t3);
                                if (xR3 == null) {
                                    c22174t2 = c22174t3;
                                    i14 = length;
                                    j13 = j15;
                                    i15 = 8;
                                } else {
                                    c22174t2 = c22174t3;
                                    i14 = length;
                                    j13 = j15;
                                    if (xR3.f38674a != 1 && !xR2.equals(xR3)) {
                                        X xR4 = C22176v.r(xD2, getF38722b(), getF38721a());
                                        if (xR4 == null) {
                                            C22176v.q();
                                            throw null;
                                        }
                                        if (map == null || (xA2 = (X) map.get(xR2)) == null) {
                                            xA2 = v12.a(xR3, xR2, xR4);
                                        }
                                        if (xA2 == null) {
                                            return new AbstractC22168m.a(null);
                                        }
                                        if (!xA2.equals(xR4)) {
                                            if (xA2.equals(xR2)) {
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList2.add(new kotlin.Q(v12, xR2.c(getF38722b())));
                                                if (arrayListH0 == null) {
                                                    arrayListH0 = new ArrayList();
                                                }
                                                arrayListH0.add(v12);
                                            } else {
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList2.add(!xA2.equals(xR3) ? new kotlin.Q(v12, xA2) : new kotlin.Q(v12, xR3.c(getF38722b())));
                                            }
                                        }
                                    }
                                    i15 = 8;
                                }
                            } else {
                                i14 = length;
                                j13 = j15;
                                i15 = 8;
                            }
                        } else {
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i14 = length;
                            j13 = j15;
                            i15 = i17;
                        }
                        j15 = j13 >> i15;
                        i19++;
                        i17 = i15;
                        length = i14;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        j14 = j12;
                    }
                    objArr = objArr3;
                    jArr = jArr3;
                    i12 = length;
                    i13 = 1;
                    if (i18 != i17) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                    jArr = jArr3;
                    i12 = length;
                    i13 = 1;
                }
                if (i16 == i12) {
                    arrayList = arrayList2;
                    break;
                }
                i16 += i13;
                length = i12;
                c22174tE = c22174t2;
                objArr3 = objArr;
                jArr3 = jArr;
                j14 = j12;
            }
        } else {
            arrayList = null;
            arrayListH0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i22 = 0; i22 < size; i22++) {
                kotlin.Q q12 = (kotlin.Q) arrayList2.get(i22);
                V v13 = (V) q12.f406619b;
                X x12 = (X) q12.f406620c;
                x12.f38674a = j12;
                synchronized (C22176v.f38750c) {
                    x12.f38675b = v13.d();
                    v13.j(x12);
                    G0 g02 = G0.f406611a;
                }
            }
        }
        if (arrayListH0 != null) {
            int size2 = arrayListH0.size();
            for (int i23 = 0; i23 < size2; i23++) {
                s02.n((V) arrayListH0.get(i23));
            }
            ArrayList arrayList3 = this.f38706j;
            if (arrayList3 != null) {
                arrayListH0 = C42745f0.h0(arrayListH0, arrayList3);
            }
            this.f38706j = arrayListH0;
        }
        return AbstractC22168m.b.f38725a;
    }
}
