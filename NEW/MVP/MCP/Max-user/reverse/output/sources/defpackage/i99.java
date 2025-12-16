package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class i99 implements fu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lk6 b;
    public final /* synthetic */ ub8 c;
    public final /* synthetic */ g19 d;

    public /* synthetic */ i99(lk6 lk6Var, ub8 ub8Var, g19 g19Var, int i) {
        this.a = i;
        this.b = lk6Var;
        this.c = ub8Var;
        this.d = g19Var;
    }

    @Override // defpackage.fu3
    public final void accept(Object obj) {
        n99 n99Var = (n99) obj;
        switch (this.a) {
            case 0:
                lk6 lk6Var = this.b;
                n99Var.u(lk6Var.b, (d99) lk6Var.c, this.c, this.d);
                break;
            default:
                lk6 lk6Var2 = this.b;
                n99Var.d(lk6Var2.b, (d99) lk6Var2.c, this.c, this.d);
                break;
        }
    }
}
