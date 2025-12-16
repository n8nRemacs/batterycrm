package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: BiConsumerSingleObserver.java */
/* renamed from: io.reactivex.rxjava3.internal.observers.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41807e<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements L<T>, io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = 4943102778943297569L;

    @Override // io.reactivex.rxjava3.core.L
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
        return get() == DisposableHelper.f401986b;
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onError(Throwable th2) {
        try {
            lazySet(DisposableHelper.f401986b);
            throw null;
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            C47998a.b(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(T t12) {
        try {
            lazySet(DisposableHelper.f401986b);
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
        }
    }
}
