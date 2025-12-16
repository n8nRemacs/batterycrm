package defpackage;

/* loaded from: classes.dex */
public final class j8g extends ws4 {
    public final oac c;
    public final int d;
    public final ynd e;
    public final /* synthetic */ t9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8g(t9 t9Var, hj0 hj0Var, oac oacVar, int i) {
        super(hj0Var);
        this.f = t9Var;
        this.c = oacVar;
        this.d = i;
        this.e = ((mk0) oacVar).a.h;
    }

    @Override // defpackage.ws4, defpackage.hj0
    public final void f(Throwable th) {
        int i = this.d + 1;
        oac oacVar = this.c;
        t9 t9Var = this.f;
        hj0 hj0Var = this.b;
        if (t9Var.c(i, hj0Var, oacVar)) {
            return;
        }
        hj0Var.e(th);
    }

    @Override // defpackage.hj0
    public final void h(int i, Object obj) {
        ce5 ce5Var = (ce5) obj;
        hj0 hj0Var = this.b;
        if (ce5Var != null && (hj0.b(i) || tei.b(ce5Var, this.e))) {
            hj0Var.g(i, ce5Var);
            return;
        }
        if (hj0.a(i)) {
            ce5.d(ce5Var);
            if (this.f.c(this.d + 1, hj0Var, this.c)) {
                return;
            }
            hj0Var.g(1, null);
        }
    }
}
