package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class qw0 implements kp5, f93 {
    public static final wm4 t0 = new wm4();
    public static final n7 u0 = new n7();
    public xo8 X;
    public long Y;
    public i9e Z;
    public final gp5 a;
    public final int b;
    public final hf6 c;
    public final SparseArray d = new SparseArray();
    public boolean o;
    public hf6[] s0;

    public qw0(gp5 gp5Var, int i, hf6 hf6Var) {
        this.a = gp5Var;
        this.b = i;
        this.c = hf6Var;
    }

    @Override // defpackage.kp5
    /* renamed from: B */
    public final sfg mo163B(int i, int i2) {
        SparseArray sparseArray = this.d;
        ow0 ow0Var = (ow0) sparseArray.get(i);
        if (ow0Var == null) {
            hsi.g(this.s0 == null);
            ow0Var = new ow0(i, i2, i2 == this.b ? this.c : null);
            xo8 xo8Var = this.X;
            long j = this.Y;
            if (xo8Var == null) {
                ow0Var.e = ow0Var.c;
            } else {
                ow0Var.f = j;
                sfg sfgVarN = xo8Var.N(i2);
                ow0Var.e = sfgVarN;
                hf6 hf6Var = ow0Var.d;
                if (hf6Var != null) {
                    sfgVarN.d(hf6Var);
                }
            }
            sparseArray.put(i, ow0Var);
        }
        return ow0Var;
    }

    @Override // defpackage.kp5
    public final void Q(i9e i9eVar) {
        this.Z = i9eVar;
    }

    public final h93 a() {
        i9e i9eVar = this.Z;
        if (i9eVar instanceof h93) {
            return (h93) i9eVar;
        }
        return null;
    }

    public final void b(xo8 xo8Var, long j, long j2) {
        this.X = xo8Var;
        this.Y = j2;
        boolean z = this.o;
        gp5 gp5Var = this.a;
        if (!z) {
            gp5Var.w(this);
            if (j != -9223372036854775807L) {
                gp5Var.d(0L, j);
            }
            this.o = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        gp5Var.d(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            ow0 ow0Var = (ow0) sparseArray.valueAt(i);
            if (xo8Var == null) {
                ow0Var.e = ow0Var.c;
            } else {
                ow0Var.f = j2;
                sfg sfgVarN = xo8Var.N(ow0Var.a);
                ow0Var.e = sfgVarN;
                hf6 hf6Var = ow0Var.d;
                if (hf6Var != null) {
                    sfgVarN.d(hf6Var);
                }
            }
            i++;
        }
    }

    @Override // defpackage.kp5
    public final void w() {
        SparseArray sparseArray = this.d;
        hf6[] hf6VarArr = new hf6[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            hf6 hf6Var = ((ow0) sparseArray.valueAt(i)).d;
            hsi.h(hf6Var);
            hf6VarArr[i] = hf6Var;
        }
        this.s0 = hf6VarArr;
    }
}
