package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableFlatMapMaybe.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41843e0<T, R> extends AbstractC41833b<T, R> {

    /* compiled from: FlowableFlatMapMaybe.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.e0$a */
    public static final class a<T, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402732b;

        /* renamed from: h, reason: collision with root package name */
        public org.reactivestreams.e f402738h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f402739i;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicLong f402733c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402734d = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: f, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402736f = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f402735e = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<q41.i<R>> f402737g = new AtomicReference<>();

        /* compiled from: FlowableFlatMapMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.e0$a$a, reason: collision with other inner class name */
        public final class C11463a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<R>, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -502562646270949838L;

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return DisposableHelper.b(get());
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(R r12) {
                throw null;
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402732b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402738h, eVar)) {
                this.f402738h = eVar;
                this.f402732b.K(this);
                eVar.request(0);
            }
        }

        public final void a() {
            q41.i<R> iVar = this.f402737g.get();
            if (iVar != null) {
                iVar.clear();
            }
        }

        public final void b() {
            org.reactivestreams.d<?> dVar = this.f402732b;
            AtomicInteger atomicInteger = this.f402735e;
            AtomicReference<q41.i<R>> atomicReference = this.f402737g;
            int iAddAndGet = 1;
            do {
                long j12 = this.f402733c.get();
                long j13 = 0;
                while (true) {
                    if (j13 == j12) {
                        break;
                    }
                    if (this.f402739i) {
                        a();
                        return;
                    }
                    if (this.f402736f.get() != null) {
                        a();
                        this.f402736f.g(dVar);
                        return;
                    }
                    boolean z12 = atomicInteger.get() == 0;
                    q41.i<R> iVar = atomicReference.get();
                    R rPoll = iVar != null ? iVar.poll() : null;
                    boolean z13 = rPoll == null;
                    if (z12 && z13) {
                        this.f402736f.g(dVar);
                        return;
                    } else {
                        if (z13) {
                            break;
                        }
                        dVar.onNext(rPoll);
                        j13++;
                    }
                }
                if (j13 == j12) {
                    if (this.f402739i) {
                        a();
                        return;
                    }
                    if (this.f402736f.get() != null) {
                        a();
                        this.f402736f.g(dVar);
                        return;
                    }
                    boolean z14 = atomicInteger.get() == 0;
                    q41.i<R> iVar2 = atomicReference.get();
                    boolean z15 = iVar2 == null || iVar2.isEmpty();
                    if (z14 && z15) {
                        this.f402736f.g(dVar);
                        return;
                    }
                }
                if (j13 != 0) {
                    io.reactivex.rxjava3.internal.util.c.e(this.f402733c, j13);
                    this.f402738h.request(j13);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final q41.i<R> c() {
            AtomicReference<q41.i<R>> atomicReference = this.f402737g;
            q41.i<R> iVar = atomicReference.get();
            if (iVar != null) {
                return iVar;
            }
            q41.i<R> iVar2 = new q41.i<>(AbstractC41777j.f401972b);
            while (!atomicReference.compareAndSet(null, iVar2)) {
                if (atomicReference.get() != null) {
                    return atomicReference.get();
                }
            }
            return iVar2;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402739i = true;
            this.f402738h.cancel();
            this.f402734d.dispose();
            this.f402736f.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402735e.decrementAndGet();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402735e.decrementAndGet();
            if (this.f402736f.b(th2)) {
                this.f402734d.dispose();
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402738h.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402733c, j12);
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
