package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableIgnoreElements.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41899x0<T> extends AbstractC41833b<T, T> {
    public C41899x0() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }

    /* compiled from: FlowableIgnoreElements.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.x0$a */
    public static final class a<T> implements InterfaceC41782o<T>, q41.d<T> {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f403098b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f403099c;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f403098b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403099c, eVar)) {
                this.f403099c = eVar;
                this.f403098b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f403099c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f403098b.e();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return true;
        }

        @Override // q41.g
        public final boolean offer(T t12) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f403098b.onError(th2);
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            return null;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return i12 & 2;
        }

        @Override // q41.g
        public final void clear() {
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
        }
    }
}
