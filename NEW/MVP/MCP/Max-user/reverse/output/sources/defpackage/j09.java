package defpackage;

/* loaded from: classes.dex */
public interface j09 extends t98 {
    @Override // defpackage.t98
    default boolean h(t98 t98Var) {
        if (!(t98Var instanceof j09)) {
            return false;
        }
        j09 j09Var = (j09) t98Var;
        return j() == j09Var.j() && i() == j09Var.i();
    }

    long i();

    long j();

    m00 v();

    String w();
}
