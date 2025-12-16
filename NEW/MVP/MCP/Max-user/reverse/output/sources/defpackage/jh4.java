package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jh4 implements nac {
    public final dr6 a;
    public final Executor b;
    public final je7 c;
    public final kme d;
    public final v25 e;
    public final boolean f;
    public final nac g;
    public final int h;
    public final x6i i;

    public jh4(dr6 dr6Var, Executor executor, je7 je7Var, kme kmeVar, v25 v25Var, boolean z, nac nacVar, int i, x6i x6iVar) {
        this.a = dr6Var;
        this.b = executor;
        this.c = je7Var;
        this.d = kmeVar;
        this.e = v25Var;
        this.f = z;
        this.g = nacVar;
        this.h = i;
        this.i = x6iVar;
    }

    @Override // defpackage.nac
    public final void a(hj0 hj0Var, oac oacVar) {
        jh4 jh4Var;
        oac oacVar2;
        hj0 gh4Var;
        ml6.i();
        rf7 rf7Var = ((mk0) oacVar).a;
        if (mwg.d(rf7Var.b) || sf7.c(rf7Var.b)) {
            jh4Var = this;
            oacVar2 = oacVar;
            gh4Var = new gh4(jh4Var, hj0Var, oacVar2, new vnc(this.a), this.d, this.h);
        } else {
            gh4Var = new fh4(this, hj0Var, oacVar, this.h);
            jh4Var = this;
            oacVar2 = oacVar;
        }
        jh4Var.g.a(gh4Var, oacVar2);
    }
}
