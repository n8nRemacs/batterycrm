package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableSkipLastTimed.java */
/* loaded from: classes8.dex */
public final class C1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableSkipLastTimed.java */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -5677354903406201275L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402296b;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402298d;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f402300f;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f402299e = new AtomicLong();

        /* renamed from: c, reason: collision with root package name */
        public final q41.i<Object> f402297c = new q41.i<>(0);

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402296b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402298d, eVar)) {
                this.f402298d = eVar;
                this.f402296b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                AtomicLong atomicLong = this.f402299e;
                if (0 != atomicLong.get()) {
                    throw null;
                }
                if (0 != 0) {
                    io.reactivex.rxjava3.internal.util.c.e(atomicLong, 0L);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402300f) {
                return;
            }
            this.f402300f = true;
            this.f402298d.cancel();
            if (getAndIncrement() == 0) {
                this.f402297c.clear();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            a();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402299e, j12);
                a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
