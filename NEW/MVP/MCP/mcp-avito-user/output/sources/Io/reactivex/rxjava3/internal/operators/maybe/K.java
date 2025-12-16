package io.reactivex.rxjava3.internal.operators.maybe;

import java.util.concurrent.Callable;
import s41.C47998a;

/* compiled from: MaybeFromCallable.java */
/* loaded from: classes8.dex */
public final class K<T> extends io.reactivex.rxjava3.core.q<T> implements l41.s<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Callable<? extends T> f403164b;

    public K(Callable<? extends T> callable) {
        this.f403164b = callable;
    }

    @Override // l41.s
    public final T get() {
        return this.f403164b.call();
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        io.reactivex.rxjava3.disposables.d dVarE = io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        tVar.b(dVarE);
        if (dVarE.i()) {
            return;
        }
        try {
            T tCall = this.f403164b.call();
            if (dVarE.i()) {
                return;
            }
            if (tCall == null) {
                tVar.e();
            } else {
                tVar.onSuccess(tCall);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (dVarE.i()) {
                C47998a.b(th2);
            } else {
                tVar.onError(th2);
            }
        }
    }
}
