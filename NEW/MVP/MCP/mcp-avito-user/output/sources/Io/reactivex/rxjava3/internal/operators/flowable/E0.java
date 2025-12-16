package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableLastSingle.java */
/* loaded from: classes8.dex */
public final class E0<T> extends io.reactivex.rxjava3.core.I<T> {

    /* compiled from: FlowableLastSingle.java */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402314b;

        /* renamed from: c, reason: collision with root package name */
        public T f402315c;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402314b, eVar)) {
                this.f402314b = eVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402314b.cancel();
            this.f402314b = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402314b = SubscriptionHelper.f404813b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402314b == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402314b = SubscriptionHelper.f404813b;
            this.f402315c = null;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402315c = t12;
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        throw null;
    }
}
