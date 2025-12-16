package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n41.InterfaceC44191h;
import p41.AbstractC46894a;
import s41.C47998a;

/* compiled from: ObservablePublish.java */
/* loaded from: classes8.dex */
public final class M0<T> extends AbstractC46894a<T> implements InterfaceC44191h<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.E<T> f403719b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<b<T>> f403720c = new AtomicReference<>();

    /* compiled from: ObservablePublish.java */
    public static final class a<T> extends AtomicReference<b<T>> implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 7463222674719692880L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403721b;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, b<T> bVar) {
            this.f403721b = g12;
            lazySet(bVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == null;
        }
    }

    /* compiled from: ObservablePublish.java */
    public static final class b<T> extends AtomicReference<a<T>[]> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: f, reason: collision with root package name */
        public static final a[] f403722f = new a[0];

        /* renamed from: g, reason: collision with root package name */
        public static final a[] f403723g = new a[0];
        private static final long serialVersionUID = -3251430252873581268L;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<b<T>> f403725c;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f403727e;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f403724b = new AtomicBoolean();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f403726d = new AtomicReference<>();

        public b(AtomicReference<b<T>> atomicReference) {
            this.f403725c = atomicReference;
            lazySet(f403722f);
        }

        public final void a(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
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
                aVarArr2 = f403722f;
                if (length != 1) {
                    aVarArr2 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, i12);
                    System.arraycopy(aVarArr, i12 + 1, aVarArr2, i12, (length - i12) - 1);
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f403726d, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            AtomicReference<b<T>> atomicReference;
            getAndSet(f403723g);
            do {
                atomicReference = this.f403725c;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            DisposableHelper.a(this.f403726d);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403726d.lazySet(DisposableHelper.f401986b);
            for (a<T> aVar : getAndSet(f403723g)) {
                aVar.f403721b.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == f403723g;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            AtomicReference<io.reactivex.rxjava3.disposables.d> atomicReference = this.f403726d;
            io.reactivex.rxjava3.disposables.d dVar = atomicReference.get();
            DisposableHelper disposableHelper = DisposableHelper.f401986b;
            if (dVar == disposableHelper) {
                C47998a.b(th2);
                return;
            }
            this.f403727e = th2;
            atomicReference.lazySet(disposableHelper);
            for (a<T> aVar : getAndSet(f403723g)) {
                aVar.f403721b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            for (a<T> aVar : get()) {
                aVar.f403721b.onNext(t12);
            }
        }
    }

    public M0(io.reactivex.rxjava3.core.E<T> e12) {
        this.f403719b = e12;
    }

    @Override // p41.AbstractC46894a
    public final void O0(l41.g<? super io.reactivex.rxjava3.disposables.d> gVar) {
        b<T> bVar;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.f403720c;
            bVar = atomicReference.get();
            if (bVar != null && !bVar.getF318621e()) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference);
            while (!atomicReference.compareAndSet(bVar, bVar2)) {
                if (atomicReference.get() != bVar) {
                    break;
                }
            }
            bVar = bVar2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = bVar.f403724b;
        boolean z12 = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z12 = true;
        }
        try {
            gVar.accept(bVar);
            if (z12) {
                this.f403719b.c(bVar);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            throw io.reactivex.rxjava3.internal.util.h.f(th2);
        }
    }

    @Override // p41.AbstractC46894a
    public final void P0() {
        AtomicReference<b<T>> atomicReference = this.f403720c;
        b<T> bVar = atomicReference.get();
        if (bVar == null || !bVar.getF318621e()) {
            return;
        }
        while (!atomicReference.compareAndSet(bVar, null) && atomicReference.get() == bVar) {
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        b<T> bVar;
        a<T>[] aVarArr;
        a[] aVarArr2;
        loop0: while (true) {
            AtomicReference<b<T>> atomicReference = this.f403720c;
            bVar = atomicReference.get();
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(atomicReference);
            while (!atomicReference.compareAndSet(bVar, bVar2)) {
                if (atomicReference.get() != bVar) {
                    break;
                }
            }
            bVar = bVar2;
            break loop0;
        }
        a<T> aVar = new a<>(g12, bVar);
        g12.b(aVar);
        do {
            aVarArr = bVar.get();
            if (aVarArr == b.f403723g) {
                Throwable th2 = bVar.f403727e;
                if (th2 != null) {
                    g12.onError(th2);
                    return;
                } else {
                    g12.e();
                    return;
                }
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!bVar.compareAndSet(aVarArr, aVarArr2));
        if (aVar.getF318621e()) {
            bVar.a(aVar);
        }
    }
}
