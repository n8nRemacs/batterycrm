package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ConcurrentKt;

/* loaded from: classes.dex */
public final class lj5 extends kj5 implements ms4 {
    public final Executor a;

    public lj5(Executor executor) {
        this.a = executor;
        ConcurrentKt.removeFutureOnCancel(executor);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.ms4
    public final Object delay(long j, Continuation continuation) {
        return q8j.a(this, j, continuation);
    }

    @Override // defpackage.z74
    /* renamed from: dispatch */
    public final void mo13dispatch(x74 x74Var, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            qt7 qt7Var = (qt7) x74Var.get(wha.w0);
            if (qt7Var != null) {
                qt7Var.cancel(cancellationException);
            }
            gy4.c.mo13dispatch(x74Var, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lj5) && ((lj5) obj).a == this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.ms4
    public final sy4 invokeOnTimeout(long j, Runnable runnable, x74 x74Var) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                qt7 qt7Var = (qt7) x74Var.get(wha.w0);
                if (qt7Var != null) {
                    qt7Var.cancel(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new ry4(scheduledFutureSchedule) : km4.Z.invokeOnTimeout(j, runnable, x74Var);
    }

    @Override // defpackage.ms4
    /* renamed from: scheduleResumeAfterDelay */
    public final void mo14scheduleResumeAfterDelay(long j, k42 k42Var) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            zn6 zn6Var = new zn6(this, 24, k42Var);
            x74 context = k42Var.getContext();
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(zn6Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                qt7 qt7Var = (qt7) context.get(wha.w0);
                if (qt7Var != null) {
                    qt7Var.cancel(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            nyi.b(k42Var, new y32(0, scheduledFutureSchedule));
        } else {
            km4.Z.mo14scheduleResumeAfterDelay(j, k42Var);
        }
    }

    @Override // defpackage.z74
    /* renamed from: toString */
    public final String getName() {
        return this.a.toString();
    }

    @Override // defpackage.kj5
    public final Executor w() {
        return this.a;
    }
}
