package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ech implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vhb b;
    public final /* synthetic */ nh4 c;

    public /* synthetic */ ech(vhb vhbVar, nh4 nh4Var, int i) {
        this.a = i;
        this.b = vhbVar;
        this.c = nh4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vhb vhbVar = this.b;
                nh4 nh4Var = this.c;
                yl5 yl5Var = (yl5) vhbVar.c;
                String str = zxg.a;
                nj4 nj4Var = yl5Var.a.D0;
                id idVarH = nj4Var.H();
                nj4Var.I(idVarH, 1015, new bj4(idVarH, nh4Var, 2));
                break;
            default:
                vhb vhbVar2 = this.b;
                nh4 nh4Var2 = this.c;
                synchronized (nh4Var2) {
                }
                yl5 yl5Var2 = (yl5) vhbVar2.c;
                String str2 = zxg.a;
                nj4 nj4Var2 = yl5Var2.a.D0;
                id idVarE = nj4Var2.E((d99) nj4Var2.d.e);
                nj4Var2.I(idVarE, 1020, new i00(idVarE, 22, nh4Var2));
                break;
        }
    }
}
