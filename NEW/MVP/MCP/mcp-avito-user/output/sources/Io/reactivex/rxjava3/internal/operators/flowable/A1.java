package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableSkip.java */
/* loaded from: classes8.dex */
public final class A1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableSkip.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402276b;

        /* renamed from: c, reason: collision with root package name */
        public long f402277c = 0;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402278d;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402276b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402278d, eVar)) {
                long j12 = this.f402277c;
                this.f402278d = eVar;
                this.f402276b.K(this);
                eVar.request(j12);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402278d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402276b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402276b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            long j12 = this.f402277c;
            if (j12 != 0) {
                this.f402277c = j12 - 1;
            } else {
                this.f402276b.onNext(t12);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402278d.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
