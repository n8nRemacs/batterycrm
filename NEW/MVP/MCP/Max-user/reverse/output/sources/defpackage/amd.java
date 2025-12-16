package defpackage;

/* loaded from: classes.dex */
public final class amd implements b48 {
    public final /* synthetic */ n9a X;
    public final /* synthetic */ dtf Y;
    public final /* synthetic */ k38 a;
    public final /* synthetic */ uid b;
    public final /* synthetic */ f84 c;
    public final /* synthetic */ k38 d;
    public final /* synthetic */ l42 o;

    /* JADX WARN: Multi-variable type inference failed */
    public amd(k38 k38Var, uid uidVar, f84 f84Var, k38 k38Var2, l42 l42Var, n9a n9aVar, sm6 sm6Var) {
        this.a = k38Var;
        this.b = uidVar;
        this.c = f84Var;
        this.d = k38Var2;
        this.o = l42Var;
        this.X = n9aVar;
        this.Y = (dtf) sm6Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dtf, sm6] */
    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) {
        k38 k38Var2 = this.a;
        uid uidVar = this.b;
        if (k38Var == k38Var2) {
            uidVar.a = svi.e(this.c, null, null, new zld(this.X, this.Y, null), 3);
            return;
        }
        if (k38Var == this.d) {
            qt7 qt7Var = (qt7) uidVar.a;
            if (qt7Var != null) {
                qt7Var.cancel(null);
            }
            uidVar.a = null;
        }
        if (k38Var == k38.ON_DESTROY) {
            this.o.resumeWith(qqg.a);
        }
    }
}
