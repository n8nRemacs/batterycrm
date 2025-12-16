package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class r79 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z79 b;
    public final /* synthetic */ a5c c;

    public /* synthetic */ r79(z79 z79Var, a5c a5cVar, int i) {
        this.a = i;
        this.b = z79Var;
        this.c = a5cVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                z79 z79Var = this.b;
                h79 h79Var = z79Var.k;
                a5c a5cVar = this.c;
                h79Var.J(z79Var.F(a5cVar));
                z79Var.i.t(a5cVar.z().a(17) ? a5cVar.v() : s9g.a);
                break;
            default:
                z79 z79Var2 = this.b;
                z79Var2.k.J(z79Var2.F(this.c));
                break;
        }
    }
}
