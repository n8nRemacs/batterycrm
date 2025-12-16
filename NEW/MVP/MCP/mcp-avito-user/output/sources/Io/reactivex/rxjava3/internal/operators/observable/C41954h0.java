package io.reactivex.rxjava3.internal.operators.observable;

/* compiled from: ObservableFromFuture.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41954h0<T> extends io.reactivex.rxjava3.core.z<T> {
    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        io.reactivex.rxjava3.internal.observers.n nVar = new io.reactivex.rxjava3.internal.observers.n(g12);
        g12.b(nVar);
        if (nVar.getF318621e()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (nVar.getF318621e()) {
                return;
            }
            g12.onError(th2);
        }
    }
}
