package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class eha extends h0e {
    public final ScheduledThreadPoolExecutor a;
    public volatile boolean b;

    public eha(ThreadFactory threadFactory) {
        boolean z = p0e.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(p0e.a);
        this.a = scheduledThreadPoolExecutor;
    }

    @Override // defpackage.h0e
    public final py4 b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // defpackage.h0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b ? cd5.a : f(runnable, j, timeUnit, null);
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.shutdownNow();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.b;
    }

    public final nzd f(Runnable runnable, long j, TimeUnit timeUnit, qy4 qy4Var) {
        nzd nzdVar = new nzd(runnable, qy4Var);
        if (qy4Var != null && !qy4Var.a(nzdVar)) {
            return nzdVar;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        try {
            nzdVar.a(j <= 0 ? scheduledThreadPoolExecutor.submit((Callable) nzdVar) : scheduledThreadPoolExecutor.schedule((Callable) nzdVar, j, timeUnit));
            return nzdVar;
        } catch (RejectedExecutionException e) {
            if (qy4Var != null) {
                qy4Var.b(nzdVar);
            }
            t8j.a(e);
            return nzdVar;
        }
    }
}
