package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableThrottleLatest.java */
/* loaded from: classes8.dex */
public final class R1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableThrottleLatest.java */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402526b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f402527c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f402528d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f402529e;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402526b, eVar)) {
                this.f402526b = eVar;
                throw null;
            }
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f402529e || !this.f402527c || this.f402528d != null) {
                throw null;
            }
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402529e = true;
            this.f402526b.cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402527c = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402528d = th2;
            this.f402527c = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(null, j12);
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
