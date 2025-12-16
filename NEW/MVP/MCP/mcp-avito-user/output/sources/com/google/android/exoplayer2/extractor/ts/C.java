package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.AbstractC36511a;
import com.google.android.exoplayer2.extractor.ts.A;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.O;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: TsExtractor.java */
/* loaded from: classes6.dex */
public final class C implements com.google.android.exoplayer2.extractor.j {

    /* renamed from: a, reason: collision with root package name */
    public final int f345005a;

    /* renamed from: b, reason: collision with root package name */
    public final int f345006b;

    /* renamed from: c, reason: collision with root package name */
    public final List<O> f345007c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345008d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f345009e;

    /* renamed from: f, reason: collision with root package name */
    public final C36522g f345010f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray<D> f345011g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f345012h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f345013i;

    /* renamed from: j, reason: collision with root package name */
    public final B f345014j;

    /* renamed from: k, reason: collision with root package name */
    public A f345015k;

    /* renamed from: l, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.l f345016l;

    /* renamed from: m, reason: collision with root package name */
    public int f345017m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f345018n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f345019o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f345020p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public D f345021q;

    /* renamed from: r, reason: collision with root package name */
    public int f345022r;

    /* renamed from: s, reason: collision with root package name */
    public int f345023s;

    /* compiled from: TsExtractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public C() {
        this(0);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        A a12;
        long j14;
        C36585a.d(this.f345005a != 2);
        List<O> list = this.f345007c;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            O o12 = list.get(i12);
            synchronized (o12) {
                j14 = o12.f348100b;
            }
            boolean z12 = j14 == -9223372036854775807L;
            if (!z12) {
                long jC2 = o12.c();
                z12 = (jC2 == -9223372036854775807L || jC2 == 0 || jC2 == j13) ? false : true;
            }
            if (z12) {
                o12.d(j13);
            }
        }
        if (j13 != 0 && (a12 = this.f345015k) != null) {
            a12.c(j13);
        }
        this.f345008d.y(0);
        this.f345009e.clear();
        int i13 = 0;
        while (true) {
            SparseArray<D> sparseArray = this.f345011g;
            if (i13 >= sparseArray.size()) {
                this.f345022r = 0;
                return;
            } else {
                sparseArray.valueAt(i13).a();
                i13++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        this.f345016l = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(com.google.android.exoplayer2.extractor.k r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            com.google.android.exoplayer2.util.F r0 = r6.f345008d
            byte[] r0 = r0.f348070a
            com.google.android.exoplayer2.extractor.f r7 = (com.google.android.exoplayer2.extractor.f) r7
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.C.h(com.google.android.exoplayer2.extractor.k):boolean");
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
    @Override // com.google.android.exoplayer2.extractor.j
    public final int i(com.google.android.exoplayer2.extractor.k kVar, com.google.android.exoplayer2.extractor.w wVar) throws ParserException, EOFException, InterruptedIOException {
        ?? r32;
        int i12;
        ?? r22;
        long j12;
        int i13;
        boolean z12;
        long j13;
        long j14;
        long j15 = ((com.google.android.exoplayer2.extractor.f) kVar).f344494c;
        boolean z13 = this.f345018n;
        int i14 = this.f345005a;
        if (z13) {
            B b12 = this.f345014j;
            if (j15 != -1 && i14 != 2 && !b12.f344999c) {
                int i15 = this.f345023s;
                if (i15 <= 0) {
                    b12.a((com.google.android.exoplayer2.extractor.f) kVar);
                    return 0;
                }
                boolean z14 = b12.f345001e;
                com.google.android.exoplayer2.util.F f12 = b12.f344998b;
                if (!z14) {
                    com.google.android.exoplayer2.extractor.f fVar = (com.google.android.exoplayer2.extractor.f) kVar;
                    long j16 = fVar.f344494c;
                    int iMin = (int) Math.min(112800, j16);
                    long j17 = j16 - iMin;
                    if (fVar.f344495d == j17) {
                        f12.y(iMin);
                        fVar.f344497f = 0;
                        fVar.a(f12.f348070a, 0, iMin, false);
                        int i16 = f12.f348071b;
                        int i17 = f12.f348072c;
                        int i18 = i17 - 188;
                        while (true) {
                            if (i18 < i16) {
                                j14 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = f12.f348070a;
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
                                        long jA2 = E.a(f12, i18, i15);
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
                        b12.f345003g = j14;
                        b12.f345001e = true;
                        return 0;
                    }
                    wVar.f345347a = j17;
                } else {
                    if (b12.f345003g == -9223372036854775807L) {
                        b12.a((com.google.android.exoplayer2.extractor.f) kVar);
                        return 0;
                    }
                    if (b12.f345000d) {
                        long j18 = b12.f345002f;
                        if (j18 == -9223372036854775807L) {
                            b12.a((com.google.android.exoplayer2.extractor.f) kVar);
                            return 0;
                        }
                        O o12 = b12.f344997a;
                        long jB2 = o12.b(b12.f345003g) - o12.b(j18);
                        b12.f345004h = jB2;
                        if (jB2 < 0) {
                            b12.f345004h = -9223372036854775807L;
                        }
                        b12.a((com.google.android.exoplayer2.extractor.f) kVar);
                        return 0;
                    }
                    com.google.android.exoplayer2.extractor.f fVar2 = (com.google.android.exoplayer2.extractor.f) kVar;
                    int iMin2 = (int) Math.min(112800, fVar2.f344494c);
                    long j19 = 0;
                    if (fVar2.f344495d == j19) {
                        f12.y(iMin2);
                        fVar2.f344497f = 0;
                        fVar2.a(f12.f348070a, 0, iMin2, false);
                        int i24 = f12.f348071b;
                        int i25 = f12.f348072c;
                        while (true) {
                            if (i24 >= i25) {
                                j13 = -9223372036854775807L;
                                break;
                            }
                            if (f12.f348070a[i24] == 71) {
                                long jA3 = E.a(f12, i24, i15);
                                if (jA3 != -9223372036854775807L) {
                                    j13 = jA3;
                                    break;
                                }
                            }
                            i24++;
                        }
                        b12.f345002f = j13;
                        b12.f345000d = true;
                        return 0;
                    }
                    wVar.f345347a = j19;
                }
                return 1;
            }
            if (this.f345019o) {
                i12 = i14;
                j12 = j15;
            } else {
                this.f345019o = true;
                long j22 = b12.f345004h;
                if (j22 != -9223372036854775807L) {
                    i12 = i14;
                    j12 = j15;
                    A a12 = new A(new AbstractC36511a.b(), new A.a(this.f345023s, b12.f344997a, this.f345006b), j22, j22 + 1, 0L, j15, 188L, 940);
                    this.f345015k = a12;
                    this.f345016l.i(a12.f344396a);
                } else {
                    i12 = i14;
                    j12 = j15;
                    this.f345016l.i(new y.b(j22));
                }
            }
            if (this.f345020p) {
                z12 = false;
                this.f345020p = false;
                a(0L, 0L);
                if (((com.google.android.exoplayer2.extractor.f) kVar).f344495d != 0) {
                    wVar.f345347a = 0L;
                    return 1;
                }
            } else {
                z12 = false;
            }
            r32 = 1;
            r32 = 1;
            A a13 = this.f345015k;
            r22 = z12;
            if (a13 != null) {
                r22 = z12;
                if (a13.f344398c != null) {
                    return a13.a((com.google.android.exoplayer2.extractor.f) kVar, wVar);
                }
            }
        } else {
            r32 = 1;
            i12 = i14;
            r22 = 0;
            j12 = j15;
        }
        com.google.android.exoplayer2.util.F f13 = this.f345008d;
        byte[] bArr2 = f13.f348070a;
        if (9400 - f13.f348071b < 188) {
            int iA2 = f13.a();
            if (iA2 > 0) {
                System.arraycopy(bArr2, f13.f348071b, bArr2, r22, iA2);
            }
            f13.z(iA2, bArr2);
        }
        while (f13.a() < 188) {
            int i26 = f13.f348072c;
            int i27 = ((com.google.android.exoplayer2.extractor.f) kVar).read(bArr2, i26, 9400 - i26);
            if (i27 == -1) {
                return -1;
            }
            f13.A(i26 + i27);
        }
        int i28 = f13.f348071b;
        int i29 = f13.f348072c;
        byte[] bArr3 = f13.f348070a;
        int i32 = i28;
        while (i32 < i29 && bArr3[i32] != 71) {
            i32++;
        }
        f13.B(i32);
        int i33 = i32 + 188;
        if (i33 > i29) {
            int i34 = (i32 - i28) + this.f345022r;
            this.f345022r = i34;
            i13 = i12;
            if (i13 == 2 && i34 > 376) {
                throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i13 = i12;
            this.f345022r = r22;
        }
        int i35 = f13.f348072c;
        if (i33 > i35) {
            return r22;
        }
        int iD2 = f13.d();
        if ((8388608 & iD2) != 0) {
            f13.B(i33);
            return r22;
        }
        int i36 = (4194304 & iD2) != 0 ? r32 : r22;
        int i37 = (2096896 & iD2) >> 8;
        boolean z15 = (iD2 & 32) != 0 ? r32 : r22;
        D d12 = (iD2 & 16) != 0 ? this.f345011g.get(i37) : null;
        if (d12 == null) {
            f13.B(i33);
            return r22;
        }
        if (i13 != 2) {
            int i38 = iD2 & 15;
            SparseIntArray sparseIntArray = this.f345009e;
            int i39 = sparseIntArray.get(i37, i38 - 1);
            sparseIntArray.put(i37, i38);
            if (i39 == i38) {
                f13.B(i33);
                return r22;
            }
            if (i38 != ((i39 + r32) & 15)) {
                d12.a();
            }
        }
        if (z15) {
            int iR2 = f13.r();
            i36 |= (f13.r() & 64) != 0 ? 2 : r22;
            f13.C(iR2 - r32);
        }
        boolean z16 = this.f345018n;
        if (i13 == 2 || z16 || !this.f345013i.get(i37, r22)) {
            f13.A(i33);
            d12.c(i36, f13);
            f13.A(i35);
        }
        if (i13 != 2 && !z16 && this.f345018n && j12 != -1) {
            this.f345020p = r32;
        }
        f13.B(i33);
        return r22;
    }

    public C(int i12) {
        this(1, new O(0L), new C36522g(0));
    }

    public C(int i12, O o12, C36522g c36522g) {
        this.f345010f = c36522g;
        this.f345006b = 112800;
        this.f345005a = i12;
        if (i12 != 1 && i12 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f345007c = arrayList;
            arrayList.add(o12);
        } else {
            this.f345007c = Collections.singletonList(o12);
        }
        this.f345008d = new com.google.android.exoplayer2.util.F(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f345012h = sparseBooleanArray;
        this.f345013i = new SparseBooleanArray();
        SparseArray<D> sparseArray = new SparseArray<>();
        this.f345011g = sparseArray;
        this.f345009e = new SparseIntArray();
        this.f345014j = new B();
        this.f345016l = com.google.android.exoplayer2.extractor.l.f344575h2;
        this.f345023s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i13 = 0; i13 < size; i13++) {
            sparseArray.put(sparseArray2.keyAt(i13), (D) sparseArray2.valueAt(i13));
        }
        sparseArray.put(0, new y(new b()));
        this.f345021q = null;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }

    /* compiled from: TsExtractor.java */
    public class b implements x {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.E f345024a = new com.google.android.exoplayer2.util.E(new byte[4], 4);

