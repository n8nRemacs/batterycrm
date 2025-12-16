package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableCache.java */
/* loaded from: classes8.dex */
public final class r<T> extends AbstractC41833b<T, T> implements InterfaceC41782o<T> {

    /* renamed from: d, reason: collision with root package name */
    public volatile long f402946d;

    /* renamed from: e, reason: collision with root package name */
    public b<T> f402947e;

    /* renamed from: f, reason: collision with root package name */
    public int f402948f;

    /* compiled from: FlowableCache.java */
    public static final class a<T> extends AtomicInteger implements org.reactivestreams.e {
        private static final long serialVersionUID = 6770240836423125754L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402949b;

        /* renamed from: c, reason: collision with root package name */
        public final r<T> f402950c;

        /* renamed from: f, reason: collision with root package name */
        public int f402953f;

        /* renamed from: g, reason: collision with root package name */
        public long f402954g;

        /* renamed from: e, reason: collision with root package name */
        public b<T> f402952e = null;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f402951d = new AtomicLong();

        public a(InterfaceC41782o interfaceC41782o, r rVar) {
            this.f402949b = interfaceC41782o;
            this.f402950c = rVar;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402951d.getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f402950c.getClass();
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (!SubscriptionHelper.h(j12)) {
                return;
            }
            io.reactivex.rxjava3.internal.util.c.b(this.f402951d, j12);
            r<T> rVar = this.f402950c;
            rVar.getClass();
            if (getAndIncrement() != 0) {
                return;
            }
            long j13 = this.f402954g;
            int i12 = this.f402953f;
            b<T> bVar = this.f402952e;
            AtomicLong atomicLong = this.f402951d;
            InterfaceC41782o interfaceC41782o = this.f402949b;
            int iAddAndGet = 1;
            while (true) {
                boolean z12 = rVar.f402946d == j13;
                if (z12) {
                    this.f402952e = null;
                    interfaceC41782o.e();
                    return;
                }
                if (!z12) {
                    long j14 = atomicLong.get();
                    if (j14 == Long.MIN_VALUE) {
                        this.f402952e = null;
                        return;
                    } else if (j14 != j13) {
                        if (i12 == 0) {
                            bVar = bVar.f402956b;
                            i12 = 0;
                        }
                        interfaceC41782o.onNext(bVar.f402955a[i12]);
                        i12++;
                        j13++;
                    }
                }
                this.f402954g = j13;
                this.f402953f = i12;
                this.f402952e = bVar;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    /* compiled from: FlowableCache.java */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T[] f402955a;

        /* renamed from: b, reason: collision with root package name */
        public volatile b<T> f402956b;

        public b(int i12) {
            this.f402955a = (T[]) new Object[i12];
        }
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        eVar.request(Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.d
    public final void e() {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        C47998a.b(th2);
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        int i12 = this.f402948f;
        if (i12 == 0) {
            b<T> bVar = new b<>(i12);
            bVar.f402955a[0] = t12;
            this.f402948f = 1;
            this.f402947e.f402956b = bVar;
            this.f402947e = bVar;
        } else {
            this.f402947e.f402955a[i12] = t12;
            this.f402948f = i12 + 1;
        }
        this.f402946d++;
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new a((InterfaceC41782o) dVar, this));
        throw null;
    }
}
