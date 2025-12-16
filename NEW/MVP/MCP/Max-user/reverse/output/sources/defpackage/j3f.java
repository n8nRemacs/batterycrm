package defpackage;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j3f extends j0e {
    public static final yvd d;
    public static final ScheduledExecutorService e;
    public final AtomicReference c;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        d = new yvd("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public j3f() {
        AtomicReference atomicReference = new AtomicReference();
        this.c = atomicReference;
        boolean z = p0e.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, d);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(p0e.a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    @Override // defpackage.j0e
    public final h0e a() {
        return new i3f((ScheduledExecutorService) this.c.get());
    }

    @Override // defpackage.j0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        jzd jzdVar = new jzd(runnable, true);
        AtomicReference atomicReference = this.c;
        try {
            jzdVar.a(j <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(jzdVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(jzdVar, j, timeUnit));
            return jzdVar;
        } catch (RejectedExecutionException e2) {
            t8j.a(e2);
            return cd5.a;
        }
    }

    @Override // defpackage.j0e
    public final py4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        cd5 cd5Var = cd5.a;
        AtomicReference atomicReference = this.c;
        if (j2 > 0) {
            izd izdVar = new izd(runnable, true);
            try {
                izdVar.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(izdVar, j, j2, timeUnit));
                return izdVar;
            } catch (RejectedExecutionException e2) {
                t8j.a(e2);
                return cd5Var;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        ko7 ko7Var = new ko7(runnable, scheduledExecutorService);
        try {
            ko7Var.a(j <= 0 ? scheduledExecutorService.submit(ko7Var) : scheduledExecutorService.schedule(ko7Var, j, timeUnit));
            return ko7Var;
        } catch (RejectedExecutionException e3) {
            t8j.a(e3);
            return cd5Var;
        }
    }
}
