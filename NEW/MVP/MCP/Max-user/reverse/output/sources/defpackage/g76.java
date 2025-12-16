package defpackage;

/* loaded from: classes.dex */
public final class g76 extends a1 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g76(i66 i66Var, Object obj, int i) {
        super(i66Var);
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.i66
    public final void g(q76 q76Var) {
        switch (this.c) {
            case 0:
                dof dofVar = new dof();
                q76Var.d(dofVar);
                new f76(q76Var, (rm0) this.d, dofVar, this.b).a();
                break;
            default:
                cfe cfeVar = new cfe(q76Var);
                ifi.c(8, "capacityHint");
                zee zeeVar = new zee(new oqg());
                try {
                    mqc mqcVar = (mqc) ((b1g) this.d).apply(zeeVar);
                    e76 e76Var = new e76(this.b);
                    h76 h76Var = new h76(cfeVar, zeeVar, e76Var);
                    e76Var.d = h76Var;
                    q76Var.d(h76Var);
                    ((i66) mqcVar).e(e76Var);
                    e76Var.f(0);
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    xd5.a(th, q76Var);
                }
        }
    }
}
