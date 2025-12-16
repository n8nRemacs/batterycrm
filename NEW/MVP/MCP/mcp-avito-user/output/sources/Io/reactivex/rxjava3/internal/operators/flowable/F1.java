package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableSubscribeOn.java */
/* loaded from: classes8.dex */
public final class F1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableSubscribeOn.java */
    public static final class a<T> extends AtomicReference<Thread> implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.c<T> f402331b;

        /* compiled from: FlowableSubscribeOn.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.F1$a$a, reason: collision with other inner class name */
        public static final class RunnableC11450a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final org.reactivestreams.e f402332b;

            /* renamed from: c, reason: collision with root package name */
            public final long f402333c;

            public RunnableC11450a(long j12, org.reactivestreams.e eVar) {
                this.f402332b = eVar;
                this.f402333c = j12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f402332b.request(this.f402333c);
            }
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(null, eVar)) {
                throw null;
            }
        }

        public final void a(long j12, org.reactivestreams.e eVar) {
            if (Thread.currentThread() == get()) {
                eVar.request(j12);
            } else {
                new RunnableC11450a(j12, eVar);
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
            if (SubscriptionHelper.h(j12)) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            org.reactivestreams.c<T> cVar = this.f402331b;
            this.f402331b = null;
            cVar.d(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
