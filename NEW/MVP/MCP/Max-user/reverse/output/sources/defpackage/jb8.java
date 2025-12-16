package defpackage;

/* loaded from: classes.dex */
public interface jb8 {
    void a(ib8 ib8Var, bn5[] bn5VarArr);

    boolean b();

    default boolean c() {
        a8i.l("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default boolean d(long j) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    void e(n4c n4cVar);

    void f(n4c n4cVar);

    default boolean g(long j, boolean z) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    long h();

    void i(n4c n4cVar);

    default boolean j(ib8 ib8Var) {
        return d(ib8Var.b);
    }

    ri4 k();

    default boolean l(ib8 ib8Var) {
        return g(ib8Var.b, ib8Var.d);
    }
}
