package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class o22 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p22 b;

    public /* synthetic */ o22(p22 p22Var, int i) {
        this.a = i;
        this.b = p22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.d(k38.ON_RESUME);
                break;
            case 1:
                this.b.a.d(k38.ON_DESTROY);
                break;
            case 2:
                this.b.a.d(k38.ON_STOP);
                break;
            default:
                this.b.a.d(k38.ON_PAUSE);
                break;
        }
    }
}
