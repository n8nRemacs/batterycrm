package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;

/* compiled from: FlowableSkipLast.java */
/* loaded from: classes8.dex */
public final class B1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableSkipLast.java */
    public static final class a<T> extends ArrayDeque<T> implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -3807491841935125653L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402292b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402293c;

        public a(InterfaceC41782o interfaceC41782o) {
            super(0);
            this.f402292b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402293c, eVar)) {
                this.f402293c = eVar;
                this.f402292b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402293c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402292b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402292b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (size() == 0) {
                this.f402292b.onNext(poll());
            } else {
                this.f402293c.request(1L);
            }
            offer(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402293c.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
