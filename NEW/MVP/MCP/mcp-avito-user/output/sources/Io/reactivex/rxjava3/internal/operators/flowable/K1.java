package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableTakeLastOne.java */
/* loaded from: classes8.dex */
public final class K1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableTakeLastOne.java */
    public static final class a<T> extends o41.f<T> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -5467847744262967226L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402401d;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402401d, eVar)) {
                this.f402401d = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f402401d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            T t12 = this.f419377c;
            if (t12 != null) {
                l(t12);
            } else {
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f419377c = null;
            this.f419376b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a(dVar));
    }
}
