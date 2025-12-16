package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ls1 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs1 b;
    public final /* synthetic */ CharSequence c;

    public /* synthetic */ ls1(vs1 vs1Var, CharSequence charSequence, int i) {
        this.a = i;
        this.b = vs1Var;
        this.c = charSequence;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        ((Boolean) obj).getClass();
        vs1 vs1Var = this.b;
        switch (i) {
            case 0:
                vs1.L(vs1Var, this.c);
                break;
            case 1:
                vs1.x(vs1Var, this.c);
                break;
            default:
                vs1.J(vs1Var, this.c);
                break;
        }
        return qqg.a;
    }
}
