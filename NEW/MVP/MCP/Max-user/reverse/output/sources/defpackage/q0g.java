package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class q0g implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ te8 b;
    public final /* synthetic */ sm c;
    public final /* synthetic */ j1g d;
    public final /* synthetic */ l0g o;

    public /* synthetic */ q0g(te8 te8Var, sm smVar, j1g j1gVar, l0g l0gVar) {
        this.b = te8Var;
        this.c = smVar;
        this.d = j1gVar;
        this.o = l0gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                te8 te8Var = this.b;
                j1g j1gVar = this.d;
                l0g l0gVar = this.o;
                sm smVar = this.c;
                try {
                    j1gVar.d(l0gVar);
                    u0g.a((u0g) te8Var.c, smVar);
                    break;
                } catch (Exception e) {
                    wqi.g(u0g.z0, e, "failure to run task %s", smVar);
                    j1gVar.e(new pzf("app.exception", e.getMessage(), null));
                    return;
                }
            default:
                sm smVar2 = this.c;
                n2 n2VarQ = smVar2.q();
                te8 te8Var2 = this.b;
                if (n2VarQ != null) {
                    ((u0g) te8Var2.c).a.remove(n2VarQ.getClass().getName());
                }
                j1g j1gVar2 = this.d;
                j1gVar2.b().a(new q0g(te8Var2, j1gVar2, this.o, smVar2));
                break;
        }
    }

    public /* synthetic */ q0g(te8 te8Var, j1g j1gVar, l0g l0gVar, sm smVar) {
        this.b = te8Var;
        this.d = j1gVar;
        this.o = l0gVar;
        this.c = smVar;
    }
}
