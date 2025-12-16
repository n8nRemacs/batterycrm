package defpackage;

/* loaded from: classes.dex */
public final class ab8 extends bb8 implements b48 {
    public final /* synthetic */ cb8 X;
    public final j48 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab8(cb8 cb8Var, j48 j48Var, wta wtaVar) {
        super(cb8Var, wtaVar);
        this.X = cb8Var;
        this.o = j48Var;
    }

    @Override // defpackage.bb8
    public final void b() {
        this.o.p().f(this);
    }

    @Override // defpackage.bb8
    public final boolean c(j48 j48Var) {
        return this.o == j48Var;
    }

    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) {
        j48 j48Var2 = this.o;
        l38 l38Var = j48Var2.p().d;
        if (l38Var == l38.a) {
            this.X.j(this.a);
            return;
        }
        l38 l38Var2 = null;
        while (l38Var2 != l38Var) {
            a(e());
            l38Var2 = l38Var;
            l38Var = j48Var2.p().d;
        }
    }

    @Override // defpackage.bb8
    public final boolean e() {
        return this.o.p().d.a(l38.d);
    }
}
