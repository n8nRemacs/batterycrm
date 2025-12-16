package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableThrottleFirstTimed.java */
/* loaded from: classes8.dex */
public final class Q1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableThrottleFirstTimed.java */
    public static final class a<T> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402518b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f402519c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402520d;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402518b, eVar)) {
                this.f402518b = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402518b.cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402520d) {
                return;
            }
            this.f402520d = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402520d) {
                C47998a.b(th2);
            } else {
                this.f402520d = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402520d || this.f402519c) {
                return;
            }
            this.f402519c = true;
            if (get() != 0) {
                throw null;
            }
            this.f402520d = true;
            cancel();
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this, j12);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f402519c = false;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
