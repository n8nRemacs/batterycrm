package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import s41.C47998a;

/* compiled from: TrampolineScheduler.java */
/* loaded from: classes8.dex */
public final class s extends H {

    /* renamed from: d, reason: collision with root package name */
    public static final s f404755d = new s();

    /* compiled from: TrampolineScheduler.java */
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f404756b;

        /* renamed from: c, reason: collision with root package name */
        public final c f404757c;

        /* renamed from: d, reason: collision with root package name */
        public final long f404758d;

        public a(Runnable runnable, c cVar, long j12) {
            this.f404756b = runnable;
            this.f404757c = cVar;
            this.f404758d = j12;
        }

        @Override // java.lang.Runnable
        public final void run() throws InterruptedException {
            if (this.f404757c.f404766e) {
                return;
            }
            c cVar = this.f404757c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cVar.getClass();
            long jA2 = H.a(timeUnit);
            long j12 = this.f404758d;
            if (j12 > jA2) {
                try {
                    Thread.sleep(j12 - jA2);
                } catch (InterruptedException e12) {
                    Thread.currentThread().interrupt();
                    C47998a.b(e12);
                    return;
                }
            }
            if (this.f404757c.f404766e) {
                return;
            }
            this.f404756b.run();
        }
    }

    /* compiled from: TrampolineScheduler.java */
    public static final class b implements Comparable<b> {

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f404759b;

        /* renamed from: c, reason: collision with root package name */
        public final long f404760c;

        /* renamed from: d, reason: collision with root package name */
        public final int f404761d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404762e;

        public b(Runnable runnable, Long l12, int i12) {
            this.f404759b = runnable;
            this.f404760c = l12.longValue();
            this.f404761d = i12;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            int iCompare = Long.compare(this.f404760c, bVar2.f404760c);
            return iCompare == 0 ? Integer.compare(this.f404761d, bVar2.f404761d) : iCompare;
        }
    }

    /* compiled from: TrampolineScheduler.java */
    public static final class c extends H.c implements io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f404763b = new PriorityBlockingQueue<>();

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f404764c = new AtomicInteger();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f404765d = new AtomicInteger();

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404766e;

        /* compiled from: TrampolineScheduler.java */
        public final class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final b f404767b;

            public a(b bVar) {
                this.f404767b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f404767b.f404762e = true;
                c.this.f404763b.remove(this.f404767b);
            }
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d b(@j41.e Runnable runnable) {
            return e(H.a(TimeUnit.MILLISECONDS), runnable);
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @j41.e
        public final io.reactivex.rxjava3.disposables.d c(@j41.e Runnable runnable, long j12, @j41.e TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j12) + H.a(TimeUnit.MILLISECONDS);
            return e(millis, new a(runnable, this, millis));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404766e = true;
        }

        public final io.reactivex.rxjava3.disposables.d e(long j12, Runnable runnable) {
            boolean z12 = this.f404766e;
            EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
            if (z12) {
                return emptyDisposable;
            }
            b bVar = new b(runnable, Long.valueOf(j12), this.f404765d.incrementAndGet());
            this.f404763b.add(bVar);
            if (this.f404764c.getAndIncrement() != 0) {
                return io.reactivex.rxjava3.disposables.d.E(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f404766e) {
                b bVarPoll = this.f404763b.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f404764c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return emptyDisposable;
                    }
                } else if (!bVarPoll.f404762e) {
                    bVarPoll.f404759b.run();
                }
            }
            this.f404763b.clear();
            return emptyDisposable;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404766e;
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final H.c b() {
        return new c();
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d d(@j41.e Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        runnable.run();
        return EmptyDisposable.f401988b;
    }

    @Override // io.reactivex.rxjava3.core.H
    @j41.e
    public final io.reactivex.rxjava3.disposables.d e(@j41.e Runnable runnable, long j12, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j12);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e12) {
            Thread.currentThread().interrupt();
            C47998a.b(e12);
        }
        return EmptyDisposable.f401988b;
    }
}
