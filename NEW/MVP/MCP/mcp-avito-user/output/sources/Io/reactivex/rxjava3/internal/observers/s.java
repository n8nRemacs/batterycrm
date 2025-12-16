package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: EmptyCompletableObserver.java */
/* loaded from: classes8.dex */
public final class s extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(this, dVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void e() {
        lazySet(DisposableHelper.f401986b);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return get() == DisposableHelper.f401986b;
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41771d
    public final void onError(Throwable th2) {
        lazySet(DisposableHelper.f401986b);
        C47998a.b(new OnErrorNotImplementedException(th2));
    }
}
