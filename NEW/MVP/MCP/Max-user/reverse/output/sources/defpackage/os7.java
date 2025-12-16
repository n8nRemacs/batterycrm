package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class os7 implements Runnable {
    public final ThreadFactory X;
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final zl3 c;
    public final ScheduledExecutorService d;
    public final ScheduledFuture o;

    public os7(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        os7 os7Var;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new zl3();
        this.X = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, rs7.e);
            os7Var = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(os7Var, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            os7Var = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        os7Var.d = scheduledExecutorServiceNewScheduledThreadPool;
        os7Var.o = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            qs7 qs7Var = (qs7) it.next();
            if (qs7Var.c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(qs7Var)) {
                this.c.b(qs7Var);
            }
        }
    }
}
