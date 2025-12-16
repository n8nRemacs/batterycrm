package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ln1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on1 b;

    public /* synthetic */ ln1(on1 on1Var, int i) {
        this.a = i;
        this.b = on1Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return on1.v(this.b);
            default:
                return Integer.valueOf(on1.x(this.b));
        }
    }
}
