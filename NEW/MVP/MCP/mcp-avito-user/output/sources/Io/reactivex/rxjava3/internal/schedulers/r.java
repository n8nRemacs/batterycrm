package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SingleScheduler.java */
/* loaded from: classes8.dex */
public final class r extends H {

    /* renamed from: e, reason: collision with root package name */
    public static final k f404749e;

    /* renamed from: f, reason: collision with root package name */
    public static final ScheduledExecutorService f404750f;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f404751d;

    /* compiled from: SingleScheduler.java */
    public static final class a extends H.c {

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f404752b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f404753c = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f404754d;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f404752b = scheduledExecutorService;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d c(@j41.e Runnable runnable, long j12, @j41.e TimeUnit timeUnit) {
            boolean z12 = this.f404754d;
            EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
            if (z12) {
                return emptyDisposable;
            }
            Objects.requireNonNull(runnable, "run is null");
            n nVar = new n(runnable, this.f404753c);
            this.f404753c.b(nVar);
            try {
                nVar.a(j12 <= 0 ? this.f404752b.submit((Callable) nVar) : this.f404752b.schedule((Callable) nVar, j12, timeUnit));
                return nVar;
            } catch (RejectedExecutionException e12) {
                dispose();
                C47998a.b(e12);
                return emptyDisposable;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404754d) {
                return;
            }
            this.f404754d = true;
            this.f404753c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404754d;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f404750f = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f404749e = new k("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public r() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f404751d = atomicReference;
        boolean z12 = p.f404743a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f404749e);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(p.f404743a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final H.c b() {
        return new a(this.f404751d.get());
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d e(@j41.e Runnable runnable, long j12, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        m mVar = new m(runnable, true);
        AtomicReference<ScheduledExecutorService> atomicReference = this.f404751d;
        try {
            mVar.a(j12 <= 0 ? atomicReference.get().submit(mVar) : atomicReference.get().schedule(mVar, j12, timeUnit));
            return mVar;
        } catch (RejectedExecutionException e12) {
            C47998a.b(e12);
            return EmptyDisposable.f401988b;
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d f(@j41.e Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
        EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
        AtomicReference<ScheduledExecutorService> atomicReference = this.f404751d;
        if (j13 > 0) {
            l lVar = new l(runnable, true);
            try {
                lVar.a(atomicReference.get().scheduleAtFixedRate(lVar, j12, j13, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e12) {
                C47998a.b(e12);
                return emptyDisposable;
            }
        }
        ScheduledExecutorService scheduledExecutorService = atomicReference.get();
        f fVar = new f(runnable, scheduledExecutorService);
        try {
            fVar.a(j12 <= 0 ? scheduledExecutorService.submit(fVar) : scheduledExecutorService.schedule(fVar, j12, timeUnit));
            return fVar;
        } catch (RejectedExecutionException e13) {
            C47998a.b(e13);
            return emptyDisposable;
        }
    }
}
