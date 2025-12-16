package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class p79 implements y79 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z79 b;

    public /* synthetic */ p79(z79 z79Var, int i) {
        this.a = i;
        this.b = z79Var;
    }

    @Override // defpackage.y79
    public final void b(u69 u69Var) {
        int i = this.a;
        z79 z79Var = this.b;
        switch (i) {
            case 0:
                z79Var.g.t.X();
                break;
            case 1:
                o79 o79Var = z79Var.g;
                if (o79Var.t.F() != null) {
                    usd usdVar = o79Var.e;
                    o79Var.t(u69Var);
                    usdVar.getClass();
                    a6a.c(new yie(-6));
                    break;
                }
                break;
            case 2:
                z79Var.g.t.c0();
                break;
            case 3:
                z79Var.g.t.d0();
                break;
            case 4:
                z79Var.g.t.W();
                break;
            case 5:
                z79Var.g.t.prepare();
                break;
            case 6:
                z79Var.g.t.l0();
                break;
            case 7:
                o79 o79Var2 = z79Var.g;
                a5c a5cVar = o79Var2.t;
                if (!zxg.h0(a5cVar, o79Var2.p)) {
                    if (a5cVar != null && a5cVar.S(1)) {
                        a5cVar.T();
                        break;
                    }
                } else {
                    zxg.J(a5cVar);
                    break;
                }
                break;
            case 8:
                z79Var.g.t.a0();
                break;
            case 9:
                z79Var.g.t.b0();
                break;
            case 10:
                z79Var.g.g(u69Var, true);
                break;
            default:
                a5c a5cVar2 = z79Var.g.t;
                String str = zxg.a;
                if (a5cVar2 != null && a5cVar2.S(1)) {
                    a5cVar2.T();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p79(z79 z79Var, g8d g8dVar) {
        this.a = 1;
        this.b = z79Var;
    }
}
