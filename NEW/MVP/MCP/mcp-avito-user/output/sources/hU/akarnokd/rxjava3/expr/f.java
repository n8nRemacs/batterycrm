package hu.akarnokd.rxjava3.expr;

import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: MaybeIfThen.java */
/* loaded from: classes8.dex */
final class f<T> extends io.reactivex.rxjava3.core.q<T> {
    @Override // io.reactivex.rxjava3.core.q
    public final void o(t<? super T> tVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.c(th2, tVar);
        }
    }
}
