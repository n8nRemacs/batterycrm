package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.ExecutionException;

/* compiled from: MaybeFromFuture.java */
/* loaded from: classes8.dex */
public final class M<T> extends io.reactivex.rxjava3.core.q<T> {
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
            th = th2;
            io.reactivex.rxjava3.exceptions.a.a(th);
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            io.reactivex.rxjava3.exceptions.a.a(th);
            if (dVarE.getF318621e()) {
                return;
            }
            tVar.onError(th);
        }
    }
}
