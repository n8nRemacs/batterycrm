package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class dch implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ vhb b;

    public /* synthetic */ dch(vhb vhbVar, long j, int i) {
        this.b = vhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vhb vhbVar = this.b;
        switch (i) {
            case 0:
                yl5 yl5Var = (yl5) vhbVar.c;
                String str = zxg.a;
                nj4 nj4Var = yl5Var.a.D0;
                nj4Var.I(nj4Var.H(), 1030, new ej4(27));
                break;
            default:
                yl5 yl5Var2 = (yl5) vhbVar.c;
                String str2 = zxg.a;
                nj4 nj4Var2 = yl5Var2.a.D0;
                nj4Var2.I(nj4Var2.E((d99) nj4Var2.d.e), 1021, new vi4(23));
                break;
        }
    }

    public /* synthetic */ dch(vhb vhbVar, Exception exc) {
        this.b = vhbVar;
    }
}
