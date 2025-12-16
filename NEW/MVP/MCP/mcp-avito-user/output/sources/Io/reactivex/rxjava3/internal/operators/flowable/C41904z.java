package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.operators.flowable.C41895w;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableConcatMapScheduler.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41904z<T, R> extends AbstractC41833b<T, R> {

    /* compiled from: FlowableConcatMapScheduler.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.z$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f403110a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f403110a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f403110a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: FlowableConcatMapScheduler.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.z$b */
    public static abstract class b<T, R> extends AtomicInteger implements InterfaceC41782o<T>, C41895w.f<R>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = -3511336836796789179L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f403111b;

        /* renamed from: c, reason: collision with root package name */
        public q41.g<T> f403112c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f403113d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f403114e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f403115f;

        /* renamed from: g, reason: collision with root package name */
        public int f403116g;

        public b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403111b, eVar)) {
                this.f403111b = eVar;
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(7);
                    if (iV2 == 1) {
                        this.f403116g = iV2;
                        this.f403112c = dVar;
                        this.f403113d = true;
                        f();
                        d();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f403116g = iV2;
                        this.f403112c = dVar;
                        f();
                        eVar.request(0);
                        return;
                    }
                }
                this.f403112c = new q41.h(0);
                f();
                eVar.request(0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.f
        public final void b() {
            this.f403115f = false;
            d();
        }

        public abstract void d();

        @Override // org.reactivestreams.d
        public final void e() {
            this.f403113d = true;
            d();
        }

        public abstract void f();

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f403116g == 2 || this.f403112c.offer(t12)) {
                d();
            } else {
                this.f403111b.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }
    }

    /* compiled from: FlowableConcatMapScheduler.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.z$c */
    public static final class c<T, R> extends b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        public c() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.f
        public final void a(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.f
        public final void c(R r12) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f403114e) {
                return;
            }
            this.f403114e = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41904z.b
        public final void d() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41904z.b
        public final void f() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!this.f403114e) {
                if (!this.f403115f) {
                    boolean z12 = this.f403113d;
                    if (z12) {
                        throw null;
                    }
                    try {
                        boolean z13 = this.f403112c.poll() == null;
                        if (z12 && z13) {
                            throw null;
                        }
                        if (!z13) {
                            try {
                                throw null;
                            } finally {
                            }
                        }
                    } finally {
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    /* compiled from: FlowableConcatMapScheduler.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.z$d */
    public static final class d<T, R> extends b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        public d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.f
        public final void a(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41895w.f
        public final void c(R r12) {
            if (get() == 0 && compareAndSet(0, 1)) {
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f403114e) {
                return;
            }
            this.f403114e = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41904z.b
        public final void d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.C41904z.b
        public final void f() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f403114e) {
                return;
            }
            if (this.f403115f) {
                throw null;
            }
            boolean z12 = this.f403113d;
            try {
                boolean z13 = this.f403112c.poll() == null;
                if ((z12 && z13) || z13) {
                    throw null;
                }
                try {
                    throw null;
                } finally {
                }
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        throw null;
    }
}
