package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableConcatMapMaybe.java */
/* loaded from: classes8.dex */
public final class f<T, R> extends AbstractC41777j<R> {

    /* compiled from: FlowableConcatMapMaybe.java */
    public static final class a<T, R> extends d<T> implements org.reactivestreams.e {
        private static final long serialVersionUID = -9140123220065488293L;

        /* renamed from: j, reason: collision with root package name */
        public final InterfaceC41782o f403369j;

        /* renamed from: k, reason: collision with root package name */
        public final AtomicLong f403370k;

        /* renamed from: l, reason: collision with root package name */
        public final C11476a<R> f403371l;

        /* renamed from: m, reason: collision with root package name */
        public long f403372m;

        /* renamed from: n, reason: collision with root package name */
        public int f403373n;

        /* renamed from: o, reason: collision with root package name */
        public R f403374o;

        /* renamed from: p, reason: collision with root package name */
        public volatile int f403375p;

        /* compiled from: FlowableConcatMapMaybe.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.mixed.f$a$a, reason: collision with other inner class name */
        public static final class C11476a<R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?, R> f403376b;

            public C11476a(a<?, R> aVar) {
                this.f403376b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void e() {
                a<?, R> aVar = this.f403376b;
                aVar.f403375p = 0;
                aVar.c();
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f403376b;
                if (aVar.f403356b.b(th2)) {
                    if (aVar.f403358d != ErrorMode.f404821d) {
                        aVar.f403360f.cancel();
                    }
                    aVar.f403375p = 0;
                    aVar.c();
                }
            }

            @Override // io.reactivex.rxjava3.core.t
            public final void onSuccess(R r12) {
                a<?, R> aVar = this.f403376b;
                aVar.f403374o = r12;
                aVar.f403375p = 2;
                aVar.c();
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            super(0, null);
            this.f403369j = interfaceC41782o;
            this.f403370k = new AtomicLong();
            this.f403371l = new C11476a<>(this);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.d
        public final void a() {
            this.f403374o = null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.d
        public final void b() {
            C11476a<R> c11476a = this.f403371l;
            c11476a.getClass();
            DisposableHelper.a(c11476a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            r3.clear();
            r17.f403374o = null;
            r4.g(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            if (r7 != false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
        
            r0 = r17.f403373n + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        
            if (r0 != r6) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        
            r17.f403373n = 0;
            r17.f403360f.request(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
        
            r17.f403373n = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
        
            io.reactivex.rxjava3.exceptions.a.a(r0);
            r17.f403360f.cancel();
            r3.clear();
            r4.b(r0);
            r4.g(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
        
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
                io.reactivex.rxjava3.core.o r2 = r1.f403369j
                io.reactivex.rxjava3.internal.util.ErrorMode r0 = r1.f403358d
                q41.g<T> r3 = r1.f403359e
                io.reactivex.rxjava3.internal.util.b r4 = r1.f403356b
                java.util.concurrent.atomic.AtomicLong r5 = r1.f403370k
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
                r1.f403374o = r11
                goto Lb1
            L28:
                int r10 = r1.f403375p
                java.lang.Object r12 = r4.get()
                if (r12 == 0) goto L43
                io.reactivex.rxjava3.internal.util.ErrorMode r12 = io.reactivex.rxjava3.internal.util.ErrorMode.f404819b
                if (r0 == r12) goto L3a
                io.reactivex.rxjava3.internal.util.ErrorMode r12 = io.reactivex.rxjava3.internal.util.ErrorMode.f404820c
                if (r0 != r12) goto L43
                if (r10 != 0) goto L43
            L3a:
                r3.clear()
                r1.f403374o = r11
                r4.g(r2)
                return
            L43:
                r12 = 0
                if (r10 != 0) goto L94
                boolean r10 = r1.f403361g
                java.lang.Object r13 = r3.poll()     // Catch: java.lang.Throwable -> L83
                if (r13 != 0) goto L50
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
                goto Lb1
            L5c:
                if (r7 != 0) goto L6e
                int r0 = r1.f403373n
                int r0 = r0 + r8
                if (r0 != r6) goto L6c
                r1.f403373n = r12
                org.reactivestreams.e r0 = r1.f403360f
                long r5 = (long) r6
                r0.request(r5)
                goto L6e
            L6c:
                r1.f403373n = r0
            L6e:
                throw r11     // Catch: java.lang.Throwable -> L6f
            L6f:
                r0 = move-exception
                r5 = r0
                io.reactivex.rxjava3.exceptions.a.a(r5)
                org.reactivestreams.e r0 = r1.f403360f
                r0.cancel()
                r3.clear()
                r4.b(r5)
                r4.g(r2)
                return
            L83:
                r0 = move-exception
                r3 = r0
                io.reactivex.rxjava3.exceptions.a.a(r3)
                org.reactivestreams.e r0 = r1.f403360f
                r0.cancel()
                r4.b(r3)
                r4.g(r2)
                return
            L94:
                r13 = 2
                if (r10 != r13) goto Lb1
                long r13 = r1.f403372m
                long r15 = r5.get()
                int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r10 == 0) goto Lb1
                R r10 = r1.f403374o
                r1.f403374o = r11
                r2.onNext(r10)
                r10 = 1
                long r13 = r13 + r10
                r1.f403372m = r13
                r1.f403375p = r12
                goto L1c
            Lb1:
                int r9 = -r9
                int r9 = r1.addAndGet(r9)
                if (r9 != 0) goto L1c
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.mixed.f.a.c():void");
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.d
        public final void d() {
            this.f403369j.K(this);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            io.reactivex.rxjava3.internal.util.c.a(this.f403370k, j12);
            c();
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
