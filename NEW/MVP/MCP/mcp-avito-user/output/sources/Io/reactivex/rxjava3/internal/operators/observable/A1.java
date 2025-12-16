package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableThrottleFirstTimed.java */
/* loaded from: classes8.dex */
public final class A1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final long f403499c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f403500d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403501e;

    /* compiled from: ObservableThrottleFirstTimed.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.observers.m f403502b;

        /* renamed from: c, reason: collision with root package name */
        public final long f403503c;

        /* renamed from: d, reason: collision with root package name */
        public final TimeUnit f403504d;

        /* renamed from: e, reason: collision with root package name */
        public final H.c f403505e;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403506f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f403507g;

        public a(io.reactivex.rxjava3.observers.m mVar, long j12, TimeUnit timeUnit, H.c cVar) {
            this.f403502b = mVar;
            this.f403503c = j12;
            this.f403504d = timeUnit;
            this.f403505e = cVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403506f, dVar)) {
                this.f403506f = dVar;
                this.f403502b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403506f.dispose();
            this.f403505e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403502b.e();
            this.f403505e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403505e.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403502b.onError(th2);
            this.f403505e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403507g) {
                return;
            }
            this.f403507g = true;
            this.f403502b.onNext(t12);
            io.reactivex.rxjava3.disposables.d dVar = get();
            if (dVar != null) {
                dVar.dispose();
            }
            DisposableHelper.c(this, this.f403505e.c(this, this.f403503c, this.f403504d));
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f403507g = false;
        }
    }

    public A1(io.reactivex.rxjava3.core.z zVar, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        super(zVar);
        this.f403499c = j12;
        this.f403500d = timeUnit;
        this.f403501e = h12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(new io.reactivex.rxjava3.observers.m(g12), this.f403499c, this.f403500d, this.f403501e.b()));
    }
}
