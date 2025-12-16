package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.G;
import j41.InterfaceC42196c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: PublishSubject.java */
/* loaded from: classes8.dex */
public final class e<T> extends i<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final a[] f404996d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    public static final a[] f404997e = new a[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f404998b = new AtomicReference<>(f404997e);

    /* renamed from: c, reason: collision with root package name */
    public Throwable f404999c;

    /* compiled from: PublishSubject.java */
    public static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: b, reason: collision with root package name */
        public final G<? super T> f405000b;

        /* renamed from: c, reason: collision with root package name */
        public final e<T> f405001c;

        public a(G<? super T> g12, e<T> eVar) {
            this.f405000b = g12;
            this.f405001c = eVar;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f405001c.O0(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return get();
        }
    }

    @InterfaceC42196c
    public final boolean N0() {
        return this.f404998b.get().length != 0;
    }

    public final void O0(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f404998b;
            a<T>[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == f404996d || aVarArr2 == (aVarArr = f404997e)) {
                return;
            }
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
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i12);
                System.arraycopy(aVarArr2, i12 + 1, aVarArr, i12, (length - i12) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (this.f404998b.get() == f404996d) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        AtomicReference<a<T>[]> atomicReference = this.f404998b;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f404996d;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (!aVar.get()) {
                aVar.f405000b.e();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        AtomicReference<a<T>[]> atomicReference = this.f404998b;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f404996d;
        if (aVarArr == aVarArr2) {
            C47998a.b(th2);
            return;
        }
        this.f404999c = th2;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get()) {
                C47998a.b(th2);
            } else {
                aVar.f405000b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onNext called with a null value.");
        for (a<T> aVar : this.f404998b.get()) {
            if (!aVar.get()) {
                aVar.f405000b.onNext(t12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        a<T> aVar = new a<>(g12, this);
        g12.b(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f404998b;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f404996d) {
                Throwable th2 = this.f404999c;
                if (th2 != null) {
                    g12.onError(th2);
                    return;
                } else {
                    g12.e();
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
            if (aVar.get()) {
                O0(aVar);
                return;
            }
            return;
        }
    }
}
