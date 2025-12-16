package defpackage;

/* loaded from: classes2.dex */
public final class it0 extends fm {
    public final ht0 b;
    public final jt0 c;

    public it0(ht0 ht0Var, jt0 jt0Var) {
        super(ht0Var.a);
        this.b = ht0Var;
        this.c = jt0Var;
    }

    @Override // defpackage.fm
    public final boolean a() {
        this.b.getClass();
        return this.c.canRepeat();
    }

    @Override // defpackage.fm
    public final boolean b() {
        return this.c.isSupplied();
    }

    @Override // defpackage.fm
    public final boolean c() {
        this.b.getClass();
        return this.c.shouldPost();
    }

    @Override // defpackage.fm
    public final void d(gy7 gy7Var) {
        jt0 jt0Var = this.c;
        if (jt0Var.shouldSkipParam()) {
            gy7Var.getClass();
        } else {
            gy7Var.b0(this.b.a);
            jt0Var.write(gy7Var);
        }
    }

    public final String toString() {
        return this.a + " = " + this.c;
    }
}
