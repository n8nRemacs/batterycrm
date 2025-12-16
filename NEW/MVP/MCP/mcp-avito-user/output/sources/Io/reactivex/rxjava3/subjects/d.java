package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: MaybeSubject.java */
/* loaded from: classes8.dex */
public final class d<T> extends q<T> implements t<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final a[] f404989f = new a[0];

    /* renamed from: g, reason: collision with root package name */
    public static final a[] f404990g = new a[0];

    /* renamed from: d, reason: collision with root package name */
    public T f404993d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f404994e;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f404992c = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f404991b = new AtomicReference<>(f404989f);

    /* compiled from: MaybeSubject.java */
    public static final class a<T> extends AtomicReference<d<T>> implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: b, reason: collision with root package name */
        public final t<? super T> f404995b;

        public a(t<? super T> tVar, d<T> dVar) {
            this.f404995b = tVar;
            lazySet(dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            d<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.s(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == null;
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (this.f404991b.get() == f404990g) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void e() {
        if (this.f404992c.compareAndSet(false, true)) {
            for (a<T> aVar : this.f404991b.getAndSet(f404990g)) {
                aVar.f404995b.e();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(t<? super T> tVar) {
        a<T> aVar = new a<>(tVar, this);
        tVar.b(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f404991b;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f404990g) {
                Throwable th2 = this.f404994e;
                if (th2 != null) {
                    tVar.onError(th2);
                    return;
                }
                T t12 = this.f404993d;
                if (t12 == null) {
                    tVar.e();
                    return;
                } else {
                    tVar.onSuccess(t12);
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
                s(aVar);
                return;
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        if (!this.f404992c.compareAndSet(false, true)) {
            C47998a.b(th2);
            return;
        }
        this.f404994e = th2;
        for (a<T> aVar : this.f404991b.getAndSet(f404990g)) {
            aVar.f404995b.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onSuccess(T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onSuccess called with a null value.");
        if (this.f404992c.compareAndSet(false, true)) {
            this.f404993d = t12;
            for (a<T> aVar : this.f404991b.getAndSet(f404990g)) {
                aVar.f404995b.onSuccess(t12);
            }
        }
    }

    public final void s(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f404991b;
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
                aVarArr = f404989f;
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
}
