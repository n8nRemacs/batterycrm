package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapSignalSingle.java */
/* loaded from: classes8.dex */
final class t0<T, R> extends io.reactivex.rxjava3.core.I<R> implements io.reactivex.rxjava3.core.P<T, R> {

    /* compiled from: SingleFlatMapSignalSingle.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11347a<R> f398154b;

        /* compiled from: SingleFlatMapSignalSingle.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.t0$a$a, reason: collision with other inner class name */
        public static final class C11347a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.L<? super R> f398155b;

            public C11347a(io.reactivex.rxjava3.core.L<? super R> l12) {
                this.f398155b = l12;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                this.f398155b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(R r12) {
                this.f398155b.onSuccess(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f398154b = new C11347a<>(l12);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11347a<R> c11347a = this.f398154b;
            if (DisposableHelper.f(c11347a.get(), dVar)) {
                c11347a.lazySet(dVar);
                c11347a.f398155b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f398154b);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f398154b.get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f398154b.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398154b.onError(th2);
            }
        }
    }

    public t0() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super R> l12) {
        new a(l12);
        throw null;
    }
}
