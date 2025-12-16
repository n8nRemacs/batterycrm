package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ExecutorScheduler.java */
/* loaded from: classes8.dex */
public final class d extends H {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f404682d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f404683e;

    /* renamed from: f, reason: collision with root package name */
    @j41.e
    public final Executor f404684f;

    /* compiled from: ExecutorScheduler.java */
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final b f404685b;

        public a(b bVar) {
            this.f404685b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f404685b;
            m41.d dVar = bVar.f404688c;
            io.reactivex.rxjava3.disposables.d dVarD = d.this.d(bVar);
            dVar.getClass();
            DisposableHelper.c(dVar, dVarD);
        }
    }

    /* compiled from: ExecutorScheduler.java */
    public static final class b extends AtomicReference<Runnable> implements Runnable, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.schedulers.a {
        private static final long serialVersionUID = -4101336210206799084L;

        /* renamed from: b, reason: collision with root package name */
        public final m41.d f404687b;

        /* renamed from: c, reason: collision with root package name */
        public final m41.d f404688c;

        public b(Runnable runnable) {
            super(runnable);
            this.f404687b = new m41.d();
            this.f404688c = new m41.d();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (getAndSet(null) != null) {
                m41.d dVar = this.f404687b;
                dVar.getClass();
                DisposableHelper.a(dVar);
                m41.d dVar2 = this.f404688c;
                dVar2.getClass();
                DisposableHelper.a(dVar2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m41.d dVar = this.f404688c;
            m41.d dVar2 = this.f404687b;
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    try {
                        runnable.run();
                        lazySet(null);
                        dVar2.lazySet(disposableHelper);
                        dVar.lazySet(disposableHelper);
                    } catch (Throwable th2) {
                        lazySet(null);
                        dVar2.lazySet(disposableHelper);
                        dVar.lazySet(disposableHelper);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    C47998a.b(th3);
                    throw th3;
                }
            }
        }
    }

    /* compiled from: ExecutorScheduler.java */
    public static final class c extends H.c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f404689b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f404690c;

        /* renamed from: d, reason: collision with root package name */
        public final Executor f404691d;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f404693f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f404694g = new AtomicInteger();

        /* renamed from: h, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f404695h = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a<Runnable> f404692e = new io.reactivex.rxjava3.internal.queue.a<>();

        /* compiled from: ExecutorScheduler.java */
        public static final class a extends AtomicBoolean implements Runnable, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -2421395018820541164L;

            /* renamed from: b, reason: collision with root package name */
            public final Runnable f404696b;

            public a(Runnable runnable) {
                this.f404696b = runnable;
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                lazySet(true);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return get();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f404696b.run();
                } finally {
                }
            }
        }

        /* compiled from: ExecutorScheduler.java */
        public static final class b extends AtomicInteger implements Runnable, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -3603436687413320876L;

            /* renamed from: b, reason: collision with root package name */
            public final Runnable f404697b;

            /* renamed from: c, reason: collision with root package name */
            public final io.reactivex.rxjava3.disposables.e f404698c;

            /* renamed from: d, reason: collision with root package name */
            public volatile Thread f404699d;

            public b(Runnable runnable, io.reactivex.rxjava3.disposables.e eVar) {
                this.f404697b = runnable;
                this.f404698c = eVar;
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                while (true) {
                    int i12 = get();
                    if (i12 >= 2) {
                        return;
                    }
                    if (i12 == 0) {
                        if (compareAndSet(0, 4)) {
                            io.reactivex.rxjava3.disposables.e eVar = this.f404698c;
                            if (eVar != null) {
                                eVar.c(this);
                                return;
                            }
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f404699d;
                        if (thread != null) {
                            thread.interrupt();
                            this.f404699d = null;
                        }
                        set(4);
                        io.reactivex.rxjava3.disposables.e eVar2 = this.f404698c;
                        if (eVar2 != null) {
                            eVar2.c(this);
                            return;
                        }
                        return;
                    }
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get() == 0) {
                    this.f404699d = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f404699d = null;
                        return;
                    }
                    try {
                        this.f404697b.run();
                        this.f404699d = null;
                        if (!compareAndSet(1, 2)) {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } else {
                            io.reactivex.rxjava3.disposables.e eVar = this.f404698c;
                            if (eVar != null) {
                                eVar.c(this);
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            C47998a.b(th2);
                            throw th2;
                        } catch (Throwable th3) {
                            this.f404699d = null;
                            if (compareAndSet(1, 2)) {
                                io.reactivex.rxjava3.disposables.e eVar2 = this.f404698c;
                                if (eVar2 != null) {
                                    eVar2.c(this);
                                }
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw th3;
                        }
                    }
                }
            }
        }

        /* compiled from: ExecutorScheduler.java */
        /* renamed from: io.reactivex.rxjava3.internal.schedulers.d$c$c, reason: collision with other inner class name */
        public final class RunnableC11517c implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final m41.d f404700b;

            /* renamed from: c, reason: collision with root package name */
            public final Runnable f404701c;

            public RunnableC11517c(m41.d dVar, Runnable runnable) {
                this.f404700b = dVar;
                this.f404701c = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.rxjava3.disposables.d dVarB = c.this.b(this.f404701c);
                m41.d dVar = this.f404700b;
                dVar.getClass();
                DisposableHelper.c(dVar, dVarB);
            }
        }

        public c(Executor executor, boolean z12, boolean z13) {
            this.f404691d = executor;
            this.f404689b = z12;
            this.f404690c = z13;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d b(@j41.e Runnable runnable) {
            io.reactivex.rxjava3.disposables.d aVar;
            boolean z12 = this.f404693f;
            EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
            if (z12) {
                return emptyDisposable;
            }
            Objects.requireNonNull(runnable, "run is null");
            if (this.f404689b) {
                aVar = new b(runnable, this.f404695h);
                this.f404695h.b(aVar);
            } else {
                aVar = new a(runnable);
            }
            this.f404692e.offer(aVar);
            if (this.f404694g.getAndIncrement() == 0) {
                try {
                    this.f404691d.execute(this);
                } catch (RejectedExecutionException e12) {
                    this.f404693f = true;
                    this.f404692e.clear();
                    C47998a.b(e12);
                    return emptyDisposable;
                }
            }
            return aVar;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d c(@j41.e Runnable runnable, long j12, @j41.e TimeUnit timeUnit) {
            if (j12 <= 0) {
                return b(runnable);
            }
            boolean z12 = this.f404693f;
            EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
            if (z12) {
                return emptyDisposable;
            }
            m41.d dVar = new m41.d();
            m41.d dVar2 = new m41.d(dVar);
            Objects.requireNonNull(runnable, "run is null");
            n nVar = new n(new RunnableC11517c(dVar2, runnable), this.f404695h);
            this.f404695h.b(nVar);
            Executor executor = this.f404691d;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    nVar.a(((ScheduledExecutorService) executor).schedule((Callable) nVar, j12, timeUnit));
                } catch (RejectedExecutionException e12) {
                    this.f404693f = true;
                    C47998a.b(e12);
                    return emptyDisposable;
                }
            } else {
                nVar.a(new io.reactivex.rxjava3.internal.schedulers.c(C11518d.f404703a.e(nVar, j12, timeUnit)));
            }
            DisposableHelper.c(dVar, nVar);
            return dVar2;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404693f) {
                return;
            }
            this.f404693f = true;
            this.f404695h.dispose();
            if (this.f404694g.getAndIncrement() == 0) {
                this.f404692e.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404693f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f404690c) {
                io.reactivex.rxjava3.internal.queue.a<Runnable> aVar = this.f404692e;
                if (this.f404693f) {
                    aVar.clear();
                    return;
                }
                aVar.poll().run();
                if (this.f404693f) {
                    aVar.clear();
                    return;
                } else {
                    if (this.f404694g.decrementAndGet() != 0) {
                        this.f404691d.execute(this);
                        return;
                    }
                    return;
                }
            }
            io.reactivex.rxjava3.internal.queue.a<Runnable> aVar2 = this.f404692e;
            int iAddAndGet = 1;
            while (!this.f404693f) {
                do {
                    Runnable runnablePoll = aVar2.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    } else if (this.f404693f) {
                        aVar2.clear();
                        return;
                    } else {
                        iAddAndGet = this.f404694g.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } while (!this.f404693f);
                aVar2.clear();
                return;
            }
            aVar2.clear();
        }
    }

    /* compiled from: ExecutorScheduler.java */
    /* renamed from: io.reactivex.rxjava3.internal.schedulers.d$d, reason: collision with other inner class name */
    public static final class C11518d {

        /* renamed from: a, reason: collision with root package name */
        public static final H f404703a = io.reactivex.rxjava3.schedulers.b.f404941a;
    }

    public d(@j41.e Executor executor, boolean z12, boolean z13) {
        this.f404684f = executor;
        this.f404682d = z12;
        this.f404683e = z13;
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final H.c b() {
        return new c(this.f404684f, this.f404682d, this.f404683e);
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d d(@j41.e Runnable runnable) {
        Executor executor = this.f404684f;
        Objects.requireNonNull(runnable, "run is null");
        try {
            boolean z12 = executor instanceof ExecutorService;
            boolean z13 = this.f404682d;
            if (z12) {
                m mVar = new m(runnable, z13);
                mVar.a(((ExecutorService) executor).submit(mVar));
                return mVar;
            }
            if (z13) {
                c.b bVar = new c.b(runnable, null);
                executor.execute(bVar);
                return bVar;
            }
            c.a aVar = new c.a(runnable);
            executor.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e12) {
            C47998a.b(e12);
            return EmptyDisposable.f401988b;
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d e(@j41.e Runnable runnable, long j12, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Executor executor = this.f404684f;
        if (executor instanceof ScheduledExecutorService) {
            try {
                m mVar = new m(runnable, this.f404682d);
                mVar.a(((ScheduledExecutorService) executor).schedule(mVar, j12, timeUnit));
                return mVar;
            } catch (RejectedExecutionException e12) {
                C47998a.b(e12);
                return EmptyDisposable.f401988b;
            }
        }
        b bVar = new b(runnable);
        io.reactivex.rxjava3.disposables.d dVarE = C11518d.f404703a.e(new a(bVar), j12, timeUnit);
        m41.d dVar = bVar.f404687b;
        dVar.getClass();
        DisposableHelper.c(dVar, dVarE);
        return bVar;
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d f(@j41.e Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
        Executor executor = this.f404684f;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.f(runnable, j12, j13, timeUnit);
        }
        try {
            l lVar = new l(runnable, this.f404682d);
            lVar.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(lVar, j12, j13, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e12) {
            C47998a.b(e12);
            return EmptyDisposable.f401988b;
        }
    }
}
