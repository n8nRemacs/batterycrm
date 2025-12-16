package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableBufferBoundary.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41872o<T, U extends Collection<? super T>, Open, Close> extends AbstractC41833b<T, U> {

    /* compiled from: FlowableBufferBoundary.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.o$a */
    public static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -8466418554264089604L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402909b;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402914g;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f402916i;

        /* renamed from: k, reason: collision with root package name */
        public long f402918k;

        /* renamed from: h, reason: collision with root package name */
        public final q41.i<C> f402915h = new q41.i<>(AbstractC41777j.f401972b);

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402910c = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f402911d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402912e = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        public LinkedHashMap f402917j = new LinkedHashMap();

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402913f = new io.reactivex.rxjava3.internal.util.b();

        /* compiled from: FlowableBufferBoundary.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.o$a$a, reason: collision with other inner class name */
        public static final class C11465a<Open> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Open>, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -8498650778633225126L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, ?, Open, ?> f402919b;

            public C11465a(a<?, ?, Open, ?> aVar) {
                this.f402919b = aVar;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                SubscriptionHelper.a(this);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                lazySet(SubscriptionHelper.f404813b);
                a<?, ?, Open, ?> aVar = this.f402919b;
                aVar.f402910c.c(this);
                if (aVar.f402910c.g() == 0) {
                    SubscriptionHelper.a(aVar.f402912e);
                    aVar.f402914g = true;
                    aVar.b();
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return get() == SubscriptionHelper.f404813b;
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                lazySet(SubscriptionHelper.f404813b);
                a<?, ?, Open, ?> aVar = this.f402919b;
                SubscriptionHelper.a(aVar.f402912e);
                aVar.f402910c.c(this);
                aVar.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(Open open) {
                a<?, ?, Open, ?> aVar = this.f402919b;
                aVar.getClass();
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    SubscriptionHelper.a(aVar.f402912e);
                    aVar.onError(th2);
                }
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402909b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this.f402912e, eVar)) {
                this.f402910c.b(new C11465a(this));
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(b<T, C> bVar, long j12) {
            boolean z12;
            this.f402910c.c(bVar);
            if (this.f402910c.g() == 0) {
                SubscriptionHelper.a(this.f402912e);
                z12 = true;
            } else {
                z12 = false;
            }
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f402917j;
                    if (linkedHashMap == null) {
                        return;
                    }
                    this.f402915h.offer(linkedHashMap.remove(Long.valueOf(j12)));
                    if (z12) {
                        this.f402914g = true;
                    }
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j12 = this.f402918k;
            InterfaceC41782o interfaceC41782o = this.f402909b;
            q41.i<C> iVar = this.f402915h;
            int iAddAndGet = 1;
            do {
                long j13 = this.f402911d.get();
                while (j12 != j13) {
                    if (this.f402916i) {
                        iVar.clear();
                        return;
                    }
                    boolean z12 = this.f402914g;
                    if (z12 && this.f402913f.get() != null) {
                        iVar.clear();
                        this.f402913f.g(interfaceC41782o);
                        return;
                    }
                    C cPoll = iVar.poll();
                    boolean z13 = cPoll == null;
                    if (z12 && z13) {
                        interfaceC41782o.e();
                        return;
                    } else {
                        if (z13) {
                            break;
                        }
                        interfaceC41782o.onNext(cPoll);
                        j12++;
                    }
                }
                if (j12 == j13) {
                    if (this.f402916i) {
                        iVar.clear();
                        return;
                    }
                    if (this.f402914g) {
                        if (this.f402913f.get() != null) {
                            iVar.clear();
                            this.f402913f.g(interfaceC41782o);
                            return;
                        } else if (iVar.isEmpty()) {
                            interfaceC41782o.e();
                            return;
                        }
                    }
                }
                this.f402918k = j12;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (SubscriptionHelper.a(this.f402912e)) {
                this.f402916i = true;
                this.f402910c.dispose();
                synchronized (this) {
                    this.f402917j = null;
                }
                if (getAndIncrement() != 0) {
                    this.f402915h.clear();
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402910c.dispose();
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f402917j;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        this.f402915h.offer((Collection) it.next());
                    }
                    this.f402917j = null;
                    this.f402914g = true;
                    b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402913f.b(th2)) {
                this.f402910c.dispose();
                synchronized (this) {
                    this.f402917j = null;
                }
                this.f402914g = true;
                b();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            synchronized (this) {
                try {
                    LinkedHashMap linkedHashMap = this.f402917j;
                    if (linkedHashMap == null) {
                        return;
                    }
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(t12);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this.f402911d, j12);
            b();
        }
    }

    /* compiled from: FlowableBufferBoundary.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.o$b */
    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<Object>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -8498650778633225126L;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            org.reactivestreams.e eVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar == subscriptionHelper) {
                return;
            }
            lazySet(subscriptionHelper);
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == SubscriptionHelper.f404813b;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            org.reactivestreams.e eVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar == subscriptionHelper) {
                C47998a.b(th2);
            } else {
                lazySet(subscriptionHelper);
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            org.reactivestreams.e eVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f404813b;
            if (eVar == subscriptionHelper) {
                return;
            }
            lazySet(subscriptionHelper);
            eVar.cancel();
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super U> dVar) {
        a aVar = new a((InterfaceC41782o) dVar);
        dVar.K(aVar);
        this.f402624c.q(aVar);
    }
}
