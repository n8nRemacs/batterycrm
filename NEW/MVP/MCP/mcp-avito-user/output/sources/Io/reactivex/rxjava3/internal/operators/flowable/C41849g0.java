package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableFlatMapSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41849g0<T, R> extends AbstractC41833b<T, R> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> f402777d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402778e;

    /* compiled from: FlowableFlatMapSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.g0$a */
    public static final class a<T, R> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402779b;

        /* renamed from: c, reason: collision with root package name */
        public final int f402780c;

        /* renamed from: h, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> f402785h;

        /* renamed from: j, reason: collision with root package name */
        public org.reactivestreams.e f402787j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f402788k;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f402781d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f402782e = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: g, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402784g = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicInteger f402783f = new AtomicInteger(1);

        /* renamed from: i, reason: collision with root package name */
        public final AtomicReference<q41.i<R>> f402786i = new AtomicReference<>();

        /* compiled from: FlowableFlatMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.g0$a$a, reason: collision with other inner class name */
        public final class C11464a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<R>, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -502562646270949838L;

            public C11464a() {
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return DisposableHelper.b(get());
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                a aVar = a.this;
                io.reactivex.rxjava3.disposables.c cVar = aVar.f402782e;
                cVar.c(this);
                if (aVar.f402784g.b(th2)) {
                    aVar.f402787j.cancel();
                    cVar.dispose();
                    aVar.f402783f.decrementAndGet();
                    if (aVar.getAndIncrement() == 0) {
                        aVar.b();
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
            @Override // io.reactivex.rxjava3.core.L
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(R r7) {
                /*
                    r6 = this;
                    io.reactivex.rxjava3.internal.operators.flowable.g0$a r0 = io.reactivex.rxjava3.internal.operators.flowable.C41849g0.a.this
                    io.reactivex.rxjava3.disposables.c r1 = r0.f402782e
                    r1.c(r6)
                    int r1 = r0.get()
                    if (r1 != 0) goto L70
                    r1 = 0
                    r2 = 1
                    boolean r3 = r0.compareAndSet(r1, r2)
                    if (r3 == 0) goto L70
                    java.util.concurrent.atomic.AtomicInteger r3 = r0.f402783f
                    int r3 = r3.decrementAndGet()
                    if (r3 != 0) goto L1e
                    r1 = r2
                L1e:
                    java.util.concurrent.atomic.AtomicLong r2 = r0.f402781d
                    long r2 = r2.get()
                    r4 = 0
                    int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r2 == 0) goto L5d
                    io.reactivex.rxjava3.core.o r2 = r0.f402779b
                    r2.onNext(r7)
                    java.util.concurrent.atomic.AtomicReference<q41.i<R>> r7 = r0.f402786i
                    java.lang.Object r7 = r7.get()
                    q41.i r7 = (q41.i) r7
                    if (r1 == 0) goto L49
                    if (r7 == 0) goto L41
                    boolean r7 = r7.isEmpty()
                    if (r7 == 0) goto L49
                L41:
                    io.reactivex.rxjava3.internal.util.b r7 = r0.f402784g
                    io.reactivex.rxjava3.core.o r0 = r0.f402779b
                    r7.g(r0)
                    goto L88
                L49:
                    java.util.concurrent.atomic.AtomicLong r7 = r0.f402781d
                    r1 = 1
                    io.reactivex.rxjava3.internal.util.c.e(r7, r1)
                    int r7 = r0.f402780c
                    r3 = 2147483647(0x7fffffff, float:NaN)
                    if (r7 == r3) goto L66
                    org.reactivestreams.e r7 = r0.f402787j
                    r7.request(r1)
                    goto L66
                L5d:
                    q41.i r1 = r0.c()
                    monitor-enter(r1)
                    r1.offer(r7)     // Catch: java.lang.Throwable -> L6d
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
                L66:
                    int r7 = r0.decrementAndGet()
                    if (r7 != 0) goto L85
                    goto L88
                L6d:
                    r7 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
                    throw r7
                L70:
                    q41.i r1 = r0.c()
                    monitor-enter(r1)
                    r1.offer(r7)     // Catch: java.lang.Throwable -> L89
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L89
                    java.util.concurrent.atomic.AtomicInteger r7 = r0.f402783f
                    r7.decrementAndGet()
                    int r7 = r0.getAndIncrement()
                    if (r7 == 0) goto L85
                    goto L88
                L85:
                    r0.b()
                L88:
                    return
                L89:
                    r7 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L89
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.C41849g0.a.C11464a.onSuccess(java.lang.Object):void");
            }
        }

        public a(InterfaceC41782o interfaceC41782o, l41.o oVar, int i12) {
            this.f402779b = interfaceC41782o;
            this.f402785h = oVar;
            this.f402780c = i12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402787j, eVar)) {
                this.f402787j = eVar;
                this.f402779b.K(this);
                int i12 = this.f402780c;
                if (i12 == Integer.MAX_VALUE) {
                    eVar.request(Long.MAX_VALUE);
                } else {
                    eVar.request(i12);
                }
            }
        }

        public final void a() {
            q41.i<R> iVar = this.f402786i.get();
            if (iVar != null) {
                iVar.clear();
            }
        }

        public final void b() {
            org.reactivestreams.d<?> dVar = this.f402779b;
            AtomicInteger atomicInteger = this.f402783f;
            AtomicReference<q41.i<R>> atomicReference = this.f402786i;
            int iAddAndGet = 1;
            do {
                long j12 = this.f402781d.get();
                long j13 = 0;
                while (true) {
                    if (j13 == j12) {
                        break;
                    }
                    if (this.f402788k) {
                        a();
                        return;
                    }
                    if (this.f402784g.get() != null) {
                        a();
                        this.f402784g.g(this.f402779b);
                        return;
                    }
                    boolean z12 = atomicInteger.get() == 0;
                    q41.i<R> iVar = atomicReference.get();
                    R rPoll = iVar != null ? iVar.poll() : null;
                    boolean z13 = rPoll == null;
                    if (z12 && z13) {
                        this.f402784g.g(dVar);
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
                    if (this.f402788k) {
                        a();
                        return;
                    }
                    if (this.f402784g.get() != null) {
                        a();
                        this.f402784g.g(dVar);
                        return;
                    }
                    boolean z14 = atomicInteger.get() == 0;
                    q41.i<R> iVar2 = atomicReference.get();
                    boolean z15 = iVar2 == null || iVar2.isEmpty();
                    if (z14 && z15) {
                        this.f402784g.g(dVar);
                        return;
                    }
                }
                if (j13 != 0) {
                    io.reactivex.rxjava3.internal.util.c.e(this.f402781d, j13);
                    if (this.f402780c != Integer.MAX_VALUE) {
                        this.f402787j.request(j13);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final q41.i<R> c() {
            AtomicReference<q41.i<R>> atomicReference = this.f402786i;
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
            this.f402788k = true;
            this.f402787j.cancel();
            this.f402782e.dispose();
            this.f402784g.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402783f.decrementAndGet();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402783f.decrementAndGet();
            if (this.f402784g.b(th2)) {
                this.f402782e.dispose();
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                io.reactivex.rxjava3.core.O<? extends R> oApply = this.f402785h.apply(t12);
                Objects.requireNonNull(oApply, "The mapper returned a null SingleSource");
                io.reactivex.rxjava3.core.O<? extends R> o12 = oApply;
                this.f402783f.getAndIncrement();
                C11464a c11464a = new C11464a();
                if (this.f402788k || !this.f402782e.b(c11464a)) {
                    return;
                }
                o12.a(c11464a);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402787j.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f402781d, j12);
                if (getAndIncrement() == 0) {
                    b();
                }
            }
        }
    }

    public C41849g0(AbstractC41777j abstractC41777j, l41.o oVar) {
        super(abstractC41777j);
        this.f402777d = oVar;
        this.f402778e = Integer.MAX_VALUE;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar, this.f402777d, this.f402778e));
    }
}
