package io.reactivex.rxjava3.internal.operators.observable;

import s41.C47998a;

/* compiled from: ObservableFromSupplier.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41966l0<T> extends io.reactivex.rxjava3.core.z<T> implements l41.s<T> {

    /* renamed from: b, reason: collision with root package name */
    public final l41.s<? extends T> f404121b;

    public C41966l0(l41.s<? extends T> sVar) {
        this.f404121b = sVar;
    }

    @Override // l41.s
    public final T get() {
        T t12 = this.f404121b.get();
        if (t12 == null) {
            throw io.reactivex.rxjava3.internal.util.h.b("The supplier returned a null value.");
        }
        Throwable th2 = io.reactivex.rxjava3.internal.util.h.f404834a;
        return t12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        io.reactivex.rxjava3.internal.observers.n nVar = new io.reactivex.rxjava3.internal.observers.n(g12);
        g12.b(nVar);
        if (nVar.getF318621e()) {
            return;
        }
        try {
            T t12 = this.f404121b.get();
            if (t12 == null) {
                throw io.reactivex.rxjava3.internal.util.h.b("Supplier returned a null value.");
            }
            Throwable th2 = io.reactivex.rxjava3.internal.util.h.f404834a;
            nVar.a(t12);
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            if (nVar.getF318621e()) {
                C47998a.b(th3);
            } else {
                g12.onError(th3);
            }
        }
    }
}
