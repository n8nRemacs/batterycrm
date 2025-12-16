package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class j7i implements uu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo4 b;
    public final /* synthetic */ ka0 c;

    public /* synthetic */ j7i(fo4 fo4Var, ka0 ka0Var, int i) {
        this.a = i;
        this.b = fo4Var;
        this.c = ka0Var;
    }

    @Override // defpackage.uu1
    public final String m(final tu1 tu1Var) {
        switch (this.a) {
            case 0:
                final fo4 fo4Var = this.b;
                qee qeeVar = (qee) fo4Var.c;
                final int i = 0;
                final ka0 ka0Var = this.c;
                qeeVar.execute(new Runnable() { // from class: k7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                fo4Var.d(tu1Var, ka0Var);
                                break;
                            default:
                                fo4Var.d(tu1Var, ka0Var);
                                break;
                        }
                    }
                });
                return "setZoomRatio";
            default:
                final fo4 fo4Var2 = this.b;
                qee qeeVar2 = (qee) fo4Var2.c;
                final int i2 = 1;
                final ka0 ka0Var2 = this.c;
                qeeVar2.execute(new Runnable() { // from class: k7i
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                fo4Var2.d(tu1Var, ka0Var2);
                                break;
                            default:
                                fo4Var2.d(tu1Var, ka0Var2);
                                break;
                        }
                    }
                });
                return "setLinearZoom";
        }
    }
}
