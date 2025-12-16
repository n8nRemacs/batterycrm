package defpackage;

/* loaded from: classes2.dex */
public final class xd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd3 b;
    public final /* synthetic */ pd7 c;
    public final /* synthetic */ ld3 d;
    public final /* synthetic */ jd3 o;

    public /* synthetic */ xd3(zd3 zd3Var, pd7 pd7Var, ld3 ld3Var, jd3 jd3Var, int i) {
        this.a = i;
        this.b = zd3Var;
        this.c = pd7Var;
        this.d = ld3Var;
        this.o = jd3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        jd3 jd3Var = this.o;
        ld3 ld3Var = this.d;
        pd7 pd7Var = this.c;
        zd3 zd3Var = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = zd3.l;
                zd3.k(pd7Var, ld3Var, zd3Var.i(jd3Var));
                break;
            default:
                yy7[] yy7VarArr2 = zd3.l;
                zd3.k(pd7Var, ld3Var, zd3Var.i(jd3Var));
                break;
        }
    }
}
