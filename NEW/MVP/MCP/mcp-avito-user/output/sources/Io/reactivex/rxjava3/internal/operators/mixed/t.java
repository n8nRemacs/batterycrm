package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapMaybe.java */
/* loaded from: classes8.dex */
public final class t<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z<T> f403437b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> f403438c;

    /* renamed from: d, reason: collision with root package name */
    public final ErrorMode f403439d;

    /* renamed from: e, reason: collision with root package name */
    public final int f403440e;

    /* compiled from: ObservableConcatMapMaybe.java */
    public static final class a<T, R> extends c<T> {
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: i, reason: collision with root package name */
        public final G<? super R> f403441i;

        /* renamed from: j, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> f403442j;

        /* renamed from: k, reason: collision with root package name */
        public final C11482a<R> f403443k;

        /* renamed from: l, reason: collision with root package name */
        public R f403444l;

        /* renamed from: m, reason: collision with root package name */
        public volatile int f403445m;

        /* compiled from: ObservableConcatMapMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.t$a$a, reason: collision with other inner class name */
        public static final class C11482a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, R> f403446b;

            public C11482a(a<?, R> aVar) {
                this.f403446b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                a<?, R> aVar = this.f403446b;
                aVar.f403445m = 0;
                aVar.d();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f403446b;
                if (aVar.f403349b.b(th2)) {
                    if (aVar.f403351d != ErrorMode.f404821d) {
                        aVar.f403353f.dispose();
                    }
                    aVar.f403445m = 0;
                    aVar.d();
                }
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(R r12) {
                a<?, R> aVar = this.f403446b;
                aVar.f403444l = r12;
                aVar.f403445m = 2;
                aVar.d();
            }
        }

        public a(G<? super R> g12, l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> oVar, int i12, ErrorMode errorMode) {
            super(i12, errorMode);
            this.f403441i = g12;
            this.f403442j = oVar;
            this.f403443k = new C11482a<>(this);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.c
        public final void a() {
            this.f403444l = null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.c
        public final void c() {
            C11482a<R> c11482a = this.f403443k;
            c11482a.getClass();
            DisposableHelper.a(c11482a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            r2.clear();
            r10.f403444l = null;
            r3.e(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        
            return;
         */
        @Override // io.reactivex.rxjava3.internal.operators.mixed.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d() {
            /*
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.rxjava3.core.G<? super R> r0 = r10.f403441i
                io.reactivex.rxjava3.internal.util.ErrorMode r1 = r10.f403351d
                q41.g<T> r2 = r10.f403352e
                io.reactivex.rxjava3.internal.util.b r3 = r10.f403349b
                r4 = 1
                r5 = r4
            L11:
                boolean r6 = r10.f403355h
                r7 = 0
                if (r6 == 0) goto L1d
                r2.clear()
                r10.f403444l = r7
                goto L97
            L1d:
                int r6 = r10.f403445m
                java.lang.Object r8 = r3.get()
                if (r8 == 0) goto L38
                io.reactivex.rxjava3.internal.util.ErrorMode r8 = io.reactivex.rxjava3.internal.util.ErrorMode.f404819b
                if (r1 == r8) goto L2f
                io.reactivex.rxjava3.internal.util.ErrorMode r8 = io.reactivex.rxjava3.internal.util.ErrorMode.f404820c
                if (r1 != r8) goto L38
                if (r6 != 0) goto L38
            L2f:
                r2.clear()
                r10.f403444l = r7
                r3.e(r0)
                return
            L38:
                r8 = 0
                if (r6 != 0) goto L89
                boolean r6 = r10.f403354g
                java.lang.Object r7 = r2.poll()     // Catch: java.lang.Throwable -> L77
                if (r7 != 0) goto L44
                r8 = r4
            L44:
                if (r6 == 0) goto L4c
                if (r8 == 0) goto L4c
                r3.e(r0)
                return
            L4c:
                if (r8 == 0) goto L4f
                goto L97
            L4f:
                l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> r6 = r10.f403442j     // Catch: java.lang.Throwable -> L64
                java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L64
                java.lang.String r7 = "The mapper returned a null MaybeSource"
                java.util.Objects.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L64
                io.reactivex.rxjava3.core.w r6 = (io.reactivex.rxjava3.core.w) r6     // Catch: java.lang.Throwable -> L64
                r10.f403445m = r4
                io.reactivex.rxjava3.internal.operators.mixed.t$a$a<R> r7 = r10.f403443k
                r6.a(r7)
                goto L97
            L64:
                r1 = move-exception
                io.reactivex.rxjava3.exceptions.a.a(r1)
                io.reactivex.rxjava3.disposables.d r4 = r10.f403353f
                r4.dispose()
                r2.clear()
                r3.b(r1)
                r3.e(r0)
                return
            L77:
                r1 = move-exception
                io.reactivex.rxjava3.exceptions.a.a(r1)
                r10.f403355h = r4
                io.reactivex.rxjava3.disposables.d r2 = r10.f403353f
                r2.dispose()
                r3.b(r1)
                r3.e(r0)
                return
            L89:
                r9 = 2
                if (r6 != r9) goto L97
                R r6 = r10.f403444l
                r10.f403444l = r7
                r0.onNext(r6)
                r10.f403445m = r8
                goto L11
            L97:
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.mixed.t.a.d():void");
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.c
        public final void f() {
            this.f403441i.b(this);
        }
    }

    public t(io.reactivex.rxjava3.core.z zVar, l41.o oVar) {
        ErrorMode errorMode = ErrorMode.f404819b;
        this.f403437b = zVar;
        this.f403438c = oVar;
        this.f403439d = errorMode;
        this.f403440e = 2;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super R> g12) {
        l41.o<? super T, ? extends io.reactivex.rxjava3.core.w<? extends R>> oVar = this.f403438c;
        io.reactivex.rxjava3.core.z<T> zVar = this.f403437b;
        if (y.b(zVar, oVar, g12)) {
            return;
        }
        zVar.c(new a(g12, oVar, this.f403440e, this.f403439d));
    }
}
