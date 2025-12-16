package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o93 implements jxd, jee, bc8, gc8 {
    public hf6 A0;
    public m93 B0;
    public long C0;
    public long D0;
    public int E0;
    public yj0 F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public final jd4 X;
    public final lk6 Y;
    public final tha Z;
    public final int a;
    public final int[] b;
    public final hf6[] c;
    public final boolean[] d;
    public final uc4 o;
    public final te8 s0 = new te8("ChunkSampleStream");
    public final os0 t0 = new os0();
    public final ArrayList u0;
    public final List v0;
    public final hxd w0;
    public final hxd[] x0;
    public final xo8 y0;
    public e93 z0;

    public o93(int i, int[] iArr, hf6[] hf6VarArr, uc4 uc4Var, jd4 jd4Var, ri4 ri4Var, long j, k55 k55Var, d55 d55Var, tha thaVar, lk6 lk6Var, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = hf6VarArr;
        this.o = uc4Var;
        this.X = jd4Var;
        this.Y = lk6Var;
        this.Z = thaVar;
        this.G0 = z;
        ArrayList arrayList = new ArrayList();
        this.u0 = arrayList;
        this.v0 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.x0 = new hxd[length];
        this.d = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        hxd[] hxdVarArr = new hxd[i2];
        k55Var.getClass();
        hxd hxdVar = new hxd(ri4Var, k55Var, d55Var);
        this.w0 = hxdVar;
        int i3 = 0;
        iArr2[0] = i;
        hxdVarArr[0] = hxdVar;
        while (i3 < length) {
            hxd hxdVar2 = new hxd(ri4Var, null, null);
            this.x0[i3] = hxdVar2;
            int i4 = i3 + 1;
            hxdVarArr[i4] = hxdVar2;
            iArr2[i4] = this.b[i3];
            i3 = i4;
        }
        this.y0 = new xo8(iArr2, 6, hxdVarArr);
        this.C0 = j;
        this.D0 = j;
    }

    public final void A(jd4 jd4Var) {
        this.B0 = jd4Var;
        hxd hxdVar = this.w0;
        hxdVar.h();
        z45 z45Var = hxdVar.h;
        if (z45Var != null) {
            z45Var.c(hxdVar.e);
            hxdVar.h = null;
            hxdVar.g = null;
        }
        for (hxd hxdVar2 : this.x0) {
            hxdVar2.h();
            z45 z45Var2 = hxdVar2.h;
            if (z45Var2 != null) {
                z45Var2.c(hxdVar2.e);
                hxdVar2.h = null;
                hxdVar2.g = null;
            }
        }
        this.s0.D(this);
    }

    @Override // defpackage.bc8
    public final void G(ec8 ec8Var, long j, long j2, int i) {
        ub8 ub8Var;
        e93 e93Var = (e93) ec8Var;
        if (i == 0) {
            long j3 = e93Var.a;
            ub8Var = new ub8(e93Var.b);
        } else {
            long j4 = e93Var.a;
            ze4 ze4Var = e93Var.b;
            zdf zdfVar = e93Var.s0;
            Uri uri = zdfVar.c;
            ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        }
        this.Y.R(ub8Var, e93Var.c, this.a, e93Var.d, e93Var.o, e93Var.X, e93Var.Y, e93Var.Z, i);
    }

    @Override // defpackage.bc8
    public final y21 K(ec8 ec8Var, long j, long j2, IOException iOException, int i) {
        y21 y21Var;
        e93 e93Var = (e93) ec8Var;
        long j3 = e93Var.s0.b;
        boolean z = e93Var instanceof yj0;
        ArrayList arrayList = this.u0;
        int size = arrayList.size() - 1;
        boolean z2 = (j3 != 0 && z && v(size)) ? false : true;
        ze4 ze4Var = e93Var.b;
        Uri uri = e93Var.s0.c;
        ub8 ub8Var = new ub8(ze4Var, j2, j3);
        zxg.m0(e93Var.Y);
        zxg.m0(e93Var.Z);
        sb8 sb8Var = new sb8(i, iOException);
        uc4 uc4Var = this.o;
        tha thaVar = this.Z;
        if (!uc4Var.g(e93Var, z2, sb8Var, thaVar)) {
            y21Var = null;
        } else if (z2) {
            if (z) {
                hsi.g(s(size) == e93Var);
                if (arrayList.isEmpty()) {
                    this.C0 = this.D0;
                }
            }
            y21Var = te8.o;
        } else {
            a8i.l("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            y21Var = null;
        }
        if (y21Var == null) {
            thaVar.getClass();
            long jS = tha.s(sb8Var);
            y21Var = jS != -9223372036854775807L ? new y21(jS, 0, 5, false) : te8.X;
        }
        boolean zA = y21Var.a();
        this.Y.O(ub8Var, e93Var.c, this.a, e93Var.d, e93Var.o, e93Var.X, e93Var.Y, e93Var.Z, iOException, !zA);
        if (!zA) {
            this.z0 = null;
            thaVar.getClass();
            this.X.s(this);
        }
        return y21Var;
    }

    @Override // defpackage.gc8
    public final void a() {
        hxd hxdVar = this.w0;
        hxdVar.A(true);
        z45 z45Var = hxdVar.h;
        if (z45Var != null) {
            z45Var.c(hxdVar.e);
            hxdVar.h = null;
            hxdVar.g = null;
        }
        for (hxd hxdVar2 : this.x0) {
            hxdVar2.A(true);
            z45 z45Var2 = hxdVar2.h;
            if (z45Var2 != null) {
                z45Var2.c(hxdVar2.e);
                hxdVar2.h = null;
                hxdVar2.g = null;
            }
        }
        this.o.release();
        m93 m93Var = this.B0;
        if (m93Var != null) {
            jd4 jd4Var = (jd4) m93Var;
            synchronized (jd4Var) {
                i4c i4cVar = (i4c) jd4Var.x0.remove(this);
                if (i4cVar != null) {
                    hxd hxdVar3 = i4cVar.a;
                    hxdVar3.A(true);
                    z45 z45Var3 = hxdVar3.h;
                    if (z45Var3 != null) {
                        z45Var3.c(hxdVar3.e);
                        hxdVar3.h = null;
                        hxdVar3.g = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.jxd
    public final void b() throws IOException {
        te8 te8Var = this.s0;
        te8Var.b();
        this.w0.w();
        if (te8Var.A()) {
            return;
        }
        this.o.b();
    }

    @Override // defpackage.jee
    public final long d() {
        if (w()) {
            return this.C0;
        }
        if (this.I0) {
            return Long.MIN_VALUE;
        }
        return u().Z;
    }

    @Override // defpackage.jxd
    public final boolean e() {
        return !w() && this.w0.u(this.I0);
    }

    @Override // defpackage.jxd
    public final int g(long j) {
        if (w()) {
            return 0;
        }
        boolean z = this.I0;
        hxd hxdVar = this.w0;
        int iS = hxdVar.s(j, z);
        yj0 yj0Var = this.F0;
        if (yj0Var != null) {
            iS = Math.min(iS, yj0Var.d(0) - hxdVar.q());
        }
        hxdVar.D(iS);
        y();
        return iS;
    }

    @Override // defpackage.jxd
    public final int i(xt4 xt4Var, ph4 ph4Var, int i) {
        if (w()) {
            return -3;
        }
        yj0 yj0Var = this.F0;
        hxd hxdVar = this.w0;
        if (yj0Var != null && yj0Var.d(0) <= hxdVar.q()) {
            return -3;
        }
        y();
        return hxdVar.z(xt4Var, ph4Var, i, this.I0);
    }

    @Override // defpackage.jee
    public final boolean j() {
        return this.s0.A();
    }

    @Override // defpackage.jee
    public final long o() {
        if (this.I0) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.C0;
        }
        long jMax = this.D0;
        yj0 yj0VarU = u();
        if (!yj0VarU.b()) {
            ArrayList arrayList = this.u0;
            yj0VarU = arrayList.size() > 1 ? (yj0) wy1.d(arrayList, 2) : null;
        }
        if (yj0VarU != null) {
            jMax = Math.max(jMax, yj0VarU.Z);
        }
        return Math.max(jMax, this.w0.n());
    }

    @Override // defpackage.jee
    public final void p(long j) {
        te8 te8Var = this.s0;
        if (te8Var.x() || w()) {
            return;
        }
        boolean zA = te8Var.A();
        List list = this.v0;
        uc4 uc4Var = this.o;
        ArrayList arrayList = this.u0;
        if (zA) {
            e93 e93Var = this.z0;
            e93Var.getClass();
            boolean z = e93Var instanceof yj0;
            if (!(z && v(arrayList.size() - 1)) && uc4Var.f(j, e93Var, list)) {
                te8Var.c();
                if (z) {
                    this.F0 = (yj0) e93Var;
                    return;
                }
                return;
            }
            return;
        }
        int iJ = uc4Var.j(j, list);
        if (iJ < arrayList.size()) {
            hsi.g(!te8Var.A());
            int size = arrayList.size();
            while (true) {
                if (iJ >= size) {
                    iJ = -1;
                    break;
                } else if (!v(iJ)) {
                    break;
                } else {
                    iJ++;
                }
            }
            if (iJ == -1) {
                return;
            }
            long j2 = u().Z;
            yj0 yj0VarS = s(iJ);
            if (arrayList.isEmpty()) {
                this.C0 = this.D0;
            }
            this.I0 = false;
            this.Y.Z(this.a, yj0VarS.Y, j2);
        }
    }

    @Override // defpackage.bc8
    public final void q(ec8 ec8Var, long j, long j2, boolean z) {
        e93 e93Var = (e93) ec8Var;
        this.z0 = null;
        this.F0 = null;
        long j3 = e93Var.a;
        ze4 ze4Var = e93Var.b;
        zdf zdfVar = e93Var.s0;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        this.Z.getClass();
        this.Y.M(ub8Var, e93Var.c, this.a, e93Var.d, e93Var.o, e93Var.X, e93Var.Y, e93Var.Z);
        if (z) {
            return;
        }
        if (w()) {
            this.w0.A(false);
            for (hxd hxdVar : this.x0) {
                hxdVar.A(false);
            }
        } else if (e93Var instanceof yj0) {
            ArrayList arrayList = this.u0;
            s(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.C0 = this.D0;
            }
        }
        this.X.s(this);
    }

    @Override // defpackage.jee
    public final boolean r(oc8 oc8Var) {
        long j;
        List list;
        if (!this.I0) {
            te8 te8Var = this.s0;
            if (!te8Var.A() && !te8Var.x()) {
                boolean zW = w();
                if (zW) {
                    list = Collections.EMPTY_LIST;
                    j = this.C0;
                } else {
                    j = u().Z;
                    list = this.v0;
                }
                this.o.d(oc8Var, j, list, this.t0);
                os0 os0Var = this.t0;
                boolean z = os0Var.a;
                e93 e93Var = (e93) os0Var.b;
                os0Var.b = null;
                os0Var.a = false;
                if (z) {
                    this.C0 = -9223372036854775807L;
                    this.I0 = true;
                    return true;
                }
                if (e93Var != null) {
                    this.z0 = e93Var;
                    boolean z2 = e93Var instanceof yj0;
                    xo8 xo8Var = this.y0;
                    if (z2) {
                        yj0 yj0Var = (yj0) e93Var;
                        if (zW) {
                            long j2 = yj0Var.Y;
                            long j3 = this.C0;
                            if (j2 < j3) {
                                this.w0.t = j3;
                                for (hxd hxdVar : this.x0) {
                                    hxdVar.t = this.C0;
                                }
                                if (this.G0) {
                                    hf6 hf6Var = yj0Var.d;
                                    this.H0 = !xz9.a(hf6Var.n, hf6Var.k);
                                }
                            }
                            this.G0 = false;
                            this.C0 = -9223372036854775807L;
                        }
                        yj0Var.w0 = xo8Var;
                        hxd[] hxdVarArr = (hxd[]) xo8Var.c;
                        int[] iArr = new int[hxdVarArr.length];
                        for (int i = 0; i < hxdVarArr.length; i++) {
                            hxd hxdVar2 = hxdVarArr[i];
                            iArr[i] = hxdVar2.q + hxdVar2.p;
                        }
                        yj0Var.x0 = iArr;
                        this.u0.add(yj0Var);
                    } else if (e93Var instanceof rl7) {
                        ((rl7) e93Var).u0 = xo8Var;
                    }
                    te8Var.F(e93Var, this, this.Z.q(e93Var.c));
                    return true;
                }
            }
        }
        return false;
    }

    public final yj0 s(int i) {
        ArrayList arrayList = this.u0;
        yj0 yj0Var = (yj0) arrayList.get(i);
        zxg.b0(arrayList, i, arrayList.size());
        this.E0 = Math.max(this.E0, arrayList.size());
        int i2 = 0;
        this.w0.k(yj0Var.d(0));
        while (true) {
            hxd[] hxdVarArr = this.x0;
            if (i2 >= hxdVarArr.length) {
                return yj0Var;
            }
            hxd hxdVar = hxdVarArr[i2];
            i2++;
            hxdVar.k(yj0Var.d(i2));
        }
    }

    public final yj0 u() {
        return (yj0) wy1.d(this.u0, 1);
    }

    public final boolean v(int i) {
        int iQ;
        yj0 yj0Var = (yj0) this.u0.get(i);
        if (this.w0.q() > yj0Var.d(0)) {
            return true;
        }
        int i2 = 0;
        do {
            hxd[] hxdVarArr = this.x0;
            if (i2 >= hxdVarArr.length) {
                return false;
            }
            iQ = hxdVarArr[i2].q();
            i2++;
        } while (iQ <= yj0Var.d(i2));
        return true;
    }

    public final boolean w() {
        return this.C0 != -9223372036854775807L;
    }

    @Override // defpackage.bc8
    public final void x(ec8 ec8Var, long j, long j2) {
        e93 e93Var = (e93) ec8Var;
        this.z0 = null;
        this.o.e(e93Var);
        long j3 = e93Var.a;
        ze4 ze4Var = e93Var.b;
        zdf zdfVar = e93Var.s0;
        Uri uri = zdfVar.c;
        ub8 ub8Var = new ub8(ze4Var, j2, zdfVar.b);
        this.Z.getClass();
        this.Y.N(ub8Var, e93Var.c, this.a, e93Var.d, e93Var.o, e93Var.X, e93Var.Y, e93Var.Z);
        this.X.s(this);
    }

    public final void y() {
        int iZ = z(this.w0.q(), this.E0 - 1);
        while (true) {
            int i = this.E0;
            if (i > iZ) {
                return;
            }
            this.E0 = i + 1;
            yj0 yj0Var = (yj0) this.u0.get(i);
            hf6 hf6Var = yj0Var.d;
            if (!hf6Var.equals(this.A0)) {
                this.Y.y(this.a, hf6Var, yj0Var.o, yj0Var.X, yj0Var.Y);
            }
            this.A0 = hf6Var;
        }
    }

    public final int z(int i, int i2) {
        ArrayList arrayList;
        do {
            i2++;
            arrayList = this.u0;
            if (i2 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((yj0) arrayList.get(i2)).d(0) <= i);
        return i2 - 1;
    }
}
