package hu.akarnokd.rxjava3.schedulers;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import l41.InterfaceC43543a;

/* compiled from: BlockingScheduler.java */
/* loaded from: classes8.dex */
public final class a extends H {

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue<InterfaceC43543a> f398223d = new ConcurrentLinkedQueue<>();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f398224e;

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantLock f398225f;

    /* renamed from: g, reason: collision with root package name */
    public final Condition f398226g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f398227h;

    /* renamed from: i, reason: collision with root package name */
    public final H f398228i;

    /* compiled from: BlockingScheduler.java */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m41.d f398229b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f398230c;

        public b(m41.d dVar, c cVar) {
            this.f398229b = dVar;
            this.f398230c = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m41.d dVar = this.f398229b;
            dVar.getClass();
            c cVar = this.f398230c;
            DisposableHelper.c(dVar, cVar);
            a.this.g(cVar);
        }
    }

    /* compiled from: BlockingScheduler.java */
    public final class c extends AtomicInteger implements InterfaceC43543a, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -9165914884456950194L;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f398232b;

        public c(Runnable runnable) {
            this.f398232b = runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            do {
                int i12 = get();
                if (i12 >= 2) {
                    return;
                }
                if (i12 == 0 && compareAndSet(0, 5)) {
                    return;
                }
            } while (!compareAndSet(1, 2));
            a.this.getClass();
            set(3);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() >= 2;
        }

        @Override // l41.InterfaceC43543a
        public final void run() {
            try {
                if (compareAndSet(0, 1)) {
                    try {
                        this.f398232b.run();
                        compareAndSet(1, 4);
                    } catch (Throwable th2) {
                        compareAndSet(1, 4);
                        throw th2;
                    }
                }
                while (get() == 2) {
                }
                if (get() == 3) {
                    Thread.interrupted();
                }
            } catch (Throwable th3) {
                while (get() == 2) {
                }
                if (get() == 3) {
                    Thread.interrupted();
                }
                throw th3;
            }
        }
    }

    /* compiled from: BlockingScheduler.java */
    public final class d extends H.c {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f398234b = new io.reactivex.rxjava3.disposables.c();

        /* compiled from: BlockingScheduler.java */
        /* renamed from: hu.akarnokd.rxjava3.schedulers.a$d$a, reason: collision with other inner class name */
        public class RunnableC11352a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m41.d f398236b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f398237c;

            public RunnableC11352a(m41.d dVar, b bVar) {
                this.f398236b = dVar;
                this.f398237c = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                m41.d dVar = this.f398236b;
                dVar.getClass();
                b bVar = this.f398237c;
                DisposableHelper.c(dVar, bVar);
                a.this.g(bVar);
            }
        }

        /* compiled from: BlockingScheduler.java */
        public final class b extends AtomicInteger implements InterfaceC43543a, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -9165914884456950194L;

            /* renamed from: b, reason: collision with root package name */
            public final Runnable f398239b;

            public b(Runnable runnable) {
                this.f398239b = runnable;
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                d dVar;
                while (true) {
                    int i12 = get();
                    if (i12 < 2) {
                        dVar = d.this;
                        if (i12 == 0 && compareAndSet(0, 5)) {
                            break;
                        }
                        if (compareAndSet(1, 2)) {
                            a.this.getClass();
                            set(3);
                            break;
                        }
                    } else {
                        return;
                    }
                }
                dVar.f398234b.a(this);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return get() >= 2;
            }

            @Override // l41.InterfaceC43543a
            public final void run() {
                d dVar = d.this;
                try {
                    if (compareAndSet(0, 1)) {
                        try {
                            this.f398239b.run();
                            compareAndSet(1, 4);
                            dVar.f398234b.a(this);
                        } catch (Throwable th2) {
                            compareAndSet(1, 4);
                            dVar.f398234b.a(this);
                            throw th2;
                        }
                    }
                    while (get() == 2) {
                    }
                    if (get() == 3) {
                        Thread.interrupted();
                    }
                } catch (Throwable th3) {
                    while (get() == 2) {
                    }
                    if (get() == 3) {
                        Thread.interrupted();
                    }
                    throw th3;
                }
            }
        }

        public d() {
        }

        @Override // io.reactivex.rxjava3.core.H.c
        public final io.reactivex.rxjava3.disposables.d c(Runnable runnable, long j12, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run is null");
            Objects.requireNonNull(timeUnit, "unit is null");
            boolean z12 = a.this.f398227h.get();
            EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
            if (z12 || this.f398234b.f401978c) {
                return emptyDisposable;
            }
            b bVar = new b(runnable);
            this.f398234b.b(bVar);
            if (j12 == 0) {
                a.this.g(bVar);
                return bVar;
            }
            m41.d dVar = new m41.d();
            m41.d dVar2 = new m41.d(dVar);
            io.reactivex.rxjava3.disposables.d dVarE = a.this.f398228i.e(new RunnableC11352a(dVar2, bVar), j12, timeUnit);
            if (dVarE == emptyDisposable) {
                return dVarE;
            }
            DisposableHelper.c(dVar, dVarE);
            return dVar2;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398234b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398234b.f401978c;
        }
    }

    static {
        new C11351a();
    }

    public a() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f398225f = reentrantLock;
        this.f398226g = reentrantLock.newCondition();
        new AtomicBoolean();
        this.f398227h = new AtomicBoolean();
        this.f398224e = new AtomicLong();
        this.f398228i = io.reactivex.rxjava3.schedulers.b.f404941a;
    }

    @Override // io.reactivex.rxjava3.core.H
    public final H.c b() {
        return new d();
    }

    @Override // io.reactivex.rxjava3.core.H
    public final io.reactivex.rxjava3.disposables.d e(Runnable runnable, long j12, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        boolean z12 = this.f398227h.get();
        EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
        if (z12) {
            return emptyDisposable;
        }
        c cVar = new c(runnable);
        if (j12 == 0) {
            g(cVar);
            return cVar;
        }
        m41.d dVar = new m41.d();
        m41.d dVar2 = new m41.d(dVar);
        io.reactivex.rxjava3.disposables.d dVarE = this.f398228i.e(new b(dVar2, cVar), j12, timeUnit);
        if (dVarE == emptyDisposable) {
            return dVarE;
        }
        DisposableHelper.c(dVar, dVarE);
        return dVar2;
    }

    public final void g(InterfaceC43543a interfaceC43543a) {
        this.f398223d.offer(interfaceC43543a);
        if (this.f398224e.getAndIncrement() == 0) {
            ReentrantLock reentrantLock = this.f398225f;
            reentrantLock.lock();
            try {
                this.f398226g.signal();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* compiled from: BlockingScheduler.java */
    /* renamed from: hu.akarnokd.rxjava3.schedulers.a$a, reason: collision with other inner class name */
    public static class C11351a implements InterfaceC43543a {
        @Override // l41.InterfaceC43543a
        public final void run() {
        }
    }
}
