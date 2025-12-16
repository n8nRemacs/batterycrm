package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cch implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ enb b;

    public /* synthetic */ cch(enb enbVar, long j, int i) {
        this.a = 4;
        this.b = enbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        enb enbVar = this.b;
        switch (i) {
            case 0:
                xl5 xl5Var = (xl5) enbVar.c;
                int i2 = xxg.a;
                mj4 mj4Var = xl5Var.a.B0;
                mj4Var.K(mj4Var.J(), 1019, new ej4(13));
                break;
            case 1:
                xl5 xl5Var2 = (xl5) enbVar.c;
                int i3 = xxg.a;
                mj4 mj4Var2 = xl5Var2.a.B0;
                mj4Var2.K(mj4Var2.J(), 1030, new ej4(25));
                break;
            case 2:
                xl5 xl5Var3 = (xl5) enbVar.c;
                int i4 = xxg.a;
                mj4 mj4Var3 = xl5Var3.a.B0;
                mj4Var3.K(mj4Var3.J(), 1015, new vi4(10));
                break;
            case 3:
                xl5 xl5Var4 = (xl5) enbVar.c;
                int i5 = xxg.a;
                mj4 mj4Var4 = xl5Var4.a.B0;
                mj4Var4.K(mj4Var4.J(), 1017, new vi4(9));
                break;
            default:
                xl5 xl5Var5 = (xl5) enbVar.c;
                int i6 = xxg.a;
                mj4 mj4Var5 = xl5Var5.a.B0;
                mj4Var5.K(mj4Var5.b((c99) mj4Var5.d.o), 1021, new vi4(28));
                break;
        }
    }

    public /* synthetic */ cch(enb enbVar, gf6 gf6Var, rh4 rh4Var) {
        this.a = 3;
        this.b = enbVar;
    }

    public /* synthetic */ cch(enb enbVar, Object obj, int i) {
        this.a = i;
        this.b = enbVar;
    }
}
