package com.jakewharton.rxrelay3;

import io.reactivex.rxjava3.core.G;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PublishRelay.java */
/* loaded from: classes7.dex */
public final class c<T> extends d<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final a[] f364279c = new a[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f364280b = new AtomicReference<>(f364279c);

    /* compiled from: PublishRelay.java */
    public static final class a<T> extends AtomicBoolean implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: b, reason: collision with root package name */
        public final G<? super T> f364281b;

        /* renamed from: c, reason: collision with root package name */
        public final c<T> f364282c;

        public a(G<? super T> g12, c<T> cVar) {
            this.f364281b = g12;
            this.f364282c = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f364282c.N0(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return get();
        }
    }

    public final void N0(a<T> aVar) {
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f364280b;
            a<T>[] aVarArr = atomicReference.get();
            a<T>[] aVarArr2 = f364279c;
            if (aVarArr == aVarArr2) {
                return;
            }
            int length = aVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                } else if (aVarArr[i12] == aVar) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 < 0) {
                return;
            }
            if (length != 1) {
                aVarArr2 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, i12);
                System.arraycopy(aVarArr, i12 + 1, aVarArr2, i12, (length - i12) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            return;
        }
    }

    @Override // l41.g
    public final void accept(T t12) {
        if (t12 == null) {
            throw new NullPointerException("value == null");
        }
        for (a<T> aVar : this.f364280b.get()) {
            if (!aVar.get()) {
                aVar.f364281b.onNext(t12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        a<T> aVar = new a<>(g12, this);
        g12.b(aVar);
        loop0: while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f364280b;
            a<T>[] aVarArr = atomicReference.get();
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
        }
        if (aVar.get()) {
            N0(aVar);
        }
    }
}
