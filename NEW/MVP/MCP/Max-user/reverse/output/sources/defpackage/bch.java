package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bch implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bch(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                xl5 xl5Var = (xl5) ((enb) obj).c;
                int i3 = xxg.a;
                mj4 mj4Var = xl5Var.a.B0;
                hd hdVarB = mj4Var.b((c99) mj4Var.d.o);
                mj4Var.K(hdVarB, 1018, new cj4(hdVarB, i2, j));
                break;
            default:
                yl5 yl5Var = (yl5) ((vhb) obj).c;
                String str = zxg.a;
                nj4 nj4Var = yl5Var.a.D0;
                id idVarE = nj4Var.E((d99) nj4Var.d.e);
                nj4Var.I(idVarE, 1018, new ui4(idVarE, i2, j));
                break;
        }
    }
}
