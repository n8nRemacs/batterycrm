package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableDelaySubscriptionOther.java */
/* loaded from: classes8.dex */
public final class K<T, U> extends AbstractC41777j<T> {

    /* compiled from: FlowableDelaySubscriptionOther.java */
    public static final class a<T> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 2259811067697317255L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402389b;

        /* renamed from: c, reason: collision with root package name */
        public final a<T>.C11453a f402390c = new C11453a();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402391d = new AtomicReference<>();

        /* compiled from: FlowableDelaySubscriptionOther.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.K$a$a, reason: collision with other inner class name */
        public final class C11453a extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            public C11453a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                if (get() == SubscriptionHelper.f404813b) {
                    return;
                }
                a.this.getClass();
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (get() != SubscriptionHelper.f404813b) {
                    a.this.f402389b.onError(th2);
                } else {
                    C47998a.b(th2);
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                org.reactivestreams.e eVar = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
                if (eVar == subscriptionHelper) {
                    return;
                }
                lazySet(subscriptionHelper);
                eVar.cancel();
                a.this.getClass();
                throw null;
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402389b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f402391d, this, eVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f402390c);
            SubscriptionHelper.a(this.f402391d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402389b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402389b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402389b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                SubscriptionHelper.b(this.f402391d, this, j12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a((InterfaceC41782o) dVar));
        throw null;
    }
}
