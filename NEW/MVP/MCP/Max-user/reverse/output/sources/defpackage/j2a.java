package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j2a extends jo7 implements ScheduledFuture, ha8, Future {
    public final x1 X;
    public final ScheduledFuture Y;

    public j2a(x1 x1Var, ScheduledFuture scheduledFuture) {
        this.X = x1Var;
        this.Y = scheduledFuture;
    }

    @Override // defpackage.jo7
    public final Object a() {
        return this.X;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zI = i(z);
        if (zI) {
            this.Y.cancel(z);
        }
        return zI;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.Y.compareTo(delayed);
    }

    @Override // defpackage.ha8
    public final void d(Runnable runnable, Executor executor) {
        this.X.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.X.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.Y.getDelay(timeUnit);
    }

    public final boolean i(boolean z) {
        return this.X.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.X.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.X.get(j, timeUnit);
    }
}
