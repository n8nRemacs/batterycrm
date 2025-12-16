package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class xe5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke5 b;

    public /* synthetic */ xe5(ke5 ke5Var, int i) {
        this.a = i;
        this.b = ke5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                break;
            default:
                this.b.l();
                break;
        }
    }
}
