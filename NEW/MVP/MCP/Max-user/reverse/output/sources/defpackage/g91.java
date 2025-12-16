package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class g91 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i91 b;

    public /* synthetic */ g91(i91 i91Var, int i) {
        this.a = i;
        this.b = i91Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                i91 i91Var = this.b;
                return new ny6(i91Var.I0, i91Var.J0);
            case 1:
                return this.b.O0;
            default:
                return this.b.M0;
        }
    }
}
