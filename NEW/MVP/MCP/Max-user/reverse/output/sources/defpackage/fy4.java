package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fy4 implements Executor {
    public final z74 a;

    public fy4(z74 z74Var) {
        this.a = z74Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        z74 z74Var = this.a;
        bd5 bd5Var = bd5.a;
        if (z74Var.isDispatchNeeded(bd5Var)) {
            z74Var.mo13dispatch(bd5Var, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
