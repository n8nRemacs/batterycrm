package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ct1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ it1 b;

    public /* synthetic */ ct1(it1 it1Var, int i) {
        this.a = i;
        this.b = it1Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return it1.w(this.b);
            case 1:
                cm6 cm6Var = this.b.P0;
                if (cm6Var != null) {
                    return (x4h) cm6Var.invoke();
                }
                return null;
            default:
                return it1.B(this.b);
        }
    }
}
