package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ForEachWhileObserver.java */
/* loaded from: classes8.dex */
public final class t<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = -4403180040475402120L;

    @Override // io.reactivex.rxjava3.core.G
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(this, dVar);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return DisposableHelper.b(get());
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        C47998a.b(th2);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
    }
}
