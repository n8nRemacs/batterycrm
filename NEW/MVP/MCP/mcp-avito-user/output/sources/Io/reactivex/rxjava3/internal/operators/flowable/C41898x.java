package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableConcatMapEager.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41898x<T, R> extends AbstractC41833b<T, R> {

    /* compiled from: FlowableConcatMapEager.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.x$a */
    public static final class a<T, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e, io.reactivex.rxjava3.internal.subscribers.m<R> {
        private static final long serialVersionUID = -4255299542215038287L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f403090b;

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f403094f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f403095g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f403096h;

        /* renamed from: i, reason: collision with root package name */
        public volatile io.reactivex.rxjava3.internal.subscribers.l<R> f403097i;

        /* renamed from: e, reason: collision with root package name */
        public final q41.i<io.reactivex.rxjava3.internal.subscribers.l<R>> f403093e = new q41.i<>(Math.min(0, 0));

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403091c = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f403092d = new AtomicLong();

        public a(InterfaceC41782o interfaceC41782o) {
            this.f403090b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403094f, eVar)) {
                this.f403094f = eVar;
                this.f403090b.K(this);
                eVar.request(0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.m
        public final void a(io.reactivex.rxjava3.internal.subscribers.l<R> lVar, Throwable th2) {
            if (this.f403091c.b(th2)) {
                lVar.f404788c = true;
                this.f403094f.cancel();
                c();
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.m
        public final void b(io.reactivex.rxjava3.internal.subscribers.l<R> lVar, R r12) {
            if (lVar.f404787b.offer(r12)) {
                c();
            } else {
                SubscriptionHelper.a(lVar);
                a(lVar, new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.m
        public final void c() {
            io.reactivex.rxjava3.internal.subscribers.l<R> lVarPoll;
            boolean z12;
            long j12;
            long j13;
            q41.g<R> gVar;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.subscribers.l<R> lVar = this.f403097i;
            InterfaceC41782o interfaceC41782o = this.f403090b;
            int iAddAndGet = 1;
            while (true) {
                long j14 = this.f403092d.get();
                if (lVar != null) {
                    lVarPoll = lVar;
                } else {
                    if (this.f403091c.get() != null) {
                        f();
                        this.f403091c.g(this.f403090b);
                        return;
                    }
                    boolean z13 = this.f403096h;
                    lVarPoll = this.f403093e.poll();
                    if (z13 && lVarPoll == null) {
                        this.f403091c.g(this.f403090b);
                        return;
                    } else if (lVarPoll != null) {
                        this.f403097i = lVarPoll;
                    }
                }
                if (lVarPoll == null || (gVar = lVarPoll.f404787b) == null) {
                    z12 = false;
                    j12 = 0;
                    j13 = 0;
                } else {
                    j13 = 0;
                    while (j13 != j14) {
                        if (this.f403095g) {
                            f();
                            return;
                        }
                        boolean z14 = lVarPoll.f404788c;
                        try {
                            R rPoll = gVar.poll();
                            boolean z15 = rPoll == null;
                            if (z14 && z15) {
                                this.f403097i = null;
                                this.f403094f.request(1L);
                                lVarPoll = null;
                                z12 = true;
                                break;
                            }
                            if (z15) {
                                break;
                            }
                            interfaceC41782o.onNext(rPoll);
                            j13++;
                            lVarPoll.request(1L);
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            this.f403097i = null;
                            SubscriptionHelper.a(lVarPoll);
                            f();
                            interfaceC41782o.onError(th2);
                            return;
                        }
                    }
                    z12 = false;
                    if (j13 == j14) {
                        if (this.f403095g) {
                            f();
                            return;
                        }
                        boolean z16 = lVarPoll.f404788c;
                        boolean zIsEmpty = gVar.isEmpty();
                        if (z16 && zIsEmpty) {
                            this.f403097i = null;
                            this.f403094f.request(1L);
                            lVarPoll = null;
                            z12 = true;
                        }
                    }
                    j12 = 0;
                }
                if (j13 != j12 && j14 != Long.MAX_VALUE) {
                    this.f403092d.addAndGet(-j13);
                }
                if (!z12 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                } else {
                    lVar = lVarPoll;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f403095g) {
                return;
            }
            this.f403095g = true;
            this.f403094f.cancel();
            this.f403091c.c();
            if (getAndIncrement() == 0) {
                do {
                    f();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.m
        public final void d(io.reactivex.rxjava3.internal.subscribers.l<R> lVar) {
            lVar.f404788c = true;
            c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f403096h = true;
            c();
        }

        public final void f() {
            io.reactivex.rxjava3.internal.subscribers.l<R> lVar = this.f403097i;
            this.f403097i = null;
            if (lVar != null) {
                SubscriptionHelper.a(lVar);
            }
            while (true) {
                io.reactivex.rxjava3.internal.subscribers.l<R> lVarPoll = this.f403093e.poll();
                if (lVarPoll == null) {
                    return;
                } else {
                    SubscriptionHelper.a(lVarPoll);
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f403091c.b(th2)) {
                this.f403096h = true;
                c();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403094f.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f403092d, j12);
                c();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
