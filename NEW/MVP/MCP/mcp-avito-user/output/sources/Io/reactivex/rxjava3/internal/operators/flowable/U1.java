package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableTimeoutTimed.java */
/* loaded from: classes8.dex */
public final class U1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableTimeoutTimed.java */
    public static final class a<T> implements InterfaceC41782o<T> {
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            throw null;
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
    }

    /* compiled from: FlowableTimeoutTimed.java */
    public static final class b<T> extends o41.h implements InterfaceC41782o<T>, d {
        private static final long serialVersionUID = 3764492702657003550L;

        public b() {
            throw null;
        }

        @Override // o41.h, org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(null, eVar)) {
                g(eVar);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.U1.d
        public final void c(long j12) {
            throw null;
        }

        @Override // o41.h, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            throw null;
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
    }

    /* compiled from: FlowableTimeoutTimed.java */
    public static final class c<T> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e, d {
        private static final long serialVersionUID = 3764492702657003550L;

        public c() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(null, null, eVar);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.U1.d
        public final void c(long j12) {
            if (compareAndSet(j12, Long.MAX_VALUE)) {
                SubscriptionHelper.a(null);
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(null);
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                throw null;
            }
            C47998a.b(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            long j12 = get();
            if (j12 != Long.MAX_VALUE && compareAndSet(j12, 1 + j12)) {
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(null, null, j12);
            throw null;
        }
    }

    /* compiled from: FlowableTimeoutTimed.java */
    public interface d {
        void c(long j12);
    }

    /* compiled from: FlowableTimeoutTimed.java */
    public static final class e implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
