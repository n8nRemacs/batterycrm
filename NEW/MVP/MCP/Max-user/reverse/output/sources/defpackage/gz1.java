package defpackage;

/* loaded from: classes.dex */
public final class gz1 extends cc9 {
    public cb8 m;
    public final Object n;

    public gz1(Object obj) {
        this.n = obj;
    }

    @Override // defpackage.cb8
    public final Object d() {
        cb8 cb8Var = this.m;
        return cb8Var == null ? this.n : cb8Var.d();
    }

    @Override // defpackage.cc9
    public final void l(cb8 cb8Var, wta wtaVar) {
        throw null;
    }

    public final void m(j8a j8aVar) {
        bc9 bc9Var;
        cb8 cb8Var = this.m;
        if (cb8Var != null && (bc9Var = (bc9) this.l.c(cb8Var)) != null) {
            bc9Var.a.j(bc9Var);
        }
        this.m = j8aVar;
        super.l(j8aVar, new fz1(0, this));
    }
}
