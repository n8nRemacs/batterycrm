package defpackage;

/* loaded from: classes2.dex */
public final class qd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld3 b;

    public /* synthetic */ qd3(ld3 ld3Var, int i) {
        this.a = i;
        this.b = ld3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                this.b.a();
                break;
            case 2:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
