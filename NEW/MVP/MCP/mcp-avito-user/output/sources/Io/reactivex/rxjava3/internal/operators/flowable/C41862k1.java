package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.operators.flowable.C41874o1;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableRepeatWhen.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41862k1<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableRepeatWhen.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.k1$a */
    public static final class a<T> extends c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            h(0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41862k1.c, org.reactivestreams.d
        public final void onError(Throwable th2) {
            ((b) this.f402858l).cancel();
            this.f402856j.onError(th2);
        }
    }

    /* compiled from: FlowableRepeatWhen.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.k1$b */
    public static final class b<T, U> extends AtomicInteger implements InterfaceC41782o<Object>, org.reactivestreams.e {
        private static final long serialVersionUID = 2827772011130406689L;

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.c<T> f402852b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402853c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f402854d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public C41874o1.a f402855e;

        public b(org.reactivestreams.c<T> cVar) {
            this.f402852b = cVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f402853c, this.f402854d, eVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f402853c);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402855e.cancel();
            this.f402855e.f402856j.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402855e.cancel();
            this.f402855e.f402856j.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.f402853c.get() != SubscriptionHelper.f404813b) {
                    this.f402852b.d(this.f402855e);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this.f402853c, this.f402854d, j12);
        }
    }

    /* compiled from: FlowableRepeatWhen.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.k1$c */
    public static abstract class c<T, U> extends o41.h implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -5604623027276966720L;

        /* renamed from: j, reason: collision with root package name */
        public final io.reactivex.rxjava3.subscribers.e f402856j;

        /* renamed from: k, reason: collision with root package name */
        public final io.reactivex.rxjava3.processors.c<U> f402857k;

        /* renamed from: l, reason: collision with root package name */
        public final org.reactivestreams.e f402858l;

        /* renamed from: m, reason: collision with root package name */
        public long f402859m;

        public c(io.reactivex.rxjava3.subscribers.e eVar, io.reactivex.rxjava3.processors.c cVar, org.reactivestreams.e eVar2) {
            super(false);
            this.f402856j = eVar;
            this.f402857k = cVar;
            this.f402858l = eVar2;
        }

        @Override // o41.h, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f402858l.cancel();
        }

        public final void h(Serializable serializable) {
            g(EmptySubscription.f404811b);
            long j12 = this.f402859m;
            if (j12 != 0) {
                this.f402859m = 0L;
                f(j12);
            }
            ((b) this.f402858l).request(1L);
            this.f402857k.onNext(serializable);
        }

        public void onError(Throwable th2) {
            h(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402859m++;
            this.f402856j.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        io.reactivex.rxjava3.internal.functions.b.a(8, "capacityHint");
        new io.reactivex.rxjava3.processors.h(8, null).z();
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
