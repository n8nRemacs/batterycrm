package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import n41.InterfaceC44186c;
import s41.C47998a;

/* compiled from: FlowableElementAtMaybe.java */
/* loaded from: classes8.dex */
public final class V<T> extends io.reactivex.rxjava3.core.q<T> implements InterfaceC44186c<T> {

    /* compiled from: FlowableElementAtMaybe.java */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402563b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402564c;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402563b, eVar)) {
                this.f402563b = eVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402563b.cancel();
            this.f402563b = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402563b = SubscriptionHelper.f404813b;
            if (this.f402564c) {
                return;
            }
            this.f402564c = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402563b == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402564c) {
                C47998a.b(th2);
            } else {
                this.f402564c = true;
                this.f402563b = SubscriptionHelper.f404813b;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (!this.f402564c) {
                throw null;
            }
        }
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<T> f() {
        return new U(false);
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        throw null;
    }
}
