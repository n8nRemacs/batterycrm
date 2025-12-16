package defpackage;

/* loaded from: classes2.dex */
public final class u9 {
    public final k95 a;

    public u9(k95 k95Var) {
        this.a = k95Var;
    }

    public final void a(m95 m95Var) {
        r95 r95Var = (r95) m95Var;
        r95Var.a.remove(this.a);
        r95Var.invalidate();
    }
}
