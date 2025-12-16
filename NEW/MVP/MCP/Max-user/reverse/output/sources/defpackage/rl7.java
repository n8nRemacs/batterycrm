package defpackage;

/* loaded from: classes.dex */
public final class rl7 extends e93 {
    public final f93 t0;
    public xo8 u0;
    public long v0;
    public volatile boolean w0;

    public rl7(se4 se4Var, ze4 ze4Var, hf6 hf6Var, int i, Object obj, f93 f93Var) {
        super(se4Var, ze4Var, 2, hf6Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.t0 = f93Var;
    }

    @Override // defpackage.ec8
    public final void c() {
        this.w0 = true;
    }

    @Override // defpackage.ec8
    public final void load() {
        if (this.v0 == 0) {
            ((qw0) this.t0).b(this.u0, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            ze4 ze4VarC = this.b.c(this.v0);
            zdf zdfVar = this.s0;
            nm4 nm4Var = new nm4(zdfVar, ze4VarC.f, zdfVar.H(ze4VarC));
            while (!this.w0) {
                try {
                    int iY = ((qw0) this.t0).a.y(nm4Var, qw0.u0);
                    boolean z = false;
                    hsi.g(iY != 1);
                    if (iY == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.v0 = nm4Var.d - this.b.f;
                    ((qw0) this.t0).a();
                }
            }
        } finally {
            z7j.a(this.s0);
        }
    }
}
