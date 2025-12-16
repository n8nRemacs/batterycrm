package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSampleTimed.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.b1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41937b1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final long f403987c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f403988d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403989e;

    /* compiled from: ObservableSampleTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.b1$a */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41937b1.c
        public final void a() {
            T andSet = getAndSet(null);
            io.reactivex.rxjava3.observers.m mVar = this.f403990b;
            if (andSet != null) {
                mVar.onNext(andSet);
            }
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: ObservableSampleTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.b1$b */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public b() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41937b1.c
        public final void a() {
            this.f403990b.e();
        }

        @Override // java.lang.Runnable
        public final void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f403990b.onNext(andSet);
            }
        }
    }

    /* compiled from: ObservableSampleTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.b1$c */
    public static abstract class c<T> extends AtomicReference<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.observers.m f403990b;

        /* renamed from: c, reason: collision with root package name */
        public final long f403991c;

        /* renamed from: d, reason: collision with root package name */
        public final TimeUnit f403992d;

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.H f403993e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403994f = new AtomicReference<>();

        /* renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403995g;

        public c(io.reactivex.rxjava3.observers.m mVar, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
            this.f403990b = mVar;
            this.f403991c = j12;
            this.f403992d = timeUnit;
            this.f403993e = h12;
        }

        public abstract void a();

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403995g, dVar)) {
                this.f403995g = dVar;
                this.f403990b.b(this);
                TimeUnit timeUnit = this.f403992d;
                io.reactivex.rxjava3.core.H h12 = this.f403993e;
                long j12 = this.f403991c;
                DisposableHelper.c(this.f403994f, h12.f(this, j12, j12, timeUnit));
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f403994f);
            this.f403995g.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            DisposableHelper.a(this.f403994f);
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403995g.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f403994f);
            this.f403990b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            lazySet(t12);
        }
    }

    public C41937b1(io.reactivex.rxjava3.core.z zVar, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        super(zVar);
        this.f403987c = j12;
        this.f403988d = timeUnit;
        this.f403989e = h12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new b(new io.reactivex.rxjava3.observers.m(g12), this.f403987c, this.f403988d, this.f403989e));
    }
}
