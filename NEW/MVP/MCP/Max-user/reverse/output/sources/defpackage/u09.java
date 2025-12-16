package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class u09 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y09 b;

    public /* synthetic */ u09(y09 y09Var, int i) {
        this.a = i;
        this.b = y09Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                wz7 wz7Var = (wz7) this.b.d.invoke();
                if (wz7Var != null) {
                    wz7Var.k();
                }
                break;
            default:
                y09 y09Var = this.b;
                y09Var.a();
                y09Var.l = false;
                break;
        }
        return qqg.a;
    }
}
