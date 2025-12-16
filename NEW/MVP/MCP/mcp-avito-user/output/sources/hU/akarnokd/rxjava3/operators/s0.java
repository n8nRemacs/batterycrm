package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapSignalObservable.java */
/* loaded from: classes8.dex */
final class s0<T, R> extends io.reactivex.rxjava3.core.z<R> implements io.reactivex.rxjava3.core.J<T, io.reactivex.rxjava3.core.z<R>> {

    /* compiled from: SingleFlatMapSignalObservable.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11346a<R> f398137b;

        /* compiled from: SingleFlatMapSignalObservable.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.s0$a$a, reason: collision with other inner class name */
        public static final class C11346a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.G<? super R> f398138b;

            public C11346a(io.reactivex.rxjava3.core.G<? super R> g12) {
                this.f398138b = g12;
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void e() {
                this.f398138b.e();
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onError(Throwable th2) {
                this.f398138b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.G
            public final void onNext(R r12) {
                this.f398138b.onNext(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f398137b = new C11346a<>(g12);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11346a<R> c11346a = this.f398137b;
            if (DisposableHelper.f(c11346a.get(), dVar)) {
                c11346a.lazySet(dVar);
                c11346a.f398138b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f398137b);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f398137b.get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f398137b.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398137b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        new a(g12);
        throw null;
    }
}
