package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import s41.C47998a;

/* compiled from: FlowableDistinct.java */
/* loaded from: classes8.dex */
public final class N<T, K> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableDistinct.java */
    public static final class a<T, K> extends io.reactivex.rxjava3.internal.subscribers.b<T, T> {
        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, q41.g
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.d
        public final void e() {
            if (this.f404777e) {
                return;
            }
            this.f404777e = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404777e) {
                C47998a.b(th2);
            } else {
                this.f404777e = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404777e) {
                return;
            }
            if (this.f404778f != 0) {
                this.f404774b.onNext(null);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                a(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            T tPoll = this.f404776d.poll();
            if (tPoll == null) {
                return tPoll;
            }
            throw null;
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
