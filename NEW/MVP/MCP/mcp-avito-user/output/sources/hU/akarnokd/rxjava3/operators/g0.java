package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapLatest.java */
/* loaded from: classes8.dex */
final class g0<T, R> extends io.reactivex.rxjava3.core.z<R> implements io.reactivex.rxjava3.core.F<T, R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z<T> f398038b;

    /* compiled from: ObservableFlatMapLatest.java */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1251911925259779985L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f398039b;

        /* renamed from: c, reason: collision with root package name */
        public final a<T, R>.C11339a f398040c = new C11339a();

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f398041d = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<T> f398042e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f398043f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f398044g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f398045h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f398046i;

        /* compiled from: ObservableFlatMapLatest.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.g0$a$a, reason: collision with other inner class name */
        public final class C11339a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<R> {
            private static final long serialVersionUID = -3707363807296094399L;

            public C11339a() {
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                a.this.c();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                a aVar = a.this;
                if (aVar.f398041d.b(th2)) {
                    aVar.c();
                }
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(R r12) {
                a.this.f398039b.onNext(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f398039b = g12;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f398046i) {
                if (!this.f398044g) {
                    boolean z12 = this.f398045h;
                    T andSet = this.f398042e.getAndSet(null);
                    if (z12 && andSet == null) {
                        this.f398041d.e(this.f398039b);
                        return;
                    }
                    if (andSet != null) {
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            this.f398043f.dispose();
                            this.f398041d.b(th2);
                            this.f398041d.e(this.f398039b);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f398042e.lazySet(null);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f398043f, dVar)) {
                this.f398043f = dVar;
                this.f398039b.b(this);
            }
        }

        public final void c() {
            this.f398044g = false;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398046i = true;
            this.f398043f.dispose();
            DisposableHelper.a(this.f398040c);
            this.f398041d.c();
            if (getAndIncrement() == 0) {
                this.f398042e.lazySet(null);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f398045h = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398046i;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f398041d.b(th2)) {
                e();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f398042e.set(t12);
            a();
        }
    }

    public g0(io.reactivex.rxjava3.core.z zVar) {
        this.f398038b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.F
    public final io.reactivex.rxjava3.core.E<R> a(io.reactivex.rxjava3.core.z<T> zVar) {
        return new g0(zVar);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f398038b.c(new a(g12));
    }
}
