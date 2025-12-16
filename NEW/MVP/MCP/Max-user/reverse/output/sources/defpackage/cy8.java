package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cy8 implements jy8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly8 b;
    public final /* synthetic */ k09 c;

    public /* synthetic */ cy8(ly8 ly8Var, k09 k09Var, int i) {
        this.a = i;
        this.b = ly8Var;
        this.c = k09Var;
    }

    @Override // defpackage.jy8
    public final void d(eb7 eb7Var, int i) {
        switch (this.a) {
            case 0:
                eb7Var.F(this.b.c, i, this.c.d(true));
                break;
            default:
                eb7Var.L(this.b.c, i, this.c.d(true), true);
                break;
        }
    }
}
