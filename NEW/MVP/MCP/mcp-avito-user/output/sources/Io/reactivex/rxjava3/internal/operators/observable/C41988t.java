package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCombineLatest.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41988t<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.E<? extends T>[] f404293b;

    /* renamed from: c, reason: collision with root package name */
    public final List f404294c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.o<? super Object[], ? extends R> f404295d;

    /* renamed from: e, reason: collision with root package name */
    public final int f404296e;

    /* compiled from: ObservableCombineLatest.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.t$a */
    public static final class a<T, R> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T> {
        private static final long serialVersionUID = -4823716997131257941L;

        /* renamed from: b, reason: collision with root package name */
        public final b<T, R> f404297b;

        /* renamed from: c, reason: collision with root package name */
        public final int f404298c;

        public a(b<T, R> bVar, int i12) {
            this.f404297b = bVar;
            this.f404298c = i12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x001f A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x000d, B:15:0x0017, B:18:0x0021, B:17:0x001f), top: B:25:0x0005 }] */
        @Override // io.reactivex.rxjava3.core.G
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void e() {
            /*
                r5 = this;
                io.reactivex.rxjava3.internal.operators.observable.t$b<T, R> r0 = r5.f404297b
                int r1 = r5.f404298c
                monitor-enter(r0)
                java.lang.Object[] r2 = r0.f404302e     // Catch: java.lang.Throwable -> Lb
                if (r2 != 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                goto L2a
            Lb:
                r1 = move-exception
                goto L2b
            Ld:
                r1 = r2[r1]     // Catch: java.lang.Throwable -> Lb
                r3 = 1
                if (r1 != 0) goto L14
                r1 = r3
                goto L15
            L14:
                r1 = 0
            L15:
                if (r1 != 0) goto L1f
                int r4 = r0.f404308k     // Catch: java.lang.Throwable -> Lb
                int r4 = r4 + r3
                r0.f404308k = r4     // Catch: java.lang.Throwable -> Lb
                int r2 = r2.length     // Catch: java.lang.Throwable -> Lb
                if (r4 != r2) goto L21
            L1f:
                r0.f404305h = r3     // Catch: java.lang.Throwable -> Lb
            L21:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                if (r1 == 0) goto L27
                r0.a()
            L27:
                r0.c()
            L2a:
                return
            L2b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.C41988t.a.e():void");
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f404297b;
            if (bVar.f404306i.b(th2)) {
                bVar.a();
                bVar.c();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            boolean z12;
            b<T, R> bVar = this.f404297b;
            int i12 = this.f404298c;
            synchronized (bVar) {
                try {
                    Object[] objArr = bVar.f404302e;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i12];
                    int i13 = bVar.f404307j;
                    if (obj == null) {
                        i13++;
                        bVar.f404307j = i13;
                    }
                    objArr[i12] = t12;
                    if (i13 == objArr.length) {
                        bVar.f404303f.offer(objArr.clone());
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        bVar.c();
                    }
                } finally {
                }
            }
        }
    }

    /* compiled from: ObservableCombineLatest.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.t$b */
    public static final class b<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8567835998786448817L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f404299b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super Object[], ? extends R> f404300c;

        /* renamed from: d, reason: collision with root package name */
        public final a<T, R>[] f404301d;

        /* renamed from: e, reason: collision with root package name */
        public Object[] f404302e;

        /* renamed from: f, reason: collision with root package name */
        public final q41.i<Object[]> f404303f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f404304g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f404305h;

        /* renamed from: i, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f404306i = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: j, reason: collision with root package name */
        public int f404307j;

        /* renamed from: k, reason: collision with root package name */
        public int f404308k;

        public b(io.reactivex.rxjava3.core.G g12, l41.o oVar, int i12, int i13) {
            this.f404299b = g12;
            this.f404300c = oVar;
            this.f404302e = new Object[i12];
            a<T, R>[] aVarArr = new a[i12];
            for (int i14 = 0; i14 < i12; i14++) {
                aVarArr[i14] = new a<>(this, i14);
            }
            this.f404301d = aVarArr;
            this.f404303f = new q41.i<>(i13);
        }

        public final void a() {
            for (a<T, R> aVar : this.f404301d) {
                aVar.getClass();
                DisposableHelper.a(aVar);
            }
        }

        public final void b(q41.i<?> iVar) {
            synchronized (this) {
                this.f404302e = null;
            }
            iVar.clear();
        }

        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            q41.i<Object[]> iVar = this.f404303f;
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f404299b;
            int iAddAndGet = 1;
            while (!this.f404304g) {
                if (this.f404306i.get() != null) {
                    a();
                    b(iVar);
                    this.f404306i.e(g12);
                    return;
                }
                boolean z12 = this.f404305h;
                Object[] objArrPoll = iVar.poll();
                boolean z13 = objArrPoll == null;
                if (z12 && z13) {
                    b(iVar);
                    this.f404306i.e(g12);
                    return;
                }
                if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        R rApply = this.f404300c.apply(objArrPoll);
                        Objects.requireNonNull(rApply, "The combiner returned a null value");
                        g12.onNext(rApply);
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        this.f404306i.b(th2);
                        a();
                        b(iVar);
                        this.f404306i.e(g12);
                        return;
                    }
                }
            }
            b(iVar);
            this.f404306i.c();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404304g) {
                return;
            }
            this.f404304g = true;
            a();
            c();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404304g;
        }
    }

    public C41988t(io.reactivex.rxjava3.core.E[] eArr, List list, l41.o oVar, int i12) {
        this.f404293b = eArr;
        this.f404294c = list;
        this.f404295d = oVar;
        this.f404296e = i12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        int length;
        io.reactivex.rxjava3.core.E<? extends T>[] eArr = this.f404293b;
        if (eArr == null) {
            eArr = new io.reactivex.rxjava3.core.E[8];
            try {
                length = 0;
                for (io.reactivex.rxjava3.core.E<? extends T> e12 : this.f404294c) {
                    if (length == eArr.length) {
                        io.reactivex.rxjava3.core.E<? extends T>[] eArr2 = new io.reactivex.rxjava3.core.E[(length >> 2) + length];
                        System.arraycopy(eArr, 0, eArr2, 0, length);
                        eArr = eArr2;
                    }
                    int i12 = length + 1;
                    Objects.requireNonNull(e12, "The Iterator returned a null ObservableSource");
                    eArr[length] = e12;
                    length = i12;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                EmptyDisposable.d(th2, g12);
                return;
            }
        } else {
            length = eArr.length;
        }
        if (length == 0) {
            EmptyDisposable.a(g12);
            return;
        }
        b bVar = new b(g12, this.f404295d, length, this.f404296e);
        a<T, R>[] aVarArr = bVar.f404301d;
        int length2 = aVarArr.length;
        bVar.f404299b.b(bVar);
        for (int i13 = 0; i13 < length2 && !bVar.f404305h && !bVar.f404304g; i13++) {
            eArr[i13].c(aVarArr[i13]);
        }
    }
}
