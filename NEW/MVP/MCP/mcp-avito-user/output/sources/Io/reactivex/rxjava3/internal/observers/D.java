package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ResumeSingleObserver.java */
/* loaded from: classes8.dex */
public final class D<T> implements L<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f402095b;

    /* renamed from: c, reason: collision with root package name */
    public final L<? super T> f402096c;

    public D(L l12, AtomicReference atomicReference) {
        this.f402095b = atomicReference;
        this.f402096c = l12;
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void b(io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.c(this.f402095b, dVar);
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onError(Throwable th2) {
        this.f402096c.onError(th2);
    }

    @Override // io.reactivex.rxjava3.core.L
    public final void onSuccess(T t12) {
        this.f402096c.onSuccess(t12);
    }
}
