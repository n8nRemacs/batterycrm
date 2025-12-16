package defpackage;

/* loaded from: classes.dex */
public final class v24 extends yj0 {
    public final f93 A0;
    public long B0;
    public volatile boolean C0;
    public boolean D0;
    public final int y0;
    public final long z0;

    public v24(se4 se4Var, ze4 ze4Var, hf6 hf6Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, f93 f93Var) {
        super(se4Var, ze4Var, hf6Var, i, obj, j, j2, j3, j4, j5);
        this.y0 = i2;
        this.z0 = j6;
        this.A0 = f93Var;
    }

    @Override // defpackage.aw8
    public final long a() {
        return this.t0 + this.y0;
    }

    @Override // defpackage.aw8
    public final boolean b() {
        return this.D0;
    }

    @Override // defpackage.ec8
    public final void c() {
        this.C0 = true;
    }

    @Override // defpackage.ec8
    public final void load() {
        xo8 xo8Var = this.w0;
        hsi.h(xo8Var);
        if (this.B0 == 0) {
            long j = this.z0;
            for (hxd hxdVar : (hxd[]) xo8Var.c) {
                if (hxdVar.F != j) {
                    hxdVar.F = j;
                    hxdVar.z = true;
                }
            }
            f93 f93Var = this.A0;
            long j2 = this.u0;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.z0;
            long j4 = this.v0;
            ((qw0) f93Var).b(xo8Var, j3, j4 != -9223372036854775807L ? j4 - this.z0 : -9223372036854775807L);
        }
        try {
            ze4 ze4VarC = this.b.c(this.B0);
            zdf zdfVar = this.s0;
            nm4 nm4Var = new nm4(zdfVar, ze4VarC.f, zdfVar.H(ze4VarC));
            while (!this.C0) {
                try {
                    int iY = ((qw0) this.A0).a.y(nm4Var, qw0.u0);
                    hsi.g(iY != 1);
                    if (!(iY == 0)) {
                        break;
                    }
                } finally {
                    this.B0 = nm4Var.d - this.b.f;
                }
            }
            hf6 hf6Var = this.d;
            String str = hf6Var.m;
            int i = hf6Var.M;
            int i2 = hf6Var.N;
            if (xz9.k(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                sfg sfgVarN = xo8Var.N(4);
                int i3 = i * i2;
                long j5 = (this.Z - this.Y) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    sfgVarN.b(new umb(), 0, 0);
                    sfgVarN.a(i4 * j5, 0, 0, 0, null);
                }
            }
            z7j.a(this.s0);
            this.D0 = !this.C0;
        } catch (Throwable th) {
            z7j.a(this.s0);
            throw th;
        }
    }
}
