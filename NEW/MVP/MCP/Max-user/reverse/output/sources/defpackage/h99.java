package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class h99 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr4 b;
    public final /* synthetic */ m99 c;
    public final /* synthetic */ tb8 d;
    public final /* synthetic */ g19 o;

    public /* synthetic */ h99(qr4 qr4Var, m99 m99Var, tb8 tb8Var, g19 g19Var, int i) {
        this.a = i;
        this.b = qr4Var;
        this.c = m99Var;
        this.d = tb8Var;
        this.o = g19Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qr4 qr4Var = this.b;
                this.c.I(qr4Var.a, (c99) qr4Var.c, this.d, this.o);
                break;
            case 1:
                qr4 qr4Var2 = this.b;
                this.c.H(qr4Var2.a, (c99) qr4Var2.c, this.d, this.o);
                break;
            default:
                qr4 qr4Var3 = this.b;
                this.c.c(qr4Var3.a, (c99) qr4Var3.c, this.d, this.o);
                break;
        }
    }
}
