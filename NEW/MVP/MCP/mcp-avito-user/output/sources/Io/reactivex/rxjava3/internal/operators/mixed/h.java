package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.core.O;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableConcatMapSingle.java */
/* loaded from: classes8.dex */
public final class h<T, R> extends AbstractC41777j<R> {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC41777j<T> f403377c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super T, ? extends O<? extends R>> f403378d;

    /* renamed from: e, reason: collision with root package name */
    public final ErrorMode f403379e;

    /* renamed from: f, reason: collision with root package name */
    public final int f403380f = 2;

    /* compiled from: FlowableConcatMapSingle.java */
    public static final class a<T, R> extends d<T> implements org.reactivestreams.e {
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: j, reason: collision with root package name */
        public final InterfaceC41782o f403381j;

        /* renamed from: k, reason: collision with root package name */
        public final l41.o<? super T, ? extends O<? extends R>> f403382k;

        /* renamed from: l, reason: collision with root package name */
        public final AtomicLong f403383l;

        /* renamed from: m, reason: collision with root package name */
        public final C11477a<R> f403384m;

        /* renamed from: n, reason: collision with root package name */
        public long f403385n;

        /* renamed from: o, reason: collision with root package name */
        public int f403386o;

        /* renamed from: p, reason: collision with root package name */
        public R f403387p;

        /* renamed from: q, reason: collision with root package name */
        public volatile int f403388q;

        /* compiled from: FlowableConcatMapSingle.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.h$a$a, reason: collision with other inner class name */
        public static final class C11477a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements L<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, R> f403389b;

            public C11477a(a<?, R> aVar) {
                this.f403389b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f403389b;
                if (aVar.f403356b.b(th2)) {
                    if (aVar.f403358d != ErrorMode.f404821d) {
                        aVar.f403360f.cancel();
                    }
                    aVar.f403388q = 0;
                    aVar.c();
                }
            }

            @Override // io.reactivex.rxjava3.core.L
            public final void onSuccess(R r12) {
                a<?, R> aVar = this.f403389b;
                aVar.f403387p = r12;
                aVar.f403388q = 2;
                aVar.c();
            }
        }

        public a(InterfaceC41782o interfaceC41782o, l41.o oVar, int i12, ErrorMode errorMode) {
            super(i12, errorMode);
            this.f403381j = interfaceC41782o;
            this.f403382k = oVar;
            this.f403383l = new AtomicLong();
            this.f403384m = new C11477a<>(this);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.d
        public final void a() {
            this.f403387p = null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.d
        public final void b() {
            C11477a<R> c11477a = this.f403384m;
            c11477a.getClass();
            DisposableHelper.a(c11477a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            r3.clear();
            r17.f403387p = null;
            r4.g(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        
            return;
         */
        @Override // io.reactivex.rxjava3.internal.operators.mixed.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void c() {
            /*
                r17 = this;
                r1 = r17
                int r0 = r17.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                io.reactivex.rxjava3.core.o r2 = r1.f403381j
                io.reactivex.rxjava3.internal.util.ErrorMode r0 = r1.f403358d
                q41.g<T> r3 = r1.f403359e
                io.reactivex.rxjava3.internal.util.b r4 = r1.f403356b
                java.util.concurrent.atomic.AtomicLong r5 = r1.f403383l
                int r6 = r1.f403357c
                int r7 = r6 >> 1
                int r6 = r6 - r7
                boolean r7 = r1.f403363i
                r8 = 1
                r9 = r8
            L1c:
                boolean r10 = r1.f403362h
                r11 = 0
                if (r10 == 0) goto L28
                r3.clear()
                r1.f403387p = r11
                goto Lc4
            L28:
                int r10 = r1.f403388q
                java.lang.Object r12 = r4.get()
                if (r12 == 0) goto L43
                io.reactivex.rxjava3.internal.util.ErrorMode r12 = io.reactivex.rxjava3.internal.util.ErrorMode.f404819b
                if (r0 == r12) goto L3a
                io.reactivex.rxjava3.internal.util.ErrorMode r12 = io.reactivex.rxjava3.internal.util.ErrorMode.f404820c
                if (r0 != r12) goto L43
                if (r10 != 0) goto L43
            L3a:
                r3.clear()
                r1.f403387p = r11
                r4.g(r2)
                return
            L43:
                r12 = 0
                if (r10 != 0) goto La7
                boolean r10 = r1.f403361g
                java.lang.Object r11 = r3.poll()     // Catch: java.lang.Throwable -> L96
                if (r11 != 0) goto L50
                r13 = r8
                goto L51
            L50:
                r13 = r12
            L51:
                if (r10 == 0) goto L59
                if (r13 == 0) goto L59
                r4.g(r2)
                return
            L59:
                if (r13 == 0) goto L5c
                goto Lc4
            L5c:
                if (r7 != 0) goto L6e
                int r10 = r1.f403386o
                int r10 = r10 + r8
                if (r10 != r6) goto L6c
                r1.f403386o = r12
                org.reactivestreams.e r10 = r1.f403360f
                long r12 = (long) r6
                r10.request(r12)
                goto L6e
            L6c:
                r1.f403386o = r10
            L6e:
                l41.o<? super T, ? extends io.reactivex.rxjava3.core.O<? extends R>> r10 = r1.f403382k     // Catch: java.lang.Throwable -> L83
                java.lang.Object r10 = r10.apply(r11)     // Catch: java.lang.Throwable -> L83
                java.lang.String r11 = "The mapper returned a null SingleSource"
                java.util.Objects.requireNonNull(r10, r11)     // Catch: java.lang.Throwable -> L83
                io.reactivex.rxjava3.core.O r10 = (io.reactivex.rxjava3.core.O) r10     // Catch: java.lang.Throwable -> L83
                r1.f403388q = r8
                io.reactivex.rxjava3.internal.operators.mixed.h$a$a<R> r11 = r1.f403384m
                r10.a(r11)
                goto Lc4
            L83:
                r0 = move-exception
                io.reactivex.rxjava3.exceptions.a.a(r0)
                org.reactivestreams.e r5 = r1.f403360f
                r5.cancel()
                r3.clear()
                r4.b(r0)
                r4.g(r2)
                return
            L96:
                r0 = move-exception
                r3 = r0
                io.reactivex.rxjava3.exceptions.a.a(r3)
                org.reactivestreams.e r0 = r1.f403360f
                r0.cancel()
                r4.b(r3)
                r4.g(r2)
                return
            La7:
                r13 = 2
                if (r10 != r13) goto Lc4
                long r13 = r1.f403385n
                long r15 = r5.get()
                int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r10 == 0) goto Lc4
                R r10 = r1.f403387p
                r1.f403387p = r11
                r2.onNext(r10)
                r10 = 1
                long r13 = r13 + r10
                r1.f403385n = r13
                r1.f403388q = r12
                goto L1c
            Lc4:
                int r9 = -r9
                int r9 = r1.addAndGet(r9)
                if (r9 != 0) goto L1c
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.mixed.h.a.c():void");
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.d
        public final void d() {
            this.f403381j.K(this);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this.f403383l, j12);
            c();
        }
    }

    public h(AbstractC41777j abstractC41777j, l41.o oVar, ErrorMode errorMode) {
        this.f403377c = abstractC41777j;
        this.f403378d = oVar;
        this.f403379e = errorMode;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        this.f403377c.q(new a((InterfaceC41782o) dVar, this.f403378d, this.f403380f, this.f403379e));
    }
}
