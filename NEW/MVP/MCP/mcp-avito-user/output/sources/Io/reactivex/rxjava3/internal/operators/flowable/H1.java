package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableSwitchMap.java */
/* loaded from: classes8.dex */
public final class H1<T, R> extends AbstractC41833b<T, R> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> f402359d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402360e;

    /* compiled from: FlowableSwitchMap.java */
    public static final class a<T, R> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* renamed from: b, reason: collision with root package name */
        public final b<T, R> f402361b;

        /* renamed from: c, reason: collision with root package name */
        public final long f402362c;

        /* renamed from: d, reason: collision with root package name */
        public final int f402363d;

        /* renamed from: e, reason: collision with root package name */
        public volatile q41.g<R> f402364e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f402365f;

        /* renamed from: g, reason: collision with root package name */
        public int f402366g;

        public a(b<T, R> bVar, long j12, int i12) {
            this.f402361b = bVar;
            this.f402362c = j12;
            this.f402363d = i12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this, eVar)) {
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(7);
                    if (iV2 == 1) {
                        this.f402366g = iV2;
                        this.f402364e = dVar;
                        this.f402365f = true;
                        this.f402361b.b();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f402366g = iV2;
                        this.f402364e = dVar;
                        eVar.request(this.f402363d);
                        return;
                    }
                }
                this.f402364e = new q41.h(this.f402363d);
                eVar.request(this.f402363d);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            b<T, R> bVar = this.f402361b;
            if (this.f402362c == bVar.f402377k) {
                this.f402365f = true;
                bVar.b();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f402361b;
            if (this.f402362c == bVar.f402377k) {
                io.reactivex.rxjava3.internal.util.b bVar2 = bVar.f402372f;
                bVar2.getClass();
                if (io.reactivex.rxjava3.internal.util.h.a(bVar2, th2)) {
                    bVar.f402374h.cancel();
                    bVar.f402371e = true;
                    this.f402365f = true;
                    bVar.b();
                    return;
                }
            }
            C47998a.b(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(R r12) {
            b<T, R> bVar = this.f402361b;
            if (this.f402362c == bVar.f402377k) {
                if (this.f402366g != 0 || this.f402364e.offer(r12)) {
                    bVar.b();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }
    }

    /* compiled from: FlowableSwitchMap.java */
    public static final class b<T, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: l, reason: collision with root package name */
        public static final a<Object, Object> f402367l;
        private static final long serialVersionUID = -3491074160481096299L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402368b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> f402369c;

        /* renamed from: d, reason: collision with root package name */
        public final int f402370d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f402371e;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402373g;

        /* renamed from: h, reason: collision with root package name */
        public org.reactivestreams.e f402374h;

        /* renamed from: k, reason: collision with root package name */
        public volatile long f402377k;

        /* renamed from: i, reason: collision with root package name */
        public final AtomicReference<a<T, R>> f402375i = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        public final AtomicLong f402376j = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402372f = new io.reactivex.rxjava3.internal.util.b();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f402367l = aVar;
            SubscriptionHelper.a(aVar);
        }

        public b(InterfaceC41782o interfaceC41782o, l41.o oVar, int i12) {
            this.f402368b = interfaceC41782o;
            this.f402369c = oVar;
            this.f402370d = i12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402374h, eVar)) {
                this.f402374h = eVar;
                this.f402368b.K(this);
            }
        }

        public final void a() {
            AtomicReference<a<T, R>> atomicReference = this.f402375i;
            a<Object, Object> aVar = f402367l;
            a<Object, Object> aVar2 = (a) atomicReference.getAndSet(aVar);
            if (aVar2 == aVar || aVar2 == null) {
                return;
            }
            SubscriptionHelper.a(aVar2);
        }

        public final void b() {
            boolean z12;
            T tPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC41782o interfaceC41782o = this.f402368b;
            int iAddAndGet = 1;
            while (!this.f402373g) {
                if (this.f402371e) {
                    if (this.f402372f.get() != null) {
                        a();
                        this.f402372f.g(interfaceC41782o);
                        return;
                    } else if (this.f402375i.get() == null) {
                        interfaceC41782o.e();
                        return;
                    }
                }
                a<T, R> aVar = this.f402375i.get();
                q41.g<R> gVar = aVar != null ? aVar.f402364e : null;
                if (gVar != null) {
                    long j12 = this.f402376j.get();
                    long j13 = 0;
                    while (j13 != j12) {
                        if (!this.f402373g) {
                            boolean z13 = aVar.f402365f;
                            try {
                                tPoll = gVar.poll();
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                SubscriptionHelper.a(aVar);
                                this.f402372f.b(th2);
                                tPoll = null;
                                z13 = true;
                            }
                            boolean z14 = tPoll == null;
                            if (aVar == this.f402375i.get()) {
                                if (z13) {
                                    if (this.f402372f.get() != null) {
                                        this.f402372f.g(interfaceC41782o);
                                        return;
                                    } else if (z14) {
                                        AtomicReference<a<T, R>> atomicReference = this.f402375i;
                                        while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                                        }
                                    }
                                }
                                if (z14) {
                                    break;
                                }
                                interfaceC41782o.onNext(tPoll);
                                j13++;
                            }
                            z12 = true;
                            break;
                        }
                        return;
                    }
                    z12 = false;
                    if (j13 == j12 && aVar.f402365f) {
                        if (this.f402372f.get() != null) {
                            a();
                            this.f402372f.g(interfaceC41782o);
                            return;
                        } else if (gVar.isEmpty()) {
                            AtomicReference<a<T, R>> atomicReference2 = this.f402375i;
                            while (!atomicReference2.compareAndSet(aVar, null) && atomicReference2.get() == aVar) {
                            }
                        }
                    }
                    if (j13 != 0 && !this.f402373g) {
                        if (j12 != Long.MAX_VALUE) {
                            this.f402376j.addAndGet(-j13);
                        }
                        if (aVar.f402366g != 1) {
                            aVar.get().request(j13);
                        }
                    }
                    if (z12) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402373g) {
                return;
            }
            this.f402373g = true;
            this.f402374h.cancel();
            a();
            this.f402372f.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402371e) {
                return;
            }
            this.f402371e = true;
            b();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (!this.f402371e) {
                io.reactivex.rxjava3.internal.util.b bVar = this.f402372f;
                bVar.getClass();
                if (io.reactivex.rxjava3.internal.util.h.a(bVar, th2)) {
                    a();
                    this.f402371e = true;
                    b();
                    return;
                }
            }
            C47998a.b(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402371e) {
                return;
            }
            long j12 = this.f402377k + 1;
            this.f402377k = j12;
            a<T, R> aVar = this.f402375i.get();
            if (aVar != null) {
                SubscriptionHelper.a(aVar);
            }
            try {
                org.reactivestreams.c<? extends R> cVarApply = this.f402369c.apply(t12);
                Objects.requireNonNull(cVarApply, "The publisher returned is null");
                org.reactivestreams.c<? extends R> cVar = cVarApply;
                a<T, R> aVar2 = new a<>(this, j12, this.f402370d);
                while (true) {
                    a<T, R> aVar3 = this.f402375i.get();
                    if (aVar3 == f402367l) {
                        return;
                    }
                    AtomicReference<a<T, R>> atomicReference = this.f402375i;
                    while (!atomicReference.compareAndSet(aVar3, aVar2)) {
                        if (atomicReference.get() != aVar3) {
                            break;
                        }
                    }
                    cVar.d(aVar2);
                    return;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402374h.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402376j, j12);
                if (this.f402377k == 0) {
                    this.f402374h.request(Long.MAX_VALUE);
                } else {
                    b();
                }
            }
        }
    }

    public H1(AbstractC41777j abstractC41777j, l41.o oVar, int i12) {
        super(abstractC41777j);
        this.f402359d = oVar;
        this.f402360e = i12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        InterfaceC41782o interfaceC41782o = (InterfaceC41782o) dVar;
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        l41.o<? super T, ? extends org.reactivestreams.c<? extends R>> oVar = this.f402359d;
        if (C41882r1.b(abstractC41777j, interfaceC41782o, oVar)) {
            return;
        }
        abstractC41777j.q(new b(interfaceC41782o, oVar, this.f402360e));
    }
}
