package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class t50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo8 b;
    public final /* synthetic */ nh4 c;

    public /* synthetic */ t50(xo8 xo8Var, nh4 nh4Var, int i) {
        this.a = i;
        this.b = xo8Var;
        this.c = nh4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xo8 xo8Var = this.b;
                nh4 nh4Var = this.c;
                yl5 yl5Var = (yl5) xo8Var.c;
                String str = zxg.a;
                nj4 nj4Var = yl5Var.a.D0;
                id idVarH = nj4Var.H();
                nj4Var.I(idVarH, 1007, new bj4(idVarH, nh4Var, 0));
                break;
            default:
                xo8 xo8Var2 = this.b;
                nh4 nh4Var2 = this.c;
                synchronized (nh4Var2) {
                }
                yl5 yl5Var2 = (yl5) xo8Var2.c;
                String str2 = zxg.a;
                nj4 nj4Var2 = yl5Var2.a.D0;
                id idVarE = nj4Var2.E((d99) nj4Var2.d.e);
                nj4Var2.I(idVarE, 1013, new bj4(idVarE, nh4Var2, 1));
                break;
        }
    }
}
