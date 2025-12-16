package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class k52 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ov8 b;

    public /* synthetic */ k52(ov8 ov8Var, int i) {
        this.a = i;
        this.b = ov8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                ov8 ov8Var = this.b;
                if (ov8Var != null) {
                    ov8Var.a();
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
