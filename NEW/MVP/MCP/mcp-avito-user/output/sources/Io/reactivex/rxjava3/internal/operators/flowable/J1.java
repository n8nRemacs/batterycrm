package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableTakeLast.java */
/* loaded from: classes8.dex */
public final class J1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableTakeLast.java */
    public static final class a<T> extends ArrayDeque<T> implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 7240042530241604978L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402383b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402384c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f402385d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f402386e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicLong f402387f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f402388g = new AtomicInteger();

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402383b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402384c, eVar)) {
                this.f402384c = eVar;
                this.f402383b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402386e = true;
            this.f402384c.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402385d = true;
            i();
        }

        public final void i() {
            if (this.f402388g.getAndIncrement() == 0) {
                InterfaceC41782o interfaceC41782o = this.f402383b;
                long jE2 = this.f402387f.get();
                while (!this.f402386e) {
                    if (this.f402385d) {
                        long j12 = 0;
                        while (j12 != jE2) {
                            if (this.f402386e) {
                                return;
                            }
                            T tPoll = poll();
                            if (tPoll == null) {
                                interfaceC41782o.e();
                                return;
                            } else {
                                interfaceC41782o.onNext(tPoll);
                                j12++;
                            }
                        }
                        if (isEmpty()) {
                            interfaceC41782o.e();
                            return;
                        } else if (j12 != 0) {
                            jE2 = io.reactivex.rxjava3.internal.util.c.e(this.f402387f, j12);
                        }
                    }
                    if (this.f402388g.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402383b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (size() == 0) {
                poll();
            }
            offer(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402387f, j12);
                i();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
