package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import s41.C47998a;

/* compiled from: Scheduler.java */
/* loaded from: classes8.dex */
public abstract class H {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f401957b = Boolean.getBoolean("rx3.scheduler.use-nanotime");

    /* renamed from: c, reason: collision with root package name */
    public static final long f401958c;

    /* compiled from: Scheduler.java */
    public static final class a implements io.reactivex.rxjava3.disposables.d, Runnable, io.reactivex.rxjava3.schedulers.a {

        /* renamed from: b, reason: collision with root package name */
        @j41.e
        public final Runnable f401959b;

        /* renamed from: c, reason: collision with root package name */
        @j41.e
        public final c f401960c;

        /* renamed from: d, reason: collision with root package name */
        @j41.f
        public Thread f401961d;

        public a(@j41.e Runnable runnable, @j41.e c cVar) {
            this.f401959b = runnable;
            this.f401960c = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f401961d == Thread.currentThread()) {
                c cVar = this.f401960c;
                if (cVar instanceof io.reactivex.rxjava3.internal.schedulers.i) {
                    io.reactivex.rxjava3.internal.schedulers.i iVar = (io.reactivex.rxjava3.internal.schedulers.i) cVar;
                    if (iVar.f404734c) {
                        return;
                    }
                    iVar.f404734c = true;
                    iVar.f404733b.shutdown();
                    return;
                }
            }
            this.f401960c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f401960c.i();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f401961d = Thread.currentThread();
            try {
                this.f401959b.run();
            } finally {
            }
        }
    }

    /* compiled from: Scheduler.java */
    public static final class b implements io.reactivex.rxjava3.disposables.d, Runnable, io.reactivex.rxjava3.schedulers.a {

        /* renamed from: b, reason: collision with root package name */
        @j41.e
        public final Runnable f401962b;

        /* renamed from: c, reason: collision with root package name */
        @j41.e
        public final c f401963c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f401964d;

        public b(@j41.e Runnable runnable, @j41.e c cVar) {
            this.f401962b = runnable;
            this.f401963c = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f401964d = true;
            this.f401963c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f401964d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f401964d) {
                return;
            }
            try {
                this.f401962b.run();
            } catch (Throwable th2) {
                dispose();
                C47998a.b(th2);
                throw th2;
            }
        }
    }

    /* compiled from: Scheduler.java */
    public static abstract class c implements io.reactivex.rxjava3.disposables.d {

        /* compiled from: Scheduler.java */
        public final class a implements Runnable, io.reactivex.rxjava3.schedulers.a {

            /* renamed from: b, reason: collision with root package name */
            @j41.e
            public final Runnable f401965b;

            /* renamed from: c, reason: collision with root package name */
            @j41.e
            public final m41.d f401966c;

            /* renamed from: d, reason: collision with root package name */
            public final long f401967d;

            /* renamed from: e, reason: collision with root package name */
            public long f401968e;

            /* renamed from: f, reason: collision with root package name */
            public long f401969f;

            /* renamed from: g, reason: collision with root package name */
            public long f401970g;

            public a(long j12, @j41.e Runnable runnable, long j13, @j41.e m41.d dVar, long j14) {
                this.f401965b = runnable;
                this.f401966c = dVar;
                this.f401967d = j14;
                this.f401969f = j13;
                this.f401970g = j12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j12;
                this.f401965b.run();
                m41.d dVar = this.f401966c;
                if (dVar.i()) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                c cVar = c.this;
                long jA2 = cVar.a(timeUnit);
                long j13 = H.f401958c;
                long j14 = jA2 + j13;
                long j15 = this.f401969f;
                long j16 = this.f401967d;
                if (j14 < j15 || jA2 >= j15 + j16 + j13) {
                    j12 = jA2 + j16;
                    long j17 = this.f401968e + 1;
                    this.f401968e = j17;
                    this.f401970g = j12 - (j16 * j17);
                } else {
                    long j18 = this.f401970g;
                    long j19 = this.f401968e + 1;
                    this.f401968e = j19;
                    j12 = (j19 * j16) + j18;
                }
                this.f401969f = jA2;
                DisposableHelper.c(dVar, cVar.c(this, j12 - jA2, timeUnit));
            }
        }

        public long a(@j41.e TimeUnit timeUnit) {
            return H.a(timeUnit);
        }

        @j41.e
        public io.reactivex.rxjava3.disposables.d b(@j41.e Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @j41.e
        public abstract io.reactivex.rxjava3.disposables.d c(@j41.e Runnable runnable, long j12, @j41.e TimeUnit timeUnit);

        @j41.e
        public io.reactivex.rxjava3.disposables.d d(@j41.e Runnable runnable, long j12, long j13, @j41.e TimeUnit timeUnit) {
            m41.d dVar = new m41.d();
            m41.d dVar2 = new m41.d(dVar);
            long nanos = timeUnit.toNanos(j13);
            long jA2 = a(TimeUnit.NANOSECONDS);
            io.reactivex.rxjava3.disposables.d dVarC = c(new a(timeUnit.toNanos(j12) + jA2, runnable, jA2, dVar2, nanos), j12, timeUnit);
            if (dVarC == EmptyDisposable.f401988b) {
                return dVarC;
            }
            DisposableHelper.c(dVar, dVarC);
            return dVar2;
        }
    }

    static {
        long jLongValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        f401958c = "seconds".equalsIgnoreCase(property) ? TimeUnit.SECONDS.toNanos(jLongValue) : "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(jLongValue) : TimeUnit.MINUTES.toNanos(jLongValue);
    }

    public static long a(TimeUnit timeUnit) {
        return !f401957b ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @j41.e
    public abstract c b();

    public long c(@j41.e TimeUnit timeUnit) {
        return a(timeUnit);
    }

    @j41.e
    public io.reactivex.rxjava3.disposables.d d(@j41.e Runnable runnable) {
        return e(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @j41.e
    public io.reactivex.rxjava3.disposables.d e(@j41.e Runnable runnable, long j12, @j41.e TimeUnit timeUnit) {
        c cVarB = b();
        Objects.requireNonNull(runnable, "run is null");
        a aVar = new a(runnable, cVarB);
        cVarB.c(aVar, j12, timeUnit);
        return aVar;
    }

    @j41.e
    public io.reactivex.rxjava3.disposables.d f(@j41.e Runnable runnable, long j12, long j13, @j41.e TimeUnit timeUnit) {
        c cVarB = b();
        b bVar = new b(runnable, cVarB);
        io.reactivex.rxjava3.disposables.d dVarD = cVarB.d(bVar, j12, j13, timeUnit);
        return dVarD == EmptyDisposable.f401988b ? dVarD : bVar;
    }
}
