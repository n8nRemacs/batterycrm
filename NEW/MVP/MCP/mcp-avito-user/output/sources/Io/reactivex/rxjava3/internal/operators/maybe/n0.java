package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: MaybeTimeoutMaybe.java */
/* loaded from: classes8.dex */
public final class n0<T, U> extends AbstractC41907a<T, T> {

    /* compiled from: MaybeTimeoutMaybe.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            throw null;
        }
    }

    /* compiled from: MaybeTimeoutMaybe.java */
    public static final class b<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5955289211445418871L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403285b;

        /* renamed from: c, reason: collision with root package name */
        public final c<T, U> f403286c = new c<>(this);

        /* renamed from: d, reason: collision with root package name */
        public final a<T> f403287d = null;

        public b(io.reactivex.rxjava3.core.t tVar) {
            this.f403285b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            DisposableHelper.a(this.f403286c);
            a<T> aVar = this.f403287d;
            if (aVar != null) {
                DisposableHelper.a(aVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            DisposableHelper.a(this.f403286c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403285b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f403286c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403285b.onError(th2);
            } else {
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            DisposableHelper.a(this.f403286c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403285b.onSuccess(t12);
            }
        }
    }

    /* compiled from: MaybeTimeoutMaybe.java */
    public static final class c<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: b, reason: collision with root package name */
        public final b<T, U> f403288b;

        public c(b<T, U> bVar) {
            this.f403288b = bVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            b<T, U> bVar = this.f403288b;
            bVar.getClass();
            if (DisposableHelper.a(bVar)) {
                bVar.f403285b.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            b<T, U> bVar = this.f403288b;
            bVar.getClass();
            if (DisposableHelper.a(bVar)) {
                bVar.f403285b.onError(th2);
            } else {
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(Object obj) {
            b<T, U> bVar = this.f403288b;
            bVar.getClass();
            if (DisposableHelper.a(bVar)) {
                bVar.f403285b.onError(new TimeoutException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        tVar.b(new b(tVar));
        throw null;
    }
}
