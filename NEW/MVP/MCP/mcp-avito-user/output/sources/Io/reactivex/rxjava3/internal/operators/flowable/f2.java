package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q41.InterfaceC47198a;

/* compiled from: FlowableWithLatestFrom.java */
/* loaded from: classes8.dex */
public final class f2<T, U, R> extends AbstractC41833b<T, R> {

    /* compiled from: FlowableWithLatestFrom.java */
    public static final class b<T, U, R> extends AtomicReference<U> implements InterfaceC47198a<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -312246233408980075L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.subscribers.e f402771b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402772c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f402773d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402774e = new AtomicReference<>();

        public b(io.reactivex.rxjava3.subscribers.e eVar) {
            this.f402771b = eVar;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f402772c, this.f402773d, eVar);
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (get() == null) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                this.f402771b.onError(th2);
                return false;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f402772c);
            SubscriptionHelper.a(this.f402774e);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            SubscriptionHelper.a(this.f402774e);
            this.f402771b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            SubscriptionHelper.a(this.f402774e);
            this.f402771b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            P(t12);
            this.f402772c.get().request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this.f402772c, this.f402773d, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        io.reactivex.rxjava3.subscribers.e eVar = new io.reactivex.rxjava3.subscribers.e((InterfaceC41782o) dVar);
        eVar.K(new b(eVar));
        throw null;
    }

    /* compiled from: FlowableWithLatestFrom.java */
    public final class a implements InterfaceC41782o<U> {
        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(U u12) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
        }
    }
}
