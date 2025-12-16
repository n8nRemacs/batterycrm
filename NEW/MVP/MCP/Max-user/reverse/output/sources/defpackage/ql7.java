package defpackage;

/* loaded from: classes.dex */
public final class ql7 extends b93 {
    public final pw0 t0;
    public xt4 u0;
    public long v0;
    public volatile boolean w0;

    public ql7(qe4 qe4Var, ye4 ye4Var, gf6 gf6Var, int i, Object obj, pw0 pw0Var) {
        super(qe4Var, ye4Var, 2, gf6Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.t0 = pw0Var;
    }

    @Override // defpackage.dc8
    public final void c() {
        this.w0 = true;
    }

    @Override // defpackage.dc8
    public final void load() {
        if (this.v0 == 0) {
            this.t0.a(this.u0, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            ye4 ye4VarB = this.b.b(this.v0);
            ydf ydfVar = this.s0;
            mm4 mm4Var = new mm4(ydfVar, ye4VarB.f, ydfVar.R(ye4VarB));
            while (!this.w0) {
                try {
                    int i = this.t0.a.i(mm4Var, pw0.t0);
                    boolean z = false;
                    fsi.d(i != 1);
                    if (i == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.v0 = mm4Var.d - this.b.f;
                }
            }
        } finally {
            y7j.b(this.s0);
        }
    }
}
