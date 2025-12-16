package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableThrottleLatest.java */
/* loaded from: classes8.dex */
public final class B1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final long f403512c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f403513d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403514e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f403515f;

    /* compiled from: ObservableThrottleLatest.java */
    public static final class a<T> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403516b;

        /* renamed from: c, reason: collision with root package name */
        public final long f403517c;

        /* renamed from: d, reason: collision with root package name */
        public final TimeUnit f403518d;

        /* renamed from: e, reason: collision with root package name */
        public final H.c f403519e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f403520f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<T> f403521g = new AtomicReference<>();

        /* renamed from: h, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403522h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403523i;

        /* renamed from: j, reason: collision with root package name */
        public Throwable f403524j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f403525k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f403526l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f403527m;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, long j12, TimeUnit timeUnit, H.c cVar, boolean z12) {
            this.f403516b = g12;
            this.f403517c = j12;
            this.f403518d = timeUnit;
            this.f403519e = cVar;
            this.f403520f = z12;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f403521g;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403516b;
            int iAddAndGet = 1;
            while (!this.f403525k) {
                boolean z12 = this.f403523i;
                if (z12 && this.f403524j != null) {
                    atomicReference.lazySet(null);
                    g12.onError(this.f403524j);
                    this.f403519e.dispose();
                    return;
                }
                boolean z13 = atomicReference.get() == null;
                if (z12) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z13 && this.f403520f) {
                        g12.onNext(andSet);
                    }
                    g12.e();
                    this.f403519e.dispose();
                    return;
                }
                if (z13) {
                    if (this.f403526l) {
                        this.f403527m = false;
                        this.f403526l = false;
                    }
                } else if (!this.f403527m || this.f403526l) {
                    g12.onNext(atomicReference.getAndSet(null));
                    this.f403526l = false;
                    this.f403527m = true;
                    this.f403519e.c(this, this.f403517c, this.f403518d);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403522h, dVar)) {
                this.f403522h = dVar;
                this.f403516b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403525k = true;
            this.f403522h.dispose();
            this.f403519e.dispose();
            if (getAndIncrement() == 0) {
                this.f403521g.lazySet(null);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403523i = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403525k;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403524j = th2;
            this.f403523i = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403521g.set(t12);
            a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f403526l = true;
            a();
        }
    }

    public B1(io.reactivex.rxjava3.core.z zVar, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        super(zVar);
        this.f403512c = j12;
        this.f403513d = timeUnit;
        this.f403514e = h12;
        this.f403515f = true;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403512c, this.f403513d, this.f403514e.b(), this.f403515f));
    }
}
