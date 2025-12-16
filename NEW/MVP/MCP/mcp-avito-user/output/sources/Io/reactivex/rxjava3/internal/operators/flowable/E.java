package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import n41.InterfaceC44186c;

/* compiled from: FlowableCountSingle.java */
/* loaded from: classes8.dex */
public final class E<T> extends io.reactivex.rxjava3.core.I<Long> implements InterfaceC44186c<Long> {

    /* compiled from: FlowableCountSingle.java */
    public static final class a implements InterfaceC41782o<Object>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402312b;

        /* renamed from: c, reason: collision with root package name */
        public long f402313c;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402312b, eVar)) {
                this.f402312b = eVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402312b.cancel();
            this.f402312b = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402312b = SubscriptionHelper.f404813b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402312b == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402312b = SubscriptionHelper.f404813b;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            this.f402313c++;
        }
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<Long> f() {
        return new D(null);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Long> l12) {
        throw null;
    }
}
