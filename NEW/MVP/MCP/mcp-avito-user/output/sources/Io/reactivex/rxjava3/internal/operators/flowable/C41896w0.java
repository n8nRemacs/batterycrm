package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableHide.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41896w0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableHide.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.w0$a */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f403088b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f403089c;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f403088b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403089c, eVar)) {
                this.f403089c = eVar;
                this.f403088b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f403089c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f403088b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f403088b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f403088b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f403089c.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
