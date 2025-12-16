package defpackage;

/* loaded from: classes.dex */
public final class b3f extends xj0 {
    public long A0;
    public boolean B0;
    public final int y0;
    public final gf6 z0;

    public b3f(qe4 qe4Var, ye4 ye4Var, gf6 gf6Var, int i, Object obj, long j, long j2, long j3, int i2, gf6 gf6Var2) {
        super(qe4Var, ye4Var, gf6Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.y0 = i2;
        this.z0 = gf6Var2;
    }

    @Override // defpackage.zv8
    public final boolean b() {
        return this.B0;
    }

    @Override // defpackage.dc8
    public final void c() {
    }

    @Override // defpackage.dc8
    public final void load() {
        ydf ydfVar = this.s0;
        xt4 xt4Var = this.w0;
        fsi.e(xt4Var);
        for (gxd gxdVar : (gxd[]) xt4Var.c) {
            if (gxdVar.F != 0) {
                gxdVar.F = 0L;
                gxdVar.z = true;
            }
        }
        rfg rfgVarE = xt4Var.E(this.y0);
        rfgVarE.d(this.z0);
        try {
            long jR = ydfVar.R(this.b.b(this.A0));
            if (jR != -1) {
                jR += this.A0;
            }
            mm4 mm4Var = new mm4(this.s0, this.A0, jR);
            for (int iA = 0; iA != -1; iA = rfgVarE.a(mm4Var, Integer.MAX_VALUE, true)) {
                this.A0 += iA;
            }
            rfgVarE.b(this.Y, 1, (int) this.A0, 0, null);
            y7j.b(ydfVar);
            this.B0 = true;
        } catch (Throwable th) {
            y7j.b(ydfVar);
            throw th;
        }
    }
}
