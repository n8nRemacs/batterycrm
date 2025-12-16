package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o41.AbstractC44583c;

/* compiled from: MaybeMergeArray.java */
/* loaded from: classes8.dex */
public final class a0<T> extends AbstractC41777j<T> {

    /* compiled from: MaybeMergeArray.java */
    public static final class a<T> extends ConcurrentLinkedQueue<T> implements d<T> {
        private static final long serialVersionUID = -4025173261791142821L;

        /* renamed from: b, reason: collision with root package name */
        public int f403190b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f403191c = new AtomicInteger();

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, q41.g
        public final boolean offer(T t12) {
            this.f403191c.getAndIncrement();
            return super.offer(t12);
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, q41.g
        @j41.f
        public final T poll() {
            T t12 = (T) super.poll();
            if (t12 != null) {
                this.f403190b++;
            }
            return t12;
        }
    }

    /* compiled from: MaybeMergeArray.java */
    public static final class b<T> extends AbstractC44583c<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -660395290758764731L;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f403192b;

        public b() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f403192b) {
                return;
            }
            this.f403192b = true;
            throw null;
        }

        @Override // q41.g
        public final void clear() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            throw null;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            throw null;
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(null, j12);
                throw null;
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return (i12 & 2) != 0 ? 2 : 0;
        }
    }

    /* compiled from: MaybeMergeArray.java */
    public static final class c<T> extends AtomicReferenceArray<T> implements d<T> {
        private static final long serialVersionUID = -7969063454040569579L;

        /* renamed from: b, reason: collision with root package name */
        public int f403193b;

        @Override // q41.g
        public final void clear() {
            T t12;
            int i12 = this.f403193b;
            if (i12 == length()) {
                t12 = null;
            } else {
                t12 = get(i12);
                t12.getClass();
                this.f403193b = i12 + 1;
                lazySet(i12, null);
            }
            if (t12 != null) {
                throw null;
            }
        }

        @Override // q41.g
        public final boolean isEmpty() {
            throw null;
        }

        @Override // q41.g
        public final boolean offer(T t12) {
            Objects.requireNonNull(t12, "value is null");
            throw null;
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            int i12 = this.f403193b;
            if (i12 == length()) {
                return null;
            }
            T t12 = get(i12);
            t12.getClass();
            this.f403193b = i12 + 1;
            lazySet(i12, null);
            return t12;
        }
    }

    /* compiled from: MaybeMergeArray.java */
    public interface d<T> extends q41.g<T> {
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
