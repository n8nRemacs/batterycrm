package androidx.media3.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.extractor.AbstractC23186e;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.H;
import androidx.media3.extractor.ts.A;
import androidx.media3.extractor.ts.D;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

/* compiled from: TsExtractor.java */
@J
/* loaded from: classes.dex */
public final class C implements androidx.media3.extractor.p {

    /* renamed from: a, reason: collision with root package name */
    public final int f51507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51508b;

    /* renamed from: c, reason: collision with root package name */
    public final List<androidx.media3.common.util.G> f51509c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.common.util.z f51510d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f51511e;

    /* renamed from: f, reason: collision with root package name */
    public final C23203g f51512f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray<D> f51513g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f51514h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f51515i;

    /* renamed from: j, reason: collision with root package name */
    public final B f51516j;

    /* renamed from: k, reason: collision with root package name */
    public A f51517k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.media3.extractor.r f51518l;

    /* renamed from: m, reason: collision with root package name */
    public int f51519m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f51520n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f51521o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f51522p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public D f51523q;

    /* renamed from: r, reason: collision with root package name */
    public int f51524r;

    /* renamed from: s, reason: collision with root package name */
    public int f51525s;

    /* compiled from: TsExtractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C() {
        this(new androidx.media3.common.util.G(0L), new C23203g(0));
    }

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        A a12;
        long j14;
        C23110a.g(this.f51507a != 2);
        List<androidx.media3.common.util.G> list = this.f51509c;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            androidx.media3.common.util.G g12 = list.get(i12);
            synchronized (g12) {
                j14 = g12.f47883b;
            }
            boolean z12 = j14 == -9223372036854775807L;
            if (!z12) {
                long jC2 = g12.c();
                z12 = (jC2 == -9223372036854775807L || jC2 == 0 || jC2 == j13) ? false : true;
            }
            if (z12) {
                g12.d(j13);
            }
        }
        if (j13 != 0 && (a12 = this.f51517k) != null) {
            a12.c(j13);
        }
        this.f51510d.C(0);
        this.f51511e.clear();
        int i13 = 0;
        while (true) {
            SparseArray<D> sparseArray = this.f51513g;
            if (i13 >= sparseArray.size()) {
                this.f51524r = 0;
                return;
            } else {
                sparseArray.valueAt(i13).a();
                i13++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(androidx.media3.extractor.q r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            androidx.media3.common.util.z r0 = r6.f51510d
            byte[] r0 = r0.f47962a
            androidx.media3.extractor.j r7 = (androidx.media3.extractor.C23191j) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.a(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.i(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.C.b(androidx.media3.extractor.q):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    @Override // androidx.media3.extractor.p
    public final int h(androidx.media3.extractor.q qVar, androidx.media3.extractor.F f12) throws ParserException, EOFException, InterruptedIOException {
        ?? r32;
        int i12;
        ?? r22;
        long j12;
        int i13;
        boolean z12;
        long j13;
        long j14;
        long j15 = ((C23191j) qVar).f50582c;
        boolean z13 = this.f51520n;
        int i14 = this.f51507a;
        if (z13) {
            B b12 = this.f51516j;
            if (j15 != -1 && i14 != 2 && !b12.f51501c) {
                int i15 = this.f51525s;
                if (i15 <= 0) {
                    b12.a((C23191j) qVar);
                    return 0;
                }
                boolean z14 = b12.f51503e;
                androidx.media3.common.util.z zVar = b12.f51500b;
                if (!z14) {
                    C23191j c23191j = (C23191j) qVar;
                    long j16 = c23191j.f50582c;
                    int iMin = (int) Math.min(112800, j16);
                    long j17 = j16 - iMin;
                    if (c23191j.f50583d == j17) {
                        zVar.C(iMin);
                        c23191j.f50585f = 0;
                        c23191j.a(zVar.f47962a, 0, iMin, false);
                        int i16 = zVar.f47963b;
                        int i17 = zVar.f47964c;
                        int i18 = i17 - 188;
                        while (true) {
                            if (i18 < i16) {
                                j14 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = zVar.f47962a;
                            int i19 = -4;
                            int i22 = 0;
                            while (true) {
                                if (i19 > 4) {
                                    break;
                                }
                                int i23 = (i19 * 188) + i18;
                                if (i23 < i16 || i23 >= i17 || bArr[i23] != 71) {
                                    i22 = 0;
                                } else {
                                    i22++;
                                    if (i22 == 5) {
                                        long jA2 = E.a(zVar, i18, i15);
                                        if (jA2 != -9223372036854775807L) {
                                            j14 = jA2;
                                            break;
                                        }
                                    }
                                }
                                i19++;
                            }
                            i18--;
                        }
                        b12.f51505g = j14;
                        b12.f51503e = true;
                        return 0;
                    }
                    f12.f50372a = j17;
                } else {
                    if (b12.f51505g == -9223372036854775807L) {
                        b12.a((C23191j) qVar);
                        return 0;
                    }
                    if (b12.f51502d) {
                        long j18 = b12.f51504f;
                        if (j18 == -9223372036854775807L) {
                            b12.a((C23191j) qVar);
                            return 0;
                        }
                        androidx.media3.common.util.G g12 = b12.f51499a;
                        long jB2 = g12.b(b12.f51505g) - g12.b(j18);
                        b12.f51506h = jB2;
                        if (jB2 < 0) {
                            androidx.media3.common.util.s.g();
                            b12.f51506h = -9223372036854775807L;
                        }
                        b12.a((C23191j) qVar);
                        return 0;
                    }
                    C23191j c23191j2 = (C23191j) qVar;
                    int iMin2 = (int) Math.min(112800, c23191j2.f50582c);
                    long j19 = 0;
                    if (c23191j2.f50583d == j19) {
                        zVar.C(iMin2);
                        c23191j2.f50585f = 0;
                        c23191j2.a(zVar.f47962a, 0, iMin2, false);
                        int i24 = zVar.f47963b;
                        int i25 = zVar.f47964c;
                        while (true) {
                            if (i24 >= i25) {
                                j13 = -9223372036854775807L;
                                break;
                            }
                            if (zVar.f47962a[i24] == 71) {
                                long jA3 = E.a(zVar, i24, i15);
                                if (jA3 != -9223372036854775807L) {
                                    j13 = jA3;
                                    break;
                                }
                            }
                            i24++;
                        }
                        b12.f51504f = j13;
                        b12.f51502d = true;
                        return 0;
                    }
                    f12.f50372a = j19;
                }
                return 1;
            }
            if (this.f51521o) {
                i12 = i14;
                j12 = j15;
            } else {
                this.f51521o = true;
                long j22 = b12.f51506h;
                if (j22 != -9223372036854775807L) {
                    i12 = i14;
                    j12 = j15;
                    A a12 = new A(new AbstractC23186e.b(), new A.a(this.f51525s, b12.f51499a, this.f51508b), j22, j22 + 1, 0L, j15, 188L, 940);
                    this.f51517k = a12;
                    this.f51518l.e(a12.f50498a);
                } else {
                    i12 = i14;
                    j12 = j15;
                    this.f51518l.e(new H.b(j22));
                }
            }
            if (this.f51522p) {
                z12 = false;
                this.f51522p = false;
                a(0L, 0L);
                if (((C23191j) qVar).f50583d != 0) {
                    f12.f50372a = 0L;
                    return 1;
                }
            } else {
                z12 = false;
            }
            r32 = 1;
            r32 = 1;
            A a13 = this.f51517k;
            r22 = z12;
            if (a13 != null) {
                r22 = z12;
                if (a13.f50500c != null) {
                    return a13.a((C23191j) qVar, f12);
                }
            }
        } else {
            r32 = 1;
            i12 = i14;
            r22 = 0;
            j12 = j15;
        }
        androidx.media3.common.util.z zVar2 = this.f51510d;
        byte[] bArr2 = zVar2.f47962a;
        if (9400 - zVar2.f47963b < 188) {
            int iA2 = zVar2.a();
            if (iA2 > 0) {
                System.arraycopy(bArr2, zVar2.f47963b, bArr2, r22, iA2);
            }
            zVar2.D(iA2, bArr2);
        }
        while (zVar2.a() < 188) {
            int i26 = zVar2.f47964c;
            int i27 = ((C23191j) qVar).read(bArr2, i26, 9400 - i26);
            if (i27 == -1) {
                return -1;
            }
            zVar2.E(i26 + i27);
        }
        int i28 = zVar2.f47963b;
        int i29 = zVar2.f47964c;
        byte[] bArr3 = zVar2.f47962a;
        int i32 = i28;
        while (i32 < i29 && bArr3[i32] != 71) {
            i32++;
        }
        zVar2.F(i32);
        int i33 = i32 + 188;
        if (i33 > i29) {
            int i34 = (i32 - i28) + this.f51524r;
            this.f51524r = i34;
            i13 = i12;
            if (i13 == 2 && i34 > 376) {
                throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i13 = i12;
            this.f51524r = r22;
        }
        int i35 = zVar2.f47964c;
        if (i33 > i35) {
            return r22;
        }
        int iG2 = zVar2.g();
        if ((8388608 & iG2) != 0) {
            zVar2.F(i33);
            return r22;
        }
        int i36 = (4194304 & iG2) != 0 ? r32 : r22;
        int i37 = (2096896 & iG2) >> 8;
        boolean z15 = (iG2 & 32) != 0 ? r32 : r22;
        D d12 = (iG2 & 16) != 0 ? this.f51513g.get(i37) : null;
        if (d12 == null) {
            zVar2.F(i33);
            return r22;
        }
        if (i13 != 2) {
            int i38 = iG2 & 15;
            SparseIntArray sparseIntArray = this.f51511e;
            int i39 = sparseIntArray.get(i37, i38 - 1);
            sparseIntArray.put(i37, i38);
            if (i39 == i38) {
                zVar2.F(i33);
                return r22;
            }
            if (i38 != ((i39 + r32) & 15)) {
                d12.a();
            }
        }
        if (z15) {
            int iU2 = zVar2.u();
            i36 |= (zVar2.u() & 64) != 0 ? 2 : r22;
            zVar2.G(iU2 - r32);
        }
        boolean z16 = this.f51520n;
        if (i13 == 2 || z16 || !this.f51515i.get(i37, r22)) {
            zVar2.E(i33);
            d12.c(i36, zVar2);
            zVar2.E(i35);
        }
        if (i13 != 2 && !z16 && this.f51520n && j12 != -1) {
            this.f51522p = r32;
        }
        zVar2.F(i33);
        return r22;
    }

    @Override // androidx.media3.extractor.p
    public final void i(androidx.media3.extractor.r rVar) {
        this.f51518l = rVar;
    }

    public C(androidx.media3.common.util.G g12, C23203g c23203g) {
        this.f51512f = c23203g;
        this.f51508b = 112800;
        this.f51507a = 1;
        this.f51509c = Collections.singletonList(g12);
        this.f51510d = new androidx.media3.common.util.z(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f51514h = sparseBooleanArray;
        this.f51515i = new SparseBooleanArray();
        SparseArray<D> sparseArray = new SparseArray<>();
        this.f51513g = sparseArray;
        this.f51511e = new SparseIntArray();
        this.f51516j = new B();
        this.f51518l = androidx.media3.extractor.r.f51145J1;
        this.f51525s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (D) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new y(new b()));
        this.f51523q = null;
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }

    /* compiled from: TsExtractor.java */
    public class b implements x {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.util.y f51526a = new androidx.media3.common.util.y(new byte[4], 4);

