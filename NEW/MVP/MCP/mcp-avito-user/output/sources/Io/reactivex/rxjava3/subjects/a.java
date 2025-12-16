package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.observers.n;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: AsyncSubject.java */
/* loaded from: classes8.dex */
public final class a<T> extends i<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final C11525a[] f404961e = new C11525a[0];

    /* renamed from: f, reason: collision with root package name */
    public static final C11525a[] f404962f = new C11525a[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<C11525a<T>[]> f404963b = new AtomicReference<>(f404961e);

    /* renamed from: c, reason: collision with root package name */
    public Throwable f404964c;

    /* renamed from: d, reason: collision with root package name */
    public T f404965d;

    /* compiled from: AsyncSubject.java */
    /* renamed from: io.reactivex.rxjava3.subjects.a$a, reason: collision with other inner class name */
    public static final class C11525a<T> extends n<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T> f404966d;

        public C11525a(G<? super T> g12, a<T> aVar) {
            super(g12);
            this.f404966d = aVar;
        }

        @Override // io.reactivex.rxjava3.internal.observers.n, io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (getAndSet(4) != 4) {
                this.f404966d.N0(this);
            }
        }
    }

    public final void N0(C11525a<T> c11525a) {
        C11525a<T>[] c11525aArr;
        while (true) {
            AtomicReference<C11525a<T>[]> atomicReference = this.f404963b;
            C11525a<T>[] c11525aArr2 = atomicReference.get();
            int length = c11525aArr2.length;
            if (length == 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                } else if (c11525aArr2[i12] == c11525a) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 < 0) {
                return;
            }
            if (length == 1) {
                c11525aArr = f404961e;
            } else {
                C11525a<T>[] c11525aArr3 = new C11525a[length - 1];
                System.arraycopy(c11525aArr2, 0, c11525aArr3, 0, i12);
                System.arraycopy(c11525aArr2, i12 + 1, c11525aArr3, i12, (length - i12) - 1);
                c11525aArr = c11525aArr3;
            }
            while (!atomicReference.compareAndSet(c11525aArr2, c11525aArr)) {
                if (atomicReference.get() != c11525aArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (this.f404963b.get() == f404962f) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        AtomicReference<C11525a<T>[]> atomicReference = this.f404963b;
        C11525a<T>[] c11525aArr = atomicReference.get();
        C11525a<T>[] c11525aArr2 = f404962f;
        if (c11525aArr == c11525aArr2) {
            return;
        }
        T t12 = this.f404965d;
        C11525a<T>[] andSet = atomicReference.getAndSet(c11525aArr2);
        int i12 = 0;
        if (t12 != null) {
            int length = andSet.length;
            while (i12 < length) {
                andSet[i12].a(t12);
                i12++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i12 < length2) {
            C11525a<T> c11525a = andSet[i12];
            if (!c11525a.getF318621e()) {
                c11525a.f402118b.e();
            }
            i12++;
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        AtomicReference<C11525a<T>[]> atomicReference = this.f404963b;
        C11525a<T>[] c11525aArr = atomicReference.get();
        C11525a<T>[] c11525aArr2 = f404962f;
        if (c11525aArr == c11525aArr2) {
            C47998a.b(th2);
            return;
        }
        this.f404965d = null;
        this.f404964c = th2;
        C11525a<T>[] andSet = atomicReference.getAndSet(c11525aArr2);
        for (C11525a<T> c11525a : andSet) {
            if (c11525a.getF318621e()) {
                C47998a.b(th2);
            } else {
                c11525a.f402118b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onNext called with a null value.");
        if (this.f404963b.get() == f404962f) {
            return;
        }
        this.f404965d = t12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        C11525a<T> c11525a = new C11525a<>(g12, this);
        g12.b(c11525a);
        while (true) {
            AtomicReference<C11525a<T>[]> atomicReference = this.f404963b;
            C11525a<T>[] c11525aArr = atomicReference.get();
            if (c11525aArr != f404962f) {
                int length = c11525aArr.length;
                C11525a<T>[] c11525aArr2 = new C11525a[length + 1];
                System.arraycopy(c11525aArr, 0, c11525aArr2, 0, length);
                c11525aArr2[length] = c11525a;
                while (!atomicReference.compareAndSet(c11525aArr, c11525aArr2)) {
                    if (atomicReference.get() != c11525aArr) {
                        break;
                    }
                }
                if (c11525a.getF318621e()) {
                    N0(c11525a);
                    return;
                }
                return;
            }
            Throwable th2 = this.f404964c;
            if (th2 != null) {
                g12.onError(th2);
                return;
            }
            T t12 = this.f404965d;
            if (t12 != null) {
                c11525a.a(t12);
                return;
            } else {
                if (c11525a.getF318621e()) {
                    return;
                }
                c11525a.f402118b.e();
                return;
            }
        }
    }
}
