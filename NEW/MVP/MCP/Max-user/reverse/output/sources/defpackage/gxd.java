package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import java.io.EOFException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public class gxd implements rfg {
    public gf6 A;
    public gf6 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final axd a;
    public final j55 d;
    public final lk6 e;
    public Object f;
    public gf6 g;
    public mc5 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final c32 b = new c32(5);
    public int i = 1000;
    public int[] j = new int[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public pfg[] o = new pfg[1000];
    public final lk6 c = new lk6(new ycd(5));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public gxd(qi4 qi4Var, j55 j55Var, lk6 lk6Var) {
        this.d = j55Var;
        this.e = lk6Var;
        this.a = new axd(qi4Var);
    }

    @Override // defpackage.rfg
    public final int a(je4 je4Var, int i, boolean z) throws EOFException {
        axd axdVar = this.a;
        int iD = axdVar.d(i);
        dt0 dt0Var = (dt0) axdVar.h;
        yc ycVar = (yc) dt0Var.d;
        int i2 = je4Var.read(ycVar.a, ((int) (axdVar.c - dt0Var.b)) + ycVar.b, iD);
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014c A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:69:0x00cd, B:71:0x00d1, B:75:0x00e7, B:78:0x00ee, B:82:0x00f6, B:87:0x0131, B:110:0x01ab, B:112:0x01b4, B:89:0x014c, B:91:0x0150, B:93:0x0158, B:95:0x0171, B:99:0x017a, B:100:0x017f, B:102:0x0185, B:106:0x0193, B:108:0x0198, B:109:0x01a8, B:92:0x0156), top: B:118:0x00cd }] */
    @Override // defpackage.rfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r17, int r19, int r20, int r21, defpackage.pfg r22) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxd.b(long, int, int, int, pfg):void");
    }

    @Override // defpackage.rfg
    public final void c(int i, qyg qygVar) {
        while (true) {
            axd axdVar = this.a;
            if (i <= 0) {
                axdVar.getClass();
                return;
            }
            int iD = axdVar.d(i);
            dt0 dt0Var = (dt0) axdVar.h;
            yc ycVar = (yc) dt0Var.d;
            qygVar.e(((int) (axdVar.c - dt0Var.b)) + ycVar.b, ycVar.a, iD);
            i -= iD;
            long j = axdVar.c + iD;
            axdVar.c = j;
            dt0 dt0Var2 = (dt0) axdVar.h;
            if (j == dt0Var2.c) {
                axdVar.h = (dt0) dt0Var2.o;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:4:0x000a, B:8:0x0017, B:13:0x0029, B:15:0x0042, B:19:0x005d, B:81:0x0111, B:73:0x00fe, B:76:0x0106, B:18:0x005b), top: B:91:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Type inference failed for: r6v31, types: [exd, java.lang.Object] */
    @Override // defpackage.rfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.gf6 r6) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxd.d(gf6):void");
    }

    public final long f(int i) {
        this.u = Math.max(this.u, m(i));
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
    public final void g(long r12, boolean r14) {
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
            if (r14 == 0) goto L1d
            int r14 = r11.s     // Catch: java.lang.Throwable -> L1f
            if (r14 == r1) goto L1d
            int r1 = r14 + 1
        L1d:
            r9 = r1
            goto L23
        L1f:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L23:
            r10 = 0
            r5 = r11
            r6 = r12
            int r12 = r5.k(r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxd.g(long, boolean):void");
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

    public final long i(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        fsi.b(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, m(i5));
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
        return this.k[o(i6 - 1)] + this.l[r9];
    }

    public final void j(int i) {
        long jI = i(i);
        axd axdVar = this.a;
        int i2 = axdVar.b;
        fsi.b(jI <= axdVar.c);
        axdVar.c = jI;
        if (jI != 0) {
            dt0 dt0Var = (dt0) axdVar.f;
            if (jI != dt0Var.b) {
                while (axdVar.c > dt0Var.c) {
                    dt0Var = (dt0) dt0Var.o;
                }
                dt0 dt0Var2 = (dt0) dt0Var.o;
                dt0Var2.getClass();
                axdVar.a(dt0Var2);
                dt0 dt0Var3 = new dt0(i2, 4, dt0Var.c);
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
        axdVar.a((dt0) axdVar.f);
        dt0 dt0Var4 = new dt0(i2, 4, axdVar.c);
        axdVar.f = dt0Var4;
        axdVar.g = dt0Var4;
        axdVar.h = dt0Var4;
    }

    public final int k(long j, int i, int i2, boolean z) {
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

    public gf6 l(gf6 gf6Var) {
        if (this.F == 0 || gf6Var.z0 == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return gf6Var;
        }
        ef6 ef6VarA = gf6Var.a();
        ef6VarA.o = gf6Var.z0 + this.F;
        return new gf6(ef6VarA);
    }

    public final long m(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iO = o(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iO]);
            if ((this.m[iO] & 1) != 0) {
                return jMax;
            }
            iO--;
            if (iO == -1) {
                iO = this.i - 1;
            }
        }
        return jMax;
    }

    public final int n() {
        return this.q + this.s;
    }

    public final int o(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int p(long j, boolean z) throws Throwable {
        try {
            try {
                int iO = o(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iO]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int iK = k(j, iO, i2 - i, true);
                if (iK == -1) {
                    return 0;
                }
                return iK;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized gf6 q() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean r(boolean z) {
        gf6 gf6Var;
        boolean z2 = false;
        if (this.s != this.p) {
            if (((cxd) this.c.A(n())).a != this.g) {
                return true;
            }
            return s(o(this.s));
        }
        if (z || this.w || ((gf6Var = this.B) != null && gf6Var != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean s(int i) {
        mc5 mc5Var = this.h;
        if (mc5Var == null || mc5Var.t() == 4) {
            return true;
        }
        if ((this.m[i] & 1073741824) != 0) {
            return false;
        }
        this.h.getClass();
        return false;
    }

    public final void t() throws DrmSession$DrmSessionException {
        mc5 mc5Var = this.h;
        if (mc5Var == null || mc5Var.t() != 1) {
            return;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionM = this.h.m();
        drmSession$DrmSessionExceptionM.getClass();
        throw drmSession$DrmSessionExceptionM;
    }

    public final void u(gf6 gf6Var, i5i i5iVar) {
        gf6 gf6Var2;
        gf6 gf6Var3 = this.g;
        boolean z = gf6Var3 == null;
        x45 x45Var = z ? null : gf6Var3.y0;
        this.g = gf6Var;
        x45 x45Var2 = gf6Var.y0;
        j55 j55Var = this.d;
        if (j55Var != null) {
            int iB = j55Var.b(gf6Var);
            ef6 ef6VarA = gf6Var.a();
            ef6VarA.D = iB;
            gf6Var2 = new gf6(ef6VarA);
        } else {
            gf6Var2 = gf6Var;
        }
        i5iVar.b = gf6Var2;
        i5iVar.a = this.h;
        if (j55Var == null) {
            return;
        }
        if (z || !xxg.a(x45Var, x45Var2)) {
            mc5 mc5Var = this.h;
            lk6 lk6Var = this.e;
            mc5 mc5VarA = j55Var.a(lk6Var, gf6Var);
            this.h = mc5VarA;
            i5iVar.a = mc5VarA;
            if (mc5Var != null) {
                mc5Var.E(lk6Var);
            }
        }
    }

    public final synchronized int v() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[o(this.s)] : this.C;
    }

    public final int w(i5i i5iVar, oh4 oh4Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        c32 c32Var = this.b;
        synchronized (this) {
            try {
                oh4Var.o = false;
                i2 = -3;
                if (this.s != this.p) {
                    gf6 gf6Var = ((cxd) this.c.A(n())).a;
                    if (!z2 && gf6Var == this.g) {
                        int iO = o(this.s);
                        if (s(iO)) {
                            oh4Var.b = this.m[iO];
                            long j = this.n[iO];
                            oh4Var.X = j;
                            if (j < this.t) {
                                oh4Var.a(Integer.MIN_VALUE);
                            }
                            c32Var.b = this.l[iO];
                            c32Var.c = this.k[iO];
                            c32Var.d = this.o[iO];
                            i2 = -4;
                        } else {
                            oh4Var.o = true;
                        }
                    }
                    u(gf6Var, i5iVar);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        gf6 gf6Var2 = this.B;
                        if (gf6Var2 == null || (!z2 && gf6Var2 == this.g)) {
                        }
                        u(gf6Var2, i5iVar);
                        i2 = -5;
                    }
                    oh4Var.b = 4;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !oh4Var.j(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    axd axdVar = this.a;
                    axd.i((dt0) axdVar.g, oh4Var, this.b, (qyg) axdVar.e);
                } else {
                    axd axdVar2 = this.a;
                    axdVar2.g = axd.i((dt0) axdVar2.g, oh4Var, this.b, (qyg) axdVar2.e);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void x(boolean z) {
        axd axdVar = this.a;
        axdVar.a((dt0) axdVar.f);
        dt0 dt0Var = (dt0) axdVar.f;
        int i = axdVar.b;
        fsi.d(((yc) dt0Var.d) == null);
        dt0Var.b = 0L;
        dt0Var.c = i;
        dt0 dt0Var2 = (dt0) axdVar.f;
        axdVar.g = dt0Var2;
        axdVar.h = dt0Var2;
        axdVar.c = 0L;
        ((qi4) axdVar.d).b();
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
        }
    }

    public final synchronized boolean y(long j, boolean z) throws Throwable {
        try {
            try {
                synchronized (this) {
                    try {
                        this.s = 0;
                        axd axdVar = this.a;
                        axdVar.g = (dt0) axdVar.f;
                        int iO = o(0);
                        int i = this.s;
                        int i2 = this.p;
                        if ((i != i2) && j >= this.n[iO]) {
                            if (j <= this.v || z) {
                                int iK = k(j, iO, i2 - i, true);
                                if (iK == -1) {
                                    return false;
                                }
                                this.t = j;
                                this.s += iK;
                                return true;
                            }
                        }
                        return false;
                    } finally {
                        th = th;
                        while (true) {
                            Throwable th = th;
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void z(int r3) {
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
            defpackage.fsi.b(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxd.z(int):void");
    }
}
