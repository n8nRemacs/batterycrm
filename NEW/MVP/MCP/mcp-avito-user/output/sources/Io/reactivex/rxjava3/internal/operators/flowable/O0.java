package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import o41.AbstractC44583c;
import q41.InterfaceC47198a;
import s41.C47998a;

/* compiled from: FlowableObserveOn.java */
/* loaded from: classes8.dex */
public final class O0<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f402462d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402463e;

    /* compiled from: FlowableObserveOn.java */
    public static abstract class a<T> extends AbstractC44583c<T> implements InterfaceC41782o<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;

        /* renamed from: b, reason: collision with root package name */
        public final H.c f402464b;

        /* renamed from: c, reason: collision with root package name */
        public final int f402465c;

        /* renamed from: d, reason: collision with root package name */
        public final int f402466d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f402467e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        public org.reactivestreams.e f402468f;

        /* renamed from: g, reason: collision with root package name */
        public q41.g<T> f402469g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f402470h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f402471i;

        /* renamed from: j, reason: collision with root package name */
        public Throwable f402472j;

        /* renamed from: k, reason: collision with root package name */
        public int f402473k;

        /* renamed from: l, reason: collision with root package name */
        public long f402474l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f402475m;

        public a(H.c cVar, int i12) {
            this.f402464b = cVar;
            this.f402465c = i12;
            this.f402466d = i12 - (i12 >> 2);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f402470h) {
                return;
            }
            this.f402470h = true;
            this.f402468f.cancel();
            this.f402464b.dispose();
            if (this.f402475m || getAndIncrement() != 0) {
                return;
            }
            this.f402469g.clear();
        }

        @Override // q41.g
        public final void clear() {
            this.f402469g.clear();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402471i) {
                return;
            }
            this.f402471i = true;
            p();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f402469g.isEmpty();
        }

        public final boolean l(boolean z12, boolean z13, org.reactivestreams.d<?> dVar) {
            if (this.f402470h) {
                clear();
                return true;
            }
            if (!z12) {
                return false;
            }
            Throwable th2 = this.f402472j;
            if (th2 != null) {
                this.f402470h = true;
                clear();
                dVar.onError(th2);
                this.f402464b.dispose();
                return true;
            }
            if (!z13) {
                return false;
            }
            this.f402470h = true;
            dVar.e();
            this.f402464b.dispose();
            return true;
        }

        public abstract void m();

        public abstract void n();

        public abstract void o();

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402471i) {
                C47998a.b(th2);
                return;
            }
            this.f402472j = th2;
            this.f402471i = true;
            p();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402471i) {
                return;
            }
            if (this.f402473k == 2) {
                p();
                return;
            }
            if (!this.f402469g.offer(t12)) {
                this.f402468f.cancel();
                this.f402472j = new MissingBackpressureException("Queue is full?!");
                this.f402471i = true;
            }
            p();
        }

        public final void p() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f402464b.b(this);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402467e, j12);
                p();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f402475m) {
                n();
            } else if (this.f402473k == 1) {
                o();
            } else {
                m();
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            if ((i12 & 2) == 0) {
                return 0;
            }
            this.f402475m = true;
            return 2;
        }
    }

    /* compiled from: FlowableObserveOn.java */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = 644624475404284533L;

        /* renamed from: n, reason: collision with root package name */
        public final InterfaceC47198a<? super T> f402476n;

        /* renamed from: o, reason: collision with root package name */
        public long f402477o;

        public b(InterfaceC47198a interfaceC47198a, H.c cVar, int i12) {
            super(cVar, i12);
            this.f402476n = interfaceC47198a;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402468f, eVar)) {
                this.f402468f = eVar;
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(7);
                    if (iV2 == 1) {
                        this.f402473k = 1;
                        this.f402469g = dVar;
                        this.f402471i = true;
                        this.f402476n.K(this);
                        return;
                    }
                    if (iV2 == 2) {
                        this.f402473k = 2;
                        this.f402469g = dVar;
                        this.f402476n.K(this);
                        eVar.request(this.f402465c);
                        return;
                    }
                }
                this.f402469g = new q41.h(this.f402465c);
                this.f402476n.K(this);
                eVar.request(this.f402465c);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.O0.a
        public final void m() {
            InterfaceC47198a<? super T> interfaceC47198a = this.f402476n;
            q41.g<T> gVar = this.f402469g;
            long j12 = this.f402474l;
            long j13 = this.f402477o;
            int iAddAndGet = 1;
            do {
                long j14 = this.f402467e.get();
                while (j12 != j14) {
                    boolean z12 = this.f402471i;
                    try {
                        T tPoll = gVar.poll();
                        boolean z13 = tPoll == null;
                        if (l(z12, z13, interfaceC47198a)) {
                            return;
                        }
                        if (z13) {
                            break;
                        }
                        if (interfaceC47198a.P(tPoll)) {
                            j12++;
                        }
                        j13++;
                        if (j13 == this.f402466d) {
                            this.f402468f.request(j13);
                            j13 = 0;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f402470h = true;
                        this.f402468f.cancel();
                        gVar.clear();
                        interfaceC47198a.onError(th2);
                        this.f402464b.dispose();
                        return;
                    }
                }
                if (j12 == j14 && l(this.f402471i, gVar.isEmpty(), interfaceC47198a)) {
                    return;
                }
                this.f402474l = j12;
                this.f402477o = j13;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.O0.a
        public final void n() {
            int iAddAndGet = 1;
            while (!this.f402470h) {
                boolean z12 = this.f402471i;
                this.f402476n.onNext(null);
                if (z12) {
                    this.f402470h = true;
                    Throwable th2 = this.f402472j;
                    if (th2 != null) {
                        this.f402476n.onError(th2);
                    } else {
                        this.f402476n.e();
                    }
                    this.f402464b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.O0.a
        public final void o() {
            InterfaceC47198a<? super T> interfaceC47198a = this.f402476n;
            q41.g<T> gVar = this.f402469g;
            long j12 = this.f402474l;
            int iAddAndGet = 1;
            do {
                long j13 = this.f402467e.get();
                while (j12 != j13) {
                    try {
                        T tPoll = gVar.poll();
                        if (this.f402470h) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f402470h = true;
                            interfaceC47198a.e();
                            this.f402464b.dispose();
                            return;
                        } else if (interfaceC47198a.P(tPoll)) {
                            j12++;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f402470h = true;
                        this.f402468f.cancel();
                        interfaceC47198a.onError(th2);
                        this.f402464b.dispose();
                        return;
                    }
                }
                if (this.f402470h) {
                    return;
                }
                if (gVar.isEmpty()) {
                    this.f402470h = true;
                    interfaceC47198a.e();
                    this.f402464b.dispose();
                    return;
                }
                this.f402474l = j12;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            T tPoll = this.f402469g.poll();
            if (tPoll != null && this.f402473k != 1) {
                long j12 = this.f402477o + 1;
                if (j12 == this.f402466d) {
                    this.f402477o = 0L;
                    this.f402468f.request(j12);
                } else {
                    this.f402477o = j12;
                }
            }
            return tPoll;
        }
    }

    /* compiled from: FlowableObserveOn.java */
    public static final class c<T> extends a<T> implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -4547113800637756442L;

        /* renamed from: n, reason: collision with root package name */
        public final InterfaceC41782o f402478n;

        public c(InterfaceC41782o interfaceC41782o, H.c cVar, int i12) {
            super(cVar, i12);
            this.f402478n = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402468f, eVar)) {
                this.f402468f = eVar;
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(7);
                    if (iV2 == 1) {
                        this.f402473k = 1;
                        this.f402469g = dVar;
                        this.f402471i = true;
                        this.f402478n.K(this);
                        return;
                    }
                    if (iV2 == 2) {
                        this.f402473k = 2;
                        this.f402469g = dVar;
                        this.f402478n.K(this);
                        eVar.request(this.f402465c);
                        return;
                    }
                }
                this.f402469g = new q41.h(this.f402465c);
                this.f402478n.K(this);
                eVar.request(this.f402465c);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.O0.a
        public final void m() {
            InterfaceC41782o interfaceC41782o = this.f402478n;
            q41.g<T> gVar = this.f402469g;
            long j12 = this.f402474l;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f402467e.get();
                while (j12 != jAddAndGet) {
                    boolean z12 = this.f402471i;
                    try {
                        T tPoll = gVar.poll();
                        boolean z13 = tPoll == null;
                        if (l(z12, z13, interfaceC41782o)) {
                            return;
                        }
                        if (z13) {
                            break;
                        }
                        interfaceC41782o.onNext(tPoll);
                        j12++;
                        if (j12 == this.f402466d) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f402467e.addAndGet(-j12);
                            }
                            this.f402468f.request(j12);
                            j12 = 0;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f402470h = true;
                        this.f402468f.cancel();
                        gVar.clear();
                        interfaceC41782o.onError(th2);
                        this.f402464b.dispose();
                        return;
                    }
                }
                if (j12 == jAddAndGet && l(this.f402471i, gVar.isEmpty(), interfaceC41782o)) {
                    return;
                }
                int i12 = get();
                if (iAddAndGet == i12) {
                    this.f402474l = j12;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i12;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.O0.a
        public final void n() {
            int iAddAndGet = 1;
            while (!this.f402470h) {
                boolean z12 = this.f402471i;
                this.f402478n.onNext(null);
                if (z12) {
                    this.f402470h = true;
                    Throwable th2 = this.f402472j;
                    if (th2 != null) {
                        this.f402478n.onError(th2);
                    } else {
                        this.f402478n.e();
                    }
                    this.f402464b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.O0.a
        public final void o() {
            InterfaceC41782o interfaceC41782o = this.f402478n;
            q41.g<T> gVar = this.f402469g;
            long j12 = this.f402474l;
            int iAddAndGet = 1;
            do {
                long j13 = this.f402467e.get();
                while (j12 != j13) {
                    try {
                        T tPoll = gVar.poll();
                        if (this.f402470h) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f402470h = true;
                            interfaceC41782o.e();
                            this.f402464b.dispose();
                            return;
                        }
                        interfaceC41782o.onNext(tPoll);
                        j12++;
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f402470h = true;
                        this.f402468f.cancel();
                        interfaceC41782o.onError(th2);
                        this.f402464b.dispose();
                        return;
                    }
                }
                if (this.f402470h) {
                    return;
                }
                if (gVar.isEmpty()) {
                    this.f402470h = true;
                    interfaceC41782o.e();
                    this.f402464b.dispose();
                    return;
                }
                this.f402474l = j12;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            T tPoll = this.f402469g.poll();
            if (tPoll != null && this.f402473k != 1) {
                long j12 = this.f402474l + 1;
                if (j12 == this.f402466d) {
                    this.f402474l = 0L;
                    this.f402468f.request(j12);
                } else {
                    this.f402474l = j12;
                }
            }
            return tPoll;
        }
    }

    public O0(AbstractC41777j abstractC41777j, io.reactivex.rxjava3.core.H h12, int i12) {
        super(abstractC41777j);
        this.f402462d = h12;
        this.f402463e = i12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        H.c cVarB = this.f402462d.b();
        boolean z12 = dVar instanceof InterfaceC47198a;
        int i12 = this.f402463e;
        AbstractC41777j<T> abstractC41777j = this.f402624c;
        if (z12) {
            abstractC41777j.q(new b((InterfaceC47198a) dVar, cVarB, i12));
        } else {
            abstractC41777j.q(new c((InterfaceC41782o) dVar, cVarB, i12));
        }
    }
}
