package defpackage;

/* loaded from: classes.dex */
public final class d31 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k18 b;

    public /* synthetic */ d31(k18 k18Var, int i) {
        this.a = i;
        this.b = k18Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                pe8 pe8Var = (pe8) ((pb3) this.b.getValue());
                pe8Var.L0.O(pe8Var, pe8.U0[25], bool);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                pe8 pe8Var2 = (pe8) ((pb3) this.b.getValue());
                pe8Var2.I0.O(pe8Var2, pe8.U0[22], bool2);
                break;
        }
        return qqg.a;
    }
}
