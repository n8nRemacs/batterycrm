package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.source.J;
import com.google.android.exoplayer2.upstream.C36571a;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.upstream.InterfaceC36580j;
import com.google.android.exoplayer2.util.C36585a;
import j.InterfaceC42153i;
import java.io.EOFException;

/* compiled from: SampleQueue.java */
/* loaded from: classes6.dex */
public class L implements com.google.android.exoplayer2.extractor.A {

    /* renamed from: A, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.I f346036A;

    /* renamed from: B, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.I f346037B;

    /* renamed from: C, reason: collision with root package name */
    public int f346038C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f346039D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f346040E;

    /* renamed from: F, reason: collision with root package name */
    public long f346041F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f346042G;

    /* renamed from: a, reason: collision with root package name */
    public final J f346043a;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final com.google.android.exoplayer2.drm.f f346046d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final e.a f346047e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public Object f346048f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.I f346049g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public DrmSession f346050h;

    /* renamed from: p, reason: collision with root package name */
    public int f346058p;

    /* renamed from: q, reason: collision with root package name */
    public int f346059q;

    /* renamed from: r, reason: collision with root package name */
    public int f346060r;

    /* renamed from: s, reason: collision with root package name */
    public int f346061s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f346065w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f346068z;

    /* renamed from: b, reason: collision with root package name */
    public final b f346044b = new b();

    /* renamed from: i, reason: collision with root package name */
    public int f346051i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public int[] f346052j = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f346053k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f346056n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f346055m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f346054l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public A.a[] f346057o = new A.a[1000];

    /* renamed from: c, reason: collision with root package name */
    public final U<c> f346045c = new U<>(new K(0));

    /* renamed from: t, reason: collision with root package name */
    public long f346062t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f346063u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f346064v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f346067y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f346066x = true;

