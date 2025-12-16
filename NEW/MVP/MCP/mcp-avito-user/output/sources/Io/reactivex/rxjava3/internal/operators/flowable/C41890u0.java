package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import k41.AbstractC42504b;
import o41.AbstractC44583c;
import s41.C47998a;

/* compiled from: FlowableGroupBy.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41890u0<T, K, V> extends AbstractC41833b<T, AbstractC42504b<K, V>> {

    /* compiled from: FlowableGroupBy.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u0$a */
    public static final class a<K, V> implements l41.g<c<K, V>> {
        public a() {
            throw null;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            throw null;
        }
    }

    /* compiled from: FlowableGroupBy.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u0$b */
    public static final class b<T, K, V> extends AtomicLong implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: j, reason: collision with root package name */
        public static final Object f403017j = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f403018b;

        /* renamed from: d, reason: collision with root package name */
        public final ConcurrentHashMap f403020d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f403021e;

        /* renamed from: i, reason: collision with root package name */
        public boolean f403025i;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f403022f = new AtomicBoolean();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f403023g = new AtomicInteger(1);

        /* renamed from: h, reason: collision with root package name */
        public final AtomicLong f403024h = new AtomicLong();

        /* renamed from: c, reason: collision with root package name */
        public final int f403019c = 0;

        public b(InterfaceC41782o interfaceC41782o, ConcurrentHashMap concurrentHashMap) {
            this.f403018b = interfaceC41782o;
            this.f403020d = concurrentHashMap;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f403021e, eVar)) {
                this.f403021e = eVar;
                this.f403018b.K(this);
                eVar.request(0);
            }
        }

        public final void a(long j12) {
            long j13;
            long jC2;
            AtomicLong atomicLong = this.f403024h;
            do {
                j13 = atomicLong.get();
                jC2 = io.reactivex.rxjava3.internal.util.c.c(j13, j12);
            } while (!atomicLong.compareAndSet(j13, jC2));
            while (true) {
                long j14 = this.f403019c;
                if (jC2 < j14) {
                    return;
                }
                if (atomicLong.compareAndSet(jC2, jC2 - j14)) {
                    this.f403021e.request(j14);
                }
                jC2 = atomicLong.get();
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f403022f.compareAndSet(false, true) && this.f403023g.decrementAndGet() == 0) {
                this.f403021e.cancel();
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f403025i) {
                return;
            }
            ConcurrentHashMap concurrentHashMap = this.f403020d;
            Iterator<V> it = concurrentHashMap.values().iterator();
            if (it.hasNext()) {
                ((c) it.next()).getClass();
                throw null;
            }
            concurrentHashMap.clear();
            this.f403025i = true;
            this.f403018b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f403025i) {
                C47998a.b(th2);
                return;
            }
            this.f403025i = true;
            Iterator<V> it = this.f403020d.values().iterator();
            if (it.hasNext()) {
                ((c) it.next()).getClass();
                throw null;
            }
            this.f403020d.clear();
            this.f403018b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f403025i) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403021e.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this, j12);
            }
        }
    }

    /* compiled from: FlowableGroupBy.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u0$c */
    public static final class c<K, T> extends AbstractC42504b<K, T> {
        @Override // io.reactivex.rxjava3.core.AbstractC41777j
        public final void u(org.reactivestreams.d<? super T> dVar) {
            throw null;
        }
    }

    /* compiled from: FlowableGroupBy.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u0$d */
    public static final class d<T, K> extends AbstractC44583c<T> implements org.reactivestreams.c<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f403026b;

        /* renamed from: c, reason: collision with root package name */
        public Throwable f403027c;

        /* renamed from: d, reason: collision with root package name */
        public int f403028d;

        @Override // org.reactivestreams.e
        public final void cancel() {
            throw null;
        }

        @Override // q41.g
        public final void clear() {
            throw null;
        }

        @Override // org.reactivestreams.c
        public final void d(org.reactivestreams.d<? super T> dVar) {
            throw null;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            throw null;
        }

        public final boolean l(boolean z12, boolean z13, org.reactivestreams.d dVar, long j12, boolean z14) {
            throw null;
        }

        public final void m(long j12, boolean z12) {
            if (z12) {
                j12++;
            }
            if (j12 != 0) {
                n(j12);
            }
        }

        public final void n(long j12) {
            throw null;
        }

        public final void o() {
            int i12 = this.f403028d;
            if (i12 != 0) {
                this.f403028d = 0;
                n(i12);
            }
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
                if (getAndIncrement() == 0) {
                    throw null;
                }
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            return 0;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super AbstractC42504b<K, V>> dVar) {
        try {
            this.f402624c.q(new b((InterfaceC41782o) dVar, new ConcurrentHashMap()));
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            dVar.K(EmptyComponent.f404817b);
            dVar.onError(th2);
        }
    }
}
