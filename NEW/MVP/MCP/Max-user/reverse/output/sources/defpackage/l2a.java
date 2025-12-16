package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l2a extends i2a implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public l2a(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        gjg gjgVar = new gjg(callable);
        return new j2a(gjgVar, this.b.schedule(gjgVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        k2a k2aVar = new k2a(runnable);
        return new j2a(k2aVar, this.b.scheduleAtFixedRate(k2aVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        k2a k2aVar = new k2a(runnable);
        return new j2a(k2aVar, this.b.scheduleWithFixedDelay(k2aVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        gjg gjgVar = new gjg(Executors.callable(runnable, null));
        return new j2a(gjgVar, this.b.schedule(gjgVar, j, timeUnit));
    }
}
