package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class pj5 extends h0e implements Runnable {
    public final boolean a;
    public final Executor b;
    public volatile boolean d;
    public final AtomicInteger o = new AtomicInteger();
    public final zl3 X = new zl3();
    public final xt4 c = new xt4(26);

    public pj5(Executor executor, boolean z) {
        this.b = executor;
        this.a = z;
    }

    @Override // defpackage.h0e
    public final py4 b(Runnable runnable) {
        py4 nj5Var;
        cd5 cd5Var = cd5.a;
        if (this.d) {
            return cd5Var;
        }
        if (this.a) {
            nj5Var = new oj5(runnable, this.X);
            this.X.a(nj5Var);
        } else {
            nj5Var = new nj5(runnable);
        }
        this.c.offer(nj5Var);
        if (this.o.getAndIncrement() != 0) {
            return nj5Var;
        }
        try {
            this.b.execute(this);
            return nj5Var;
        } catch (RejectedExecutionException e) {
            this.d = true;
            this.c.clear();
            t8j.a(e);
            return cd5Var;
        }
    }

    @Override // defpackage.h0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        cd5 cd5Var = cd5.a;
        if (j <= 0) {
            return b(runnable);
        }
        if (this.d) {
            return cd5Var;
        }
        n42 n42Var = new n42(2);
        n42 n42Var2 = new n42(n42Var);
        nzd nzdVar = new nzd(new nt3(this, n42Var2, false, runnable, 1), this.X);
        this.X.a(nzdVar);
        Executor executor = this.b;
        if (executor instanceof ScheduledExecutorService) {
            try {
                nzdVar.a(((ScheduledExecutorService) executor).schedule((Callable) nzdVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.d = true;
                t8j.a(e);
                return cd5Var;
            }
        } else {
            nzdVar.a(new vy4(qj5.a.c(nzdVar, j, timeUnit)));
        }
        ty4.d(n42Var, nzdVar);
        return n42Var2;
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.X.dispose();
        if (this.o.getAndIncrement() == 0) {
            this.c.clear();
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xt4 xt4Var = this.c;
        int iAddAndGet = 1;
        while (!this.d) {
            do {
                Runnable runnable = (Runnable) xt4Var.poll();
                if (runnable != null) {
                    runnable.run();
                } else if (this.d) {
                    xt4Var.clear();
                    return;
                } else {
                    iAddAndGet = this.o.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            } while (!this.d);
            xt4Var.clear();
            return;
        }
        xt4Var.clear();
    }
}
