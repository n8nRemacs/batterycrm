package hu.akarnokd.rxjava3.consumers;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: DisposableAutoReleaseObserver.java */
/* loaded from: classes8.dex */
final class d<T> extends a implements G<T> {
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
