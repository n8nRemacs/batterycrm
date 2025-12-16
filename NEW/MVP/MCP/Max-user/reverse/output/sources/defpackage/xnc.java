package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class xnc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ goc b;

    public /* synthetic */ xnc(goc gocVar, int i) {
        this.a = i;
        this.b = gocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.T0 = true;
                break;
            case 1:
                this.b.u();
                break;
            default:
                goc gocVar = this.b;
                if (!gocVar.Z0) {
                    n29 n29Var = gocVar.C0;
                    n29Var.getClass();
                    n29Var.s(gocVar);
                    break;
                }
                break;
        }
    }
}
