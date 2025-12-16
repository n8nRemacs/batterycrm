package defpackage;

/* loaded from: classes.dex */
public final class sr8 extends or8 {
    public final es8 a;

    public sr8(es8 es8Var) {
        this.a = es8Var;
    }

    @Override // defpackage.or8
    public final void f(bs8 bs8Var) {
        rr8 rr8Var = new rr8(0, bs8Var);
        bs8Var.c(rr8Var);
        try {
            this.a.b(rr8Var);
        } catch (Throwable th) {
            raj.c(th);
            if (rr8Var.d(th)) {
                return;
            }
            t8j.a(th);
        }
    }
}
