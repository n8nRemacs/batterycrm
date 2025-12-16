package m41;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequentialDisposable.java */
/* loaded from: classes8.dex */
public final class d extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = -754898800686245608L;

    public d() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return DisposableHelper.b(get());
    }

    public d(d dVar) {
        lazySet(dVar);
    }
}
