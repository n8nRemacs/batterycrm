package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class pw0 implements jp5 {
    public static final n7 t0 = new n7();
    public xt4 X;
    public long Y;
    public h9e Z;
    public final fp5 a;
    public final int b;
    public final gf6 c;
    public final SparseArray d = new SparseArray();
    public boolean o;
    public gf6[] s0;

    public pw0(fp5 fp5Var, int i, gf6 gf6Var) {
        this.a = fp5Var;
        this.b = i;
        this.c = gf6Var;
    }

    @Override // defpackage.jp5
    public final rfg B(int i, int i2) {
        SparseArray sparseArray = this.d;
        nw0 nw0Var = (nw0) sparseArray.get(i);
        if (nw0Var == null) {
            fsi.d(this.s0 == null);
            nw0Var = new nw0(i, i2, i2 == this.b ? this.c : null);
            xt4 xt4Var = this.X;
            long j = this.Y;
            if (xt4Var == null) {
                nw0Var.e = nw0Var.c;
            } else {
                nw0Var.f = j;
                rfg rfgVarE = xt4Var.E(i2);
                nw0Var.e = rfgVarE;
                gf6 gf6Var = nw0Var.d;
                if (gf6Var != null) {
                    rfgVarE.d(gf6Var);
                }
            }
            sparseArray.put(i, nw0Var);
        }
        return nw0Var;
    }

    @Override // defpackage.jp5
    public final void N(h9e h9eVar) {
        this.Z = h9eVar;
    }

    public final void a(xt4 xt4Var, long j, long j2) {
        this.X = xt4Var;
        this.Y = j2;
        boolean z = this.o;
        fp5 fp5Var = this.a;
        if (!z) {
            fp5Var.g(this);
            if (j != -9223372036854775807L) {
                fp5Var.d(0L, j);
            }
            this.o = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        fp5Var.d(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            nw0 nw0Var = (nw0) sparseArray.valueAt(i);
            if (xt4Var == null) {
                nw0Var.e = nw0Var.c;
            } else {
                nw0Var.f = j2;
                rfg rfgVarE = xt4Var.E(nw0Var.a);
                nw0Var.e = rfgVarE;
                gf6 gf6Var = nw0Var.d;
                if (gf6Var != null) {
                    rfgVarE.d(gf6Var);
                }
            }
            i++;
        }
    }

    @Override // defpackage.jp5
    public final void w() {
        SparseArray sparseArray = this.d;
        gf6[] gf6VarArr = new gf6[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            gf6 gf6Var = ((nw0) sparseArray.valueAt(i)).d;
            fsi.e(gf6Var);
            gf6VarArr[i] = gf6Var;
        }
        this.s0 = gf6VarArr;
    }
}
