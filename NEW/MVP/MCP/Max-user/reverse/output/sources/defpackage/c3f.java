package defpackage;

/* loaded from: classes.dex */
public final class c3f extends yj0 {
    public long A0;
    public boolean B0;
    public final int y0;
    public final hf6 z0;

    public c3f(se4 se4Var, ze4 ze4Var, hf6 hf6Var, int i, Object obj, long j, long j2, long j3, int i2, hf6 hf6Var2) {
        super(se4Var, ze4Var, hf6Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.y0 = i2;
        this.z0 = hf6Var2;
    }

    @Override // defpackage.aw8
    public final boolean b() {
        return this.B0;
    }

    @Override // defpackage.ec8
    public final void c() {
    }

    @Override // defpackage.ec8
    public final void load() {
        zdf zdfVar = this.s0;
        xo8 xo8Var = this.w0;
        hsi.h(xo8Var);
        for (hxd hxdVar : (hxd[]) xo8Var.c) {
            if (hxdVar.F != 0) {
                hxdVar.F = 0L;
                hxdVar.z = true;
            }
        }
        sfg sfgVarN = xo8Var.N(this.y0);
        sfgVarN.d(this.z0);
        try {
            long jH = zdfVar.H(this.b.c(this.A0));
            if (jH != -1) {
                jH += this.A0;
            }
            nm4 nm4Var = new nm4(this.s0, this.A0, jH);
            for (int iC = 0; iC != -1; iC = sfgVarN.c(nm4Var, Integer.MAX_VALUE, true)) {
                this.A0 += iC;
            }
            sfgVarN.a(this.Y, 1, (int) this.A0, 0, null);
            z7j.a(zdfVar);
            this.B0 = true;
        } catch (Throwable th) {
            z7j.a(zdfVar);
            throw th;
        }
    }
}
