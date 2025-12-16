package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableSkipWhile.java */
/* loaded from: classes8.dex */
public final class E1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableSkipWhile.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402316b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402317c;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402316b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402317c, eVar)) {
                this.f402317c = eVar;
                this.f402316b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402317c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402316b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402316b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            InterfaceC41782o interfaceC41782o = this.f402316b;
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402317c.cancel();
                interfaceC41782o.onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402317c.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
