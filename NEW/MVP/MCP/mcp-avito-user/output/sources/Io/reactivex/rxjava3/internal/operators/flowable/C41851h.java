package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import n41.InterfaceC44186c;
import s41.C47998a;

/* compiled from: FlowableAllSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41851h<T> extends io.reactivex.rxjava3.core.I<Boolean> implements InterfaceC44186c<Boolean> {

    /* compiled from: FlowableAllSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.h$a */
    public static final class a<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402792b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402793c;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402792b, eVar)) {
                this.f402792b = eVar;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402792b.cancel();
            this.f402792b = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402793c) {
                return;
            }
            this.f402793c = true;
            this.f402792b = SubscriptionHelper.f404813b;
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402792b == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402793c) {
                C47998a.b(th2);
            } else {
                this.f402793c = true;
                this.f402792b = SubscriptionHelper.f404813b;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (this.f402793c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402792b.cancel();
                this.f402792b = subscriptionHelper;
                onError(th2);
            }
        }
    }

    @Override // n41.InterfaceC44186c
    public final AbstractC41777j<Boolean> f() {
        return new C41848g(null);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Boolean> l12) {
        throw null;
    }
}
