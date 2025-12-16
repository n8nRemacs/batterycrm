package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableTakeUntil.java */
/* loaded from: classes8.dex */
public final class N1<T, U> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableTakeUntil.java */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -4945480365982832967L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402446b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f402447c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402448d = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public final a<T>.C11457a f402450f = new C11457a();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402449e = new io.reactivex.rxjava3.internal.util.b();

        /* compiled from: FlowableTakeUntil.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.N1$a$a, reason: collision with other inner class name */
        public final class C11457a extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            public C11457a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a aVar = a.this;
                SubscriptionHelper.a(aVar.f402448d);
                io.reactivex.rxjava3.internal.util.i.b(aVar.f402446b, aVar, aVar.f402449e);
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                a aVar = a.this;
                SubscriptionHelper.a(aVar.f402448d);
                io.reactivex.rxjava3.internal.util.i.d(aVar.f402446b, th2, aVar, aVar.f402449e);
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                SubscriptionHelper.a(this);
                e();
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402446b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f402448d, this.f402447c, eVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f402448d);
            SubscriptionHelper.a(this.f402450f);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            SubscriptionHelper.a(this.f402450f);
            io.reactivex.rxjava3.internal.util.i.b(this.f402446b, this, this.f402449e);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            SubscriptionHelper.a(this.f402450f);
            io.reactivex.rxjava3.internal.util.i.d(this.f402446b, th2, this, this.f402449e);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            io.reactivex.rxjava3.internal.util.i.f(this.f402446b, t12, this, this.f402449e);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this.f402448d, this.f402447c, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a((InterfaceC41782o) dVar));
        throw null;
    }
}
