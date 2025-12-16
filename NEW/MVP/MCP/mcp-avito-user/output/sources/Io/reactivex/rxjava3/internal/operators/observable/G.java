package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* compiled from: ObservableDelay.java */
/* loaded from: classes8.dex */
public final class G<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final long f403610c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f403611d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403612e;

    /* compiled from: ObservableDelay.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403613b;

        /* renamed from: c, reason: collision with root package name */
        public final long f403614c;

        /* renamed from: d, reason: collision with root package name */
        public final TimeUnit f403615d;

        /* renamed from: e, reason: collision with root package name */
        public final H.c f403616e;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403617f;

        /* compiled from: ObservableDelay.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.G$a$a, reason: collision with other inner class name */
        public final class RunnableC11490a implements Runnable {
            public RunnableC11490a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                H.c cVar = aVar.f403616e;
                try {
                    aVar.f403613b.e();
                } finally {
                    cVar.dispose();
                }
            }
        }

        /* compiled from: ObservableDelay.java */
        public final class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final Throwable f403619b;

            public b(Throwable th2) {
                this.f403619b = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    aVar.f403613b.onError(this.f403619b);
                } finally {
                    aVar.f403616e.dispose();
                }
            }
        }

        /* compiled from: ObservableDelay.java */
        public final class c implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final T f403621b;

            public c(T t12) {
                this.f403621b = t12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f403613b.onNext(this.f403621b);
            }
        }

        public a(io.reactivex.rxjava3.core.G g12, long j12, TimeUnit timeUnit, H.c cVar) {
            this.f403613b = g12;
            this.f403614c = j12;
            this.f403615d = timeUnit;
            this.f403616e = cVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403617f, dVar)) {
                this.f403617f = dVar;
                this.f403613b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403617f.dispose();
            this.f403616e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403616e.c(new RunnableC11490a(), this.f403614c, this.f403615d);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403616e.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403616e.c(new b(th2), 0L, this.f403615d);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403616e.c(new c(t12), this.f403614c, this.f403615d);
        }
    }

    public G(io.reactivex.rxjava3.core.z zVar, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        super(zVar);
        this.f403610c = j12;
        this.f403611d = timeUnit;
        this.f403612e = h12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        io.reactivex.rxjava3.observers.m mVar = new io.reactivex.rxjava3.observers.m(g12);
        H.c cVarB = this.f403612e.b();
        this.f403951b.c(new a(mVar, this.f403610c, this.f403611d, cVarB));
    }
}
