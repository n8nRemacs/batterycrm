package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: MaybeTakeUntilPublisher.java */
/* loaded from: classes8.dex */
public final class l0<T, U> extends AbstractC41907a<T, T> {

    /* compiled from: MaybeTakeUntilPublisher.java */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2187421758664251153L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403272b;

        /* renamed from: c, reason: collision with root package name */
        public final C11473a<U> f403273c = new C11473a<>(this);

        /* compiled from: MaybeTakeUntilPublisher.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.l0$a$a, reason: collision with other inner class name */
        public static final class C11473a<U> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, U> f403274b;

            public C11473a(a<?, U> aVar) {
                this.f403274b = aVar;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a<?, U> aVar = this.f403274b;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.f403272b.e();
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a<?, U> aVar = this.f403274b;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.f403272b.onError(th2);
                } else {
                    C47998a.b(th2);
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                SubscriptionHelper.a(this);
                a<?, U> aVar = this.f403274b;
                aVar.getClass();
                if (DisposableHelper.a(aVar)) {
                    aVar.f403272b.e();
                }
            }
        }

        public a(io.reactivex.rxjava3.core.t<? super T> tVar) {
            this.f403272b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            SubscriptionHelper.a(this.f403273c);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            SubscriptionHelper.a(this.f403273c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403272b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            SubscriptionHelper.a(this.f403273c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403272b.onError(th2);
            } else {
                C47998a.b(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            SubscriptionHelper.a(this.f403273c);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f403272b.onSuccess(t12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        tVar.b(new a(tVar));
        throw null;
    }
}
