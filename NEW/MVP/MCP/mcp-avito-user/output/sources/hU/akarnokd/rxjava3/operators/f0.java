package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapDrop.java */
/* loaded from: classes8.dex */
final class f0<T, R> extends io.reactivex.rxjava3.core.z<R> implements io.reactivex.rxjava3.core.F<T, R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z<T> f398028b;

    /* compiled from: ObservableFlatMapDrop.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f398029b;

        /* renamed from: c, reason: collision with root package name */
        public final a<T, R>.C11337a f398030c = new C11337a();

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f398031d = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f398032e = new AtomicInteger(1);

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f398033f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f398034g;

        /* compiled from: ObservableFlatMapDrop.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.f0$a$a, reason: collision with other inner class name */
        public final class C11337a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<R> {
            private static final long serialVersionUID = -3707363807296094399L;

            public C11337a() {
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                a.this.a();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                a aVar = a.this;
                if (aVar.f398031d.b(th2)) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(R r12) {
                a.this.f398029b.onNext(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f398029b = g12;
        }

        public final void a() {
            this.f398034g = false;
            if (this.f398032e.decrementAndGet() == 0) {
                this.f398031d.e(this.f398029b);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f398033f, dVar)) {
                this.f398033f = dVar;
                this.f398029b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398033f.dispose();
            DisposableHelper.a(this.f398030c);
            this.f398031d.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f398032e.decrementAndGet() == 0) {
                this.f398031d.e(this.f398029b);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398033f.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f398031d.b(th2)) {
                e();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f398034g) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398033f.dispose();
                onError(th2);
            }
        }
    }

    public f0(io.reactivex.rxjava3.core.z zVar) {
        this.f398028b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.F
    public final io.reactivex.rxjava3.core.E<R> a(io.reactivex.rxjava3.core.z<T> zVar) {
        return new f0(zVar);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f398028b.c(new a(g12));
    }
}
