package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapMaybe.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.a0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41933a0<T, R> extends AbstractC41932a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> f403952c;

    /* compiled from: ObservableFlatMapMaybe.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.a0$a */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f403953b;

        /* renamed from: f, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> f403957f;

        /* renamed from: h, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403959h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403960i;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f403954c = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403956e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f403955d = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<q41.i<R>> f403958g = new AtomicReference<>();

        /* compiled from: ObservableFlatMapMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.a0$a$a, reason: collision with other inner class name */
        public final class C11498a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<R>, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -502562646270949838L;

            public C11498a() {
            }

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
                a aVar = a.this;
                aVar.f403954c.c(this);
                int i12 = aVar.get();
                AtomicInteger atomicInteger = aVar.f403955d;
                if (i12 == 0) {
                    if (aVar.compareAndSet(0, 1)) {
                        boolean z12 = atomicInteger.decrementAndGet() == 0;
                        q41.i<R> iVar = aVar.f403958g.get();
                        if (z12 && (iVar == null || iVar.isEmpty())) {
                            aVar.f403956e.e(aVar.f403953b);
                            return;
                        } else {
                            if (aVar.decrementAndGet() == 0) {
                                return;
                            }
                            aVar.a();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (aVar.getAndIncrement() == 0) {
                    aVar.a();
                }
            }

            @Override // io.reactivex.rxjava3.disposables.d
            /* renamed from: i */
            public final boolean getF318621e() {
                return DisposableHelper.b(get());
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                a aVar = a.this;
                io.reactivex.rxjava3.disposables.c cVar = aVar.f403954c;
                cVar.c(this);
                if (aVar.f403956e.b(th2)) {
                    aVar.f403959h.dispose();
                    cVar.dispose();
                    aVar.f403955d.decrementAndGet();
                    if (aVar.getAndIncrement() == 0) {
                        aVar.a();
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
            @Override // io.reactivex.rxjava3.core.t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(R r5) {
                /*
                    r4 = this;
                    io.reactivex.rxjava3.internal.operators.observable.a0$a r0 = io.reactivex.rxjava3.internal.operators.observable.C41933a0.a.this
                    io.reactivex.rxjava3.disposables.c r1 = r0.f403954c
                    r1.c(r4)
                    int r1 = r0.get()
                    if (r1 != 0) goto L44
                    r1 = 0
                    r2 = 1
                    boolean r3 = r0.compareAndSet(r1, r2)
                    if (r3 == 0) goto L44
                    io.reactivex.rxjava3.core.G<? super R> r3 = r0.f403953b
                    r3.onNext(r5)
                    java.util.concurrent.atomic.AtomicInteger r5 = r0.f403955d
                    int r5 = r5.decrementAndGet()
                    if (r5 != 0) goto L23
                    r1 = r2
                L23:
                    java.util.concurrent.atomic.AtomicReference<q41.i<R>> r5 = r0.f403958g
                    java.lang.Object r5 = r5.get()
                    q41.i r5 = (q41.i) r5
                    if (r1 == 0) goto L3d
                    if (r5 == 0) goto L35
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L3d
                L35:
                    io.reactivex.rxjava3.internal.util.b r5 = r0.f403956e
                    io.reactivex.rxjava3.core.G<? super R> r0 = r0.f403953b
                    r5.e(r0)
                    goto L81
                L3d:
                    int r5 = r0.decrementAndGet()
                    if (r5 != 0) goto L7e
                    goto L81
                L44:
                    java.util.concurrent.atomic.AtomicReference<q41.i<R>> r1 = r0.f403958g
                    java.lang.Object r2 = r1.get()
                    q41.i r2 = (q41.i) r2
                    if (r2 == 0) goto L50
                L4e:
                    r3 = r2
                    goto L6d
                L50:
                    q41.i r2 = new q41.i
                    int r3 = io.reactivex.rxjava3.core.AbstractC41777j.f401972b
                    r2.<init>(r3)
                L57:
                    r3 = 0
                    boolean r3 = r1.compareAndSet(r3, r2)
                    if (r3 == 0) goto L5f
                    goto L4e
                L5f:
                    java.lang.Object r3 = r1.get()
                    if (r3 == 0) goto L57
                    java.lang.Object r1 = r1.get()
                    r2 = r1
                    q41.i r2 = (q41.i) r2
                    goto L4e
                L6d:
                    monitor-enter(r3)
                    r3.offer(r5)     // Catch: java.lang.Throwable -> L82
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L82
                    java.util.concurrent.atomic.AtomicInteger r5 = r0.f403955d
                    r5.decrementAndGet()
                    int r5 = r0.getAndIncrement()
                    if (r5 == 0) goto L7e
                    goto L81
                L7e:
                    r0.a()
                L81:
                    return
                L82:
                    r5 = move-exception
                    monitor-exit(r3)     // Catch: java.lang.Throwable -> L82
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.C41933a0.a.C11498a.onSuccess(java.lang.Object):void");
            }
        }

        public a(io.reactivex.rxjava3.core.G g12, l41.o oVar) {
            this.f403953b = g12;
            this.f403957f = oVar;
        }

        public final void a() {
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f403953b;
            AtomicInteger atomicInteger = this.f403955d;
            AtomicReference<q41.i<R>> atomicReference = this.f403958g;
            int iAddAndGet = 1;
            while (!this.f403960i) {
                if (this.f403956e.get() != null) {
                    q41.i<R> iVar = this.f403958g.get();
                    if (iVar != null) {
                        iVar.clear();
                    }
                    this.f403956e.e(g12);
                    return;
                }
                boolean z12 = atomicInteger.get() == 0;
                q41.i<R> iVar2 = atomicReference.get();
                A00.b bVarPoll = iVar2 != null ? iVar2.poll() : null;
                boolean z13 = bVarPoll == null;
                if (z12 && z13) {
                    this.f403956e.e(g12);
                    return;
                } else if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    g12.onNext(bVarPoll);
                }
            }
            q41.i<R> iVar3 = this.f403958g.get();
            if (iVar3 != null) {
                iVar3.clear();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403959h, dVar)) {
                this.f403959h = dVar;
                this.f403953b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403960i = true;
            this.f403959h.dispose();
            this.f403954c.dispose();
            this.f403956e.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403955d.decrementAndGet();
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403960i;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403955d.decrementAndGet();
            if (this.f403956e.b(th2)) {
                this.f403954c.dispose();
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            try {
                io.reactivex.rxjava3.core.w<? extends R> wVarApply = this.f403957f.apply(t12);
                Objects.requireNonNull(wVarApply, "The mapper returned a null MaybeSource");
                io.reactivex.rxjava3.core.w<? extends R> wVar = wVarApply;
                this.f403955d.getAndIncrement();
                C11498a c11498a = new C11498a();
                if (this.f403960i || !this.f403954c.b(c11498a)) {
                    return;
                }
                wVar.a(c11498a);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403959h.dispose();
                onError(th2);
            }
        }
    }

    public C41933a0(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        super(zVar);
        this.f403952c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f403951b.c(new a(g12, this.f403952c));
    }
}
