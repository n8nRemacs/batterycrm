package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class oq4 extends bgg {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;
    public boolean z;

    public oq4() {
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        b();
    }

    @Override // defpackage.bgg
    public final bgg a(int i, int i2) {
        super.a(i, i2);
        return this;
    }

    public final void b() {
        this.z = true;
        this.A = false;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = true;
        this.K = false;
        this.L = true;
    }

    public final bgg c(String[] strArr) {
        tg7 tg7VarI = wg7.i();
        for (String str : strArr) {
            str.getClass();
            tg7VarI.a(xxg.C(str));
        }
        this.n = tg7VarI.i();
        return this;
    }

    public final void d(int i, mfg mfgVar, pq4 pq4Var) {
        SparseArray sparseArray = this.M;
        Map map = (Map) sparseArray.get(i);
        if (map == null) {
            map = new HashMap();
            sparseArray.put(i, map);
        }
        if (map.containsKey(mfgVar) && xxg.a(map.get(mfgVar), pq4Var)) {
            return;
        }
        map.put(mfgVar, pq4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public oq4(android.content.Context r10) throws java.lang.ClassNotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq4.<init>(android.content.Context):void");
    }

    public oq4(mq4 mq4Var) {
        this.a = mq4Var.a;
        this.b = mq4Var.b;
        this.c = mq4Var.c;
        this.d = mq4Var.d;
        this.e = mq4Var.o;
        this.f = mq4Var.X;
        this.g = mq4Var.Y;
        this.h = mq4Var.Z;
        this.i = mq4Var.s0;
        this.j = mq4Var.t0;
        this.k = mq4Var.u0;
        this.l = mq4Var.v0;
        this.m = mq4Var.w0;
        this.n = mq4Var.x0;
        this.o = mq4Var.y0;
        this.p = mq4Var.z0;
        this.q = mq4Var.A0;
        this.r = mq4Var.B0;
        this.s = mq4Var.C0;
        this.t = mq4Var.D0;
        this.u = mq4Var.E0;
        this.v = mq4Var.F0;
        this.w = mq4Var.G0;
        this.x = mq4Var.H0;
        this.y = mq4Var.I0;
        this.I = mq4Var.J0;
        this.z = mq4Var.K0;
        this.A = mq4Var.L0;
        this.B = mq4Var.M0;
        this.C = mq4Var.N0;
        this.D = mq4Var.O0;
        this.E = mq4Var.P0;
        this.F = mq4Var.Q0;
        this.G = mq4Var.R0;
        this.H = mq4Var.S0;
        this.J = mq4Var.T0;
        this.K = mq4Var.U0;
        this.L = mq4Var.V0;
        SparseArray sparseArray = mq4Var.W0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.M = sparseArray2;
        this.N = mq4Var.X0.clone();
    }
}
