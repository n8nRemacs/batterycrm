package hu.akarnokd.rxjava3.expr;

import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: SingleSwitchCase.java */
/* loaded from: classes8.dex */
final class l<T, K> extends I<T> {
    @Override // io.reactivex.rxjava3.core.I
    public final void y(L<? super T> l12) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.e(th2, l12);
        }
    }
}
