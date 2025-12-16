package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rj5 extends j0e {
    public final boolean c;
    public final Executor d;

    public rj5(Executor executor, boolean z) {
        this.d = executor;
        this.c = z;
    }

    @Override // defpackage.j0e
    public final h0e a() {
        return new pj5(this.d, this.c);
    }

    @Override // defpackage.j0e
    public final py4 b(Runnable runnable) {
        Executor executor = this.d;
        try {
            boolean z = executor instanceof ExecutorService;
            boolean z2 = this.c;
            if (z) {
                jzd jzdVar = new jzd(runnable, z2);
                jzdVar.a(((ExecutorService) executor).submit(jzdVar));
                return jzdVar;
            }
            if (z2) {
                oj5 oj5Var = new oj5(runnable, null);
                executor.execute(oj5Var);
                return oj5Var;
            }
            nj5 nj5Var = new nj5(runnable);
            executor.execute(nj5Var);
            return nj5Var;
        } catch (RejectedExecutionException e) {
            t8j.a(e);
            return cd5.a;
        }
    }

    @Override // defpackage.j0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Executor executor = this.d;
        if (executor instanceof ScheduledExecutorService) {
            try {
                jzd jzdVar = new jzd(runnable, this.c);
                jzdVar.a(((ScheduledExecutorService) executor).schedule(jzdVar, j, timeUnit));
                return jzdVar;
            } catch (RejectedExecutionException e) {
                t8j.a(e);
                return cd5.a;
            }
        }
        mj5 mj5Var = new mj5(runnable);
        py4 py4VarC = qj5.a.c(new yn6(this, mj5Var, false, 11), j, timeUnit);
        n42 n42Var = mj5Var.a;
        n42Var.getClass();
        ty4.d(n42Var, py4VarC);
        return mj5Var;
    }

    @Override // defpackage.j0e
    public final py4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.d;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.d(runnable, j, j2, timeUnit);
        }
        try {
            izd izdVar = new izd(runnable, this.c);
            izdVar.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(izdVar, j, j2, timeUnit));
            return izdVar;
        } catch (RejectedExecutionException e) {
            t8j.a(e);
            return cd5.a;
        }
    }
}
