package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import n41.InterfaceC44186c;
import s41.C47998a;

/* compiled from: FlowableElementAtSingle.java */
/* loaded from: classes8.dex */
public final class X<T> extends io.reactivex.rxjava3.core.I<T> implements InterfaceC44186c<T> {

    /* compiled from: FlowableElementAtSingle.java */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402573b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402574c;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402573b, eVar)) {
                this.f402573b = eVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402573b.cancel();
            this.f402573b = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402573b = SubscriptionHelper.f404813b;
            if (this.f402574c) {
                return;
            }
            this.f402574c = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402573b == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402574c) {
                C47998a.b(th2);
            } else {
                this.f402574c = true;
                this.f402573b = SubscriptionHelper.f404813b;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (!this.f402574c) {
                throw null;
            }
        }
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<T> f() {
        return new U(true);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        throw null;
    }
}
