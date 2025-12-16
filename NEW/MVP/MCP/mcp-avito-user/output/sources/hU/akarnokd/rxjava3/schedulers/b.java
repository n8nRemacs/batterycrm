package hu.akarnokd.rxjava3.schedulers;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.disposables.e;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.schedulers.k;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ParallelScheduler.java */
/* loaded from: classes8.dex */
public final class b extends H {

    /* renamed from: i, reason: collision with root package name */
    public static final ScheduledExecutorService[] f398241i = new ScheduledExecutorService[0];

    /* renamed from: j, reason: collision with root package name */
    public static final ScheduledExecutorService f398242j;

    /* renamed from: d, reason: collision with root package name */
    public final k f398243d;

    /* renamed from: e, reason: collision with root package name */
    public final int f398244e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f398245f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService[]> f398246g;

    /* renamed from: h, reason: collision with root package name */
    public int f398247h;

    /* compiled from: ParallelScheduler.java */
    public static final class a extends H.c {

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f398248b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f398249c;

        /* compiled from: ParallelScheduler.java */
        /* renamed from: hu.akarnokd.rxjava3.schedulers.b$a$a, reason: collision with other inner class name */
        public final class CallableC11353a implements Callable<Object>, d {

            /* renamed from: b, reason: collision with root package name */
            public final Runnable f398250b;

            /* renamed from: c, reason: collision with root package name */
            public volatile boolean f398251c;

            public CallableC11353a(Runnable runnable) {
                this.f398250b = runnable;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (this.f398251c || a.this.f398249c) {
                    return null;
                }
                try {
                    this.f398250b.run();
                    return null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                    return null;
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                this.f398251c = true;
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return this.f398251c;
            }
        }

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f398248b = scheduledExecutorService;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        public final d b(Runnable runnable) {
            if (!this.f398249c) {
                try {
                    Objects.requireNonNull(runnable, "run is null");
                    CallableC11353a callableC11353a = new CallableC11353a(runnable);
                    this.f398248b.submit(callableC11353a);
                    return callableC11353a;
                } catch (RejectedExecutionException unused) {
                }
            }
            return EmptyDisposable.f401988b;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        public final d c(Runnable runnable, long j12, TimeUnit timeUnit) {
            if (!this.f398249c) {
                try {
                    Objects.requireNonNull(runnable, "run is null");
                    CallableC11353a callableC11353a = new CallableC11353a(runnable);
                    this.f398248b.schedule(callableC11353a, j12, timeUnit);
                    return callableC11353a;
                } catch (RejectedExecutionException unused) {
                }
            }
            return EmptyDisposable.f401988b;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398249c = true;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398249c;
        }
    }

    /* compiled from: ParallelScheduler.java */
    /* renamed from: hu.akarnokd.rxjava3.schedulers.b$b, reason: collision with other inner class name */
    public static final class C11354b extends H.c {

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f398253b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f398254c = new io.reactivex.rxjava3.disposables.c();

        /* compiled from: ParallelScheduler.java */
        /* renamed from: hu.akarnokd.rxjava3.schedulers.b$b$a */
        public static final class a extends AtomicReference<e> implements Callable<Object>, d {

            /* renamed from: d, reason: collision with root package name */
            public static final FutureTask f398255d;

            /* renamed from: e, reason: collision with root package name */
            public static final FutureTask f398256e;
            private static final long serialVersionUID = 4949851341419870956L;

            /* renamed from: b, reason: collision with root package name */
            public final AtomicReference<Future<?>> f398257b;

            /* renamed from: c, reason: collision with root package name */
            public final Runnable f398258c;

            static {
                Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
                FutureTask futureTask = new FutureTask(runnable, null);
                f398255d = futureTask;
                futureTask.cancel(false);
                FutureTask futureTask2 = new FutureTask(runnable, null);
                f398256e = futureTask2;
                futureTask2.cancel(false);
            }

            public a(Runnable runnable, e eVar) {
                this.f398258c = runnable;
                lazySet(eVar);
                this.f398257b = new AtomicReference<>();
            }

            public final void a(Future<?> future) {
                AtomicReference<Future<?>> atomicReference = this.f398257b;
                Future<?> future2 = atomicReference.get();
                if (future2 != f398255d) {
                    FutureTask futureTask = f398256e;
                    if (future2 == futureTask) {
                        future.cancel(true);
                        return;
                    }
                    while (!atomicReference.compareAndSet(future2, future)) {
                        if (atomicReference.get() != future2) {
                            if (atomicReference.get() == futureTask) {
                                future.cancel(true);
                                return;
                            }
                            return;
                        }
                    }
                }
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    this.f398258c.run();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
                e eVar = get();
                if (eVar != null && compareAndSet(eVar, null)) {
                    eVar.c(this);
                }
                loop0: while (true) {
                    AtomicReference<Future<?>> atomicReference = this.f398257b;
                    Future<?> future = atomicReference.get();
                    if (future == f398256e) {
                        break;
                    }
                    FutureTask futureTask = f398255d;
                    while (!atomicReference.compareAndSet(future, futureTask)) {
                        if (atomicReference.get() != future) {
                            break;
                        }
                    }
                    break loop0;
                }
                return null;
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                FutureTask futureTask;
                Future<?> andSet;
                e andSet2 = getAndSet(null);
                if (andSet2 != null) {
                    andSet2.c(this);
                }
                AtomicReference<Future<?>> atomicReference = this.f398257b;
                Future<?> future = atomicReference.get();
                FutureTask futureTask2 = f398255d;
                if (future == futureTask2 || future == (futureTask = f398256e) || (andSet = atomicReference.getAndSet(futureTask)) == null || andSet == futureTask2 || andSet == futureTask) {
                    return;
                }
                andSet.cancel(true);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return get() == null;
            }
        }

