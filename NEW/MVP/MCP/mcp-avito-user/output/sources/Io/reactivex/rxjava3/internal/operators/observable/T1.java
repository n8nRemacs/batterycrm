package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObserverResourceWrapper.java */
/* loaded from: classes8.dex */
public final class T1<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = -8612022020200669122L;

    public T1() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        if (DisposableHelper.e(null, dVar)) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        DisposableHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        DisposableHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        throw null;
    }
}
