package defpackage;

/* loaded from: classes.dex */
public final class u24 extends xj0 {
    public final pw0 A0;
    public long B0;
    public volatile boolean C0;
    public boolean D0;
    public final int y0;
    public final long z0;

    public u24(qe4 qe4Var, ye4 ye4Var, gf6 gf6Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, pw0 pw0Var) {
        super(qe4Var, ye4Var, gf6Var, i, obj, j, j2, j3, j4, j5);
        this.y0 = i2;
        this.z0 = j6;
        this.A0 = pw0Var;
    }

    @Override // defpackage.zv8
    public final long a() {
        return this.t0 + this.y0;
    }

    @Override // defpackage.zv8
    public final boolean b() {
        return this.D0;
    }

    @Override // defpackage.dc8
    public final void c() {
        this.C0 = true;
    }

    @Override // defpackage.dc8
    public final void load() {
        if (this.B0 == 0) {
            xt4 xt4Var = this.w0;
            fsi.e(xt4Var);
            long j = this.z0;
            for (gxd gxdVar : (gxd[]) xt4Var.c) {
                if (gxdVar.F != j) {
                    gxdVar.F = j;
                    gxdVar.z = true;
                }
            }
            pw0 pw0Var = this.A0;
            long j2 = this.u0;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.z0;
            long j4 = this.v0;
            pw0Var.a(xt4Var, j3, j4 != -9223372036854775807L ? j4 - this.z0 : -9223372036854775807L);
        }
        try {
            ye4 ye4VarB = this.b.b(this.B0);
            ydf ydfVar = this.s0;
            mm4 mm4Var = new mm4(ydfVar, ye4VarB.f, ydfVar.R(ye4VarB));
            while (!this.C0) {
                try {
                    int i = this.A0.a.i(mm4Var, pw0.t0);
                    fsi.d(i != 1);
                    if (!(i == 0)) {
                        break;
                    }
                } finally {
                    this.B0 = mm4Var.d - this.b.f;
                }
            }
            y7j.b(this.s0);
            this.D0 = !this.C0;
        } catch (Throwable th) {
            y7j.b(this.s0);
            throw th;
        }
    }
}
