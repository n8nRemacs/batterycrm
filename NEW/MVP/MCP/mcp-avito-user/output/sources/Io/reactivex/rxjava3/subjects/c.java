package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: CompletableSubject.java */
/* loaded from: classes8.dex */
public final class c extends AbstractC41768a implements InterfaceC41771d {

    /* renamed from: e, reason: collision with root package name */
    public static final a[] f404983e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    public static final a[] f404984f = new a[0];

    /* renamed from: d, reason: collision with root package name */
    public Throwable f404987d;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f404986c = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<a[]> f404985b = new AtomicReference<>(f404983e);

    /* compiled from: CompletableSubject.java */
    public static final class a extends AtomicReference<c> implements io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -7650903191002190468L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f404988b;

        public a(InterfaceC41771d interfaceC41771d, c cVar) {
            this.f404988b = interfaceC41771d;
            lazySet(cVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            c andSet = getAndSet(null);
            if (andSet != null) {
                andSet.C(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == null;
        }
    }

    public final void C(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference<a[]> atomicReference = this.f404985b;
            a[] aVarArr2 = atomicReference.get();
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
                aVarArr = f404983e;
            } else {
                a[] aVarArr3 = new a[length - 1];
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

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (this.f404985b.get() == f404984f) {
            dVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void e() {
        if (this.f404986c.compareAndSet(false, true)) {
            for (a aVar : this.f404985b.getAndSet(f404984f)) {
                aVar.f404988b.e();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        if (!this.f404986c.compareAndSet(false, true)) {
            C47998a.b(th2);
            return;
        }
        this.f404987d = th2;
        for (a aVar : this.f404985b.getAndSet(f404984f)) {
            aVar.f404988b.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        a aVar = new a(interfaceC41771d, this);
        interfaceC41771d.b(aVar);
        while (true) {
            AtomicReference<a[]> atomicReference = this.f404985b;
            a[] aVarArr = atomicReference.get();
            if (aVarArr == f404984f) {
                Throwable th2 = this.f404987d;
                if (th2 != null) {
                    interfaceC41771d.onError(th2);
                    return;
                } else {
                    interfaceC41771d.e();
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.getF318621e()) {
                C(aVar);
                return;
            }
            return;
        }
    }
}
