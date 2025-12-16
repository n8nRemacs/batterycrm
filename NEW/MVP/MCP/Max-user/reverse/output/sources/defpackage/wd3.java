package defpackage;

/* loaded from: classes2.dex */
public final class wd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd7 b;
    public final /* synthetic */ ld3 c;

    public /* synthetic */ wd3(zd3 zd3Var, pd7 pd7Var, ld3 ld3Var, int i) {
        this.a = i;
        this.b = pd7Var;
        this.c = ld3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zd3.k(this.b, this.c, od3.a);
                break;
            case 1:
                zd3.k(this.b, this.c, od3.a);
                break;
            default:
                zd3.k(this.b, this.c, md3.a);
                break;
        }
    }
}
