package io.reactivex.rxjava3.internal.operators.single;

import s41.C47998a;

/* compiled from: SingleFromSupplier.java */
/* loaded from: classes8.dex */
public final class I<T> extends io.reactivex.rxjava3.core.I<T> {
    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        io.reactivex.rxjava3.disposables.d dVarE = io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        l12.b(dVarE);
        if (dVarE.getF318621e()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (dVarE.getF318621e()) {
                C47998a.b(th2);
            } else {
                l12.onError(th2);
            }
        }
    }
}
