package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mx8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx8 b;
    public final /* synthetic */ px8 c;

    public /* synthetic */ mx8(yx8 yx8Var, px8 px8Var, int i) {
        this.a = i;
        this.b = yx8Var;
        this.c = px8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yx8 yx8Var = this.b;
                px8 px8Var = this.c;
                yx8Var.s0 = px8Var;
                if (yx8Var.t0) {
                    yx8Var.k(px8Var);
                }
                yx8Var.d(new mx8(yx8Var, px8Var, 1), new fv1(2, yx8Var));
                break;
            default:
                yx8 yx8Var2 = this.b;
                px8 px8Var2 = this.c;
                if (yx8Var2.a instanceof b1) {
                    px8Var2.w();
                    break;
                }
                break;
        }
    }
}
