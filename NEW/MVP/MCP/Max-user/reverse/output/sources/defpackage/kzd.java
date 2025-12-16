package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class kzd extends zj5 implements ScheduledExecutorService {
    public final ScheduledExecutorService u0;

    public kzd(ScheduledExecutorService scheduledExecutorService, f4b f4bVar, e4b e4bVar) {
        super(scheduledExecutorService, f4bVar, e4bVar);
        this.u0 = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.u0.schedule(i(runnable, b()), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.u0.scheduleAtFixedRate(i(runnable, b()), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.u0.scheduleAtFixedRate(i(runnable, b()), j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.u0.schedule(h(callable, b()), j, timeUnit);
    }
}
