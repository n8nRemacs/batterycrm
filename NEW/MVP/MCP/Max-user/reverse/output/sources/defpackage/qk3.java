package defpackage;

/* loaded from: classes.dex */
public final class qk3 extends hk3 {
    public final /* synthetic */ int a;
    public final hk3 b;
    public final j0e c;

    public /* synthetic */ qk3(hk3 hk3Var, j0e j0eVar, int i) {
        this.a = i;
        this.b = hk3Var;
        this.c = j0eVar;
    }

    @Override // defpackage.hk3
    public final void g(rk3 rk3Var) {
        switch (this.a) {
            case 0:
                this.b.f(new pk3(rk3Var, this.c));
                break;
            default:
                pk3 pk3Var = new pk3(rk3Var, this.b);
                rk3Var.c(pk3Var);
                py4 py4VarB = this.c.b(pk3Var);
                n42 n42Var = (n42) pk3Var.c;
                n42Var.getClass();
                ty4.d(n42Var, py4VarB);
                break;
        }
    }
}
