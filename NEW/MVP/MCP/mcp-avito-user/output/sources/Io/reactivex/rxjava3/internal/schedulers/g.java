package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: IoScheduler.java */
/* loaded from: classes8.dex */
public final class g extends H {

    /* renamed from: e, reason: collision with root package name */
    public static final k f404712e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f404713f;

    /* renamed from: i, reason: collision with root package name */
    public static final c f404716i;

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f404717j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f404718k;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<a> f404719d;

    /* renamed from: h, reason: collision with root package name */
    public static final TimeUnit f404715h = TimeUnit.SECONDS;

    /* renamed from: g, reason: collision with root package name */
    public static final long f404714g = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    /* compiled from: IoScheduler.java */
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final long f404720b;

        /* renamed from: c, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f404721c;

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f404722d;

        /* renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f404723e;

        /* renamed from: f, reason: collision with root package name */
        public final ScheduledFuture f404724f;

        /* renamed from: g, reason: collision with root package name */
        public final k f404725g;

        public a(long j12, TimeUnit timeUnit, k kVar) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j12) : 0L;
            this.f404720b = nanos;
            this.f404721c = new ConcurrentLinkedQueue<>();
            this.f404722d = new io.reactivex.rxjava3.disposables.c();
            this.f404725g = kVar;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, g.f404713f);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f404723e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f404724f = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.f404721c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            Iterator<c> it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.f404730d > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(next)) {
                    this.f404722d.a(next);
                }
            }
        }
    }

    /* compiled from: IoScheduler.java */
    public static final class b extends H.c implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        public final a f404727c;

        /* renamed from: d, reason: collision with root package name */
        public final c f404728d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f404729e = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f404726b = new io.reactivex.rxjava3.disposables.c();

        public b(a aVar) {
            c cVar;
            c cVar2;
            this.f404727c = aVar;
            if (aVar.f404722d.f401978c) {
                cVar2 = g.f404716i;
            } else {
                while (true) {
                    if (aVar.f404721c.isEmpty()) {
                        cVar = new c(aVar.f404725g);
                        aVar.f404722d.b(cVar);
                        break;
                    } else {
                        cVar = aVar.f404721c.poll();
                        if (cVar != null) {
                            break;
                        }
                    }
                }
                cVar2 = cVar;
            }
            this.f404728d = cVar2;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d c(@j41.e Runnable runnable, long j12, @j41.e TimeUnit timeUnit) {
            return this.f404726b.f401978c ? EmptyDisposable.f401988b : this.f404728d.e(runnable, j12, timeUnit, this.f404726b);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404729e.compareAndSet(false, true)) {
                this.f404726b.dispose();
                if (g.f404717j) {
                    this.f404728d.e(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                a aVar = this.f404727c;
                aVar.getClass();
                long jNanoTime = System.nanoTime() + aVar.f404720b;
                c cVar = this.f404728d;
                cVar.f404730d = jNanoTime;
                aVar.f404721c.offer(cVar);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404729e.get();
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = this.f404727c;
            aVar.getClass();
            long jNanoTime = System.nanoTime() + aVar.f404720b;
            c cVar = this.f404728d;
            cVar.f404730d = jNanoTime;
            aVar.f404721c.offer(cVar);
        }
    }

    /* compiled from: IoScheduler.java */
    public static final class c extends i {

        /* renamed from: d, reason: collision with root package name */
        public long f404730d;

        public c(k kVar) {
            super(kVar);
            this.f404730d = 0L;
        }
    }

    static {
        c cVar = new c(new k("RxCachedThreadSchedulerShutdown"));
        f404716i = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        k kVar = new k("RxCachedThreadScheduler", iMax, false);
        f404712e = kVar;
        f404713f = new k("RxCachedWorkerPoolEvictor", iMax, false);
        f404717j = Boolean.getBoolean("rx3.io-scheduled-release");
        a aVar = new a(0L, null, kVar);
        f404718k = aVar;
        aVar.f404722d.dispose();
        ScheduledFuture scheduledFuture = aVar.f404724f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f404723e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public g() {
        AtomicReference<a> atomicReference;
        k kVar = f404712e;
        a aVar = f404718k;
        this.f404719d = new AtomicReference<>(aVar);
        a aVar2 = new a(f404714g, f404715h, kVar);
        do {
            atomicReference = this.f404719d;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                return;
            }
        } while (atomicReference.get() == aVar);
        aVar2.f404722d.dispose();
        ScheduledFuture scheduledFuture = aVar2.f404724f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar2.f404723e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final H.c b() {
        return new b(this.f404719d.get());
    }
}
