package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class asf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zr4 b;

    public /* synthetic */ asf(zr4 zr4Var, int i) {
        this.a = i;
        this.b = zr4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
