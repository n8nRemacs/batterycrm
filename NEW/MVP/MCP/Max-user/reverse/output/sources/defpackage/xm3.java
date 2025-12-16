package defpackage;

import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xm3 extends j0e {
    public static final vm3 d;
    public static final yvd e;
    public static final int f;
    public static final wm3 g;
    public final AtomicReference c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f = iAvailableProcessors;
        wm3 wm3Var = new wm3(new yvd("RxComputationShutdown"));
        g = wm3Var;
        wm3Var.dispose();
        yvd yvdVar = new yvd("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        e = yvdVar;
        vm3 vm3Var = new vm3(0, yvdVar);
        d = vm3Var;
        for (wm3 wm3Var2 : vm3Var.b) {
            wm3Var2.dispose();
        }
    }

    public xm3() {
        vm3 vm3Var = d;
        AtomicReference atomicReference = new AtomicReference(vm3Var);
        this.c = atomicReference;
        vm3 vm3Var2 = new vm3(f, e);
        while (!atomicReference.compareAndSet(vm3Var, vm3Var2)) {
            if (atomicReference.get() != vm3Var) {
                wm3[] wm3VarArr = vm3Var2.b;
                for (wm3 wm3Var : wm3VarArr) {
                    wm3Var.dispose();
                }
                return;
            }
        }
    }

    @Override // defpackage.j0e
    public final h0e a() {
        return new um3(((vm3) this.c.get()).a());
    }

    @Override // defpackage.j0e
    public final py4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((vm3) this.c.get()).a().a;
        Objects.requireNonNull(runnable, "run is null");
        jzd jzdVar = new jzd(runnable, true);
        try {
            jzdVar.a(j <= 0 ? scheduledThreadPoolExecutor.submit(jzdVar) : scheduledThreadPoolExecutor.schedule(jzdVar, j, timeUnit));
            return jzdVar;
        } catch (RejectedExecutionException e2) {
            t8j.a(e2);
            return cd5.a;
        }
    }

    @Override // defpackage.j0e
    public final py4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((vm3) this.c.get()).a().a;
        if (j2 <= 0) {
            ko7 ko7Var = new ko7(runnable, scheduledThreadPoolExecutor);
            try {
                ko7Var.a(j <= 0 ? scheduledThreadPoolExecutor.submit(ko7Var) : scheduledThreadPoolExecutor.schedule(ko7Var, j, timeUnit));
                return ko7Var;
            } catch (RejectedExecutionException e2) {
                t8j.a(e2);
            }
        } else {
            izd izdVar = new izd(runnable, true);
            try {
                izdVar.a(scheduledThreadPoolExecutor.scheduleAtFixedRate(izdVar, j, j2, timeUnit));
                return izdVar;
            } catch (RejectedExecutionException e3) {
                t8j.a(e3);
            }
        }
        return cd5.a;
    }
}
