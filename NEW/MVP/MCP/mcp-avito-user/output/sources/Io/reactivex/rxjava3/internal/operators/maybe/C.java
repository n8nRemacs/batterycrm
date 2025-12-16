package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapBiSelector.java */
/* loaded from: classes8.dex */
public final class C<T, U, R> extends AbstractC41907a<T, R> {

    /* compiled from: MaybeFlatMapBiSelector.java */
    public static final class a<T, U, R> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11466a<T, U, R> f403134b;

        /* compiled from: MaybeFlatMapBiSelector.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.C$a$a, reason: collision with other inner class name */
        public static final class C11466a<T, U, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<U> {
            private static final long serialVersionUID = -2897979525538174559L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.t<? super R> f403135b;

            /* renamed from: c, reason: collision with root package name */
            public T f403136c;

            public C11466a(io.reactivex.rxjava3.core.t tVar) {
                this.f403135b = tVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                this.f403135b.e();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                this.f403135b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(U u12) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    this.f403135b.onError(th2);
                }
            }
        }

        public a(io.reactivex.rxjava3.core.t tVar) {
            this.f403134b = new C11466a<>(tVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11466a<T, U, R> c11466a = this.f403134b;
            if (DisposableHelper.e(c11466a, dVar)) {
                c11466a.f403135b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f403134b);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403134b.f403135b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403134b.get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403134b.f403135b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403134b.f403135b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        this.f403189b.a(new a(tVar));
    }
}
