package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ex5 {
    public final vy a;
    public final cx5 b;
    public final bx5 c;
    public z74 g;
    public final AtomicReference d = new AtomicReference(null);
    public final Object e = new Object();
    public final boolean f = false;
    public final Object h = ipi.b(2, new e44(15, this));

    public ex5(vy vyVar, cx5 cx5Var, bx5 bx5Var) {
        this.a = vyVar;
        this.b = cx5Var;
        this.c = bx5Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    public final void a(c9a c9aVar) {
        z74 z74VarLimitedParallelism;
        synchronized (this.e) {
            try {
                cx5 cx5Var = this.b;
                if (cx5Var != null) {
                    cx5Var.log("schedule update");
                }
                this.d.set(c9aVar);
                if (this.g == null) {
                    try {
                        z74VarLimitedParallelism = this.c.a().limitedParallelism(1, "file-prefs");
                    } catch (Throwable unused) {
                        z74VarLimitedParallelism = null;
                    }
                    this.g = z74VarLimitedParallelism;
                }
                z74 z74Var = this.g;
                if (z74Var != null) {
                    z74Var.mo13dispatch(bd5.a, (dx5) this.h.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