        public b() {
        }

        @Override // androidx.media3.extractor.ts.x
        public final void c(androidx.media3.common.util.z zVar) {
            C c12;
            if (zVar.u() == 0 && (zVar.u() & 128) != 0) {
                zVar.G(6);
                int iA2 = zVar.a() / 4;
                int i12 = 0;
                while (true) {
                    c12 = C.this;
                    if (i12 >= iA2) {
                        break;
                    }
                    androidx.media3.common.util.y yVar = this.f51526a;
                    zVar.e(0, 4, yVar.f47955a);
                    yVar.l(0);
                    int iG2 = yVar.g(16);
                    yVar.n(3);
                    if (iG2 == 0) {
                        yVar.n(13);
                    } else {
                        int iG3 = yVar.g(13);
                        if (c12.f51513g.get(iG3) == null) {
                            c12.f51513g.put(iG3, new y(c12.new c(iG3)));
                            c12.f51519m++;
                        }
                    }
                    i12++;
                }
                if (c12.f51507a != 2) {
                    c12.f51513g.remove(0);
                }
            }
        }

        @Override // androidx.media3.extractor.ts.x
        public final void b(androidx.media3.common.util.G g12, androidx.media3.extractor.r rVar, D.e eVar) {
        }
    }

    /* compiled from: TsExtractor.java */
    public class c implements x {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.util.y f51528a = new androidx.media3.common.util.y(new byte[5], 5);

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<D> f51529b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        public final SparseIntArray f51530c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        public final int f51531d;

        public c(int i12) {
            this.f51531d = i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
        @Override // androidx.media3.extractor.ts.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(androidx.media3.common.util.z r28) {
            /*
                Method dump skipped, instructions count: 687
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.C.c.c(androidx.media3.common.util.z):void");
        }

        @Override // androidx.media3.extractor.ts.x
        public final void b(androidx.media3.common.util.G g12, androidx.media3.extractor.r rVar, D.e eVar) {
        }
    }
}
