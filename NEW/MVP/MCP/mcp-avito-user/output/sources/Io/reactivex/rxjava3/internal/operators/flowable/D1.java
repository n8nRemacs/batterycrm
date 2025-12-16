package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q41.InterfaceC47198a;

/* compiled from: FlowableSkipUntil.java */
/* loaded from: classes8.dex */
public final class D1<T, U> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableSkipUntil.java */
    public static final class a<T> extends AtomicInteger implements InterfaceC47198a<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -6270983465606289181L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402305b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402306c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f402307d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final a<T>.C11449a f402308e = new C11449a();

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402309f = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402310g;

        /* compiled from: FlowableSkipUntil.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.D1$a$a, reason: collision with other inner class name */
        public final class C11449a extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            public C11449a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a.this.f402310g = true;
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a aVar = a.this;
                SubscriptionHelper.a(aVar.f402306c);
                io.reactivex.rxjava3.internal.util.i.d(aVar.f402305b, th2, aVar, aVar.f402309f);
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                a.this.f402310g = true;
                get().cancel();
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402305b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f402306c, this.f402307d, eVar);
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (!this.f402310g) {
                return false;
            }
            io.reactivex.rxjava3.internal.util.i.f(this.f402305b, t12, this, this.f402309f);
            return true;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f402306c);
            SubscriptionHelper.a(this.f402308e);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            SubscriptionHelper.a(this.f402308e);
            io.reactivex.rxjava3.internal.util.i.b(this.f402305b, this, this.f402309f);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            SubscriptionHelper.a(this.f402308e);
            io.reactivex.rxjava3.internal.util.i.d(this.f402305b, th2, this, this.f402309f);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (P(t12)) {
                return;
            }
            this.f402306c.get().request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this.f402306c, this.f402307d, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a((InterfaceC41782o) dVar));
        throw null;
    }
}
