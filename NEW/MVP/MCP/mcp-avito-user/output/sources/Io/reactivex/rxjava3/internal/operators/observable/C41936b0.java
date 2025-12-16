package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41936b0<T, R> extends AbstractC41932a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> f403977c;

    /* compiled from: ObservableFlatMapSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.b0$a */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f403978b;

        /* renamed from: f, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> f403982f;

        /* renamed from: h, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403984h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403985i;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.c f403979c = new io.reactivex.rxjava3.disposables.c();

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403981e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f403980d = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<q41.i<R>> f403983g = new AtomicReference<>();

        /* compiled from: ObservableFlatMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.b0$a$a, reason: collision with other inner class name */
        public final class C11500a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.L<R>, io.reactivex.rxjava3.disposables.d {
            private static final long serialVersionUID = -502562646270949838L;

            public C11500a() {
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
            public final boolean i() {
                return DisposableHelper.b(get());
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                a aVar = a.this;
                io.reactivex.rxjava3.disposables.c cVar = aVar.f403979c;
                cVar.c(this);
                if (aVar.f403981e.b(th2)) {
                    aVar.f403984h.dispose();
                    cVar.dispose();
                    aVar.f403980d.decrementAndGet();
                    if (aVar.getAndIncrement() == 0) {
                        aVar.a();
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
            @Override // io.reactivex.rxjava3.core.L
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(R r5) {
                /*
                    r4 = this;
                    io.reactivex.rxjava3.internal.operators.observable.b0$a r0 = io.reactivex.rxjava3.internal.operators.observable.C41936b0.a.this
                    io.reactivex.rxjava3.disposables.c r1 = r0.f403979c
                    r1.c(r4)
                    int r1 = r0.get()
                    if (r1 != 0) goto L44
                    r1 = 0
                    r2 = 1
                    boolean r3 = r0.compareAndSet(r1, r2)
                    if (r3 == 0) goto L44
                    io.reactivex.rxjava3.core.G<? super R> r3 = r0.f403978b
                    r3.onNext(r5)
                    java.util.concurrent.atomic.AtomicInteger r5 = r0.f403980d
                    int r5 = r5.decrementAndGet()
                    if (r5 != 0) goto L23
                    r1 = r2
                L23:
                    java.util.concurrent.atomic.AtomicReference<q41.i<R>> r5 = r0.f403983g
                    java.lang.Object r5 = r5.get()
                    q41.i r5 = (q41.i) r5
                    if (r1 == 0) goto L3d
                    if (r5 == 0) goto L35
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L3d
                L35:
                    io.reactivex.rxjava3.internal.util.b r5 = r0.f403981e
                    io.reactivex.rxjava3.core.G<? super R> r0 = r0.f403978b
                    r5.e(r0)
                    goto L81
                L3d:
                    int r5 = r0.decrementAndGet()
                    if (r5 != 0) goto L7e
                    goto L81
                L44:
                    java.util.concurrent.atomic.AtomicReference<q41.i<R>> r1 = r0.f403983g
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
                    java.util.concurrent.atomic.AtomicInteger r5 = r0.f403980d
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
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.C41936b0.a.C11500a.onSuccess(java.lang.Object):void");
            }
        }

        public a(io.reactivex.rxjava3.core.G g12, l41.o oVar) {
            this.f403978b = g12;
            this.f403982f = oVar;
        }

        public final void a() {
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f403978b;
            AtomicInteger atomicInteger = this.f403980d;
            AtomicReference<q41.i<R>> atomicReference = this.f403983g;
            int iAddAndGet = 1;
            while (!this.f403985i) {
                if (this.f403981e.get() != null) {
                    q41.i<R> iVar = this.f403983g.get();
                    if (iVar != null) {
                        iVar.clear();
                    }
                    this.f403981e.e(g12);
                    return;
                }
                boolean z12 = atomicInteger.get() == 0;
                q41.i<R> iVar2 = atomicReference.get();
                A00.b bVarPoll = iVar2 != null ? iVar2.poll() : null;
                boolean z13 = bVarPoll == null;
                if (z12 && z13) {
                    this.f403981e.e(this.f403978b);
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
            q41.i<R> iVar3 = this.f403983g.get();
            if (iVar3 != null) {
                iVar3.clear();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403984h, dVar)) {
                this.f403984h = dVar;
                this.f403978b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403985i = true;
            this.f403984h.dispose();
            this.f403979c.dispose();
            this.f403981e.c();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403980d.decrementAndGet();
            if (getAndIncrement() == 0) {
                a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f403985i;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403980d.decrementAndGet();
            if (this.f403981e.b(th2)) {
                this.f403979c.dispose();
                if (getAndIncrement() == 0) {
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            try {
                io.reactivex.rxjava3.core.O<? extends R> oApply = this.f403982f.apply(t12);
                Objects.requireNonNull(oApply, "The mapper returned a null SingleSource");
                io.reactivex.rxjava3.core.O<? extends R> o12 = oApply;
                this.f403980d.getAndIncrement();
                C11500a c11500a = new C11500a();
                if (this.f403985i || !this.f403979c.b(c11500a)) {
                    return;
                }
                o12.a(c11500a);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403984h.dispose();
                onError(th2);
            }
        }
    }

    public C41936b0(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        super(zVar);
        this.f403977c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f403951b.c(new a(g12, this.f403977c));
    }
}
