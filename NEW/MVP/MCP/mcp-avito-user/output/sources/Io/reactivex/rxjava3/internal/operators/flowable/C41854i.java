package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableAmb.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41854i<T> extends AbstractC41777j<T> {

    /* compiled from: FlowableAmb.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.i$a */
    public static final class a<T> implements org.reactivestreams.e {
        public a() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                throw null;
            }
        }
    }

    /* compiled from: FlowableAmb.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.i$b */
    public static final class b<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -1185974347409665484L;

        public b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this, null, eVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this);
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
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this, null, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
