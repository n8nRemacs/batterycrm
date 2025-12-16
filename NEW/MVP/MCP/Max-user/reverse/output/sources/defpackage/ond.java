package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ond implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pnd b;

    public /* synthetic */ ond(pnd pndVar, int i) {
        this.a = i;
        this.b = pndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                za0 za0Var = this.b.c;
                if (((pnd) za0Var.g) != null) {
                    za0Var.b();
                    break;
                }
                break;
            default:
                za0 za0Var2 = this.b.c;
                if (((pnd) za0Var2.g) != null && (za0Var2.a & 3) != 0) {
                    za0Var2.b();
                    break;
                }
                break;
        }
    }
}
