package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapSignalMaybe.java */
/* loaded from: classes8.dex */
final class Y<T, R> extends io.reactivex.rxjava3.core.q<R> implements io.reactivex.rxjava3.core.x<T, R> {

    /* compiled from: MaybeFlatMapSignalMaybe.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11328a<R> f397993b;

        /* compiled from: MaybeFlatMapSignalMaybe.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.Y$a$a, reason: collision with other inner class name */
        public static final class C11328a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.t<? super R> f397994b;

            public C11328a(io.reactivex.rxjava3.core.t<? super R> tVar) {
                this.f397994b = tVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                this.f397994b.e();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                this.f397994b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(R r12) {
                this.f397994b.onSuccess(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.t tVar) {
            this.f397993b = new C11328a<>(tVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11328a<R> c11328a = this.f397993b;
            if (DisposableHelper.f(c11328a.get(), dVar)) {
                c11328a.lazySet(dVar);
                c11328a.f397994b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f397993b);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397993b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f397993b.get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f397993b.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397993b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super R> tVar) {
        new a(tVar);
        throw null;
    }
}
