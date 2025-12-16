package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableZip.java */
/* loaded from: classes8.dex */
public final class h2<T, R> extends AbstractC41777j<R> {

    /* renamed from: c, reason: collision with root package name */
    public final org.reactivestreams.c<? extends T>[] f402803c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super Object[], ? extends R> f402804d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402805e;

    /* compiled from: FlowableZip.java */
    public static final class a<T, R> extends AtomicInteger implements org.reactivestreams.e {
        private static final long serialVersionUID = -2434867452883857743L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402806b;

        /* renamed from: c, reason: collision with root package name */
        public final b<T, R>[] f402807c;

        /* renamed from: d, reason: collision with root package name */
        public final l41.o<? super Object[], ? extends R> f402808d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f402809e;

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402810f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402811g;

        /* renamed from: h, reason: collision with root package name */
        public final Object[] f402812h;

        public a(InterfaceC41782o interfaceC41782o, l41.o oVar, int i12, int i13) {
            this.f402806b = interfaceC41782o;
            this.f402808d = oVar;
            b<T, R>[] bVarArr = new b[i12];
            for (int i14 = 0; i14 < i12; i14++) {
                bVarArr[i14] = new b<>(this, i13);
            }
            this.f402812h = new Object[i12];
            this.f402807c = bVarArr;
            this.f402809e = new AtomicLong();
            this.f402810f = new io.reactivex.rxjava3.internal.util.b();
        }

        public final void a() {
            for (b<T, R> bVar : this.f402807c) {
                bVar.getClass();
                SubscriptionHelper.a(bVar);
            }
        }

        public final void b() {
            T tPoll;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f402806b;
            b<T, R>[] bVarArr = this.f402807c;
            int length = bVarArr.length;
            Object[] objArr = this.f402812h;
            int iAddAndGet = 1;
            do {
                long j12 = this.f402809e.get();
                long j13 = 0;
                while (j12 != j13) {
                    if (this.f402811g) {
                        return;
                    }
                    if (this.f402810f.get() != null) {
                        a();
                        this.f402810f.g(interfaceC41782o);
                        return;
                    }
                    boolean z12 = false;
                    for (int i12 = 0; i12 < length; i12++) {
                        b<T, R> bVar = bVarArr[i12];
                        if (objArr[i12] == null) {
                            boolean z13 = bVar.f402818g;
                            q41.g<T> gVar = bVar.f402816e;
                            if (gVar != null) {
                                try {
                                    tPoll2 = gVar.poll();
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.a(th2);
                                    this.f402810f.b(th2);
                                    a();
                                    this.f402810f.g(interfaceC41782o);
                                    return;
                                }
                            } else {
                                tPoll2 = null;
                            }
                            boolean z14 = tPoll2 == null;
                            if (z13 && z14) {
                                a();
                                this.f402810f.g(interfaceC41782o);
                                return;
                            } else if (z14) {
                                z12 = true;
                            } else {
                                objArr[i12] = tPoll2;
                            }
                        }
                    }
                    if (z12) {
                        break;
                    }
                    try {
                        R rApply = this.f402808d.apply(objArr.clone());
                        Objects.requireNonNull(rApply, "The zipper returned a null value");
                        interfaceC41782o.onNext(rApply);
                        j13++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.a(th3);
                        a();
                        this.f402810f.b(th3);
                        this.f402810f.g(interfaceC41782o);
                        return;
                    }
                }
                if (j12 == j13) {
                    if (this.f402811g) {
                        return;
                    }
                    if (this.f402810f.get() != null) {
                        a();
                        this.f402810f.g(interfaceC41782o);
                        return;
                    }
                    for (int i13 = 0; i13 < length; i13++) {
                        b<T, R> bVar2 = bVarArr[i13];
                        if (objArr[i13] == null) {
                            boolean z15 = bVar2.f402818g;
                            q41.g<T> gVar2 = bVar2.f402816e;
                            if (gVar2 != null) {
                                try {
                                    tPoll = gVar2.poll();
                                } catch (Throwable th4) {
                                    io.reactivex.rxjava3.exceptions.a.a(th4);
                                    this.f402810f.b(th4);
                                    a();
                                    this.f402810f.g(interfaceC41782o);
                                    return;
                                }
                            } else {
                                tPoll = null;
                            }
                            boolean z16 = tPoll == null;
                            if (z15 && z16) {
                                a();
                                this.f402810f.g(interfaceC41782o);
                                return;
                            } else if (!z16) {
                                objArr[i13] = tPoll;
                            }
                        }
                    }
                }
                if (j13 != 0) {
                    for (b<T, R> bVar3 : bVarArr) {
                        bVar3.request(j13);
                    }
                    if (j12 != Long.MAX_VALUE) {
                        this.f402809e.addAndGet(-j13);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402811g) {
                return;
            }
            this.f402811g = true;
            a();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402809e, j12);
                b();
            }
        }
    }

    /* compiled from: FlowableZip.java */
    public static final class b<T, R> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -4627193790118206028L;

        /* renamed from: b, reason: collision with root package name */
        public final a<T, R> f402813b;

        /* renamed from: c, reason: collision with root package name */
        public final int f402814c;

        /* renamed from: d, reason: collision with root package name */
        public final int f402815d;

        /* renamed from: e, reason: collision with root package name */
        public q41.g<T> f402816e;

        /* renamed from: f, reason: collision with root package name */
        public long f402817f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402818g;

        /* renamed from: h, reason: collision with root package name */
        public int f402819h;

        public b(a<T, R> aVar, int i12) {
            this.f402813b = aVar;
            this.f402814c = i12;
            this.f402815d = i12 - (i12 >> 2);
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this, eVar)) {
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(7);
                    if (iV2 == 1) {
                        this.f402819h = iV2;
                        this.f402816e = dVar;
                        this.f402818g = true;
                        this.f402813b.b();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f402819h = iV2;
                        this.f402816e = dVar;
                        eVar.request(this.f402814c);
                        return;
                    }
                }
                this.f402816e = new q41.h(this.f402814c);
                eVar.request(this.f402814c);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402818g = true;
            this.f402813b.b();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            a<T, R> aVar = this.f402813b;
            if (aVar.f402810f.b(th2)) {
                this.f402818g = true;
                aVar.b();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402819h != 2) {
                this.f402816e.offer(t12);
            }
            this.f402813b.b();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (this.f402819h != 1) {
                long j13 = this.f402817f + j12;
                if (j13 < this.f402815d) {
                    this.f402817f = j13;
                } else {
                    this.f402817f = 0L;
                    get().request(j13);
                }
            }
        }
    }

    public h2(org.reactivestreams.c[] cVarArr, l41.o oVar, int i12) {
        this.f402803c = cVarArr;
        this.f402804d = oVar;
        this.f402805e = i12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        org.reactivestreams.c<? extends T>[] cVarArr = this.f402803c;
        cVarArr.getClass();
        int length = cVarArr.length;
        if (length == 0) {
            EmptySubscription.a(dVar);
            return;
        }
        a aVar = new a((InterfaceC41782o) dVar, this.f402804d, length, this.f402805e);
        dVar.K(aVar);
        b<T, R>[] bVarArr = aVar.f402807c;
        for (int i12 = 0; i12 < length && !aVar.f402811g && aVar.f402810f.get() == null; i12++) {
            cVarArr[i12].d(bVarArr[i12]);
        }
    }
}
