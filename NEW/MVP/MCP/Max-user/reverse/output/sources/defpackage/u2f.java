package defpackage;

/* loaded from: classes.dex */
public final class u2f extends e2f {
    public final /* synthetic */ int a;
    public final e2f b;
    public final j0e c;

    public /* synthetic */ u2f(e2f e2fVar, j0e j0eVar, int i) {
        this.a = i;
        this.b = e2fVar;
        this.c = j0eVar;
    }

    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        switch (this.a) {
            case 0:
                this.b.k(new as8(v2fVar, this.c, 1));
                break;
            default:
                pk3 pk3Var = new pk3(v2fVar, this.b);
                v2fVar.c(pk3Var);
                py4 py4VarB = this.c.b(pk3Var);
                n42 n42Var = (n42) pk3Var.c;
                n42Var.getClass();
                ty4.d(n42Var, py4VarB);
                break;
        }
    }
}
