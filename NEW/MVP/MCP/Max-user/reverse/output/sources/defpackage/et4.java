package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class et4 implements ScheduledExecutorService, ExecutorService {
    public final ExecutorService a;
    public final k18 b;

    public et4(ExecutorService executorService, bwf bwfVar) {
        this.a = executorService;
        this.b = bwfVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.getValue();
        t9b t9bVar = new t9b(callable, this.a);
        t9bVar.Z = scheduledExecutorService.schedule(new s9b(t9bVar, 1), j, timeUnit);
        return t9bVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Callable<Object> callable = Executors.callable(runnable);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.getValue();
        t9b t9bVar = new t9b(callable, this.a);
        t9bVar.Z = scheduledExecutorService.scheduleWithFixedDelay(new s9b(t9bVar, 0), j, j2, timeUnit);
        return t9bVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Callable<Object> callable = Executors.callable(runnable);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.getValue();
        t9b t9bVar = new t9b(callable, this.a);
        t9bVar.Z = scheduledExecutorService.scheduleWithFixedDelay(new s9b(t9bVar, 0), j, j2, timeUnit);
        return t9bVar;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Callable<Object> callable = Executors.callable(runnable);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.getValue();
        t9b t9bVar = new t9b(callable, this.a);
        t9bVar.Z = scheduledExecutorService.schedule(new s9b(t9bVar, 1), j, timeUnit);
        return t9bVar;
    }
}
