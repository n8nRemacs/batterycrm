package hu.akarnokd.rxjava3.expr;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: ObservableSwitchCase.java */
/* loaded from: classes8.dex */
final class i<T, K> extends z<T> {
    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
