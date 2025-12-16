package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class lj6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj6 b;

    public /* synthetic */ lj6(mj6 mj6Var, int i) {
        this.a = i;
        this.b = mj6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mj6 mj6Var = this.b;
                mj6Var.s0 = false;
                if (mj6Var.X != null) {
                    mj6Var.X.stopCapture();
                }
                mj6Var.t0 = false;
                break;
            default:
                mj6 mj6Var2 = this.b;
                mj6Var2.s0 = false;
                if (mj6Var2.X != null) {
                    mj6Var2.X.stopCapture();
                }
                mj6Var2.X = null;
                mj6Var2.t0 = false;
                if (mj6Var2.o != null) {
                    mj6Var2.o.dispose();
                }
                mj6Var2.o = null;
                break;
        }
    }
}
