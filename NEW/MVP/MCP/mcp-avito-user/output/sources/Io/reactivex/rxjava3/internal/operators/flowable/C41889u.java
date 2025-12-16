package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.operators.flowable.G0;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o41.AbstractC44583c;
import s41.C47998a;

/* compiled from: FlowableCombineLatest.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41889u<T, R> extends AbstractC41777j<R> {

    /* renamed from: c, reason: collision with root package name */
    @j41.f
    public final org.reactivestreams.c<? extends T>[] f402996c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super Object[], ? extends R> f402997d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402998e;

    /* compiled from: FlowableCombineLatest.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u$a */
    public static final class a<T, R> extends AbstractC44583c<R> {
        private static final long serialVersionUID = -5082275438355852221L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402999b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super Object[], ? extends R> f403000c;

        /* renamed from: d, reason: collision with root package name */
        public final b<T>[] f403001d;

        /* renamed from: e, reason: collision with root package name */
        public final q41.i<Object> f403002e;

        /* renamed from: f, reason: collision with root package name */
        public final Object[] f403003f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f403004g;

        /* renamed from: h, reason: collision with root package name */
        public int f403005h;

        /* renamed from: i, reason: collision with root package name */
        public int f403006i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f403007j;

        /* renamed from: k, reason: collision with root package name */
        public final AtomicLong f403008k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f403009l;

        /* renamed from: m, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403010m;

        public a(InterfaceC41782o interfaceC41782o, l41.o oVar, int i12, int i13) {
            this.f402999b = interfaceC41782o;
            this.f403000c = oVar;
            b<T>[] bVarArr = new b[i12];
            for (int i14 = 0; i14 < i12; i14++) {
                bVarArr[i14] = new b<>(this, i14, i13);
            }
            this.f403001d = bVarArr;
            this.f403003f = new Object[i12];
            this.f403002e = new q41.i<>(i13);
            this.f403008k = new AtomicLong();
            this.f403010m = new io.reactivex.rxjava3.internal.util.b();
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            if (this.f403004g) {
                InterfaceC41782o interfaceC41782o = this.f402999b;
                q41.i<Object> iVar = this.f403002e;
                while (!this.f403007j) {
                    Throwable th2 = this.f403010m.get();
                    if (th2 != null) {
                        iVar.clear();
                        interfaceC41782o.onError(th2);
                        return;
                    }
                    boolean z12 = this.f403009l;
                    boolean zIsEmpty = iVar.isEmpty();
                    if (!zIsEmpty) {
                        interfaceC41782o.onNext(null);
                    }
                    if (z12 && zIsEmpty) {
                        interfaceC41782o.e();
                        return;
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                iVar.clear();
                return;
            }
            InterfaceC41782o interfaceC41782o2 = this.f402999b;
            q41.i<?> iVar2 = this.f403002e;
            int iAddAndGet2 = 1;
            do {
                long j12 = this.f403008k.get();
                long j13 = 0;
                while (j13 != j12) {
                    boolean z13 = this.f403009l;
                    Object objPoll = iVar2.poll();
                    boolean z14 = objPoll == null;
                    if (m(z13, z14, interfaceC41782o2, iVar2)) {
                        return;
                    }
                    if (z14) {
                        break;
                    }
                    try {
                        R rApply = this.f403000c.apply((Object[]) iVar2.poll());
                        Objects.requireNonNull(rApply, "The combiner returned a null value");
                        interfaceC41782o2.onNext(rApply);
                        ((b) objPoll).a();
                        j13++;
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.a(th3);
                        l();
                        io.reactivex.rxjava3.internal.util.h.a(this.f403010m, th3);
                        interfaceC41782o2.onError(io.reactivex.rxjava3.internal.util.h.d(this.f403010m));
                        return;
                    }
                }
                if (j13 == j12 && m(this.f403009l, iVar2.isEmpty(), interfaceC41782o2, iVar2)) {
                    return;
                }
                if (j13 != 0 && j12 != Long.MAX_VALUE) {
                    this.f403008k.addAndGet(-j13);
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f403007j = true;
            l();
            c();
        }

        @Override // q41.g
        public final void clear() {
            this.f403002e.clear();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f403002e.isEmpty();
        }

        public final void l() {
            for (b<T> bVar : this.f403001d) {
                bVar.getClass();
                SubscriptionHelper.a(bVar);
            }
        }

        public final boolean m(boolean z12, boolean z13, org.reactivestreams.d<?> dVar, q41.i<?> iVar) {
            if (this.f403007j) {
                l();
                iVar.clear();
                this.f403010m.c();
                return true;
            }
            if (!z12) {
                return false;
            }
            Throwable thD = io.reactivex.rxjava3.internal.util.h.d(this.f403010m);
            if (thD != null && thD != io.reactivex.rxjava3.internal.util.h.f404834a) {
                l();
                iVar.clear();
                dVar.onError(thD);
                return true;
            }
            if (!z13) {
                return false;
            }
            l();
            dVar.e();
            return true;
        }

        @Override // q41.g
        @j41.f
        public final R poll() {
            q41.i<Object> iVar = this.f403002e;
            Object objPoll = iVar.poll();
            if (objPoll == null) {
                return null;
            }
            R rApply = this.f403000c.apply((Object[]) iVar.poll());
            Objects.requireNonNull(rApply, "The combiner returned a null value");
            ((b) objPoll).a();
            return rApply;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f403008k, j12);
                c();
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            if ((i12 & 4) != 0) {
                return 0;
            }
            int i13 = i12 & 2;
            this.f403004g = i13 != 0;
            return i13;
        }
    }

    /* compiled from: FlowableCombineLatest.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u$b */
    public static final class b<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -8730235182291002949L;

        /* renamed from: b, reason: collision with root package name */
        public final a<T, ?> f403011b;

        /* renamed from: c, reason: collision with root package name */
        public final int f403012c;

        /* renamed from: d, reason: collision with root package name */
        public final int f403013d;

        /* renamed from: e, reason: collision with root package name */
        public final int f403014e;

        /* renamed from: f, reason: collision with root package name */
        public int f403015f;

        public b(a<T, ?> aVar, int i12, int i13) {
            this.f403011b = aVar;
            this.f403012c = i12;
            this.f403013d = i13;
            this.f403014e = i13 - (i13 >> 2);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, this.f403013d);
        }

        public final void a() {
            int i12 = this.f403015f + 1;
            if (i12 != this.f403014e) {
                this.f403015f = i12;
            } else {
                this.f403015f = 0;
                get().request(i12);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            int i12;
            a<T, ?> aVar = this.f403011b;
            int i13 = this.f403012c;
            synchronized (aVar) {
                try {
                    Object[] objArr = aVar.f403003f;
                    if (objArr[i13] != null && (i12 = aVar.f403006i + 1) != objArr.length) {
                        aVar.f403006i = i12;
                    } else {
                        aVar.f403009l = true;
                        aVar.c();
                    }
                } finally {
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            a<T, ?> aVar = this.f403011b;
            if (!io.reactivex.rxjava3.internal.util.h.a(aVar.f403010m, th2)) {
                C47998a.b(th2);
                return;
            }
            aVar.l();
            aVar.f403009l = true;
            aVar.c();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            boolean z12;
            a<T, ?> aVar = this.f403011b;
            int i12 = this.f403012c;
            synchronized (aVar) {
                try {
                    Object[] objArr = aVar.f403003f;
                    int i13 = aVar.f403005h;
                    if (objArr[i12] == null) {
                        i13++;
                        aVar.f403005h = i13;
                    }
                    objArr[i12] = t12;
                    if (objArr.length == i13) {
                        aVar.f403002e.a(aVar.f403001d[i12], objArr.clone());
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z12) {
                aVar.f403001d[i12].a();
            } else {
                aVar.c();
            }
        }
    }

    /* compiled from: FlowableCombineLatest.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.u$c */
    public final class c implements l41.o<T, R> {
        public c() {
        }

        @Override // l41.o
        public final R apply(T t12) {
            return C41889u.this.f402997d.apply(new Object[]{t12});
        }
    }

    public C41889u(@j41.e org.reactivestreams.c[] cVarArr, @j41.e l41.o oVar, int i12) {
        this.f402996c = cVarArr;
        this.f402997d = oVar;
        this.f402998e = i12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        org.reactivestreams.c<? extends T>[] cVarArr = this.f402996c;
        if (cVarArr == null) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                EmptySubscription.b(th2, dVar);
                return;
            }
        }
        int length = cVarArr.length;
        if (length == 0) {
            EmptySubscription.a(dVar);
            return;
        }
        if (length == 1) {
            cVarArr[0].d(new G0.b((InterfaceC41782o) dVar, new c()));
            return;
        }
        a aVar = new a((InterfaceC41782o) dVar, this.f402997d, length, this.f402998e);
        dVar.K(aVar);
        b<T>[] bVarArr = aVar.f403001d;
        for (int i12 = 0; i12 < length && !aVar.f403009l && !aVar.f403007j; i12++) {
            cVarArr[i12].d(bVarArr[i12]);
        }
    }
}
