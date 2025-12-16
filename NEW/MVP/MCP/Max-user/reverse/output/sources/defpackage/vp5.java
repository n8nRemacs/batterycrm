package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vp5 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yp5 b;

    public /* synthetic */ vp5(yp5 yp5Var, int i) {
        this.a = i;
        this.b = yp5Var;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                e51 e51Var = e51.a;
                nnb nnbVar = (nnb) e51Var.getAccessor().c(16);
                ax1 ax1VarA = e51Var.a();
                yp5 yp5Var = this.b;
                return new r1c(nnbVar, (tv1) yp5Var.e.getValue(), ax1VarA, new t9f(16, yp5Var), fm1.b());
            default:
                return (x4h) this.b.b().X.getValue();
        }
    }
}
