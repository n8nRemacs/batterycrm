package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s76 extends i66 {
    public final j0e b;
    public final long c;

    public s76(long j, j0e j0eVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = j;
        this.b = j0eVar;
    }

    @Override // defpackage.i66
    public final void g(q76 q76Var) {
        r76 r76Var = new r76(q76Var);
        q76Var.d(r76Var);
        py4 py4VarC = this.b.c(r76Var, this.c, TimeUnit.SECONDS);
        while (!r76Var.compareAndSet(null, py4VarC)) {
            if (r76Var.get() != null) {
                if (r76Var.get() == ty4.a) {
                    py4VarC.dispose();
                    return;
                }
                return;
            }
        }
    }
}
