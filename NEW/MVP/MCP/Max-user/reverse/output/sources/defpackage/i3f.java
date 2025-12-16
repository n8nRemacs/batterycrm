package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class i3f extends h0e {
    public final ScheduledExecutorService a;
    public final zl3 b = new zl3();
    public volatile boolean c;

    public i3f(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.h0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        cd5 cd5Var = cd5.a;
        if (this.c) {
            return cd5Var;
        }
        nzd nzdVar = new nzd(runnable, this.b);
        this.b.a(nzdVar);
        try {
            nzdVar.a(j <= 0 ? this.a.submit((Callable) nzdVar) : this.a.schedule((Callable) nzdVar, j, timeUnit));
            return nzdVar;
        } catch (RejectedExecutionException e) {
            dispose();
            t8j.a(e);
            return cd5Var;
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.c;
    }
}
