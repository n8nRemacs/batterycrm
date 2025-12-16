package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowablePublishMulticast.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.a1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41832a1<T, R> extends AbstractC41833b<T, R> {

    /* compiled from: FlowablePublishMulticast.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.a1$a */
    public static final class a<T> extends AbstractC41777j<T> implements InterfaceC41782o<T> {

        /* renamed from: l, reason: collision with root package name */
        public static final b[] f402599l = new b[0];

        /* renamed from: m, reason: collision with root package name */
        public static final b[] f402600m = new b[0];

        /* renamed from: g, reason: collision with root package name */
        public volatile q41.g<T> f402605g;

        /* renamed from: h, reason: collision with root package name */
        public int f402606h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f402607i;

        /* renamed from: j, reason: collision with root package name */
        public Throwable f402608j;

        /* renamed from: k, reason: collision with root package name */
        public int f402609k;

        /* renamed from: e, reason: collision with root package name */
        public final int f402603e = 0;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f402601c = new AtomicInteger();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402604f = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<b<T>[]> f402602d = new AtomicReference<>(f402599l);

        /* JADX WARN: Code restructure failed: missing block: B:72:0x00eb, code lost:
        
            r8 = r5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void A() {
            /*
                Method dump skipped, instructions count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41832a1.a.A():void");
        }

        public final void B(Throwable th2) {
            for (b<T> bVar : this.f402602d.getAndSet(f402600m)) {
                if (bVar.get() != Long.MIN_VALUE) {
                    bVar.f402610b.onError(th2);
                }
            }
        }

        public final void D(b<T> bVar) {
            b<T>[] bVarArr;
            while (true) {
                AtomicReference<b<T>[]> atomicReference = this.f402602d;
                b<T>[] bVarArr2 = atomicReference.get();
                int length = bVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i12 = -1;
                        break;
                    } else if (bVarArr2[i12] == bVar) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr = f402599l;
                } else {
                    b<T>[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr2, 0, bVarArr3, 0, i12);
                    System.arraycopy(bVarArr2, i12 + 1, bVarArr3, i12, (length - i12) - 1);
                    bVarArr = bVarArr3;
                }
                while (!atomicReference.compareAndSet(bVarArr2, bVarArr)) {
                    if (atomicReference.get() != bVarArr2) {
                        break;
                    }
                }
                return;
            }
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this.f402604f, eVar)) {
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(3);
                    if (iV2 == 1) {
                        this.f402606h = iV2;
                        this.f402605g = dVar;
                        this.f402607i = true;
                        A();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f402606h = iV2;
                        this.f402605g = dVar;
                        eVar.request(0);
                        return;
                    }
                }
                this.f402605g = new q41.h(0);
                eVar.request(0);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402607i) {
                return;
            }
            this.f402607i = true;
            A();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402607i) {
                C47998a.b(th2);
                return;
            }
            this.f402608j = th2;
            this.f402607i = true;
            A();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402607i) {
                return;
            }
            if (this.f402606h != 0 || this.f402605g.offer(t12)) {
                A();
            } else {
                this.f402604f.get().cancel();
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.rxjava3.core.AbstractC41777j
        public final void u(org.reactivestreams.d<? super T> dVar) {
            b<T> bVar = new b<>((InterfaceC41782o) dVar, this);
            dVar.K(bVar);
            while (true) {
                AtomicReference<b<T>[]> atomicReference = this.f402602d;
                b<T>[] bVarArr = atomicReference.get();
                if (bVarArr == f402600m) {
                    Throwable th2 = this.f402608j;
                    if (th2 != null) {
                        dVar.onError(th2);
                        return;
                    } else {
                        dVar.e();
                        return;
                    }
                }
                int length = bVarArr.length;
                b<T>[] bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
                while (!atomicReference.compareAndSet(bVarArr, bVarArr2)) {
                    if (atomicReference.get() != bVarArr) {
                        break;
                    }
                }
                if (bVar.get() == Long.MIN_VALUE) {
                    D(bVar);
                    return;
                } else {
                    A();
                    return;
                }
            }
        }

        public final void z() {
            for (b<T> bVar : this.f402602d.getAndSet(f402600m)) {
                if (bVar.get() != Long.MIN_VALUE) {
                    bVar.f402610b.e();
                }
            }
        }
    }

    /* compiled from: FlowablePublishMulticast.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.a1$b */
    public static final class b<T> extends AtomicLong implements org.reactivestreams.e {
        private static final long serialVersionUID = 8664815189257569791L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402610b;

        /* renamed from: c, reason: collision with root package name */
        public final a<T> f402611c;

        /* renamed from: d, reason: collision with root package name */
        public long f402612d;

        public b(InterfaceC41782o interfaceC41782o, a aVar) {
            this.f402610b = interfaceC41782o;
            this.f402611c = aVar;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                a<T> aVar = this.f402611c;
                aVar.D(this);
                aVar.A();
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.b(this, j12);
                this.f402611c.A();
            }
        }
    }

    /* compiled from: FlowablePublishMulticast.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.a1$c */
    public static final class c<R> implements InterfaceC41782o<R>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402613b;

        public c() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402613b, eVar)) {
                this.f402613b = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402613b.cancel();
            throw null;
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
        public final void onNext(R r12) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402613b.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a();
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
