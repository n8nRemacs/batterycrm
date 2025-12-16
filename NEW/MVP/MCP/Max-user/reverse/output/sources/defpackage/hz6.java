package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hz6 extends yt3 {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public ft3 t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public hz6() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.yt3
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.yt3
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.yt3
    public final void Q(d58 d58Var, boolean z) {
        if (this.T == null) {
            return;
        }
        ft3 ft3Var = this.t0;
        d58Var.getClass();
        int iN = d58.n(ft3Var);
        if (this.u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        ft3[] ft3VarArr = this.Q;
        int length = ft3VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ft3VarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.yt3
    public final void b(d58 d58Var, boolean z) {
        zt3 zt3Var = (zt3) this.T;
        if (zt3Var == null) {
            return;
        }
        Object objI = zt3Var.i(2);
        Object objI2 = zt3Var.i(4);
        yt3 yt3Var = this.T;
        boolean z2 = yt3Var != null && yt3Var.p0[0] == 2;
        if (this.u0 == 0) {
            objI = zt3Var.i(3);
            objI2 = zt3Var.i(5);
            yt3 yt3Var2 = this.T;
            z2 = yt3Var2 != null && yt3Var2.p0[1] == 2;
        }
        if (this.v0) {
            ft3 ft3Var = this.t0;
            if (ft3Var.c) {
                m6f m6fVarK = d58Var.k(ft3Var);
                d58Var.d(m6fVarK, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        d58Var.f(d58Var.k(objI2), m6fVarK, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    m6f m6fVarK2 = d58Var.k(objI2);
                    d58Var.f(m6fVarK, d58Var.k(objI), 0, 5);
                    d58Var.f(m6fVarK2, m6fVarK, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            m6f m6fVarK3 = d58Var.k(this.t0);
            d58Var.e(m6fVarK3, d58Var.k(objI), this.r0, 8);
            if (z2) {
                d58Var.f(d58Var.k(objI2), m6fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            m6f m6fVarK4 = d58Var.k(this.t0);
            m6f m6fVarK5 = d58Var.k(objI2);
            d58Var.e(m6fVarK4, m6fVarK5, -this.s0, 8);
            if (z2) {
                d58Var.f(m6fVarK4, d58Var.k(objI), 0, 5);
                d58Var.f(m6fVarK5, m6fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            m6f m6fVarK6 = d58Var.k(this.t0);
            m6f m6fVarK7 = d58Var.k(objI2);
            float f = this.q0;
            ws wsVarL = d58Var.l();
            wsVarL.d.g(m6fVarK6, -1.0f);
            wsVarL.d.g(m6fVarK7, f);
            d58Var.c(wsVarL);
        }
    }

    @Override // defpackage.yt3
    public final boolean c() {
        return true;
    }

    @Override // defpackage.yt3
    public final ft3 i(int i) {
        int iV = az1.v(i);
        if (iV != 1) {
            if (iV != 2) {
                if (iV != 3) {
                    if (iV != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
