package defpackage;

/* loaded from: classes.dex */
public final class mn6 implements p6 {
    public final y6i a;

    public mn6(y6i y6iVar) {
        this.a = y6iVar;
    }

    @Override // defpackage.p6
    public final void run() {
        wp7 wp7Var = (wp7) this.a.b;
        wp7Var.d.f(wp7Var);
        wp7Var.l.compareAndSet(true, false);
    }
}
