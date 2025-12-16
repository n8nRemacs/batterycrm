package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SingleTakeUntil.java */
/* loaded from: classes8.dex */
public final class X<T, U> extends io.reactivex.rxjava3.core.I<T> {

    /* compiled from: SingleTakeUntil.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -622603812305745221L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404539b;

        /* renamed from: c, reason: collision with root package name */
        public final b f404540c = new b(this);

        public a(io.reactivex.rxjava3.core.L<? super T> l12) {
            this.f404539b = l12;
        }

        public final void a(Throwable th2) {
            io.reactivex.rxjava3.disposables.d andSet;
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                C47998a.b(th2);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.f404539b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            b bVar = this.f404540c;
            bVar.getClass();
            SubscriptionHelper.a(bVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            b bVar = this.f404540c;
            bVar.getClass();
            SubscriptionHelper.a(bVar);
            io.reactivex.rxjava3.disposables.d dVar = get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                C47998a.b(th2);
            } else {
                this.f404539b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            b bVar = this.f404540c;
            bVar.getClass();
            SubscriptionHelper.a(bVar);
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f404539b.onSuccess(t12);
            }
        }
    }

    /* compiled from: SingleTakeUntil.java */
    public static final class b extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object> {
        private static final long serialVersionUID = 5170026210238877381L;

        /* renamed from: b, reason: collision with root package name */
        public final a<?> f404541b;

        public b(a<?> aVar) {
            this.f404541b = aVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            org.reactivestreams.e eVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f404541b.a(new CancellationException());
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f404541b.a(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            if (SubscriptionHelper.a(this)) {
                this.f404541b.a(new CancellationException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        l12.b(new a(l12));
        throw null;
    }
}
