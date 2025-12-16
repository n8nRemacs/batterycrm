package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: DisposableAutoReleaseObserver.java */
/* loaded from: classes8.dex */
public final class q<T> extends AbstractC41803a implements io.reactivex.rxjava3.core.G<T> {
    private static final long serialVersionUID = 8924480688481408726L;

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        if (get() == DisposableHelper.f401986b) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            get().dispose();
            onError(th2);
            throw null;
        }
    }
}
