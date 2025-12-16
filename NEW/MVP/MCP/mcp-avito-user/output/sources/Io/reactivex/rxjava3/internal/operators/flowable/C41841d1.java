package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import s41.C47998a;

/* compiled from: FlowableReduce.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.d1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41841d1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableReduce.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.d1$a */
    public static final class a<T> extends o41.f<T> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -4663883003264602070L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402727d;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402727d, eVar)) {
                this.f402727d = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f402727d.cancel();
            this.f402727d = SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            org.reactivestreams.e eVar = this.f402727d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar == subscriptionHelper) {
                return;
            }
            this.f402727d = subscriptionHelper;
            T t12 = this.f419377c;
            if (t12 != null) {
                l(t12);
            } else {
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            org.reactivestreams.e eVar = this.f402727d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar == subscriptionHelper) {
                C47998a.b(th2);
            } else {
                this.f402727d = subscriptionHelper;
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402727d == SubscriptionHelper.f404813b) {
                return;
            }
            if (this.f419377c == null) {
                this.f419377c = t12;
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402727d.cancel();
                onError(th2);
            }
        }
    }

    public C41841d1() {
        super(null);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
