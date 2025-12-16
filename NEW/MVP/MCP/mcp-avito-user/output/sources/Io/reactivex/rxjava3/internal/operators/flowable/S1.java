package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableTimeInterval.java */
/* loaded from: classes8.dex */
public final class S1<T> extends AbstractC41833b<T, io.reactivex.rxjava3.schedulers.d<T>> {

    /* compiled from: FlowableTimeInterval.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402545b;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402545b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(null, eVar)) {
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402545b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402545b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super io.reactivex.rxjava3.schedulers.d<T>> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
