package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xnd implements nac {
    public final Executor a;
    public final py0 b;
    public final nac c;
    public final boolean d;
    public final uf7 e;

    public xnd(Executor executor, py0 py0Var, nac nacVar, boolean z, uf7 uf7Var) {
        executor.getClass();
        this.a = executor;
        py0Var.getClass();
        this.b = py0Var;
        this.c = nacVar;
        uf7Var.getClass();
        this.e = uf7Var;
        this.d = z;
    }

    @Override // defpackage.nac
    public final void a(hj0 hj0Var, oac oacVar) {
        this.c.a(new wnd(this, hj0Var, oacVar, this.d, this.e), oacVar);
    }
}
