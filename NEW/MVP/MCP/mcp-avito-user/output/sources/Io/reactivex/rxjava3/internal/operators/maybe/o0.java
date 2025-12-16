package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: MaybeTimeoutPublisher.java */
/* loaded from: classes8.dex */
public final class o0<T, U> extends AbstractC41907a<T, T> {

    /* compiled from: MaybeTimeoutPublisher.java */
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

    /* compiled from: MaybeTimeoutPublisher.java */
    public static final class b<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5955289211445418871L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403295b;

        /* renamed from: c, reason: collision with root package name */
        public final c<T, U> f403296c = new c<>(this);

        /* renamed from: d, reason: collision with root package name */
        public final a<T> f403297d = null;

        public b(io.reactivex.rxjava3.core.t tVar) {
            this.f403295b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            SubscriptionHelper.a(this.f403296c);
            a<T> aVar = this.f403297d;
            if (aVar != null) {
                DisposableHelper.a(aVar);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            SubscriptionHelper.a(this.f403296c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403295b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            SubscriptionHelper.a(this.f403296c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403295b.onError(th2);
            } else {
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            SubscriptionHelper.a(this.f403296c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403295b.onSuccess(t12);
            }
        }
    }

    /* compiled from: MaybeTimeoutPublisher.java */
    public static final class c<T, U> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: b, reason: collision with root package name */
        public final b<T, U> f403298b;

        public c(b<T, U> bVar) {
            this.f403298b = bVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            b<T, U> bVar = this.f403298b;
            bVar.getClass();
            if (DisposableHelper.a(bVar)) {
                bVar.f403295b.onError(new TimeoutException());
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            b<T, U> bVar = this.f403298b;
            bVar.getClass();
            if (DisposableHelper.a(bVar)) {
                bVar.f403295b.onError(th2);
            } else {
                C47998a.b(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            get().cancel();
            b<T, U> bVar = this.f403298b;
            bVar.getClass();
            if (DisposableHelper.a(bVar)) {
                bVar.f403295b.onError(new TimeoutException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        tVar.b(new b(tVar));
        throw null;
    }
}
