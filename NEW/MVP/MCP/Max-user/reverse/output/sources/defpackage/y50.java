package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class y50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a60 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ y50(a60 a60Var, boolean z, int i) {
        this.a = i;
        this.b = a60Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a60 a60Var = this.b;
                int iV = az1.v(a60Var.g);
                if (iV != 0) {
                    if (iV == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                a60Var.b.set(null);
                a60Var.c.set(false);
                a60Var.d(2);
                a60Var.a.execute(new y50(a60Var, this.c, 1));
                a60Var.f();
                return;
            default:
                a60 a60Var2 = this.b;
                int iV2 = az1.v(a60Var2.g);
                if (iV2 != 0 && iV2 != 1) {
                    if (iV2 == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                boolean z = a60Var2.r;
                boolean z2 = this.c;
                if (z == z2) {
                    return;
                }
                a60Var2.r = z2;
                if (a60Var2.g == 2) {
                    a60Var2.a();
                    return;
                }
                return;
        }
    }
}
