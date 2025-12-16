package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class rx4 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ux4 b;

    public /* synthetic */ rx4(ux4 ux4Var, int i) {
        this.a = i;
        this.b = ux4Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new tx4(this.b);
            case 1:
                ux4 ux4Var = this.b;
                return ux4Var.a.t(ux4Var.e);
            default:
                ux4 ux4Var2 = this.b;
                return ux4Var2.a.t(ux4Var2.f);
        }
    }
}
