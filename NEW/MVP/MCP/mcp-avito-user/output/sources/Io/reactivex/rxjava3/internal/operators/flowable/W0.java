package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableOnErrorComplete.java */
/* loaded from: classes8.dex */
public final class W0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableOnErrorComplete.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402570b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402571c;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402570b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402571c, eVar)) {
                this.f402571c = eVar;
                this.f402570b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402571c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402570b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f402570b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402570b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402571c.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
