package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableSamplePublisher.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.p1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41877p1<T> extends AbstractC41777j<T> {

    /* compiled from: FlowableSamplePublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.p1$a */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41877p1.c
        public final void a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41877p1.c
        public final void b() {
            throw null;
        }
    }

    /* compiled from: FlowableSamplePublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.p1$b */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public b() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41877p1.c
        public final void a() {
            this.f402932b.e();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41877p1.c
        public final void b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                AtomicLong atomicLong = this.f402933c;
                long j12 = atomicLong.get();
                io.reactivex.rxjava3.subscribers.e eVar = this.f402932b;
                if (j12 != 0) {
                    eVar.onNext(andSet);
                    io.reactivex.rxjava3.internal.util.c.e(atomicLong, 1L);
                } else {
                    cancel();
                    eVar.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }
    }

    /* compiled from: FlowableSamplePublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.p1$c */
    public static abstract class c<T> extends AtomicReference<T> implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.subscribers.e f402932b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f402933c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402934d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f402935e;

        public c(io.reactivex.rxjava3.subscribers.e eVar) {
            this.f402932b = eVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402935e, eVar)) {
                this.f402935e = eVar;
                this.f402932b.K(this);
                if (this.f402934d.get() == null) {
                    throw null;
                }
            }
        }

        public abstract void a();

        public abstract void b();

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f402934d);
            this.f402935e.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            SubscriptionHelper.a(this.f402934d);
            a();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            SubscriptionHelper.a(this.f402934d);
            this.f402932b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            lazySet(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402933c, j12);
            }
        }
    }

    /* compiled from: FlowableSamplePublisher.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.p1$d */
    public static final class d<T> implements InterfaceC41782o<Object> {
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
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new b(new io.reactivex.rxjava3.subscribers.e((InterfaceC41782o) dVar));
        throw null;
    }
}
