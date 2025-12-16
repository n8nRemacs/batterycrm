package defpackage;

/* loaded from: classes2.dex */
public final class rd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld3 b;
    public final /* synthetic */ zd3 c;
    public final /* synthetic */ jd3 d;

    public /* synthetic */ rd3(ld3 ld3Var, zd3 zd3Var, jd3 jd3Var, int i) {
        this.a = i;
        this.b = ld3Var;
        this.c = zd3Var;
        this.d = jd3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                zd3 zd3Var = this.c;
                zd3Var.b.postInvalidate();
                zd3Var.i.invoke(this.d.i());
                break;
            default:
                this.b.a();
                zd3 zd3Var2 = this.c;
                zd3Var2.b.postInvalidate();
                zd3Var2.i.invoke(this.d.i());
                break;
        }
    }
}
