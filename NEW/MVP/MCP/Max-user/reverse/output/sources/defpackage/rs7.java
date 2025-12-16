package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class rs7 extends j0e {
    public static final yvd d;
    public static final yvd e;
    public static final qs7 h;
    public static final boolean i;
    public static final os7 j;
    public final AtomicReference c;
    public static final TimeUnit g = TimeUnit.SECONDS;
    public static final long f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    static {
        qs7 qs7Var = new qs7(new yvd("RxCachedThreadSchedulerShutdown"));
        h = qs7Var;
        qs7Var.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        yvd yvdVar = new yvd("RxCachedThreadScheduler", iMax, false);
        d = yvdVar;
        e = new yvd("RxCachedWorkerPoolEvictor", iMax, false);
        i = Boolean.getBoolean("rx3.io-scheduled-release");
        os7 os7Var = new os7(0L, null, yvdVar);
        j = os7Var;
        os7Var.c.dispose();
        ScheduledFuture scheduledFuture = os7Var.o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = os7Var.d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public rs7() {
        os7 os7Var = j;
        AtomicReference atomicReference = new AtomicReference(os7Var);
        this.c = atomicReference;
        os7 os7Var2 = new os7(f, g, d);
        while (!atomicReference.compareAndSet(os7Var, os7Var2)) {
            if (atomicReference.get() != os7Var) {
                os7Var2.c.dispose();
                ScheduledFuture scheduledFuture = os7Var2.o;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = os7Var2.d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.j0e
    public final h0e a() {
        return new ps7((os7) this.c.get());
    }
}
