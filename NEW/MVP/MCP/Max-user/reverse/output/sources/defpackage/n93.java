package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n93 implements ixd, iee, ac8, fc8 {
    public gf6 A0;
    public l93 B0;
    public long C0;
    public long D0;
    public int E0;
    public xj0 F0;
    public boolean G0;
    public final id4 X;
    public final qr4 Y;
    public final rha Z;
    public final int a;
    public final int[] b;
    public final gf6[] c;
    public final boolean[] d;
    public final zk4 o;
    public final hc8 s0 = new hc8("ChunkSampleStream", 0);
    public final os0 t0 = new os0();
    public final ArrayList u0;
    public final List v0;
    public final gxd w0;
    public final gxd[] x0;
    public final xt4 y0;
    public b93 z0;

    public n93(int i, int[] iArr, gf6[] gf6VarArr, zk4 zk4Var, id4 id4Var, qi4 qi4Var, long j, j55 j55Var, lk6 lk6Var, rha rhaVar, qr4 qr4Var) {
        this.a = i;
        this.b = iArr;
        this.c = gf6VarArr;
        this.o = zk4Var;
        this.X = id4Var;
        this.Y = qr4Var;
        this.Z = rhaVar;
        ArrayList arrayList = new ArrayList();
        this.u0 = arrayList;
        this.v0 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.x0 = new gxd[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        gxd[] gxdVarArr = new gxd[i2];
        j55Var.getClass();
        gxd gxdVar = new gxd(qi4Var, j55Var, lk6Var);
        this.w0 = gxdVar;
        int i3 = 0;
        iArr2[0] = i;
        gxdVarArr[0] = gxdVar;
        while (i3 < length) {
            gxd gxdVar2 = new gxd(qi4Var, null, null);
            this.x0[i3] = gxdVar2;
            int i4 = i3 + 1;
            gxdVarArr[i4] = gxdVar2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.y0 = new xt4(iArr2, 6, gxdVarArr);
        this.C0 = j;
        this.D0 = j;
    }

    @Override // defpackage.ac8
    public final void A(dc8 dc8Var, long j, long j2) {
        b93 b93Var = (b93) dc8Var;
        this.z0 = null;
        zk4 zk4Var = this.o;
        wk4[] wk4VarArr = zk4Var.h;
        if (b93Var instanceof ql7) {
            int iQ = zk4Var.i.q(((ql7) b93Var).d);
            wk4 wk4Var = wk4VarArr[iQ];
            if (((td4) wk4Var.e) == null) {
                pw0 pw0Var = (pw0) wk4Var.b;
                h9e h9eVar = pw0Var.Z;
                g93 g93Var = h9eVar instanceof g93 ? (g93) h9eVar : null;
                if (g93Var != null) {
                    xmd xmdVar = (xmd) wk4Var.c;
                    wk4VarArr[iQ] = new wk4(wk4Var.f, xmdVar, (jl0) wk4Var.d, pw0Var, wk4Var.g, new v32(g93Var, xmdVar.c, 3), 2);
                }
            }
        }
        h4c h4cVar = zk4Var.g;
        if (h4cVar != null) {
            long j3 = h4cVar.d;
            if (j3 == -9223372036854775807L || b93Var.Z > j3) {
                h4cVar.d = b93Var.Z;
            }
            h4cVar.e.d = true;
        }
        long j4 = b93Var.a;
        ye4 ye4Var = b93Var.b;
        ydf ydfVar = b93Var.s0;
        tb8 tb8Var = new tb8(j4, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        this.Z.getClass();
        this.Y.f(tb8Var, b93Var.c, this.a, b93Var.d, b93Var.o, b93Var.X, b93Var.Y, b93Var.Z);
        this.X.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175 A[LOOP:1: B:64:0x016f->B:66:0x0175, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d A[LOOP:2: B:68:0x0197->B:70:0x019d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0251  */
    @Override // defpackage.ac8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.y21 D(defpackage.dc8 r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n93.D(dc8, long, long, java.io.IOException, int):y21");
    }

    @Override // defpackage.fc8
    public final void a() {
        gxd gxdVar = this.w0;
        gxdVar.x(true);
        mc5 mc5Var = gxdVar.h;
        if (mc5Var != null) {
            mc5Var.E(gxdVar.e);
            gxdVar.h = null;
            gxdVar.g = null;
        }
        for (gxd gxdVar2 : this.x0) {
            gxdVar2.x(true);
            mc5 mc5Var2 = gxdVar2.h;
            if (mc5Var2 != null) {
                mc5Var2.E(gxdVar2.e);
                gxdVar2.h = null;
                gxdVar2.g = null;
            }
        }
        for (wk4 wk4Var : this.o.h) {
            pw0 pw0Var = (pw0) wk4Var.b;
            if (pw0Var != null) {
                pw0Var.a.release();
            }
        }
        l93 l93Var = this.B0;
        if (l93Var != null) {
            id4 id4Var = (id4) l93Var;
            synchronized (id4Var) {
                h4c h4cVar = (h4c) id4Var.x0.remove(this);
                if (h4cVar != null) {
                    gxd gxdVar3 = h4cVar.a;
                    gxdVar3.x(true);
                    mc5 mc5Var3 = gxdVar3.h;
                    if (mc5Var3 != null) {
                        mc5Var3.E(gxdVar3.e);
                        gxdVar3.h = null;
                        gxdVar3.g = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.ixd
    public final void b() throws IOException {
        hc8 hc8Var = this.s0;
        hc8Var.b();
        this.w0.t();
        if (hc8Var.I()) {
            return;
        }
        zk4 zk4Var = this.o;
        BehindLiveWindowException behindLiveWindowException = zk4Var.l;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        zk4Var.a.b();
    }

    public final xj0 c(int i) {
        ArrayList arrayList = this.u0;
        xj0 xj0Var = (xj0) arrayList.get(i);
        xxg.G(arrayList, i, arrayList.size());
        this.E0 = Math.max(this.E0, arrayList.size());
        int i2 = 0;
        this.w0.j(xj0Var.d(0));
        while (true) {
            gxd[] gxdVarArr = this.x0;
            if (i2 >= gxdVarArr.length) {
                return xj0Var;
            }
            gxd gxdVar = gxdVarArr[i2];
            i2++;
            gxdVar.j(xj0Var.d(i2));
        }
    }

    @Override // defpackage.iee
    public final long d() {
        if (q()) {
            return this.C0;
        }
        if (this.G0) {
            return Long.MIN_VALUE;
        }
        return m().Z;
    }

    @Override // defpackage.ixd
    public final boolean e() {
        return !q() && this.w0.r(this.G0);
    }

    @Override // defpackage.ixd
    public final int g(long j) throws Throwable {
        if (q()) {
            return 0;
        }
        boolean z = this.G0;
        gxd gxdVar = this.w0;
        int iP = gxdVar.p(j, z);
        xj0 xj0Var = this.F0;
        if (xj0Var != null) {
            iP = Math.min(iP, xj0Var.d(0) - gxdVar.n());
        }
        gxdVar.z(iP);
        s();
        return iP;
    }

    @Override // defpackage.ixd
    public final int i(i5i i5iVar, oh4 oh4Var, int i) {
        if (q()) {
            return -3;
        }
        xj0 xj0Var = this.F0;
        gxd gxdVar = this.w0;
        if (xj0Var != null && xj0Var.d(0) <= gxdVar.n()) {
            return -3;
        }
        s();
        return gxdVar.w(i5iVar, oh4Var, i, this.G0);
    }

    @Override // defpackage.iee
    public final boolean j() {
        return this.s0.I();
    }

    public final xj0 m() {
        return (xj0) wy1.d(this.u0, 1);
    }

    public final boolean n(int i) {
        int iN;
        xj0 xj0Var = (xj0) this.u0.get(i);
        if (this.w0.n() > xj0Var.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            gxd[] gxdVarArr = this.x0;
            if (i2 >= gxdVarArr.length) {
                return false;
            }
            iN = gxdVarArr[i2].n();
            i2++;
        } while (iN <= xj0Var.d(i2));
        return true;
    }

    @Override // defpackage.iee
    public final long o() {
        long j;
        ArrayList arrayList = this.u0;
        if (this.G0) {
            return Long.MIN_VALUE;
        }
        if (q()) {
            return this.C0;
        }
        long jMax = this.D0;
        xj0 xj0VarM = m();
        if (!xj0VarM.b()) {
            xj0VarM = arrayList.size() > 1 ? (xj0) wy1.d(arrayList, 2) : null;
        }
        if (xj0VarM != null) {
            jMax = Math.max(jMax, xj0VarM.Z);
        }
        gxd gxdVar = this.w0;
        synchronized (gxdVar) {
            j = gxdVar.v;
        }
        return Math.max(jMax, j);
    }

    @Override // defpackage.iee
    public final void p(long j) {
        hc8 hc8Var = this.s0;
        if (hc8Var.G() || q()) {
            return;
        }
        boolean zI = hc8Var.I();
        List list = this.v0;
        zk4 zk4Var = this.o;
        ArrayList arrayList = this.u0;
        if (zI) {
            b93 b93Var = this.z0;
            b93Var.getClass();
            boolean z = b93Var instanceof xj0;
            if (z && n(arrayList.size() - 1)) {
                return;
            }
            if (zk4Var.l == null ? zk4Var.i.u(j, b93Var, list) : false) {
                hc8Var.x();
                if (z) {
                    this.F0 = (xj0) b93Var;
                    return;
                }
                return;
            }
            return;
        }
        int size = (zk4Var.l != null || zk4Var.i.length() < 2) ? list.size() : zk4Var.i.g(j, list);
        if (size < arrayList.size()) {
            fsi.d(!hc8Var.I());
            int size2 = arrayList.size();
            while (true) {
                if (size >= size2) {
                    size = -1;
                    break;
                } else if (!n(size)) {
                    break;
                } else {
                    size++;
                }
            }
            if (size == -1) {
                return;
            }
            long j2 = m().Z;
            xj0 xj0VarC = c(size);
            if (arrayList.isEmpty()) {
                this.C0 = this.D0;
            }
            this.G0 = false;
            long j3 = xj0VarC.Y;
            qr4 qr4Var = this.Y;
            qr4Var.m(new g19(1, this.a, null, 3, null, qr4Var.a(j3), qr4Var.a(j2)));
        }
    }

    public final boolean q() {
        return this.C0 != -9223372036854775807L;
    }

    @Override // defpackage.ac8
    public final void r(dc8 dc8Var, long j, long j2, boolean z) {
        b93 b93Var = (b93) dc8Var;
        this.z0 = null;
        this.F0 = null;
        long j3 = b93Var.a;
        ye4 ye4Var = b93Var.b;
        ydf ydfVar = b93Var.s0;
        tb8 tb8Var = new tb8(j3, ye4Var, ydfVar.c, ydfVar.d, j, j2, ydfVar.b);
        this.Z.getClass();
        this.Y.d(tb8Var, b93Var.c, this.a, b93Var.d, b93Var.o, b93Var.X, b93Var.Y, b93Var.Z);
        if (z) {
            return;
        }
        if (q()) {
            this.w0.x(false);
            for (gxd gxdVar : this.x0) {
                gxdVar.x(false);
            }
        } else if (b93Var instanceof xj0) {
            ArrayList arrayList = this.u0;
            c(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.C0 = this.D0;
            }
        }
        this.X.b(this);
    }

    public final void s() {
        int iT = t(this.w0.n(), this.E0 - 1);
        while (true) {
            int i = this.E0;
            if (i > iT) {
                return;
            }
            this.E0 = i + 1;
            xj0 xj0Var = (xj0) this.u0.get(i);
            gf6 gf6Var = xj0Var.d;
            if (!gf6Var.equals(this.A0)) {
                this.Y.b(this.a, gf6Var, xj0Var.o, xj0Var.X, xj0Var.Y);
            }
            this.A0 = gf6Var;
        }
    }

    public final int t(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.u0;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((xj0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }

    public final void u(id4 id4Var) {
        this.B0 = id4Var;
        gxd gxdVar = this.w0;
        gxdVar.h();
        mc5 mc5Var = gxdVar.h;
        if (mc5Var != null) {
            mc5Var.E(gxdVar.e);
            gxdVar.h = null;
            gxdVar.g = null;
        }
        for (gxd gxdVar2 : this.x0) {
            gxdVar2.h();
            mc5 mc5Var2 = gxdVar2.h;
            if (mc5Var2 != null) {
                mc5Var2.E(gxdVar2.e);
                gxdVar2.h = null;
                gxdVar2.g = null;
            }
        }
        this.s0.N(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b8  */
    @Override // defpackage.iee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(long r59) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n93.z(long):boolean");
    }
}
