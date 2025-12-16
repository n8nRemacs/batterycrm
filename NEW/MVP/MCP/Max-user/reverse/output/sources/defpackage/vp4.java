package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vp4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu1 b;

    public /* synthetic */ vp4(tu1 tu1Var, int i) {
        this.a = i;
        this.b = tu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
            default:
                this.b.b(null);
                break;
        }
    }
}
