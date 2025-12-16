package io.reactivex.rxjava3.internal.operators.maybe;

import s41.C47998a;

/* compiled from: MaybeFromAction.java */
/* loaded from: classes8.dex */
public final class J<T> extends io.reactivex.rxjava3.core.q<T> implements l41.s<T> {
    @Override // l41.s
    public final T get() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        io.reactivex.rxjava3.disposables.d dVarE = io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        tVar.b(dVarE);
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
                tVar.onError(th2);
            }
        }
    }
}
