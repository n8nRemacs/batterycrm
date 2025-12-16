package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q41.InterfaceC47199b;
import s41.C47998a;

/* compiled from: ObservableFlatMap.java */
/* loaded from: classes8.dex */
public final class X<T, U> extends AbstractC41932a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends U>> f403878c;

    /* renamed from: d, reason: collision with root package name */
    public final int f403879d;

    /* renamed from: e, reason: collision with root package name */
    public final int f403880e;

    /* compiled from: ObservableFlatMap.java */
    public static final class a<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* renamed from: b, reason: collision with root package name */
        public final b<T, U> f403881b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f403882c;

        /* renamed from: d, reason: collision with root package name */
        public volatile q41.g<U> f403883d;

        /* renamed from: e, reason: collision with root package name */
        public int f403884e;

        public a(b bVar) {
            this.f403881b = bVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar) && (dVar instanceof InterfaceC47199b)) {
                InterfaceC47199b interfaceC47199b = (InterfaceC47199b) dVar;
                int iV2 = interfaceC47199b.v(7);
                if (iV2 == 1) {
                    this.f403884e = iV2;
                    this.f403883d = interfaceC47199b;
                    this.f403882c = true;
                    this.f403881b.d();
                    return;
                }
                if (iV2 == 2) {
                    this.f403884e = iV2;
                    this.f403883d = interfaceC47199b;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403882c = true;
            this.f403881b.d();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403881b.f403893h.b(th2)) {
                b<T, U> bVar = this.f403881b;
                bVar.getClass();
                bVar.c();
                this.f403882c = true;
                this.f403881b.d();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(U u12) {
            if (this.f403884e != 0) {
                this.f403881b.d();
                return;
            }
            b<T, U> bVar = this.f403881b;
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                bVar.f403887b.onNext(u12);
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                q41.g iVar = this.f403883d;
                if (iVar == null) {
                    iVar = new q41.i(bVar.f403890e);
                    this.f403883d = iVar;
                }
                iVar.offer(u12);
                if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.f();
        }
    }

    /* compiled from: ObservableFlatMap.java */
    public static final class b<T, U> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.core.G<T> {

        /* renamed from: p, reason: collision with root package name */
        public static final a<?, ?>[] f403885p = new a[0];

        /* renamed from: q, reason: collision with root package name */
        public static final a<?, ?>[] f403886q = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super U> f403887b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends U>> f403888c;

        /* renamed from: d, reason: collision with root package name */
        public final int f403889d;

        /* renamed from: e, reason: collision with root package name */
        public final int f403890e;

        /* renamed from: f, reason: collision with root package name */
        public volatile q41.f<U> f403891f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f403892g;

        /* renamed from: h, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f403893h = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f403894i;

        /* renamed from: j, reason: collision with root package name */
        public final AtomicReference<a<?, ?>[]> f403895j;

        /* renamed from: k, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403896k;

        /* renamed from: l, reason: collision with root package name */
        public long f403897l;

        /* renamed from: m, reason: collision with root package name */
        public int f403898m;

        /* renamed from: n, reason: collision with root package name */
        public final ArrayDeque f403899n;

        /* renamed from: o, reason: collision with root package name */
        public int f403900o;

        public b(io.reactivex.rxjava3.core.G g12, l41.o oVar, int i12, int i13) {
            this.f403887b = g12;
            this.f403888c = oVar;
            this.f403889d = i12;
            this.f403890e = i13;
            if (i12 != Integer.MAX_VALUE) {
                this.f403899n = new ArrayDeque(i12);
            }
            this.f403895j = new AtomicReference<>(f403885p);
        }

        public final boolean a() {
            if (this.f403894i) {
                return true;
            }
            if (this.f403893h.get() == null) {
                return false;
            }
            c();
            this.f403893h.e(this.f403887b);
            return true;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403896k, dVar)) {
                this.f403896k = dVar;
                this.f403887b.b(this);
            }
        }

        public final boolean c() {
            this.f403896k.dispose();
            AtomicReference<a<?, ?>[]> atomicReference = this.f403895j;
            a<?, ?>[] aVarArr = f403886q;
            a<?, ?>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet == aVarArr) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.getClass();
                DisposableHelper.a(aVar);
            }
            return true;
        }

        public final void d() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403894i = true;
            if (c()) {
                this.f403893h.c();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403892g) {
                return;
            }
            this.f403892g = true;
            d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00c4 A[PHI: r4
  0x00c4: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00aa, B:66:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void f() {
            /*
                Method dump skipped, instructions count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.observable.X.b.f():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                AtomicReference<a<?, ?>[]> atomicReference = this.f403895j;
                a<?, ?>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i12 = -1;
                        break;
                    } else if (aVarArr2[i12] == aVar) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = f403885p;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr2, 0, aVarArr3, 0, i12);
                    System.arraycopy(aVarArr2, i12 + 1, aVarArr3, i12, (length - i12) - 1);
                    aVarArr = aVarArr3;
                }
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                        break;
                    }
                }
                return;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v5, types: [q41.g] */
        public final void h(io.reactivex.rxjava3.core.E<? extends U> e12) {
            boolean z12;
            do {
                z12 = false;
                if (!(e12 instanceof l41.s)) {
                    this.f403897l++;
                    a<?, ?> aVar = new a<>(this);
                    while (true) {
                        AtomicReference<a<?, ?>[]> atomicReference = this.f403895j;
                        a<?, ?>[] aVarArr = atomicReference.get();
                        if (aVarArr == f403886q) {
                            DisposableHelper.a(aVar);
                            return;
                        }
                        int length = aVarArr.length;
                        a<?, ?>[] aVarArr2 = new a[length + 1];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                            if (atomicReference.get() != aVarArr) {
                                break;
                            }
                        }
                        e12.c(aVar);
                        return;
                    }
                }
                try {
                    Object obj = ((l41.s) e12).get();
                    if (obj != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.f403887b.onNext(obj);
                            if (decrementAndGet() != 0) {
                            }
                        } else {
                            q41.f<U> fVar = this.f403891f;
                            ?? r32 = fVar;
                            if (fVar == false) {
                                q41.f<U> iVar = this.f403889d == Integer.MAX_VALUE ? new q41.i(this.f403890e) : new q41.h(this.f403889d);
                                this.f403891f = iVar;
                                r32 = iVar;
                            }
                            r32.offer(obj);
                            if (getAndIncrement() != 0) {
                                return;
                            }
                        }
                        f();
                    }
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    this.f403893h.b(th2);
                    d();
                }
                if (this.f403889d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        e12 = (io.reactivex.rxjava3.core.E) this.f403899n.poll();
                        if (e12 == null) {
                            this.f403900o--;
                            z12 = true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } while (!z12);
            d();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403894i;
        }

        public final void k(int i12) {
            while (true) {
                int i13 = i12 - 1;
                if (i12 == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        io.reactivex.rxjava3.core.E<? extends U> e12 = (io.reactivex.rxjava3.core.E) this.f403899n.poll();
                        if (e12 == null) {
                            this.f403900o--;
                        } else {
                            h(e12);
                        }
                    } finally {
                    }
                }
                i12 = i13;
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403892g) {
                C47998a.b(th2);
            } else if (this.f403893h.b(th2)) {
                this.f403892g = true;
                d();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403892g) {
                return;
            }
            try {
                io.reactivex.rxjava3.core.E<? extends U> eApply = this.f403888c.apply(t12);
                Objects.requireNonNull(eApply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.E<? extends U> e12 = eApply;
                if (this.f403889d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i12 = this.f403900o;
                            if (i12 == this.f403889d) {
                                this.f403899n.offer(e12);
                                return;
                            }
                            this.f403900o = i12 + 1;
                        } finally {
                        }
                    }
                }
                h(e12);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f403896k.dispose();
                onError(th2);
            }
        }
    }

    public X(io.reactivex.rxjava3.core.z zVar, l41.o oVar, int i12, int i13) {
        super(zVar);
        this.f403878c = oVar;
        this.f403879d = i12;
        this.f403880e = i13;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super U> g12) {
        io.reactivex.rxjava3.core.E<T> e12 = this.f403951b;
        l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends U>> oVar = this.f403878c;
        if (C41943d1.b(e12, g12, oVar)) {
            return;
        }
        e12.c(new b(g12, oVar, this.f403879d, this.f403880e));
    }
}