        public b() {
        }

        @Override // com.google.android.exoplayer2.extractor.ts.x
        public final void c(com.google.android.exoplayer2.util.F f12) {
            C c12;
            if (f12.r() == 0 && (f12.r() & 128) != 0) {
                f12.C(6);
                int iA2 = f12.a() / 4;
                int i12 = 0;
                while (true) {
                    c12 = C.this;
                    if (i12 >= iA2) {
                        break;
                    }
                    com.google.android.exoplayer2.util.E e12 = this.f345024a;
                    f12.c(0, 4, e12.f348059a);
                    e12.k(0);
                    int iG2 = e12.g(16);
                    e12.m(3);
                    if (iG2 == 0) {
                        e12.m(13);
                    } else {
                        int iG3 = e12.g(13);
                        if (c12.f345011g.get(iG3) == null) {
                            c12.f345011g.put(iG3, new y(c12.new c(iG3)));
                            c12.f345017m++;
                        }
                    }
                    i12++;
                }
                if (c12.f345005a != 2) {
                    c12.f345011g.remove(0);
                }
            }
        }

        @Override // com.google.android.exoplayer2.extractor.ts.x
        public final void b(O o12, com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        }
    }

    /* compiled from: TsExtractor.java */
    public class c implements x {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.E f345026a = new com.google.android.exoplayer2.util.E(new byte[5], 5);

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<D> f345027b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        public final SparseIntArray f345028c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        public final int f345029d;

        public c(int i12) {
            this.f345029d = i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
        @Override // com.google.android.exoplayer2.extractor.ts.x
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c(com.google.android.exoplayer2.util.F r28) {
            /*
                Method dump skipped, instructions count: 687
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.C.c.c(com.google.android.exoplayer2.util.F):void");
        }

        @Override // com.google.android.exoplayer2.extractor.ts.x
        public final void b(O o12, com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        }
    }
}
