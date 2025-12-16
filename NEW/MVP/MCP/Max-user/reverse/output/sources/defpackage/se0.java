package defpackage;

/* loaded from: classes.dex */
public final class se0 extends u08 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se0(fg1 fg1Var, int i) {
        super(0);
        this.a = i;
        this.b = fg1Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                fg1 fg1Var = this.b;
                return new p21(fg1Var.v.j, fg1Var.f);
            case 1:
                return this.b.b.a;
            case 2:
                return Boolean.valueOf(this.b.h.a.c.e);
            case 3:
                fg1 fg1Var2 = this.b;
                return new zk1(fg1Var2.v.i, fg1Var2.f);
            case 4:
                fg1 fg1Var3 = this.b;
                return new l2e(fg1Var3.m.k, fg1Var3.e);
            case 5:
                fg1 fg1Var4 = this.b;
                return new e0f(fg1Var4.c, fg1Var4.d);
            default:
                this.b.k.getClass();
                return mdg.a;
        }
    }
}
