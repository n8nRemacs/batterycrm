package defpackage;

/* loaded from: classes2.dex */
public abstract class yb9 implements t98 {
    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        if (!(t98Var instanceof yb9)) {
            return false;
        }
        yb9 yb9Var = (yb9) t98Var;
        return j() == yb9Var.j() && i() == yb9Var.i();
    }

    public abstract long i();

    public abstract long j();

    public abstract boolean l();
}
