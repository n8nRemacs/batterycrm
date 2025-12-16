package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapSignalMaybe.java */
/* loaded from: classes8.dex */
final class r0<T, R> extends io.reactivex.rxjava3.core.q<R> implements io.reactivex.rxjava3.core.J<T, io.reactivex.rxjava3.core.q<R>> {

    /* compiled from: SingleFlatMapSignalMaybe.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11345a<R> f398135b;

        /* compiled from: SingleFlatMapSignalMaybe.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.r0$a$a, reason: collision with other inner class name */
        public static final class C11345a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.t<? super R> f398136b;

            public C11345a(io.reactivex.rxjava3.core.t<? super R> tVar) {
                this.f398136b = tVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                this.f398136b.e();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                this.f398136b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(R r12) {
                this.f398136b.onSuccess(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.t tVar) {
            this.f398135b = new C11345a<>(tVar);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11345a<R> c11345a = this.f398135b;
            if (DisposableHelper.f(c11345a.get(), dVar)) {
                c11345a.lazySet(dVar);
                c11345a.f398136b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f398135b);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f398135b.get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f398135b.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398135b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        new a(tVar);
        throw null;
    }
}
