package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ParallelSortedJoin.java */
/* loaded from: classes8.dex */
public final class q<T> extends AbstractC41777j<T> {

    /* compiled from: ParallelSortedJoin.java */
    public static final class b<T> extends AtomicInteger implements org.reactivestreams.e {
        private static final long serialVersionUID = 3481980673745556697L;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f404473b;

        public b() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f404473b) {
                return;
            }
            this.f404473b = true;
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(null, j12);
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }

    /* compiled from: ParallelSortedJoin.java */
    public static final class a<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
        }
    }
}