    /* compiled from: SampleQueue.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f346069a;

        /* renamed from: b, reason: collision with root package name */
        public long f346070b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public A.a f346071c;
    }

    /* compiled from: SampleQueue.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.I f346072a;

        /* renamed from: b, reason: collision with root package name */
        public final f.b f346073b;

        public c(com.google.android.exoplayer2.I i12, f.b bVar, a aVar) {
            this.f346072a = i12;
            this.f346073b = bVar;
        }
    }

    /* compiled from: SampleQueue.java */
    public interface d {
        void g();
    }

    public L(InterfaceC36572b interfaceC36572b, @j.P com.google.android.exoplayer2.drm.f fVar, @j.P e.a aVar) {
        this.f346046d = fVar;
        this.f346047e = aVar;
        this.f346043a = new J(interfaceC36572b);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f346061s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f346058p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            com.google.android.exoplayer2.util.C36585a.b(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f346061s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f346061s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.L.A(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0026, B:15:0x003d, B:19:0x0055, B:18:0x0053), top: B:29:0x000a }] */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.exoplayer2.source.L$d, java.lang.Object] */
    @Override // com.google.android.exoplayer2.extractor.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.exoplayer2.I r5) {
        /*
            r4 = this;
            com.google.android.exoplayer2.I r0 = r4.m(r5)
            r1 = 0
            r4.f346068z = r1
            r4.f346036A = r5
            monitor-enter(r4)
            r4.f346067y = r1     // Catch: java.lang.Throwable -> L51
            com.google.android.exoplayer2.I r5 = r4.f346037B     // Catch: java.lang.Throwable -> L51
            boolean r5 = com.google.android.exoplayer2.util.U.a(r0, r5)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L16
            monitor-exit(r4)
            goto L65
        L16:
            com.google.android.exoplayer2.source.U<com.google.android.exoplayer2.source.L$c> r5 = r4.f346045c     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray<V> r5 = r5.f346145b     // Catch: java.lang.Throwable -> L51
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L51
            r2 = 1
            if (r5 != 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            if (r5 != 0) goto L53
            com.google.android.exoplayer2.source.U<com.google.android.exoplayer2.source.L$c> r5 = r4.f346045c     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray<V> r5 = r5.f346145b     // Catch: java.lang.Throwable -> L51
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L51
            int r3 = r3 - r2
            java.lang.Object r5 = r5.valueAt(r3)     // Catch: java.lang.Throwable -> L51
            com.google.android.exoplayer2.source.L$c r5 = (com.google.android.exoplayer2.source.L.c) r5     // Catch: java.lang.Throwable -> L51
            com.google.android.exoplayer2.I r5 = r5.f346072a     // Catch: java.lang.Throwable -> L51
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L53
            com.google.android.exoplayer2.source.U<com.google.android.exoplayer2.source.L$c> r5 = r4.f346045c     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray<V> r5 = r5.f346145b     // Catch: java.lang.Throwable -> L51
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L51
            int r0 = r0 - r2
            java.lang.Object r5 = r5.valueAt(r0)     // Catch: java.lang.Throwable -> L51
            com.google.android.exoplayer2.source.L$c r5 = (com.google.android.exoplayer2.source.L.c) r5     // Catch: java.lang.Throwable -> L51
            com.google.android.exoplayer2.I r5 = r5.f346072a     // Catch: java.lang.Throwable -> L51
            r4.f346037B = r5     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r5 = move-exception
            goto L6f
        L53:
            r4.f346037B = r0     // Catch: java.lang.Throwable -> L51
        L55:
            com.google.android.exoplayer2.I r5 = r4.f346037B     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r5.f343476m     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r5.f343473j     // Catch: java.lang.Throwable -> L51
            boolean r5 = com.google.android.exoplayer2.util.z.a(r0, r5)     // Catch: java.lang.Throwable -> L51
            r4.f346039D = r5     // Catch: java.lang.Throwable -> L51
            r4.f346040E = r1     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)
            r1 = r2
        L65:
            java.lang.Object r5 = r4.f346048f
            if (r5 == 0) goto L6e
            if (r1 == 0) goto L6e
            r5.g()
        L6e:
            return
        L6f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.L.a(com.google.android.exoplayer2.I):void");
    }

    @Override // com.google.android.exoplayer2.extractor.A
    public final int d(InterfaceC36580j interfaceC36580j, int i12, boolean z12) throws EOFException {
        J j12 = this.f346043a;
        int iB2 = j12.b(i12);
        J.a aVar = j12.f346029f;
        C36571a c36571a = aVar.f346033c;
        int i13 = interfaceC36580j.read(c36571a.f347794a, ((int) (j12.f346030g - aVar.f346031a)) + c36571a.f347795b, iB2);
        if (i13 == -1) {
            if (z12) {
                return -1;
            }
            throw new EOFException();
        }
        long j13 = j12.f346030g + i13;
        j12.f346030g = j13;
        J.a aVar2 = j12.f346029f;
        if (j13 != aVar2.f346032b) {
            return i13;
        }
        j12.f346029f = aVar2.f346034d;
        return i13;
    }

    @Override // com.google.android.exoplayer2.extractor.A
    public final void e(int i12, com.google.android.exoplayer2.util.F f12) {
        while (true) {
            J j12 = this.f346043a;
            if (i12 <= 0) {
                j12.getClass();
                return;
            }
            int iB2 = j12.b(i12);
            J.a aVar = j12.f346029f;
            C36571a c36571a = aVar.f346033c;
            f12.c(((int) (j12.f346030g - aVar.f346031a)) + c36571a.f347795b, iB2, c36571a.f347794a);
            i12 -= iB2;
            long j13 = j12.f346030g + iB2;
            j12.f346030g = j13;
            J.a aVar2 = j12.f346029f;
            if (j13 == aVar2.f346032b) {
                j12.f346029f = aVar2.f346034d;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0129 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:69:0x00ae, B:71:0x00b2, B:75:0x00c8, B:78:0x00cf, B:82:0x00d7, B:87:0x0110, B:110:0x0188, B:112:0x0191, B:89:0x0129, B:91:0x012d, B:93:0x0138, B:95:0x0150, B:99:0x0159, B:100:0x015e, B:102:0x0164, B:106:0x0172, B:108:0x0177, B:109:0x0185, B:92:0x0136), top: B:118:0x00ae }] */
    @Override // com.google.android.exoplayer2.extractor.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(long r17, int r19, int r20, int r21, @j.P com.google.android.exoplayer2.extractor.A.a r22) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.L.f(long, int, int, int, com.google.android.exoplayer2.extractor.A$a):void");
    }

    @j.B
    public final long g(int i12) {
        this.f346063u = Math.max(this.f346063u, n(i12));
        this.f346058p -= i12;
        int i13 = this.f346059q + i12;
        this.f346059q = i13;
        int i14 = this.f346060r + i12;
        this.f346060r = i14;
        int i15 = this.f346051i;
        if (i14 >= i15) {
            this.f346060r = i14 - i15;
        }
        int i16 = this.f346061s - i12;
        this.f346061s = i16;
        int i17 = 0;
        if (i16 < 0) {
            this.f346061s = 0;
        }
        while (true) {
            U<c> u12 = this.f346045c;
            SparseArray<c> sparseArray = u12.f346145b;
            if (i17 >= sparseArray.size() - 1) {
                break;
            }
            int i18 = i17 + 1;
            if (i13 < sparseArray.keyAt(i18)) {
                break;
            }
            u12.f346146c.accept(sparseArray.valueAt(i17));
            sparseArray.removeAt(i17);
            int i19 = u12.f346144a;
            if (i19 > 0) {
                u12.f346144a = i19 - 1;
            }
            i17 = i18;
        }
        if (this.f346058p != 0) {
            return this.f346053k[this.f346060r];
        }
        int i22 = this.f346060r;
        if (i22 == 0) {
            i22 = this.f346051i;
        }
        return this.f346053k[i22 - 1] + this.f346054l[r7];
    }

    public final void h(long j12, boolean z12, boolean z13) {
        long jG2;
        int i12;
        J j13 = this.f346043a;
        synchronized (this) {
            try {
                int i13 = this.f346058p;
                jG2 = -1;
                if (i13 != 0) {
                    long[] jArr = this.f346056n;
                    int i14 = this.f346060r;
                    if (j12 >= jArr[i14]) {
                        if (z13 && (i12 = this.f346061s) != i13) {
                            i13 = i12 + 1;
                        }
                        int iL2 = l(i14, i13, j12, z12);
                        if (iL2 != -1) {
                            jG2 = g(iL2);
                        }
                    }
                }
            } finally {
            }
        }
        j13.a(jG2);
    }

    public final void i() {
        long jG2;
        J j12 = this.f346043a;
        synchronized (this) {
            int i12 = this.f346058p;
            jG2 = i12 == 0 ? -1L : g(i12);
        }
        j12.a(jG2);
    }

    public final long j(int i12) {
        int i13 = this.f346059q;
        int i14 = this.f346058p;
        int i15 = (i13 + i14) - i12;
        boolean z12 = false;
        C36585a.b(i15 >= 0 && i15 <= i14 - this.f346061s);
        int i16 = this.f346058p - i15;
        this.f346058p = i16;
        this.f346064v = Math.max(this.f346063u, n(i16));
        if (i15 == 0 && this.f346065w) {
            z12 = true;
        }
        this.f346065w = z12;
        U<c> u12 = this.f346045c;
        SparseArray<c> sparseArray = u12.f346145b;
        for (int size = sparseArray.size() - 1; size >= 0 && i12 < sparseArray.keyAt(size); size--) {
            u12.f346146c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        u12.f346144a = sparseArray.size() > 0 ? Math.min(u12.f346144a, sparseArray.size() - 1) : -1;
        int i17 = this.f346058p;
        if (i17 == 0) {
            return 0L;
        }
        return this.f346053k[p(i17 - 1)] + this.f346054l[r9];
    }

    public final void k(int i12) {
        long j12 = j(i12);
        J j13 = this.f346043a;
        C36585a.b(j12 <= j13.f346030g);
        j13.f346030g = j12;
        InterfaceC36572b interfaceC36572b = j13.f346024a;
        int i13 = j13.f346025b;
        if (j12 != 0) {
            J.a aVar = j13.f346027d;
            if (j12 != aVar.f346031a) {
                while (j13.f346030g > aVar.f346032b) {
                    aVar = aVar.f346034d;
                }
                J.a aVar2 = aVar.f346034d;
                aVar2.getClass();
                if (aVar2.f346033c != null) {
                    interfaceC36572b.e(aVar2);
                    aVar2.f346033c = null;
                    aVar2.f346034d = null;
                }
                J.a aVar3 = new J.a(aVar.f346032b, i13);
                aVar.f346034d = aVar3;
                if (j13.f346030g == aVar.f346032b) {
                    aVar = aVar3;
                }
                j13.f346029f = aVar;
                if (j13.f346028e == aVar2) {
                    j13.f346028e = aVar3;
                    return;
                }
                return;
            }
        }
        J.a aVar4 = j13.f346027d;
        if (aVar4.f346033c != null) {
            interfaceC36572b.e(aVar4);
            aVar4.f346033c = null;
            aVar4.f346034d = null;
        }
        J.a aVar5 = new J.a(j13.f346030g, i13);
        j13.f346027d = aVar5;
        j13.f346028e = aVar5;
        j13.f346029f = aVar5;
    }

    public final int l(int i12, int i13, long j12, boolean z12) {
        int i14 = -1;
        for (int i15 = 0; i15 < i13; i15++) {
            long j13 = this.f346056n[i12];
            if (j13 > j12) {
                return i14;
            }
            if (!z12 || (this.f346055m[i12] & 1) != 0) {
                if (j13 == j12) {
                    return i15;
                }
                i14 = i15;
            }
            i12++;
            if (i12 == this.f346051i) {
                i12 = 0;
            }
        }
        return i14;
    }

    @InterfaceC42153i
    public com.google.android.exoplayer2.I m(com.google.android.exoplayer2.I i12) {
        if (this.f346041F == 0 || i12.f343480q == Long.MAX_VALUE) {
            return i12;
        }
        I.b bVarA = i12.a();
        bVarA.f343508o = i12.f343480q + this.f346041F;
        return bVarA.a();
    }

    public final long n(int i12) {
        long jMax = Long.MIN_VALUE;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int iP2 = p(i12 - 1);
        for (int i13 = 0; i13 < i12; i13++) {
            jMax = Math.max(jMax, this.f346056n[iP2]);
            if ((this.f346055m[iP2] & 1) != 0) {
                break;
            }
            iP2--;
            if (iP2 == -1) {
                iP2 = this.f346051i - 1;
            }
        }
        return jMax;
    }

    public final int o() {
        return this.f346059q + this.f346061s;
    }

    public final int p(int i12) {
        int i13 = this.f346060r + i12;
        int i14 = this.f346051i;
        return i13 < i14 ? i13 : i13 - i14;
    }

    public final synchronized int q(long j12, boolean z12) {
        int iP2 = p(this.f346061s);
        if (s() && j12 >= this.f346056n[iP2]) {
            if (j12 > this.f346064v && z12) {
                return this.f346058p - this.f346061s;
            }
            int iL2 = l(iP2, this.f346058p - this.f346061s, j12, true);
            if (iL2 == -1) {
                return 0;
            }
            return iL2;
        }
        return 0;
    }

    @j.P
    public final synchronized com.google.android.exoplayer2.I r() {
        return this.f346067y ? null : this.f346037B;
    }

    public final boolean s() {
        return this.f346061s != this.f346058p;
    }

    @InterfaceC42153i
    public final synchronized boolean t(boolean z12) {
        com.google.android.exoplayer2.I i12;
        boolean z13 = true;
        if (s()) {
            if (this.f346045c.a(o()).f346072a != this.f346049g) {
                return true;
            }
            return u(p(this.f346061s));
        }
        if (!z12 && !this.f346065w && ((i12 = this.f346037B) == null || i12 == this.f346049g)) {
            z13 = false;
        }
        return z13;
    }

    public final boolean u(int i12) {
        DrmSession drmSession = this.f346050h;
        return drmSession == null || drmSession.getState() == 4 || ((this.f346055m[i12] & 1073741824) == 0 && this.f346050h.a());
    }

    public final void v(com.google.android.exoplayer2.I i12, com.google.android.exoplayer2.J j12) {
        com.google.android.exoplayer2.I iA2;
        com.google.android.exoplayer2.I i13 = this.f346049g;
        boolean z12 = i13 == null;
        DrmInitData drmInitData = z12 ? null : i13.f343479p;
        this.f346049g = i12;
        DrmInitData drmInitData2 = i12.f343479p;
        com.google.android.exoplayer2.drm.f fVar = this.f346046d;
        if (fVar != null) {
            int iC2 = fVar.c(i12);
            I.b bVarA = i12.a();
            bVarA.f343493D = iC2;
            iA2 = bVarA.a();
        } else {
            iA2 = i12;
        }
        j12.f343521b = iA2;
        j12.f343520a = this.f346050h;
        if (fVar == null) {
            return;
        }
        if (z12 || !com.google.android.exoplayer2.util.U.a(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f346050h;
            e.a aVar = this.f346047e;
            DrmSession drmSessionB = fVar.b(aVar, i12);
            this.f346050h = drmSessionB;
            j12.f343520a = drmSessionB;
            if (drmSession != null) {
                drmSession.e(aVar);
            }
        }
    }

    public final synchronized int w() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return s() ? this.f346052j[p(this.f346061s)] : this.f346038C;
    }

    @InterfaceC42153i
    public final int x(com.google.android.exoplayer2.J j12, DecoderInputBuffer decoderInputBuffer, int i12, boolean z12) {
        int i13;
        boolean z13 = (i12 & 2) != 0;
        b bVar = this.f346044b;
        synchronized (this) {
            try {
                decoderInputBuffer.f344206e = false;
                i13 = -3;
                if (s()) {
                    com.google.android.exoplayer2.I i14 = this.f346045c.a(o()).f346072a;
                    if (!z13 && i14 == this.f346049g) {
                        int iP2 = p(this.f346061s);
                        if (u(iP2)) {
                            decoderInputBuffer.f344210b = this.f346055m[iP2];
                            long j13 = this.f346056n[iP2];
                            decoderInputBuffer.f344207f = j13;
                            if (j13 < this.f346062t) {
                                decoderInputBuffer.e(BeduinInputModel.MIN_TEXT_VERSION);
                            }
                            bVar.f346069a = this.f346054l[iP2];
                            bVar.f346070b = this.f346053k[iP2];
                            bVar.f346071c = this.f346057o[iP2];
                            i13 = -4;
                        } else {
                            decoderInputBuffer.f344206e = true;
                        }
                    }
                    v(i14, j12);
                    i13 = -5;
                } else {
                    if (!z12 && !this.f346065w) {
                        com.google.android.exoplayer2.I i15 = this.f346037B;
                        if (i15 == null || (!z13 && i15 == this.f346049g)) {
                        }
                        v(i15, j12);
                        i13 = -5;
                    }
                    decoderInputBuffer.f344210b = 4;
                    i13 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i13 == -4 && !decoderInputBuffer.f(4)) {
            boolean z14 = (i12 & 1) != 0;
            if ((i12 & 4) == 0) {
                if (z14) {
                    J j14 = this.f346043a;
                    J.e(j14.f346028e, decoderInputBuffer, this.f346044b, j14.f346026c);
                } else {
                    J j15 = this.f346043a;
                    j15.f346028e = J.e(j15.f346028e, decoderInputBuffer, this.f346044b, j15.f346026c);
                }
            }
            if (!z14) {
                this.f346061s++;
            }
        }
        return i13;
    }

    @InterfaceC42153i
    public final void y(boolean z12) {
        U<c> u12;
        SparseArray<c> sparseArray;
        J j12 = this.f346043a;
        J.a aVar = j12.f346027d;
        C36571a c36571a = aVar.f346033c;
        InterfaceC36572b interfaceC36572b = j12.f346024a;
        if (c36571a != null) {
            interfaceC36572b.e(aVar);
            aVar.f346033c = null;
            aVar.f346034d = null;
        }
        J.a aVar2 = j12.f346027d;
        int i12 = 0;
        C36585a.d(aVar2.f346033c == null);
        aVar2.f346031a = 0L;
        aVar2.f346032b = j12.f346025b;
        J.a aVar3 = j12.f346027d;
        j12.f346028e = aVar3;
        j12.f346029f = aVar3;
        j12.f346030g = 0L;
        interfaceC36572b.a();
        this.f346058p = 0;
        this.f346059q = 0;
        this.f346060r = 0;
        this.f346061s = 0;
        this.f346066x = true;
        this.f346062t = Long.MIN_VALUE;
        this.f346063u = Long.MIN_VALUE;
        this.f346064v = Long.MIN_VALUE;
        this.f346065w = false;
        while (true) {
            u12 = this.f346045c;
            sparseArray = u12.f346145b;
            if (i12 >= sparseArray.size()) {
                break;
            }
            u12.f346146c.accept(sparseArray.valueAt(i12));
            i12++;
        }
        u12.f346144a = -1;
        sparseArray.clear();
        if (z12) {
            this.f346036A = null;
            this.f346037B = null;
            this.f346067y = true;
        }
    }

    public final synchronized boolean z(long j12, boolean z12) {
        synchronized (this) {
            this.f346061s = 0;
            J j13 = this.f346043a;
            j13.f346028e = j13.f346027d;
        }
        int iP2 = p(0);
        if (s() && j12 >= this.f346056n[iP2] && (j12 <= this.f346064v || z12)) {
            int iL2 = l(iP2, this.f346058p - this.f346061s, j12, true);
            if (iL2 == -1) {
                return false;
            }
            this.f346062t = j12;
            this.f346061s += iL2;
            return true;
        }
        return false;
    }
}
