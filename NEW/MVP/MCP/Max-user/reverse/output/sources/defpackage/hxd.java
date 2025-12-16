package defpackage;

import android.util.SparseArray;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.EOFException;
import java.util.Objects;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public class hxd implements sfg {
    public hf6 A;
    public hf6 B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final axd a;
    public final k55 d;
    public final d55 e;
    public Object f;
    public hf6 g;
    public z45 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final c32 b = new c32(6);
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public qfg[] o = new qfg[1000];
    public final lk6 c = new lk6(new ycd(6), (byte) 0);
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public hxd(ri4 ri4Var, k55 k55Var, d55 d55Var) {
        this.d = k55Var;
        this.e = d55Var;
        this.a = new axd(ri4Var);
    }

    public final void A(boolean z) {
        axd axdVar = this.a;
        axdVar.b((dt0) axdVar.f);
        dt0 dt0Var = (dt0) axdVar.f;
        int i = axdVar.b;
        hsi.g(((zc) dt0Var.d) == null);
        dt0Var.b = 0L;
        dt0Var.c = i;
        dt0 dt0Var2 = (dt0) axdVar.f;
        axdVar.g = dt0Var2;
        axdVar.h = dt0Var2;
        axdVar.c = 0L;
        ((ri4) axdVar.d).d();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        lk6 lk6Var = this.c;
        SparseArray sparseArray = (SparseArray) lk6Var.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((ycd) lk6Var.d).accept(sparseArray.valueAt(i2));
        }
        lk6Var.b = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized boolean B(int i) {
        synchronized (this) {
            this.s = 0;
            axd axdVar = this.a;
            axdVar.g = (dt0) axdVar.f;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean C(long j, boolean z) {
        Throwable th;
        hxd hxdVar;
        long j2;
        int iL;
        try {
            synchronized (this) {
                try {
                    try {
                        this.s = 0;
                        axd axdVar = this.a;
                        axdVar.g = (dt0) axdVar.f;
                        int iR = r(0);
                        int i = this.s;
                        int i2 = this.p;
                        if (!(i != i2) || j < this.n[iR] || (j > this.v && !z)) {
                            return false;
                        }
                        if (this.D) {
                            iL = i2 - i;
                            int i3 = 0;
                            while (true) {
                                if (i3 < iL) {
                                    try {
                                        if (this.n[iR] >= j) {
                                            iL = i3;
                                            break;
                                        }
                                        iR++;
                                        if (iR == this.i) {
                                            iR = 0;
                                        }
                                        i3++;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } else if (!z) {
                                    iL = -1;
                                }
                            }
                            hxdVar = this;
                            j2 = j;
                        } else {
                            hxdVar = this;
                            j2 = j;
                            iL = hxdVar.l(j2, iR, i2 - i, true);
                        }
                        if (iL == -1) {
                            return false;
                        }
                        hxdVar.t = j2;
                        hxdVar.s += iL;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void D(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            defpackage.hsi.b(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxd.D(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x010c A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016d, B:98:0x0176, B:75:0x010c, B:77:0x0115, B:79:0x011e, B:81:0x0133, B:85:0x013c, B:86:0x0141, B:88:0x0147, B:92:0x0155, B:94:0x015a, B:95:0x016a, B:78:0x011c), top: B:104:0x008d }] */
    @Override // defpackage.sfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r10, int r12, int r13, int r14, defpackage.qfg r15) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxd.a(long, int, int, int, qfg):void");
    }

    @Override // defpackage.sfg
    public final void b(umb umbVar, int i, int i2) {
        while (true) {
            axd axdVar = this.a;
            if (i <= 0) {
                axdVar.getClass();
                return;
            }
            int iD = axdVar.d(i);
            dt0 dt0Var = (dt0) axdVar.h;
            zc zcVar = (zc) dt0Var.d;
            umbVar.h(((int) (axdVar.c - dt0Var.b)) + zcVar.b, zcVar.a, iD);
            i -= iD;
            long j = axdVar.c + iD;
            axdVar.c = j;
            dt0 dt0Var2 = (dt0) axdVar.h;
            if (j == dt0Var2.c) {
                axdVar.h = (dt0) dt0Var2.o;
            }
        }
    }

    @Override // defpackage.sfg
    public final int c(ke4 ke4Var, int i, boolean z) throws EOFException {
        axd axdVar = this.a;
        int iD = axdVar.d(i);
        dt0 dt0Var = (dt0) axdVar.h;
        zc zcVar = (zc) dt0Var.d;
        int i2 = ke4Var.read(zcVar.a, ((int) (axdVar.c - dt0Var.b)) + zcVar.b, iD);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = axdVar.c + i2;
        axdVar.c = j;
        dt0 dt0Var2 = (dt0) axdVar.h;
        if (j == dt0Var2.c) {
            axdVar.h = (dt0) dt0Var2.o;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:18:0x0059), top: B:29:0x000a }] */
    /* JADX WARN: Type inference failed for: r5v26, types: [fxd, java.lang.Object] */
    @Override // defpackage.sfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.hf6 r5) {
        /*
            r4 = this;
            hf6 r0 = r4.m(r5)
            r1 = 0
            r4.z = r1
            r4.A = r5
            monitor-enter(r4)
            r4.y = r1     // Catch: java.lang.Throwable -> L57
            hf6 r5 = r4.B     // Catch: java.lang.Throwable -> L57
            boolean r5 = java.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L16
            monitor-exit(r4)
            goto L6e
        L16:
            lk6 r5 = r4.c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.c     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L57
            r2 = 1
            if (r5 != 0) goto L25
            r5 = r2
            goto L26
        L25:
            r5 = r1
        L26:
            if (r5 != 0) goto L59
            lk6 r5 = r4.c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.c     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L57
            int r3 = r3 - r2
            java.lang.Object r5 = r5.valueAt(r3)     // Catch: java.lang.Throwable -> L57
            dxd r5 = (defpackage.dxd) r5     // Catch: java.lang.Throwable -> L57
            hf6 r5 = r5.a     // Catch: java.lang.Throwable -> L57
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L59
            lk6 r5 = r4.c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.c     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L57
            int r0 = r0 - r2
            java.lang.Object r5 = r5.valueAt(r0)     // Catch: java.lang.Throwable -> L57
            dxd r5 = (defpackage.dxd) r5     // Catch: java.lang.Throwable -> L57
            hf6 r5 = r5.a     // Catch: java.lang.Throwable -> L57
            r4.B = r5     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r5 = move-exception
            goto L78
        L59:
            r4.B = r0     // Catch: java.lang.Throwable -> L57
        L5b:
            boolean r5 = r4.D     // Catch: java.lang.Throwable -> L57
            hf6 r0 = r4.B     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r0.n     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.k     // Catch: java.lang.Throwable -> L57
            boolean r0 = defpackage.xz9.a(r3, r0)     // Catch: java.lang.Throwable -> L57
            r5 = r5 & r0
            r4.D = r5     // Catch: java.lang.Throwable -> L57
            r4.E = r1     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)
            r1 = r2
        L6e:
            java.lang.Object r5 = r4.f
            if (r5 == 0) goto L77
            if (r1 == 0) goto L77
            r5.b()
        L77:
            return
        L78:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxd.d(hf6):void");
    }

    public final int e(long j) {
        int i = this.p;
        int iR = r(i - 1);
        while (i > this.s && this.n[iR] >= j) {
            i--;
            iR--;
            if (iR == -1) {
                iR = this.i - 1;
            }
        }
        return i;
    }

    public final long f(int i) {
        this.u = Math.max(this.u, p(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        lk6 lk6Var = this.c;
        SparseArray sparseArray = (SparseArray) lk6Var.c;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((ycd) lk6Var.d).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = lk6Var.b;
            if (i8 > 0) {
                lk6Var.b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        return this.k[i9 - 1] + this.l[r7];
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r12, boolean r14, boolean r15) {
        /*
            r11 = this;
            axd r0 = r11.a
            monitor-enter(r11)
            int r1 = r11.p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.n     // Catch: java.lang.Throwable -> L38
            int r8 = r11.r     // Catch: java.lang.Throwable -> L38
            r5 = r4[r8]     // Catch: java.lang.Throwable -> L38
            int r4 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r15 == 0) goto L1d
            int r15 = r11.s     // Catch: java.lang.Throwable -> L22
            if (r15 == r1) goto L1d
            int r1 = r15 + 1
        L1d:
            r5 = r11
            r6 = r12
            r10 = r14
            r9 = r1
            goto L26
        L22:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L26:
            int r12 = r5.l(r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.f(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.c(r2)
            return
        L40:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L35
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxd.g(long, boolean, boolean):void");
    }

    public final void h() {
        long jF;
        axd axdVar = this.a;
        synchronized (this) {
            int i = this.p;
            jF = i == 0 ? -1L : f(i);
        }
        axdVar.c(jF);
    }

    public final void i(long j) {
        if (this.p == 0) {
            return;
        }
        hsi.b(j > o());
        k(this.q + e(j));
    }

    public final long j(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        hsi.b(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, p(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        lk6 lk6Var = this.c;
        SparseArray sparseArray = (SparseArray) lk6Var.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((ycd) lk6Var.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        lk6Var.b = sparseArray.size() > 0 ? Math.min(lk6Var.b, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        return this.k[r(i6 - 1)] + this.l[r9];
    }

    public final void k(int i) {
        long j = j(i);
        axd axdVar = this.a;
        int i2 = axdVar.b;
        hsi.b(j <= axdVar.c);
        axdVar.c = j;
        if (j != 0) {
            dt0 dt0Var = (dt0) axdVar.f;
            if (j != dt0Var.b) {
                while (axdVar.c > dt0Var.c) {
                    dt0Var = (dt0) dt0Var.o;
                }
                dt0 dt0Var2 = (dt0) dt0Var.o;
                dt0Var2.getClass();
                axdVar.b(dt0Var2);
                dt0 dt0Var3 = new dt0(i2, 5, dt0Var.c);
                dt0Var.o = dt0Var3;
                if (axdVar.c == dt0Var.c) {
                    dt0Var = dt0Var3;
                }
                axdVar.h = dt0Var;
                if (((dt0) axdVar.g) == dt0Var2) {
                    axdVar.g = dt0Var3;
                    return;
                }
                return;
            }
        }
        axdVar.b((dt0) axdVar.f);
        dt0 dt0Var4 = new dt0(i2, 5, axdVar.c);
        axdVar.f = dt0Var4;
        axdVar.g = dt0Var4;
        axdVar.h = dt0Var4;
    }

    public final int l(long j, int i, int i2, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public hf6 m(hf6 hf6Var) {
        if (this.F == 0 || hf6Var.s == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return hf6Var;
        }
        ff6 ff6VarA = hf6Var.a();
        ff6VarA.r = hf6Var.s + this.F;
        return new hf6(ff6VarA);
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.u, p(this.s));
    }

    public final long p(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iR = r(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iR]);
            if ((this.m[iR] & 1) != 0) {
                return jMax;
            }
            iR--;
            if (iR == -1) {
                iR = this.i - 1;
            }
        }
        return jMax;
    }

    public final int q() {
        return this.q + this.s;
    }

    public final int r(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int s(long j, boolean z) {
        try {
            try {
                int iR = r(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iR]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int iL = l(j, iR, i2 - i, true);
                if (iL == -1) {
                    return 0;
                }
                return iL;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized hf6 t() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean u(boolean z) {
        hf6 hf6Var;
        boolean z2 = false;
        if (this.s != this.p) {
            if (((dxd) this.c.A(q())).a != this.g) {
                return true;
            }
            return v(r(this.s));
        }
        if (z || this.w || ((hf6Var = this.B) != null && hf6Var != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean v(int i) {
        z45 z45Var = this.h;
        if (z45Var == null || z45Var.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.b();
    }

    public final void w() {
        z45 z45Var = this.h;
        if (z45Var == null || z45Var.getState() != 1) {
            return;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionF = this.h.f();
        drmSession$DrmSessionExceptionF.getClass();
        throw drmSession$DrmSessionExceptionF;
    }

    public final void x(hf6 hf6Var, xt4 xt4Var) {
        hf6 hf6Var2;
        hf6 hf6Var3 = this.g;
        boolean z = hf6Var3 == null;
        y45 y45Var = hf6Var3 == null ? null : hf6Var3.r;
        this.g = hf6Var;
        y45 y45Var2 = hf6Var.r;
        k55 k55Var = this.d;
        if (k55Var != null) {
            int iD = k55Var.d(hf6Var);
            ff6 ff6VarA = hf6Var.a();
            ff6VarA.N = iD;
            hf6Var2 = new hf6(ff6VarA);
        } else {
            hf6Var2 = hf6Var;
        }
        xt4Var.c = hf6Var2;
        xt4Var.b = this.h;
        if (k55Var == null) {
            return;
        }
        if (z || !Objects.equals(y45Var, y45Var2)) {
            z45 z45Var = this.h;
            d55 d55Var = this.e;
            z45 z45VarA = k55Var.a(d55Var, hf6Var);
            this.h = z45VarA;
            xt4Var.b = z45VarA;
            if (z45Var != null) {
                z45Var.c(d55Var);
            }
        }
    }

    public final synchronized long y() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[r(this.s)] : this.C;
    }

    public final int z(xt4 xt4Var, ph4 ph4Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        c32 c32Var = this.b;
        synchronized (this) {
            try {
                ph4Var.X = false;
                i2 = -3;
                if (this.s != this.p) {
                    hf6 hf6Var = ((dxd) this.c.A(q())).a;
                    if (!z2 && hf6Var == this.g) {
                        int iR = r(this.s);
                        if (v(iR)) {
                            ph4Var.b = this.m[iR];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                ph4Var.a(536870912);
                            }
                            ph4Var.Y = this.n[iR];
                            c32Var.b = this.l[iR];
                            c32Var.c = this.k[iR];
                            c32Var.d = this.o[iR];
                            i2 = -4;
                        } else {
                            ph4Var.X = true;
                        }
                    }
                    x(hf6Var, xt4Var);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        hf6 hf6Var2 = this.B;
                        if (hf6Var2 == null || (!z2 && hf6Var2 == this.g)) {
                        }
                        x(hf6Var2, xt4Var);
                        i2 = -5;
                    }
                    ph4Var.b = 4;
                    ph4Var.Y = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !ph4Var.j(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    axd axdVar = this.a;
                    axd.j((dt0) axdVar.g, ph4Var, this.b, (umb) axdVar.e);
                } else {
                    axd axdVar2 = this.a;
                    axdVar2.g = axd.j((dt0) axdVar2.g, ph4Var, this.b, (umb) axdVar2.e);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }
}
