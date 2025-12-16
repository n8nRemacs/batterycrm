package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableTimeoutTimed.java */
/* loaded from: classes8.dex */
public final class E1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final long f403573c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f403574d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403575e;

    /* renamed from: f, reason: collision with root package name */
    public final C41998x0 f403576f;

    /* compiled from: ObservableTimeoutTimed.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403577b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403578c;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference) {
            this.f403577b = g12;
            this.f403578c = atomicReference;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.c(this.f403578c, dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403577b.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403577b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403577b.onNext(t12);
        }
    }

    /* compiled from: ObservableTimeoutTimed.java */
    public static final class b<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403579b;

        /* renamed from: c, reason: collision with root package name */
        public final long f403580c;

        /* renamed from: d, reason: collision with root package name */
        public final TimeUnit f403581d;

        /* renamed from: e, reason: collision with root package name */
        public final H.c f403582e;

        /* renamed from: f, reason: collision with root package name */
        public final m41.d f403583f = new m41.d();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicLong f403584g = new AtomicLong();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403585h = new AtomicReference<>();

        /* renamed from: i, reason: collision with root package name */
        public C41998x0 f403586i;

        public b(io.reactivex.rxjava3.core.G g12, long j12, TimeUnit timeUnit, H.c cVar, C41998x0 c41998x0) {
            this.f403579b = g12;
            this.f403580c = j12;
            this.f403581d = timeUnit;
            this.f403582e = cVar;
            this.f403586i = c41998x0;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403585h, dVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.E1.d
        public final void c(long j12) {
            if (this.f403584g.compareAndSet(j12, Long.MAX_VALUE)) {
                DisposableHelper.a(this.f403585h);
                C41998x0 c41998x0 = this.f403586i;
                this.f403586i = null;
                c41998x0.c(new a(this.f403579b, this));
                this.f403582e.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f403585h);
            DisposableHelper.a(this);
            this.f403582e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403584g.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                m41.d dVar = this.f403583f;
                dVar.getClass();
                DisposableHelper.a(dVar);
                this.f403579b.e();
                this.f403582e.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403584g.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C47998a.b(th2);
                return;
            }
            m41.d dVar = this.f403583f;
            dVar.getClass();
            DisposableHelper.a(dVar);
            this.f403579b.onError(th2);
            this.f403582e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            AtomicLong atomicLong = this.f403584g;
            long j12 = atomicLong.get();
            if (j12 != Long.MAX_VALUE) {
                long j13 = 1 + j12;
                if (atomicLong.compareAndSet(j12, j13)) {
                    m41.d dVar = this.f403583f;
                    dVar.get().dispose();
                    this.f403579b.onNext(t12);
                    io.reactivex.rxjava3.disposables.d dVarC = this.f403582e.c(new e(j13, this), this.f403580c, this.f403581d);
                    dVar.getClass();
                    DisposableHelper.c(dVar, dVarC);
                }
            }
        }
    }

    /* compiled from: ObservableTimeoutTimed.java */
    public static final class c<T> extends AtomicLong implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403587b;

        /* renamed from: c, reason: collision with root package name */
        public final long f403588c;

        /* renamed from: d, reason: collision with root package name */
        public final TimeUnit f403589d;

        /* renamed from: e, reason: collision with root package name */
        public final H.c f403590e;

        /* renamed from: f, reason: collision with root package name */
        public final m41.d f403591f = new m41.d();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403592g = new AtomicReference<>();

        public c(io.reactivex.rxjava3.core.G<? super T> g12, long j12, TimeUnit timeUnit, H.c cVar) {
            this.f403587b = g12;
            this.f403588c = j12;
            this.f403589d = timeUnit;
            this.f403590e = cVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403592g, dVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.E1.d
        public final void c(long j12) {
            if (compareAndSet(j12, Long.MAX_VALUE)) {
                DisposableHelper.a(this.f403592g);
                this.f403587b.onError(new TimeoutException(io.reactivex.rxjava3.internal.util.h.e(this.f403588c, this.f403589d)));
                this.f403590e.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f403592g);
            this.f403590e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                m41.d dVar = this.f403591f;
                dVar.getClass();
                DisposableHelper.a(dVar);
                this.f403587b.e();
                this.f403590e.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403592g.get());
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                C47998a.b(th2);
                return;
            }
            m41.d dVar = this.f403591f;
            dVar.getClass();
            DisposableHelper.a(dVar);
            this.f403587b.onError(th2);
            this.f403590e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            long j12 = get();
            if (j12 != Long.MAX_VALUE) {
                long j13 = 1 + j12;
                if (compareAndSet(j12, j13)) {
                    m41.d dVar = this.f403591f;
                    dVar.get().dispose();
                    this.f403587b.onNext(t12);
                    io.reactivex.rxjava3.disposables.d dVarC = this.f403590e.c(new e(j13, this), this.f403588c, this.f403589d);
                    dVar.getClass();
                    DisposableHelper.c(dVar, dVarC);
                }
            }
        }
    }

    /* compiled from: ObservableTimeoutTimed.java */
    public interface d {
        void c(long j12);
    }

    /* compiled from: ObservableTimeoutTimed.java */
    public static final class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Object f403593b;

        /* renamed from: c, reason: collision with root package name */
        public final long f403594c;

        public e(long j12, d dVar) {
            this.f403594c = j12;
            this.f403593b = dVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.internal.operators.observable.E1$d, java.lang.Object] */
        @Override // java.lang.Runnable
        public final void run() {
            this.f403593b.c(this.f403594c);
        }
    }

    public E1(io.reactivex.rxjava3.core.z zVar, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12, C41998x0 c41998x0) {
        super(zVar);
        this.f403573c = j12;
        this.f403574d = timeUnit;
        this.f403575e = h12;
        this.f403576f = c41998x0;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        C41998x0 c41998x0 = this.f403576f;
        io.reactivex.rxjava3.core.E<T> e12 = this.f403951b;
        io.reactivex.rxjava3.core.H h12 = this.f403575e;
        if (c41998x0 == null) {
            c cVar = new c(g12, this.f403573c, this.f403574d, h12.b());
            g12.b(cVar);
            io.reactivex.rxjava3.disposables.d dVarC = cVar.f403590e.c(new e(0L, cVar), cVar.f403588c, cVar.f403589d);
            m41.d dVar = cVar.f403591f;
            dVar.getClass();
            DisposableHelper.c(dVar, dVarC);
            e12.c(cVar);
            return;
        }
        b bVar = new b(g12, this.f403573c, this.f403574d, h12.b(), this.f403576f);
        g12.b(bVar);
        io.reactivex.rxjava3.disposables.d dVarC2 = bVar.f403582e.c(new e(0L, bVar), bVar.f403580c, bVar.f403581d);
        m41.d dVar2 = bVar.f403583f;
        dVar2.getClass();
        DisposableHelper.c(dVar2, dVarC2);
        e12.c(bVar);
    }
}
