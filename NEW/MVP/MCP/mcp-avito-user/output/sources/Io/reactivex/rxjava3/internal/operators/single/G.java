package io.reactivex.rxjava3.internal.operators.single;

import java.util.Objects;
import java.util.concurrent.Callable;
import s41.C47998a;

/* compiled from: SingleFromCallable.java */
/* loaded from: classes8.dex */
public final class G<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Callable<? extends T> f404503b;

    public G(Callable<? extends T> callable) {
        this.f404503b = callable;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        io.reactivex.rxjava3.disposables.d dVarE = io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        l12.b(dVarE);
        if (dVarE.i()) {
            return;
        }
        try {
            T tCall = this.f404503b.call();
            Objects.requireNonNull(tCall, "The callable returned a null value");
            if (dVarE.i()) {
                return;
            }
            l12.onSuccess(tCall);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (dVarE.i()) {
                C47998a.b(th2);
            } else {
                l12.onError(th2);
            }
        }
    }
}
