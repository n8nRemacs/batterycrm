package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ar3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o79 b;
    public final /* synthetic */ u69 c;

    public /* synthetic */ ar3(o79 o79Var, u69 u69Var, int i) {
        this.a = i;
        this.b = o79Var;
        this.c = u69Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o79 o79Var = this.b;
                if (!o79Var.j()) {
                    if (o79Var.A) {
                        u69 u69Var = this.c;
                        if (!o79.k(u69Var)) {
                            if (o79Var.i(u69Var)) {
                                o79Var.A = false;
                            }
                        }
                    }
                    o79Var.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.W(this.c, Integer.MIN_VALUE, 12, z89.Y(new zz8(17)));
                break;
            case 2:
                this.b.g.W(this.c, Integer.MIN_VALUE, 11, z89.Y(new zz8(12)));
                break;
            case 3:
                this.b.g.W(this.c, Integer.MIN_VALUE, 3, z89.Y(new zz8(24)));
                break;
            case 4:
                this.b.g.W(this.c, Integer.MIN_VALUE, 1, z89.Y(new zz8(9)));
                break;
            case 5:
                z89 z89Var = this.b.g;
                z89Var.getClass();
                u69 u69Var2 = this.c;
                z89Var.W(u69Var2, Integer.MIN_VALUE, 1, z89.Y(new dq4(z89Var, 21, u69Var2)));
                break;
            case 6:
                z89 z89Var2 = this.b.g;
                z89Var2.getClass();
                u69 u69Var3 = this.c;
                z89Var2.W(u69Var3, Integer.MIN_VALUE, 1, z89.Y(new dq4(z89Var2, 21, u69Var3)));
                break;
            case 7:
                this.b.g.W(this.c, Integer.MIN_VALUE, 1, z89.Y(new zz8(9)));
                break;
            case 8:
                this.b.g.W(this.c, Integer.MIN_VALUE, 9, z89.Y(new zz8(18)));
                break;
            default:
                this.b.g.W(this.c, Integer.MIN_VALUE, 7, z89.Y(new zz8(14)));
                break;
        }
    }
}
