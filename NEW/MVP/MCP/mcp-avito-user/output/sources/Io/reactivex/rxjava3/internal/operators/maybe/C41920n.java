package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: MaybeDelaySubscriptionOtherPublisher.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41920n<T, U> extends AbstractC41907a<T, T> {

    /* compiled from: MaybeDelaySubscriptionOtherPublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.n$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 706635022205076709L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403281b;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar) {
            this.f403281b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403281b.e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403281b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403281b.onSuccess(t12);
        }
    }

    /* compiled from: MaybeDelaySubscriptionOtherPublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.n$b */
    public static final class b<T> implements InterfaceC41782o<Object>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final a<T> f403282b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.core.w<T> f403283c;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f403284d;

        public b(io.reactivex.rxjava3.core.t<? super T> tVar, io.reactivex.rxjava3.core.w<T> wVar) {
            this.f403282b = new a<>(tVar);
            this.f403283c = wVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403284d, eVar)) {
                this.f403284d = eVar;
                this.f403282b.f403281b.b(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403284d.cancel();
            this.f403284d = SubscriptionHelper.f404813b;
            DisposableHelper.a(this.f403282b);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            org.reactivestreams.e eVar = this.f403284d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar != subscriptionHelper) {
                this.f403284d = subscriptionHelper;
                io.reactivex.rxjava3.core.w<T> wVar = this.f403283c;
                this.f403283c = null;
                wVar.a(this.f403282b);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f403282b.get());
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            org.reactivestreams.e eVar = this.f403284d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar == subscriptionHelper) {
                C47998a.b(th2);
            } else {
                this.f403284d = subscriptionHelper;
                this.f403282b.f403281b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            org.reactivestreams.e eVar = this.f403284d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar != subscriptionHelper) {
                eVar.cancel();
                this.f403284d = subscriptionHelper;
                io.reactivex.rxjava3.core.w<T> wVar = this.f403283c;
                this.f403283c = null;
                wVar.a(this.f403282b);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        new b(tVar, this.f403189b);
        throw null;
    }
}