        public C11354b(ScheduledExecutorService scheduledExecutorService) {
            this.f398253b = scheduledExecutorService;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        public final d b(Runnable runnable) {
            if (!this.f398254c.f401978c) {
                Objects.requireNonNull(runnable, "run is null");
                a aVar = new a(runnable, this.f398254c);
                if (this.f398254c.b(aVar)) {
                    try {
                        aVar.a(this.f398253b.submit(aVar));
                        return aVar;
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
            return EmptyDisposable.f401988b;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        public final d c(Runnable runnable, long j12, TimeUnit timeUnit) {
            if (!this.f398254c.f401978c) {
                Objects.requireNonNull(runnable, "run is null");
                a aVar = new a(runnable, this.f398254c);
                if (this.f398254c.b(aVar)) {
                    try {
                        aVar.a(this.f398253b.schedule(aVar, j12, timeUnit));
                        return aVar;
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
            return EmptyDisposable.f401988b;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398254c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398254c.f401978c;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        f398242j = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdownNow();
    }

    public b() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        k kVar = new k("RxParallelScheduler", 5, false);
        if (iAvailableProcessors <= 0) {
            throw new IllegalArgumentException(AK.c.g(iAvailableProcessors, "parallelism > 0 required but it was "));
        }
        this.f398244e = iAvailableProcessors;
        this.f398243d = kVar;
        this.f398245f = true;
        ScheduledExecutorService[] scheduledExecutorServiceArr2 = f398241i;
        this.f398246g = new AtomicReference<>(scheduledExecutorServiceArr2);
        ScheduledExecutorService[] scheduledExecutorServiceArr3 = null;
        while (true) {
            AtomicReference<ScheduledExecutorService[]> atomicReference = this.f398246g;
            ScheduledExecutorService[] scheduledExecutorServiceArr4 = atomicReference.get();
            if (scheduledExecutorServiceArr4 != scheduledExecutorServiceArr2) {
                if (scheduledExecutorServiceArr3 != null) {
                    for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr3) {
                        scheduledExecutorService.shutdownNow();
                    }
                    return;
                }
                return;
            }
            if (scheduledExecutorServiceArr3 == null) {
                int i12 = this.f398244e;
                scheduledExecutorServiceArr = new ScheduledExecutorService[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    scheduledExecutorServiceArr[i13] = Executors.newSingleThreadScheduledExecutor(this.f398243d);
                }
            } else {
                scheduledExecutorServiceArr = scheduledExecutorServiceArr3;
            }
            while (!atomicReference.compareAndSet(scheduledExecutorServiceArr4, scheduledExecutorServiceArr)) {
                if (atomicReference.get() != scheduledExecutorServiceArr4) {
                    break;
                }
            }
            return;
            scheduledExecutorServiceArr3 = scheduledExecutorServiceArr;
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    public final H.c b() {
        return this.f398245f ? new C11354b(g()) : new a(g());
    }

    @Override // io.reactivex.rxjava3.core.H
    public final d d(Runnable runnable) {
        ScheduledExecutorService scheduledExecutorServiceG = g();
        ScheduledExecutorService scheduledExecutorService = f398242j;
        EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
        if (scheduledExecutorServiceG == scheduledExecutorService) {
            return emptyDisposable;
        }
        try {
            Objects.requireNonNull(runnable, "run is null");
            return d.O(scheduledExecutorServiceG.submit(runnable));
        } catch (RejectedExecutionException unused) {
            return emptyDisposable;
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    public final d e(Runnable runnable, long j12, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorServiceG = g();
        ScheduledExecutorService scheduledExecutorService = f398242j;
        EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
        if (scheduledExecutorServiceG == scheduledExecutorService) {
            return emptyDisposable;
        }
        try {
            Objects.requireNonNull(runnable, "run is null");
            return d.O(scheduledExecutorServiceG.schedule(runnable, j12, timeUnit));
        } catch (RejectedExecutionException unused) {
            return emptyDisposable;
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    public final d f(Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorServiceG = g();
        EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
        if (scheduledExecutorServiceG == f398242j) {
            return emptyDisposable;
        }
        try {
            return d.O(scheduledExecutorServiceG.scheduleAtFixedRate(runnable, j12, j13, timeUnit));
        } catch (RejectedExecutionException unused) {
            return emptyDisposable;
        }
    }

    public final ScheduledExecutorService g() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = this.f398246g.get();
        if (scheduledExecutorServiceArr.length == 0) {
            return f398242j;
        }
        int i12 = this.f398247h;
        if (i12 >= this.f398244e) {
            i12 = 0;
        }
        this.f398247h = i12 + 1;
        return scheduledExecutorServiceArr[i12];
    }
}
