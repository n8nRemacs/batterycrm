package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class c01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k01 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ c01(k01 k01Var, Runnable runnable, int i) {
        this.a = i;
        this.b = k01Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k01 k01Var = this.b;
                k01Var.l.post(new c01(k01Var, this.c, 1));
                break;
            default:
                k01 k01Var2 = this.b;
                k01Var2.P.log("OKRTCCall", "disabling enhancer");
                if (!k01Var2.u) {
                    k01Var2.U = true;
                    k01Var2.G(new aia(false, true, true, false, null, null, 0, 0, 0, 0, 0, false, null, 0));
                    Runnable runnable = this.c;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
