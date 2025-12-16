package com.google.common.util.concurrent;

import bZ0.InterfaceC25600a;
import com.google.common.util.concurrent.AbstractC37532c;
import com.google.common.util.concurrent.AbstractC37559p0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MoreExecutors.java */
@InterfaceC37531b0
@XY0.b
/* loaded from: classes6.dex */
public final class Q0 {

    /* compiled from: MoreExecutors.java */
    @XY0.e
    @XY0.d
    @XY0.c
    public static class a {
    }

    /* compiled from: MoreExecutors.java */
    @XY0.c
    @XY0.d
    public static class c extends AbstractC37538f {

        /* renamed from: b, reason: collision with root package name */
        public final ExecutorService f360537b;

        public c(ExecutorService executorService) {
            executorService.getClass();
            this.f360537b = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j12, TimeUnit timeUnit) {
            return this.f360537b.awaitTermination(j12, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f360537b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f360537b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f360537b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f360537b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f360537b.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f360537b + "]";
        }
    }

    public static Executor a() {
        return EnumC37529a0.f360553b;
    }

    @XY0.c
    @XY0.d
    public static H0 b(ExecutorService executorService) {
        if (executorService instanceof H0) {
            return (H0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new d((ScheduledExecutorService) executorService) : new c(executorService);
    }

    /* compiled from: MoreExecutors.java */
    @XY0.d
    @XY0.c
    public static final class d extends c implements I0 {

        /* renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f360538c;

        /* compiled from: MoreExecutors.java */
        public static final class a<V> extends AbstractC37559p0.a<V> implements F0<V> {

            /* renamed from: c, reason: collision with root package name */
            public final ScheduledFuture<?> f360539c;

            public a(AbstractC37532c abstractC37532c, ScheduledFuture scheduledFuture) {
                super(abstractC37532c);
                this.f360539c = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.AbstractFutureC37557o0, java.util.concurrent.Future
            public final boolean cancel(boolean z12) {
                boolean zCancel = super.cancel(z12);
                if (zCancel) {
                    this.f360539c.cancel(z12);
                }
                return zCancel;
            }

            @Override // java.lang.Comparable
            public final int compareTo(Delayed delayed) {
                return this.f360539c.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public final long getDelay(TimeUnit timeUnit) {
                return this.f360539c.getDelay(timeUnit);
            }
        }

        /* compiled from: MoreExecutors.java */
        @XY0.d
        @XY0.c
        public static final class b extends AbstractC37532c.j<Void> implements Runnable {

            /* renamed from: i, reason: collision with root package name */
            public final Runnable f360540i;

            public b(Runnable runnable) {
                runnable.getClass();
                this.f360540i = runnable;
            }

            @Override // com.google.common.util.concurrent.AbstractC37532c
            public final String l() {
                return "task=[" + this.f360540i + "]";
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f360540i.run();
                } catch (Error | RuntimeException e12) {
                    o(e12);
                    throw e12;
                }
            }
        }

        public d(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f360538c = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture schedule(Callable callable, long j12, TimeUnit timeUnit) {
            n1 n1Var = new n1(callable);
            return new a(n1Var, this.f360538c.schedule(n1Var, j12, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f360538c.scheduleAtFixedRate(bVar, j12, j13, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f360538c.scheduleWithFixedDelay(bVar, j12, j13, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture schedule(Runnable runnable, long j12, TimeUnit timeUnit) {
            n1 n1Var = new n1(Executors.callable(runnable, null));
            return new a(n1Var, this.f360538c.schedule(n1Var, j12, timeUnit));
        }
    }

    /* compiled from: MoreExecutors.java */
    @XY0.c
    @XY0.d
    public static final class b extends AbstractC37538f {

        /* renamed from: b, reason: collision with root package name */
        public final Object f360534b;

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC25600a
        public int f360535c;

        /* renamed from: d, reason: collision with root package name */
        @InterfaceC25600a
        public boolean f360536d;

        public b() {
            this.f360534b = new Object();
            this.f360535c = 0;
            this.f360536d = false;
        }

        public final void a() {
            synchronized (this.f360534b) {
                try {
                    int i12 = this.f360535c - 1;
                    this.f360535c = i12;
                    if (i12 == 0) {
                        this.f360534b.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j12, TimeUnit timeUnit) {
            long nanos = timeUnit.toNanos(j12);
            synchronized (this.f360534b) {
                while (true) {
                    try {
                        if (this.f360536d && this.f360535c == 0) {
                            return true;
                        }
                        if (nanos <= 0) {
                            return false;
                        }
                        long jNanoTime = System.nanoTime();
                        TimeUnit.NANOSECONDS.timedWait(this.f360534b, nanos);
                        nanos -= System.nanoTime() - jNanoTime;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.f360534b) {
                if (this.f360536d) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.f360535c++;
            }
            try {
                runnable.run();
            } finally {
                a();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            boolean z12;
            synchronized (this.f360534b) {
                z12 = this.f360536d;
            }
            return z12;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            boolean z12;
            synchronized (this.f360534b) {
                try {
                    z12 = this.f360536d && this.f360535c == 0;
                } finally {
                }
            }
            return z12;
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            synchronized (this.f360534b) {
                try {
                    this.f360536d = true;
                    if (this.f360535c == 0) {
                        this.f360534b.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }

        public /* synthetic */ b(K0 k02) {
            this();
        }
    }
}
