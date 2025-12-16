package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class yyf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zyf b;

    public /* synthetic */ yyf(zyf zyfVar, int i) {
        this.a = i;
        this.b = zyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zyf zyfVar = this.b;
                zyfVar.d = null;
                zyfVar.c();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
