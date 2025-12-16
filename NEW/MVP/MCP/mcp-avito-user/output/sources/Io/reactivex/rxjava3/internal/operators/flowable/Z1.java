package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import s41.C47998a;

/* compiled from: FlowableUsing.java */
/* loaded from: classes8.dex */
public final class Z1<T, D> extends AbstractC41777j<T> {

    /* compiled from: FlowableUsing.java */
    public static final class a<T, D> extends AtomicBoolean implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 5904473792286235046L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402588b;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402588b, eVar)) {
                this.f402588b = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            this.f402588b.cancel();
            this.f402588b = subscriptionHelper;
            if (compareAndSet(false, true)) {
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402588b.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
