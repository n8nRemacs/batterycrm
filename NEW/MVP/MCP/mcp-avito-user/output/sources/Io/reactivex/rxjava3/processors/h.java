package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import j41.InterfaceC42196c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o41.AbstractC44583c;
import q41.i;
import s41.C47998a;

/* compiled from: UnicastProcessor.java */
/* loaded from: classes8.dex */
public final class h<T> extends c<T> {

    /* renamed from: c, reason: collision with root package name */
    public final i<T> f404929c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<Runnable> f404930d;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f404932f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f404933g;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f404935i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f404939m;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f404931e = true;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference<org.reactivestreams.d<? super T>> f404934h = new AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f404936j = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC44583c<T> f404937k = new a();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicLong f404938l = new AtomicLong();

    /* compiled from: UnicastProcessor.java */
    public final class a extends AbstractC44583c<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public a() {
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (h.this.f404935i) {
                return;
            }
            h.this.f404935i = true;
            Runnable andSet = h.this.f404930d.getAndSet(null);
            if (andSet != null) {
                andSet.run();
            }
            h.this.f404934h.lazySet(null);
            if (h.this.f404937k.getAndIncrement() == 0) {
                h.this.f404934h.lazySet(null);
                h hVar = h.this;
                if (hVar.f404939m) {
                    return;
                }
                hVar.f404929c.clear();
            }
        }

        @Override // q41.g
        public final void clear() {
            h.this.f404929c.clear();
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return h.this.f404929c.isEmpty();
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            return h.this.f404929c.poll();
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                h hVar = h.this;
                io.reactivex.rxjava3.internal.util.c.a(hVar.f404938l, j12);
                hVar.D();
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            if ((i12 & 2) == 0) {
                return 0;
            }
            h.this.f404939m = true;
            return 2;
        }
    }

    public h(int i12, Runnable runnable) {
        this.f404929c = new i<>(i12);
        this.f404930d = new AtomicReference<>(runnable);
    }

    @j41.e
    @InterfaceC42196c
    public static <T> h<T> B(int i12, @j41.e Runnable runnable) {
        Objects.requireNonNull(runnable, "onTerminate");
        io.reactivex.rxjava3.internal.functions.b.a(i12, "capacityHint");
        return new h<>(i12, runnable);
    }

    public final boolean A(boolean z12, boolean z13, boolean z14, org.reactivestreams.d<? super T> dVar, i<T> iVar) {
        if (this.f404935i) {
            iVar.clear();
            this.f404934h.lazySet(null);
            return true;
        }
        if (!z13) {
            return false;
        }
        if (z12 && this.f404933g != null) {
            iVar.clear();
            this.f404934h.lazySet(null);
            dVar.onError(this.f404933g);
            return true;
        }
        if (!z14) {
            return false;
        }
        Throwable th2 = this.f404933g;
        this.f404934h.lazySet(null);
        if (th2 != null) {
            dVar.onError(th2);
        } else {
            dVar.e();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        long j12;
        if (this.f404937k.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        org.reactivestreams.d<? super T> dVar = this.f404934h.get();
        int iAddAndGet2 = 1;
        while (dVar == null) {
            iAddAndGet2 = this.f404937k.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
            dVar = this.f404934h.get();
            iAddAndGet = 1;
        }
        if (this.f404939m) {
            i<T> iVar = this.f404929c;
            boolean z12 = this.f404931e;
            while (!this.f404935i) {
                boolean z13 = this.f404932f;
                if (!z12 && z13 && this.f404933g != null) {
                    iVar.clear();
                    this.f404934h.lazySet(null);
                    dVar.onError(this.f404933g);
                    return;
                }
                dVar.onNext(null);
                if (z13) {
                    this.f404934h.lazySet(null);
                    Throwable th2 = this.f404933g;
                    if (th2 != null) {
                        dVar.onError(th2);
                        return;
                    } else {
                        dVar.e();
                        return;
                    }
                }
                iAddAndGet = this.f404937k.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f404934h.lazySet(null);
            return;
        }
        i<T> iVar2 = this.f404929c;
        boolean z14 = !this.f404931e;
        int iAddAndGet3 = iAddAndGet;
        while (true) {
            long j13 = this.f404938l.get();
            long j14 = 0;
            while (true) {
                if (j13 == j14) {
                    j12 = j14;
                    break;
                }
                boolean z15 = this.f404932f;
                T tPoll = iVar2.poll();
                int i12 = tPoll == null ? iAddAndGet : 0;
                j12 = j14;
                if (A(z14, z15, i12, dVar, iVar2)) {
                    return;
                }
                if (i12 != 0) {
                    break;
                }
                dVar.onNext(tPoll);
                j14 = j12 + 1;
                iAddAndGet = 1;
            }
            if (j13 == j14 && A(z14, this.f404932f, iVar2.isEmpty(), dVar, iVar2)) {
                return;
            }
            if (j12 != 0 && j13 != Long.MAX_VALUE) {
                this.f404938l.addAndGet(-j12);
            }
            iAddAndGet3 = this.f404937k.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                iAddAndGet = 1;
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (this.f404932f || this.f404935i) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        if (this.f404932f || this.f404935i) {
            return;
        }
        this.f404932f = true;
        Runnable andSet = this.f404930d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        D();
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        if (this.f404932f || this.f404935i) {
            C47998a.b(th2);
            return;
        }
        this.f404933g = th2;
        this.f404932f = true;
        Runnable andSet = this.f404930d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        D();
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onNext called with a null value.");
        if (this.f404932f || this.f404935i) {
            return;
        }
        this.f404929c.offer(t12);
        D();
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        if (this.f404936j.get() || !this.f404936j.compareAndSet(false, true)) {
            EmptySubscription.b(new IllegalStateException("This processor allows only a single Subscriber"), dVar);
            return;
        }
        dVar.K(this.f404937k);
        this.f404934h.set(dVar);
        if (this.f404935i) {
            this.f404934h.lazySet(null);
        } else {
            D();
        }
    }
}
