package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeDelayOtherPublisher.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41919m<T, U> extends AbstractC41907a<T, T> {

    /* compiled from: MaybeDelayOtherPublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.m$a */
    public static final class a<T, U> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final b<T> f403275b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403276c;

        public a(io.reactivex.rxjava3.core.t tVar) {
            this.f403275b = new b<>(tVar);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403276c, dVar)) {
                this.f403276c = dVar;
                this.f403275b.f403277b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403276c.dispose();
            this.f403276c = DisposableHelper.f401986b;
            SubscriptionHelper.a(this.f403275b);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403276c = DisposableHelper.f401986b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403275b.get() == SubscriptionHelper.f404813b;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403276c = DisposableHelper.f401986b;
            this.f403275b.f403279d = th2;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403276c = DisposableHelper.f401986b;
            this.f403275b.f403278c = t12;
            throw null;
        }
    }

    /* compiled from: MaybeDelayOtherPublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.m$b */
    public static final class b<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object> {
        private static final long serialVersionUID = -1215060610805418006L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403277b;

        /* renamed from: c, reason: collision with root package name */
        public T f403278c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f403279d;

        public b(io.reactivex.rxjava3.core.t<? super T> tVar) {
            this.f403277b = tVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            Throwable th2 = this.f403279d;
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403277b;
            if (th2 != null) {
                tVar.onError(th2);
                return;
            }
            T t12 = this.f403278c;
            if (t12 != null) {
                tVar.onSuccess(t12);
            } else {
                tVar.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            Throwable th3 = this.f403279d;
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403277b;
            if (th3 == null) {
                tVar.onError(th2);
            } else {
                tVar.onError(new CompositeException(th3, th2));
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            org.reactivestreams.e eVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                eVar.cancel();
                e();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar));
    }
}
