package defpackage;

/* loaded from: classes.dex */
public final class qi0 extends e27 {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.yt3
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.yt3
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            yt3 yt3Var = this.q0[i4];
            if ((this.t0 || yt3Var.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !yt3Var.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !yt3Var.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.r0; i5++) {
            yt3 yt3Var2 = this.q0[i5];
            if (this.t0 || yt3Var2.c()) {
                if (!z2) {
                    int i6 = this.s0;
                    if (i6 == 0) {
                        iMax = yt3Var2.i(2).d();
                    } else if (i6 == 1) {
                        iMax = yt3Var2.i(4).d();
                    } else if (i6 == 2) {
                        iMax = yt3Var2.i(3).d();
                    } else if (i6 == 3) {
                        iMax = yt3Var2.i(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.s0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, yt3Var2.i(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, yt3Var2.i(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, yt3Var2.i(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, yt3Var2.i(5).d());
                }
            }
        }
        int i8 = iMax + this.u0;
        int i9 = this.s0;
        if (i9 == 0 || i9 == 1) {
            J(i8, i8);
        } else {
            K(i8, i8);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.yt3
    public final void b(d58 d58Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        ft3[] ft3VarArr = this.Q;
        ft3 ft3Var = this.I;
        ft3VarArr[0] = ft3Var;
        int i3 = 2;
        ft3 ft3Var2 = this.J;
        ft3VarArr[2] = ft3Var2;
        ft3 ft3Var3 = this.K;
        ft3VarArr[1] = ft3Var3;
        ft3 ft3Var4 = this.L;
        ft3VarArr[3] = ft3Var4;
        for (ft3 ft3Var5 : ft3VarArr) {
            ft3Var5.i = d58Var.k(ft3Var5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ft3 ft3Var6 = ft3VarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                d58Var.d(ft3Var.i, this.Y);
                d58Var.d(ft3Var3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    d58Var.d(ft3Var2.i, this.Z);
                    d58Var.d(ft3Var4.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.r0; i6++) {
            yt3 yt3Var = this.q0[i6];
            if ((this.t0 || yt3Var.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && yt3Var.p0[0] == 3 && yt3Var.I.f != null && yt3Var.K.f != null) || ((i2 == 2 || i2 == 3) && yt3Var.p0[1] == 3 && yt3Var.J.f != null && yt3Var.L.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = ft3Var.g() || ft3Var3.g();
        boolean z4 = ft3Var2.g() || ft3Var4.g();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            yt3 yt3Var2 = this.q0[i8];
            if (this.t0 || yt3Var2.c()) {
                m6f m6fVarK = d58Var.k(yt3Var2.Q[this.s0]);
                ft3[] ft3VarArr2 = yt3Var2.Q;
                int i9 = this.s0;
                ft3 ft3Var7 = ft3VarArr2[i9];
                ft3Var7.i = m6fVarK;
                ft3 ft3Var8 = ft3Var7.f;
                int i10 = (ft3Var8 == null || ft3Var8.d != this) ? 0 : ft3Var7.g;
                if (i9 == 0 || i9 == i3) {
                    m6f m6fVar = ft3Var6.i;
                    int i11 = this.u0 - i10;
                    ws wsVarL = d58Var.l();
                    m6f m6fVarM = d58Var.m();
                    m6fVarM.d = 0;
                    wsVarL.c(m6fVar, m6fVarK, m6fVarM, i11);
                    d58Var.c(wsVarL);
                } else {
                    m6f m6fVar2 = ft3Var6.i;
                    int i12 = this.u0 + i10;
                    ws wsVarL2 = d58Var.l();
                    m6f m6fVarM2 = d58Var.m();
                    m6fVarM2.d = 0;
                    wsVarL2.b(m6fVar2, m6fVarK, m6fVarM2, i12);
                    d58Var.c(wsVarL2);
                }
                d58Var.e(ft3Var6.i, m6fVarK, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            d58Var.e(ft3Var3.i, ft3Var.i, 0, 8);
            d58Var.e(ft3Var.i, this.T.K.i, 0, 4);
            d58Var.e(ft3Var.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            d58Var.e(ft3Var.i, ft3Var3.i, 0, 8);
            d58Var.e(ft3Var.i, this.T.I.i, 0, 4);
            d58Var.e(ft3Var.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            d58Var.e(ft3Var4.i, ft3Var2.i, 0, 8);
            d58Var.e(ft3Var2.i, this.T.L.i, 0, 4);
            d58Var.e(ft3Var2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            d58Var.e(ft3Var2.i, ft3Var4.i, 0, 8);
            d58Var.e(ft3Var2.i, this.T.J.i, 0, 4);
            d58Var.e(ft3Var2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.yt3
    public final boolean c() {
        return true;
    }

    @Override // defpackage.yt3
    public final String toString() {
        String strL = ho7.l(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            yt3 yt3Var = this.q0[i];
            if (i > 0) {
                strL = az1.i(strL, ", ");
            }
            StringBuilder sbM = az1.m(strL);
            sbM.append(yt3Var.h0);
            strL = sbM.toString();
        }
        return az1.i(strL, "}");
    }
}
