package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q41.InterfaceC47198a;
import s41.C47998a;

/* compiled from: FlowableWithLatestFromMany.java */
/* loaded from: classes8.dex */
public final class g2<T, R> extends AbstractC41833b<T, R> {

    /* compiled from: FlowableWithLatestFromMany.java */
    public final class a implements l41.o<T, R> {
        @Override // l41.o
        public final R apply(T t12) {
            throw null;
        }
    }

    /* compiled from: FlowableWithLatestFromMany.java */
    public static final class b<T, R> extends AtomicInteger implements InterfaceC47198a<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 1577321883966341961L;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f402790b;

        public b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(null, null, eVar);
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f402790b) {
                return false;
            }
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(null);
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402790b) {
                return;
            }
            this.f402790b = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402790b) {
                C47998a.b(th2);
            } else {
                this.f402790b = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            P(t12);
            if (!this.f402790b) {
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(null, null, j12);
            throw null;
        }
    }

    /* compiled from: FlowableWithLatestFromMany.java */
    public static final class c extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* renamed from: b, reason: collision with root package name */
        public boolean f402791b;

        public c() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (!this.f402791b) {
                throw null;
            }
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            if (!this.f402791b) {
                this.f402791b = true;
            }
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
