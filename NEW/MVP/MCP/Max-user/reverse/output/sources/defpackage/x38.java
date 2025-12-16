package defpackage;

/* loaded from: classes.dex */
public final class x38 extends v38 implements b48 {
    public final l48 a;
    public final x74 b;

    public x38(l48 l48Var, x74 x74Var) {
        this.a = l48Var;
        this.b = x74Var;
        if (l48Var.d == l38.a) {
            eoi.b(x74Var);
        }
    }

    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) {
        l48 l48Var = this.a;
        if (l48Var.d.compareTo(l38.a) <= 0) {
            l48Var.f(this);
            eoi.b(this.b);
        }
    }

    @Override // defpackage.f84
    public final x74 getCoroutineContext() {
        return this.b;
    }
}
