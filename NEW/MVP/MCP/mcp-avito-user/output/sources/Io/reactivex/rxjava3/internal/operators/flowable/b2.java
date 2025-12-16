package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableWindowBoundary.java */
/* loaded from: classes8.dex */
public final class b2<T, B> extends AbstractC41833b<T, AbstractC41777j<T>> {

    /* compiled from: FlowableWindowBoundary.java */
    public static final class a<T, B> extends io.reactivex.rxjava3.subscribers.b<B> {

        /* renamed from: c, reason: collision with root package name */
        public final b<T, B> f402661c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402662d;

        public a(b<T, B> bVar) {
            this.f402661c = bVar;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402662d) {
                return;
            }
            this.f402662d = true;
            b<T, B> bVar = this.f402661c;
            SubscriptionHelper.a(bVar.f402666d);
            bVar.f402672j = true;
            bVar.a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402662d) {
                C47998a.b(th2);
                return;
            }
            this.f402662d = true;
            b<T, B> bVar = this.f402661c;
            SubscriptionHelper.a(bVar.f402666d);
            if (bVar.f402669g.b(th2)) {
                bVar.f402672j = true;
                bVar.a();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(B b12) {
            if (this.f402662d) {
                return;
            }
            Object obj = b.f402663m;
            b<T, B> bVar = this.f402661c;
            bVar.f402668f.offer(obj);
            bVar.a();
        }
    }

    /* compiled from: FlowableWindowBoundary.java */
    public static final class b<T, B> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {

        /* renamed from: m, reason: collision with root package name */
        public static final Object f402663m = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402664b;

        /* renamed from: c, reason: collision with root package name */
        public final a<T, B> f402665c = new a<>(this);

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402666d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f402667e = new AtomicInteger(1);

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a<Object> f402668f = new io.reactivex.rxjava3.internal.queue.a<>();

        /* renamed from: g, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402669g = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f402670h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        public final AtomicLong f402671i = new AtomicLong();

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f402672j;

        /* renamed from: k, reason: collision with root package name */
        public io.reactivex.rxjava3.processors.h<T> f402673k;

        /* renamed from: l, reason: collision with root package name */
        public long f402674l;

        public b(InterfaceC41782o interfaceC41782o) {
            this.f402664b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this.f402666d, eVar, Long.MAX_VALUE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f402664b;
            io.reactivex.rxjava3.internal.queue.a<Object> aVar = this.f402668f;
            io.reactivex.rxjava3.internal.util.b bVar = this.f402669g;
            long j12 = this.f402674l;
            int iAddAndGet = 1;
            while (this.f402667e.get() != 0) {
                io.reactivex.rxjava3.processors.h<T> hVar = this.f402673k;
                boolean z12 = this.f402672j;
                if (z12 && bVar.get() != null) {
                    aVar.clear();
                    Throwable thD = io.reactivex.rxjava3.internal.util.h.d(bVar);
                    if (hVar != 0) {
                        this.f402673k = null;
                        hVar.onError(thD);
                    }
                    interfaceC41782o.onError(thD);
                    return;
                }
                Object objPoll = aVar.poll();
                boolean z13 = objPoll == null;
                if (z12 && z13) {
                    bVar.getClass();
                    Throwable thD2 = io.reactivex.rxjava3.internal.util.h.d(bVar);
                    if (thD2 == null) {
                        if (hVar != 0) {
                            this.f402673k = null;
                            hVar.e();
                        }
                        interfaceC41782o.e();
                        return;
                    }
                    if (hVar != 0) {
                        this.f402673k = null;
                        hVar.onError(thD2);
                    }
                    interfaceC41782o.onError(thD2);
                    return;
                }
                if (z13) {
                    this.f402674l = j12;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f402663m) {
                    hVar.onNext(objPoll);
                } else {
                    if (hVar != 0) {
                        this.f402673k = null;
                        hVar.e();
                    }
                    if (!this.f402670h.get()) {
                        io.reactivex.rxjava3.processors.h<T> hVarB = io.reactivex.rxjava3.processors.h.B(0, this);
                        this.f402673k = hVarB;
                        this.f402667e.getAndIncrement();
                        if (j12 != this.f402671i.get()) {
                            j12++;
                            d2 d2Var = new d2(hVarB);
                            interfaceC41782o.onNext(d2Var);
                            if (d2Var.z()) {
                                hVarB.e();
                            }
                        } else {
                            SubscriptionHelper.a(this.f402666d);
                            this.f402665c.dispose();
                            bVar.b(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                            this.f402672j = true;
                        }
                    }
                }
            }
            aVar.clear();
            this.f402673k = null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402670h.compareAndSet(false, true)) {
                this.f402665c.dispose();
                if (this.f402667e.decrementAndGet() == 0) {
                    SubscriptionHelper.a(this.f402666d);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402665c.dispose();
            this.f402672j = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402665c.dispose();
            if (this.f402669g.b(th2)) {
                this.f402672j = true;
                a();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402668f.offer(t12);
            a();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this.f402671i, j12);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f402667e.decrementAndGet() == 0) {
                SubscriptionHelper.a(this.f402666d);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super AbstractC41777j<T>> dVar) {
        b bVar = new b((InterfaceC41782o) dVar);
        dVar.K(bVar);
        bVar.f402668f.offer(b.f402663m);
        bVar.a();
        throw null;
    }
}
