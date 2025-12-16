package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class lq4 extends cgg {
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;

    public lq4(nq4 nq4Var) {
        d(nq4Var);
        this.F = nq4Var.o0;
        this.G = nq4Var.p0;
        this.H = nq4Var.q0;
        this.I = nq4Var.r0;
        this.J = nq4Var.s0;
        this.K = nq4Var.t0;
        this.L = nq4Var.u0;
        SparseArray sparseArray = nq4Var.v0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.M = sparseArray2;
        this.N = nq4Var.w0.clone();
    }

    @Override // defpackage.cgg
    public final void a(xfg xfgVar) {
        this.D.put(xfgVar.a, xfgVar);
    }

    @Override // defpackage.cgg
    public final egg b() {
        return new nq4(this);
    }

    @Override // defpackage.cgg
    public final cgg c() {
        super.c();
        return this;
    }

    public final cgg f(String[] strArr) {
        this.p = cgg.e(strArr);
        return this;
    }

    public lq4() {
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = true;
        this.L = true;
    }
}
