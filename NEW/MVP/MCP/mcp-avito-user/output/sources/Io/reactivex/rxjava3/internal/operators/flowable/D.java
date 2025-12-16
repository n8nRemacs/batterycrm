package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableCount.java */
/* loaded from: classes8.dex */
public final class D<T> extends AbstractC41833b<T, Long> {

    /* compiled from: FlowableCount.java */
    public static final class a extends o41.f<Long> implements InterfaceC41782o<Object> {
        private static final long serialVersionUID = 4973004223787171406L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402301d;

        /* renamed from: e, reason: collision with root package name */
        public long f402302e;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402301d, eVar)) {
                this.f402301d = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f402301d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            l(Long.valueOf(this.f402302e));
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f419376b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            this.f402302e++;
        }
    }

    public D() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Long> dVar) {
        this.f402624c.q(new a(dVar));
    }
}
