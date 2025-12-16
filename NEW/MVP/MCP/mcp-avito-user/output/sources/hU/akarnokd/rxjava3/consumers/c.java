package hu.akarnokd.rxjava3.consumers;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: DisposableAutoReleaseMultiObserver.java */
/* loaded from: classes8.dex */
final class c<T> extends a implements L<T>, t<T>, InterfaceC41771d {
    private static final long serialVersionUID = 8924480688481408726L;

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(T t12) {
        io.reactivex.rxjava3.disposables.d dVar = get();
        DisposableHelper disposableHelper = DisposableHelper.f401986b;
        if (dVar == disposableHelper) {
            throw null;
        }
        lazySet(disposableHelper);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
            throw null;
        }
    }
}
