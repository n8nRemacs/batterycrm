package defpackage;

/* loaded from: classes.dex */
public final class vc4 extends svd {
    public final /* synthetic */ ly0 Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ ymd t0;

    public vc4(ly0 ly0Var, int i, ymd ymdVar) {
        this.Z = ly0Var;
        this.s0 = i;
        this.t0 = ymdVar;
    }

    @Override // defpackage.svd
    public final Object c() {
        ymd ymdVar = this.t0;
        wg7 wg7Var = ymdVar.b;
        r7d r7dVar = ymdVar.o;
        if (r7dVar == null) {
            return null;
        }
        hf6 hf6Var = ymdVar.a;
        String str = hf6Var.m;
        qof qofVar = rof.b0;
        gp5 kj6Var = (str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new kj6(qofVar, 32) : new jr8(qofVar, 2);
        qw0 qw0Var = new qw0(kj6Var, this.s0, hf6Var);
        try {
            r7dVar.getClass();
            r7d r7dVarD = ymdVar.d();
            if (r7dVarD != null) {
                r7d r7dVarA = r7dVar.a(r7dVarD, ((kl0) wg7Var.get(0)).a);
                ly0 ly0Var = this.Z;
                if (r7dVarA == null) {
                    new rl7(ly0Var, x7j.a(ymdVar, ((kl0) wg7Var.get(0)).a, r7dVar, 0), ymdVar.a, 0, null, qw0Var).load();
                } else {
                    r7dVarD = r7dVarA;
                }
                new rl7(ly0Var, x7j.a(ymdVar, ((kl0) wg7Var.get(0)).a, r7dVarD, 0), ymdVar.a, 0, null, qw0Var).load();
            }
            kj6Var.release();
            return qw0Var.a();
        } catch (Throwable th) {
            qw0Var.a.release();
            throw th;
        }
    }
}
