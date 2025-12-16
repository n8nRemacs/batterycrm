package hu.akarnokd.rxjava3.operators;

import hu.akarnokd.rxjava3.operators.C41164x;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: FlowableFilterAsync.java */
/* loaded from: classes8.dex */
final class r<T> extends AbstractC41777j<T> implements InterfaceC41783p<T, T> {

    /* compiled from: FlowableFilterAsync.java */
    public static final class a<T> extends AtomicReferenceArray<T> implements InterfaceC41782o<T>, org.reactivestreams.e, C41164x.a<Boolean> {

        /* renamed from: p, reason: collision with root package name */
        public static final C41164x.b.a f398120p = new C41164x.b.a(null);
        private static final long serialVersionUID = -1557840206706079339L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f398121b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f398122c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f398123d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f398124e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicReference<C41164x.b.a<Boolean>> f398125f;

        /* renamed from: g, reason: collision with root package name */
        public org.reactivestreams.e f398126g;

        /* renamed from: h, reason: collision with root package name */
        public long f398127h;

        /* renamed from: i, reason: collision with root package name */
        public long f398128i;

        /* renamed from: j, reason: collision with root package name */
        public int f398129j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f398130k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f398131l;

        /* renamed from: m, reason: collision with root package name */
        public Boolean f398132m;

        /* renamed from: n, reason: collision with root package name */
        public long f398133n;

        /* renamed from: o, reason: collision with root package name */
        public volatile int f398134o;

        public a(InterfaceC41782o interfaceC41782o) {
            super(io.reactivex.rxjava3.internal.util.n.a(0));
            this.f398121b = interfaceC41782o;
            this.f398122c = new io.reactivex.rxjava3.internal.util.b();
            this.f398123d = new AtomicLong();
            this.f398124e = new AtomicInteger();
            this.f398125f = new AtomicReference<>();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f398126g, eVar)) {
                this.f398126g = eVar;
                this.f398121b.K(this);
                eVar.request(0);
            }
        }

        @Override // hu.akarnokd.rxjava3.operators.C41164x.a
        public final void a(Throwable th2) {
            this.f398122c.b(th2);
            this.f398134o = 2;
            f();
            g();
        }

        @Override // hu.akarnokd.rxjava3.operators.C41164x.a
        public final void b() {
            this.f398134o = 2;
            f();
            g();
        }

        @Override // hu.akarnokd.rxjava3.operators.C41164x.a
        public final void c(Boolean bool) {
            this.f398132m = bool;
            this.f398134o = 2;
            f();
            g();
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            C41164x.b.a<Boolean> andSet;
            if (this.f398131l) {
                return;
            }
            this.f398131l = true;
            this.f398126g.cancel();
            this.f398122c.c();
            AtomicReference<C41164x.b.a<Boolean>> atomicReference = this.f398125f;
            C41164x.b.a<Boolean> aVar = atomicReference.get();
            C41164x.b.a<Boolean> aVar2 = f398120p;
            if (aVar != aVar2 && (andSet = atomicReference.getAndSet(aVar2)) != null && andSet != aVar2) {
                SubscriptionHelper.a(andSet);
            }
            if (this.f398124e.getAndIncrement() == 0) {
                d();
            }
        }

        public final void d() {
            int length = length();
            for (int i12 = 0; i12 < length; i12++) {
                lazySet(i12, null);
            }
            this.f398132m = null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f398130k = true;
            g();
        }

        public final void f() {
            AtomicReference<C41164x.b.a<Boolean>> atomicReference = this.f398125f;
            C41164x.b.a<Boolean> aVar = atomicReference.get();
            if (aVar != f398120p) {
                while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
                }
            }
        }

        public final void g() {
            int i12;
            int i13;
            int i14;
            if (this.f398124e.getAndIncrement() != 0) {
                return;
            }
            long j12 = this.f398133n;
            long j13 = this.f398128i;
            int i15 = this.f398129j;
            int length = length() - 1;
            InterfaceC41782o interfaceC41782o = this.f398121b;
            int i16 = 1;
            while (true) {
                long j14 = this.f398123d.get();
                long j15 = j13;
                long j16 = j12;
                int i17 = i15;
                while (j16 != j14) {
                    if (this.f398131l) {
                        d();
                        return;
                    }
                    boolean z12 = this.f398130k;
                    int i18 = ((int) j15) & length;
                    T t12 = get(i18);
                    boolean z13 = t12 == null;
                    if (!z12 || !z13) {
                        if (z13) {
                            break;
                        }
                        int i19 = this.f398134o;
                        if (i19 == 0) {
                            try {
                                throw null;
                            } catch (Throwable th2) {
                                io.reactivex.rxjava3.exceptions.a.a(th2);
                                this.f398122c.b(th2);
                                lazySet(i18, null);
                                j15++;
                                int i22 = i17 + 1;
                                if (i22 == 0) {
                                    i12 = 0;
                                    this.f398126g.request(0);
                                } else {
                                    i12 = i22;
                                }
                                i17 = i12;
                            }
                        } else {
                            if (i19 != 2) {
                                break;
                            }
                            Boolean bool = this.f398132m;
                            this.f398132m = null;
                            if (bool != null && bool.booleanValue()) {
                                j16++;
                                interfaceC41782o.onNext(t12);
                            }
                            lazySet(i18, null);
                            j15++;
                            int i23 = i17 + 1;
                            if (i23 == 0) {
                                i13 = 0;
                                this.f398126g.request(0);
                                i14 = 0;
                            } else {
                                i13 = 0;
                                i14 = i23;
                            }
                            this.f398134o = i13;
                            i17 = i14;
                        }
                    } else {
                        io.reactivex.rxjava3.internal.util.b bVar = this.f398122c;
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
                if (j16 == j14) {
                    if (this.f398131l) {
                        d();
                        return;
                    }
                    boolean z14 = this.f398130k;
                    boolean z15 = get(((int) j15) & length) == null;
                    if (z14 && z15) {
                        io.reactivex.rxjava3.internal.util.b bVar2 = this.f398122c;
                        bVar2.getClass();
                        Throwable thD2 = io.reactivex.rxjava3.internal.util.h.d(bVar2);
                        if (thD2 == null) {
                            interfaceC41782o.e();
                            return;
                        } else {
                            interfaceC41782o.onError(thD2);
                            return;
                        }
                    }
                }
                int iAddAndGet = this.f398124e.get();
                if (i16 == iAddAndGet) {
                    this.f398129j = i17;
                    this.f398128i = j15;
                    this.f398133n = j16;
                    iAddAndGet = this.f398124e.addAndGet(-i16);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                i16 = iAddAndGet;
                i15 = i17;
                j12 = j16;
                j13 = j15;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f398122c.b(th2);
            this.f398130k = true;
            g();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            long j12 = this.f398127h;
            lazySet((length() - 1) & ((int) j12), t12);
            this.f398127h = j12 + 1;
            g();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f398123d, j12);
                g();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
