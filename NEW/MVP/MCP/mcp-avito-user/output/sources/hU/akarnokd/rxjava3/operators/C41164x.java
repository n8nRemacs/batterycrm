package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import s41.C47998a;

/* compiled from: FlowableMapAsync.java */
/* renamed from: hu.akarnokd.rxjava3.operators.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41164x<T, U, R> extends AbstractC41777j<R> implements InterfaceC41783p<T, R> {

    /* compiled from: FlowableMapAsync.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.x$a */
    public interface a<U> {
        void a(Throwable th2);

        void b();

        void c(U u12);
    }

    /* compiled from: FlowableMapAsync.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.x$b */
    public static final class b<T, U, R> extends AtomicReferenceArray<T> implements InterfaceC41782o<T>, org.reactivestreams.e, a<U> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f398167p = new a(null);
        private static final long serialVersionUID = -1557840206706079339L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398168b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f398169c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f398170d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f398171e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicReference<a<U>> f398172f;

        /* renamed from: g, reason: collision with root package name */
        public org.reactivestreams.e f398173g;

        /* renamed from: h, reason: collision with root package name */
        public long f398174h;

        /* renamed from: i, reason: collision with root package name */
        public long f398175i;

        /* renamed from: j, reason: collision with root package name */
        public int f398176j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f398177k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f398178l;

        /* renamed from: m, reason: collision with root package name */
        public U f398179m;

        /* renamed from: n, reason: collision with root package name */
        public long f398180n;

        /* renamed from: o, reason: collision with root package name */
        public volatile int f398181o;

        /* compiled from: FlowableMapAsync.java */
        /* renamed from: hu.akarnokd.rxjava3.operators.x$b$a */
        public static final class a<U> extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<U> {
            private static final long serialVersionUID = 6335578148970008248L;

            /* renamed from: b, reason: collision with root package name */
            public final AtomicReferenceArray f398182b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f398183c;

            /* JADX WARN: Multi-variable type inference failed */
            public a(a<U> aVar) {
                this.f398182b = (AtomicReferenceArray) aVar;
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [hu.akarnokd.rxjava3.operators.x$a, java.util.concurrent.atomic.AtomicReferenceArray] */
            @Override // org.reactivestreams.d
            public final void e() {
                if (this.f398183c) {
                    return;
                }
                this.f398183c = true;
                this.f398182b.b();
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [hu.akarnokd.rxjava3.operators.x$a, java.util.concurrent.atomic.AtomicReferenceArray] */
            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (this.f398183c) {
                    C47998a.b(th2);
                } else {
                    this.f398183c = true;
                    this.f398182b.a(th2);
                }
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [hu.akarnokd.rxjava3.operators.x$a, java.util.concurrent.atomic.AtomicReferenceArray] */
            @Override // org.reactivestreams.d
            public final void onNext(U u12) {
                if (this.f398183c) {
                    return;
                }
                get().cancel();
                this.f398183c = true;
                this.f398182b.c(u12);
            }
        }

        public b(InterfaceC41782o interfaceC41782o) {
            super(io.reactivex.rxjava3.internal.util.n.a(0));
            this.f398168b = interfaceC41782o;
            this.f398169c = new io.reactivex.rxjava3.internal.util.b();
            this.f398170d = new AtomicLong();
            this.f398171e = new AtomicInteger();
            this.f398172f = new AtomicReference<>();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f398173g, eVar)) {
                this.f398173g = eVar;
                this.f398168b.K(this);
                eVar.request(0);
            }
        }

        @Override // hu.akarnokd.rxjava3.operators.C41164x.a
        public final void a(Throwable th2) {
            this.f398169c.b(th2);
            this.f398181o = 2;
            f();
            g();
        }

        @Override // hu.akarnokd.rxjava3.operators.C41164x.a
        public final void b() {
            this.f398181o = 2;
            f();
            g();
        }

        @Override // hu.akarnokd.rxjava3.operators.C41164x.a
        public final void c(U u12) {
            this.f398179m = u12;
            this.f398181o = 2;
            f();
            g();
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            a<U> andSet;
            if (this.f398178l) {
                return;
            }
            this.f398178l = true;
            this.f398173g.cancel();
            this.f398169c.c();
            AtomicReference<a<U>> atomicReference = this.f398172f;
            a<U> aVar = atomicReference.get();
            a<U> aVar2 = f398167p;
            if (aVar != aVar2 && (andSet = atomicReference.getAndSet(aVar2)) != null && andSet != aVar2) {
                SubscriptionHelper.a(andSet);
            }
            if (this.f398171e.getAndIncrement() == 0) {
                d();
            }
        }

        public final void d() {
            int length = length();
            for (int i12 = 0; i12 < length; i12++) {
                lazySet(i12, null);
            }
            this.f398179m = null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f398177k = true;
            g();
        }

        public final void f() {
            AtomicReference<a<U>> atomicReference = this.f398172f;
            a<U> aVar = atomicReference.get();
            if (aVar != f398167p) {
                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                }
            }
        }

        public final void g() {
            int i12;
            int i13;
            int i14;
            if (this.f398171e.getAndIncrement() != 0) {
                return;
            }
            long j12 = this.f398180n;
            long j13 = this.f398175i;
            int i15 = this.f398176j;
            boolean z12 = true;
            int length = length() - 1;
            InterfaceC41782o interfaceC41782o = this.f398168b;
            int i16 = 1;
            while (true) {
                long j14 = this.f398170d.get();
                long j15 = j13;
                int i17 = i15;
                while (j12 != j14) {
                    if (this.f398178l) {
                        d();
                        return;
                    }
                    boolean z13 = this.f398177k;
                    int i18 = ((int) j15) & length;
                    boolean z14 = get(i18) == null ? z12 : false;
                    if (!z13 || !z14) {
                        if (z14) {
                            break;
                        }
                        int i19 = this.f398181o;
                        if (i19 == 0) {
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                this.f398169c.b(th2);
                                lazySet(i18, null);
                                j15++;
                                int i22 = i17 + 1;
                                if (i22 == 0) {
                                    i12 = 0;
                                    this.f398173g.request(0);
                                } else {
                                    i12 = i22;
                                }
                                i17 = i12;
                            }
                        } else {
                            if (i19 != 2) {
                                break;
                            }
                            U u12 = this.f398179m;
                            this.f398179m = null;
                            if (u12 != null) {
                                try {
                                    throw null;
                                } catch (Throwable th3) {
                                    io.reactivex.rxjava3.exceptions.a.a(th3);
                                    this.f398169c.b(th3);
                                }
                            }
                            lazySet(i18, null);
                            j15++;
                            int i23 = i17 + 1;
                            if (i23 == 0) {
                                i13 = 0;
                                this.f398173g.request(0);
                                i14 = 0;
                            } else {
                                i13 = 0;
                                i14 = i23;
                            }
                            this.f398181o = i13;
                            i17 = i14;
                        }
                        z12 = true;
                    } else {
                        io.reactivex.rxjava3.internal.util.b bVar = this.f398169c;
                        bVar.getClass();
                        Throwable thD = io.reactivex.rxjava3.internal.util.h.d(bVar);
                        if (thD == null) {
                            interfaceC41782o.e();
                            return;
                        } else {
                            interfaceC41782o.onError(thD);
                            return;
                        }
                    }
                }
                if (j12 == j14) {
                    if (this.f398178l) {
                        d();
                        return;
                    }
                    boolean z15 = this.f398177k;
                    boolean z16 = get(((int) j15) & length) == null;
                    if (z15 && z16) {
                        this.f398169c.g(interfaceC41782o);
                        return;
                    }
                }
                int iAddAndGet = this.f398171e.get();
                if (i16 == iAddAndGet) {
                    this.f398176j = i17;
                    this.f398175i = j15;
                    this.f398180n = j12;
                    iAddAndGet = this.f398171e.addAndGet(-i16);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                i16 = iAddAndGet;
                i15 = i17;
                j13 = j15;
                z12 = true;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f398169c.b(th2);
            this.f398177k = true;
            g();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            long j12 = this.f398174h;
            lazySet((length() - 1) & ((int) j12), t12);
            this.f398174h = j12 + 1;
            g();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f398170d, j12);
                g();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new b((InterfaceC41782o) dVar);
        throw null;
    }
}
