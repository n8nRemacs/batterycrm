package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapSignalSingle.java */
/* loaded from: classes8.dex */
final class a0<T, R> extends io.reactivex.rxjava3.core.I<R> implements io.reactivex.rxjava3.core.r<T, io.reactivex.rxjava3.core.I<R>> {

    /* compiled from: MaybeFlatMapSignalSingle.java */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final C11330a<R> f397997b;

        /* compiled from: MaybeFlatMapSignalSingle.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.a0$a$a, reason: collision with other inner class name */
        public static final class C11330a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<R> {
            private static final long serialVersionUID = 314442824941893429L;

            /* renamed from: b, reason: collision with root package name */
            public final io.reactivex.rxjava3.core.L<? super R> f397998b;

            public C11330a(io.reactivex.rxjava3.core.L<? super R> l12) {
                this.f397998b = l12;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                this.f397998b.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(R r12) {
                this.f397998b.onSuccess(r12);
            }
        }

        public a(io.reactivex.rxjava3.core.L l12) {
            this.f397997b = new C11330a<>(l12);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            C11330a<R> c11330a = this.f397997b;
            if (DisposableHelper.f(c11330a.get(), dVar)) {
                c11330a.lazySet(dVar);
                c11330a.f397998b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f397997b);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397997b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f397997b.get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f397997b.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f397997b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super R> l12) {
        new a(l12);
        throw null;
    }
}
