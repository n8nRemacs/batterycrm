package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.L;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SingleSubject.java */
/* loaded from: classes8.dex */
public final class h<T> extends I<T> implements L<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final a[] f405019f = new a[0];

    /* renamed from: g, reason: collision with root package name */
    public static final a[] f405020g = new a[0];

    /* renamed from: d, reason: collision with root package name */
    public T f405023d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f405024e;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f405022c = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f405021b = new AtomicReference<>(f405019f);

    /* compiled from: SingleSubject.java */
    public static final class a<T> extends AtomicReference<h<T>> implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: b, reason: collision with root package name */
        public final L<? super T> f405025b;

        public a(L<? super T> l12, h<T> hVar) {
            this.f405025b = l12;
            lazySet(hVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            h<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.J(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == null;
        }
    }

    public final void J(@j41.e a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f405021b;
            a<T>[] aVarArr2 = atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
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
                aVarArr = f405019f;
            } else {
                a<T>[] aVarArr3 = new a[length - 1];
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

    @Override // io.reactivex.rxjava3.core.L
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        if (this.f405021b.get() == f405020g) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onError(@j41.e Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        if (!this.f405022c.compareAndSet(false, true)) {
            C47998a.b(th2);
            return;
        }
        this.f405024e = th2;
        for (a<T> aVar : this.f405021b.getAndSet(f405020g)) {
            aVar.f405025b.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(@j41.e T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onSuccess called with a null value.");
        if (this.f405022c.compareAndSet(false, true)) {
            this.f405023d = t12;
            for (a<T> aVar : this.f405021b.getAndSet(f405020g)) {
                aVar.f405025b.onSuccess(t12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(@j41.e L<? super T> l12) {
        a<T> aVar = new a<>(l12, this);
        l12.b(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f405021b;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f405020g) {
                Throwable th2 = this.f405024e;
                if (th2 != null) {
                    l12.onError(th2);
                    return;
                } else {
                    l12.onSuccess(this.f405023d);
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.getF318621e()) {
                J(aVar);
                return;
            }
            return;
        }
    }
}
