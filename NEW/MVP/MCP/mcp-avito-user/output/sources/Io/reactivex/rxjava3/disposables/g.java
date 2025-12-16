package io.reactivex.rxjava3.disposables;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReferenceDisposable.java */
/* loaded from: classes8.dex */
abstract class g<T> extends AtomicReference<T> implements d {
    private static final long serialVersionUID = 6537757548749041217L;

    public abstract void a(@j41.e T t12);

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return get() == null;
    }
}
