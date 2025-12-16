package defpackage;

/* loaded from: classes.dex */
public final class q38 {
    public final l48 a;
    public final l38 b;
    public final ay4 c;
    public final hl3 d;

    public q38(l48 l48Var, l38 l38Var, ay4 ay4Var, qt7 qt7Var) {
        this.a = l48Var;
        this.b = l38Var;
        this.c = ay4Var;
        hl3 hl3Var = new hl3(this, 1, qt7Var);
        this.d = hl3Var;
        if (l48Var.d != l38.a) {
            l48Var.a(hl3Var);
        } else {
            qt7Var.cancel(null);
            a();
        }
    }

    public final void a() {
        this.a.f(this.d);
        ay4 ay4Var = this.c;
        ay4Var.b = true;
        ay4Var.a();
    }
}
