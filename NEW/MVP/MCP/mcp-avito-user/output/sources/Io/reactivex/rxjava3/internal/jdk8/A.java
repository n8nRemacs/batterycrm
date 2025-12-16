package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ParallelCollector.java */
/* loaded from: classes8.dex */
public final class A<T, A, R> extends AbstractC41777j<R> {

    /* compiled from: ParallelCollector.java */
    public static final class a<T, A, R> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -7954444275102466525L;

        /* renamed from: b, reason: collision with root package name */
        public A f402017b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402018c;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402018c) {
                return;
            }
            this.f402018c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402018c) {
                C47998a.b(th2);
            } else {
                this.f402018c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402018c) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                get().cancel();
                onError(th2);
            }
        }
    }

    /* compiled from: ParallelCollector.java */
    public static final class b<T, A, R> extends o41.f<R> {
        private static final long serialVersionUID = -5370107872170712765L;

        public b() {
            throw null;
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            throw null;
        }
    }

    /* compiled from: ParallelCollector.java */
    public static final class c<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;

        public c() {
            new AtomicInteger();
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
