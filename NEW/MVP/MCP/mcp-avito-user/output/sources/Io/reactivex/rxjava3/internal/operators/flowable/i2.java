package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: FlowableZipIterable.java */
/* loaded from: classes8.dex */
public final class i2<T, U, V> extends AbstractC41833b<T, V> {

    /* compiled from: FlowableZipIterable.java */
    public static final class a<T, U, V> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402836b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402837c;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402836b, eVar)) {
                this.f402836b = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402836b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402837c) {
                return;
            }
            this.f402837c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402837c) {
                C47998a.b(th2);
            } else {
                this.f402837c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402836b.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super V> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
