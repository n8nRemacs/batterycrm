package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableWindow.java */
/* loaded from: classes8.dex */
public final class a2<T> extends AbstractC41833b<T, AbstractC41777j<T>> {

    /* compiled from: FlowableWindow.java */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402614b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f402615c;

        /* renamed from: d, reason: collision with root package name */
        public long f402616d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402617e;

        /* renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.processors.h<T> f402618f;

        public a(InterfaceC41782o interfaceC41782o) {
            super(1);
            this.f402614b = interfaceC41782o;
            this.f402615c = new AtomicBoolean();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402617e, eVar)) {
                this.f402617e = eVar;
                this.f402614b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402615c.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            io.reactivex.rxjava3.processors.h<T> hVar = this.f402618f;
            if (hVar != null) {
                this.f402618f = null;
                hVar.e();
            }
            this.f402614b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.processors.h<T> hVar = this.f402618f;
            if (hVar != null) {
                this.f402618f = null;
                hVar.onError(th2);
            }
            this.f402614b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            d2 d2Var;
            long j12 = this.f402616d;
            io.reactivex.rxjava3.processors.h<T> hVarB = this.f402618f;
            if (j12 == 0) {
                getAndIncrement();
                hVarB = io.reactivex.rxjava3.processors.h.B(0, this);
                this.f402618f = hVarB;
                d2Var = new d2(hVarB);
                this.f402614b.onNext(d2Var);
            } else {
                d2Var = null;
            }
            long j13 = j12 + 1;
            hVarB.onNext(t12);
            if (j13 == 0) {
                this.f402616d = 0L;
                this.f402618f = null;
                hVarB.e();
            } else {
                this.f402616d = j13;
            }
            if (d2Var == null || !d2Var.z()) {
                return;
            }
            d2Var.f402728c.e();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                this.f402617e.request(io.reactivex.rxjava3.internal.util.c.d(0L, j12));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f402617e.cancel();
            }
        }
    }

    /* compiled from: FlowableWindow.java */
    public static final class b<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402619b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f402620c;

        public b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402619b, eVar)) {
                this.f402619b = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402620c = true;
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
            if (0 != 0 || this.f402620c) {
                throw null;
            }
            getAndIncrement();
            io.reactivex.rxjava3.processors.h.B(0, this);
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
            if (decrementAndGet() == 0) {
                this.f402619b.cancel();
            }
        }
    }

    /* compiled from: FlowableWindow.java */
    public static final class c<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;

        /* renamed from: b, reason: collision with root package name */
        public long f402621b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402622c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.processors.h<T> f402623d;

        public c() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402622c, eVar)) {
                this.f402622c = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            io.reactivex.rxjava3.processors.h<T> hVar = this.f402623d;
            if (hVar == null) {
                throw null;
            }
            this.f402623d = null;
            hVar.e();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.processors.h<T> hVar = this.f402623d;
            if (hVar == null) {
                throw null;
            }
            this.f402623d = null;
            hVar.onError(th2);
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            long j12 = this.f402621b;
            io.reactivex.rxjava3.processors.h<T> hVar = this.f402623d;
            if (j12 == 0) {
                getAndIncrement();
                io.reactivex.rxjava3.processors.h<T> hVarB = io.reactivex.rxjava3.processors.h.B(0, this);
                this.f402623d = hVarB;
                new d2(hVarB);
                throw null;
            }
            long j13 = j12 + 1;
            if (hVar != null) {
                hVar.onNext(t12);
            }
            if (j13 == 0) {
                this.f402623d = null;
                hVar.e();
            }
            if (j13 == 0) {
                this.f402621b = 0L;
            } else {
                this.f402621b = j13;
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.f402622c.cancel();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super AbstractC41777j<T>> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
