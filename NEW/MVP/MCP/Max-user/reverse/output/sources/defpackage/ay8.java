package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ay8 implements jy8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly8 b;
    public final /* synthetic */ float c;

    public /* synthetic */ ay8(ly8 ly8Var, float f, int i) {
        this.a = i;
        this.b = ly8Var;
        this.c = f;
    }

    @Override // defpackage.jy8
    public final void d(eb7 eb7Var, int i) {
        switch (this.a) {
            case 0:
                eb7Var.s(this.b.c, i, this.c);
                break;
            default:
                eb7Var.r(this.b.c, i, this.c);
                break;
        }
    }
}
