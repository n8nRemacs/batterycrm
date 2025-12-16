package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C43234d;

/* compiled from: Executors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/z0;", "Lkotlinx/coroutines/y0;", "Lkotlinx/coroutines/c0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.z0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43315z0 extends AbstractC43313y0 implements InterfaceC43082c0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Executor f412305c;

    public C43315z0(@Y61.k Executor executor) {
        Method method;
        this.f412305c = executor;
        Method method2 = C43234d.f411893a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = C43234d.f411893a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    public static void B(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        Q0.b(coroutineContext, C43311x0.a("The task was rejected", rejectedExecutionException));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f412305c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof C43315z0) && ((C43315z0) obj).f412305c == this.f412305c;
    }

    @Override // kotlinx.coroutines.InterfaceC43082c0
    public final void f(long j12, @Y61.k r rVar) {
        Executor executor = this.f412305c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new m1(this, rVar), j12, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e12) {
                B(rVar.f411960f, e12);
            }
        }
        if (scheduledFutureSchedule != null) {
            rVar.s(new C43265n(scheduledFutureSchedule));
        } else {
            Y.f410745j.f(j12, rVar);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC43082c0
    @Y61.k
    public final InterfaceC43268o0 g(long j12, @Y61.k Runnable runnable, @Y61.k CoroutineContext coroutineContext) {
        Executor executor = this.f412305c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j12, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e12) {
                B(coroutineContext, e12);
            }
        }
        return scheduledFutureSchedule != null ? new C43266n0(scheduledFutureSchedule) : Y.f410745j.g(j12, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        try {
            this.f412305c.execute(runnable);
        } catch (RejectedExecutionException e12) {
            B(coroutineContext, e12);
            C43262l0.f411947c.h(coroutineContext, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f412305c);
    }

    @Override // kotlinx.coroutines.M
    @Y61.k
    public final String toString() {
        return this.f412305c.toString();
    }

    @Override // kotlinx.coroutines.AbstractC43313y0
    @Y61.k
    /* renamed from: y, reason: from getter */
    public final Executor getF412305c() {
        return this.f412305c;
    }
}
