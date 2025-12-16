package hu.akarnokd.rxjava3.schedulers;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.disposables.e;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SharedScheduler.java */
/* loaded from: classes8.dex */
public final class c extends H {

    /* renamed from: d, reason: collision with root package name */
    public final H.c f398259d;

    /* compiled from: SharedScheduler.java */
    public static final class a extends H.c {

        /* renamed from: b, reason: collision with root package name */
        public final H.c f398260b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f398261c = new io.reactivex.rxjava3.disposables.c();

        /* compiled from: SharedScheduler.java */
        /* renamed from: hu.akarnokd.rxjava3.schedulers.c$a$a, reason: collision with other inner class name */
        public static final class RunnableC11355a extends AtomicReference<e> implements Runnable, d {
            private static final long serialVersionUID = 4949851341419870956L;

            /* renamed from: b, reason: collision with root package name */
            public final AtomicReference<d> f398262b;

            /* renamed from: c, reason: collision with root package name */
            public final Runnable f398263c;

            public RunnableC11355a(Runnable runnable, e eVar) {
                this.f398263c = runnable;
                lazySet(eVar);
                this.f398262b = new AtomicReference<>();
            }

            public final void a() {
                e eVar = get();
                if (eVar != null && compareAndSet(eVar, null)) {
                    eVar.c(this);
                }
                while (true) {
                    AtomicReference<d> atomicReference = this.f398262b;
                    d dVar = atomicReference.get();
                    if (dVar != DisposableHelper.f401986b) {
                        while (!atomicReference.compareAndSet(dVar, this)) {
                            if (atomicReference.get() != dVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                e andSet = getAndSet(null);
                if (andSet != null) {
                    andSet.c(this);
                }
                DisposableHelper.a(this.f398262b);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return get() == null;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f398263c.run();
                } finally {
                    a();
                }
            }
        }

        public a(H.c cVar) {
            this.f398260b = cVar;
        }

        @Override // io.reactivex.rxjava3.core.H.c
        public final long a(TimeUnit timeUnit) {
            return this.f398260b.a(timeUnit);
        }

        @Override // io.reactivex.rxjava3.core.H.c
        public final d c(Runnable runnable, long j12, TimeUnit timeUnit) {
            if (this.f398261c.f401978c || this.f398260b.getF318621e()) {
                return EmptyDisposable.f401988b;
            }
            RunnableC11355a runnableC11355a = new RunnableC11355a(runnable, this.f398261c);
            this.f398261c.b(runnableC11355a);
            d dVarB = j12 <= 0 ? this.f398260b.b(runnableC11355a) : this.f398260b.c(runnableC11355a, j12, timeUnit);
            AtomicReference<d> atomicReference = runnableC11355a.f398262b;
            d dVar = atomicReference.get();
            if (dVar != runnableC11355a) {
                DisposableHelper disposableHelper = DisposableHelper.f401986b;
                if (dVar != disposableHelper) {
                    while (true) {
                        if (atomicReference.compareAndSet(dVar, dVarB)) {
                            break;
                        }
                        if (atomicReference.get() != dVar) {
                            if (atomicReference.get() == disposableHelper) {
                                dVarB.dispose();
                            }
                        }
                    }
                } else {
                    dVarB.dispose();
                }
            }
            return runnableC11355a;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398261c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398261c.f401978c;
        }
    }

    public c(H h12) {
        this.f398259d = h12.b();
    }

    @Override // io.reactivex.rxjava3.core.H
    public final H.c b() {
        return new a(this.f398259d);
    }

    @Override // io.reactivex.rxjava3.core.H
    public final long c(TimeUnit timeUnit) {
        return this.f398259d.a(timeUnit);
    }

    @Override // io.reactivex.rxjava3.core.H
    public final d d(Runnable runnable) {
        return this.f398259d.b(runnable);
    }

    @Override // io.reactivex.rxjava3.core.H
    public final d e(Runnable runnable, long j12, TimeUnit timeUnit) {
        return this.f398259d.c(runnable, j12, timeUnit);
    }

    @Override // io.reactivex.rxjava3.core.H
    public final d f(Runnable runnable, long j12, long j13, TimeUnit timeUnit) {
        return this.f398259d.d(runnable, j12, j13, timeUnit);
    }

    public final void g() {
        this.f398259d.dispose();
    }
}
