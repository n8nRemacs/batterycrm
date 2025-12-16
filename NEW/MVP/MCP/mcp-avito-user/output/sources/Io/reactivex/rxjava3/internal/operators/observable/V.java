package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: ObservableError.java */
/* loaded from: classes8.dex */
public final class V<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final l41.s<? extends Throwable> f403872b;

    public V(l41.s<? extends Throwable> sVar) {
        this.f403872b = sVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        Throwable th2;
        try {
            th2 = this.f403872b.get();
        } catch (Throwable th3) {
            th = th3;
            io.reactivex.rxjava3.exceptions.a.a(th);
        }
        if (th2 == null) {
            throw io.reactivex.rxjava3.internal.util.h.b("Supplier returned a null Throwable.");
        }
        Throwable th4 = io.reactivex.rxjava3.internal.util.h.f404834a;
        th = th2;
        EmptyDisposable.d(th, g12);
    }
}
