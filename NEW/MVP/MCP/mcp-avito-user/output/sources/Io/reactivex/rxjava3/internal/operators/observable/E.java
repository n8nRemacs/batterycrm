package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableDebounceTimed.java */
/* loaded from: classes8.dex */
public final class E<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final long f403551c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f403552d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403553e;

    /* compiled from: ObservableDebounceTimed.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements Runnable, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: b, reason: collision with root package name */
        public final T f403554b;

        /* renamed from: c, reason: collision with root package name */
        public final long f403555c;

        /* renamed from: d, reason: collision with root package name */
        public final b<T> f403556d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f403557e = new AtomicBoolean();

        public a(T t12, long j12, b<T> bVar) {
            this.f403554b = t12;
            this.f403555c = j12;
            this.f403556d = bVar;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == DisposableHelper.f401986b;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f403557e.compareAndSet(false, true)) {
                b<T> bVar = this.f403556d;
                long j12 = this.f403555c;
                T t12 = this.f403554b;
                if (j12 == bVar.f403564h) {
                    bVar.f403558b.onNext(t12);
                    DisposableHelper.a(this);
                }
            }
        }
    }

    /* compiled from: ObservableDebounceTimed.java */
    public static final class b<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.observers.m f403558b;

        /* renamed from: c, reason: collision with root package name */
        public final long f403559c;

        /* renamed from: d, reason: collision with root package name */
        public final TimeUnit f403560d;

        /* renamed from: e, reason: collision with root package name */
        public final H.c f403561e;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403562f;

        /* renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403563g;

        /* renamed from: h, reason: collision with root package name */
        public volatile long f403564h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f403565i;

        public b(io.reactivex.rxjava3.observers.m mVar, long j12, TimeUnit timeUnit, H.c cVar) {
            this.f403558b = mVar;
            this.f403559c = j12;
            this.f403560d = timeUnit;
            this.f403561e = cVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403562f, dVar)) {
                this.f403562f = dVar;
                this.f403558b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403562f.dispose();
            this.f403561e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403565i) {
                return;
            }
            this.f403565i = true;
            io.reactivex.rxjava3.disposables.d dVar = this.f403563g;
            if (dVar != null) {
                DisposableHelper.a((a) dVar);
            }
            a aVar = (a) dVar;
            if (aVar != null) {
                aVar.run();
            }
            this.f403558b.e();
            this.f403561e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403561e.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403565i) {
                C47998a.b(th2);
                return;
            }
            io.reactivex.rxjava3.disposables.d dVar = this.f403563g;
            if (dVar != null) {
                DisposableHelper.a((a) dVar);
            }
            this.f403565i = true;
            this.f403558b.onError(th2);
            this.f403561e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403565i) {
                return;
            }
            long j12 = this.f403564h + 1;
            this.f403564h = j12;
            io.reactivex.rxjava3.disposables.d dVar = this.f403563g;
            if (dVar != null) {
                DisposableHelper.a((a) dVar);
            }
            a aVar = new a(t12, j12, this);
            this.f403563g = aVar;
            DisposableHelper.c(aVar, this.f403561e.c(aVar, this.f403559c, this.f403560d));
        }
    }

    public E(io.reactivex.rxjava3.core.z zVar, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        super(zVar);
        this.f403551c = j12;
        this.f403552d = timeUnit;
        this.f403553e = h12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new b(new io.reactivex.rxjava3.observers.m(g12), this.f403551c, this.f403552d, this.f403553e.b()));
    }
}
