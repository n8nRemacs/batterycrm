package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import j41.e;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: TestScheduler.java */
/* loaded from: classes8.dex */
public final class c extends H {

    /* renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f404950d = new PriorityBlockingQueue(11);

    /* renamed from: e, reason: collision with root package name */
    public long f404951e;

    /* compiled from: TestScheduler.java */
    public final class a extends H.c {

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f404952b;

        /* compiled from: TestScheduler.java */
        /* renamed from: io.reactivex.rxjava3.schedulers.c$a$a, reason: collision with other inner class name */
        public final class C11524a extends AtomicReference<b> implements io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -7874968252110604360L;

            public C11524a(b bVar) {
                lazySet(bVar);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                b andSet = getAndSet(null);
                if (andSet != null) {
                    c.this.f404950d.remove(andSet);
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return get() == null;
            }
        }

        public a() {
        }

        @Override // io.reactivex.rxjava3.core.H.c
        public final long a(@e TimeUnit timeUnit) {
            return c.this.c(timeUnit);
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @e
        public final io.reactivex.rxjava3.disposables.d b(@e Runnable runnable) {
            if (this.f404952b) {
                return EmptyDisposable.f401988b;
            }
            c.this.getClass();
            c cVar = c.this;
            long j12 = cVar.f404951e;
            cVar.f404951e = 1 + j12;
            b bVar = new b(runnable, 0L, j12);
            cVar.f404950d.add(bVar);
            return new C11524a(bVar);
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @e
        public final io.reactivex.rxjava3.disposables.d c(@e Runnable runnable, long j12, @e TimeUnit timeUnit) {
            if (this.f404952b) {
                return EmptyDisposable.f401988b;
            }
            c.this.getClass();
            c.this.getClass();
            long nanos = timeUnit.toNanos(j12);
            c cVar = c.this;
            long j13 = cVar.f404951e;
            cVar.f404951e = 1 + j13;
            b bVar = new b(runnable, nanos, j13);
            cVar.f404950d.add(bVar);
            return new C11524a(bVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404952b = true;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404952b;
        }
    }

    /* compiled from: TestScheduler.java */
    public static final class b implements Comparable<b> {

        /* renamed from: b, reason: collision with root package name */
        public final long f404955b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f404956c;

        /* renamed from: d, reason: collision with root package name */
        public final long f404957d;

        public b(Runnable runnable, long j12, long j13) {
            this.f404955b = j12;
            this.f404956c = runnable;
            this.f404957d = j13;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            long j12 = bVar2.f404955b;
            long j13 = this.f404955b;
            return j13 == j12 ? Long.compare(this.f404957d, bVar2.f404957d) : Long.compare(j13, j12);
        }

        public final String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f404955b), this.f404956c.toString());
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    @e
    public final H.c b() {
        return new a();
    }

    @Override // io.reactivex.rxjava3.core.H
    public final long c(@e TimeUnit timeUnit) {
        return timeUnit.convert(0L, TimeUnit.NANOSECONDS);
    }
}
