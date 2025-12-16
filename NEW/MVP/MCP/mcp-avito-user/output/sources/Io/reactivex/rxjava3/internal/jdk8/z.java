package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ObservableStageObserver.java */
/* loaded from: classes8.dex */
abstract class z<T> extends CompletableFuture<T> implements io.reactivex.rxjava3.core.G<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f402092b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    public T f402093c;

    @Override // io.reactivex.rxjava3.core.G
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(this.f402092b, dVar);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        DisposableHelper.a(this.f402092b);
        return super.cancel(z12);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T t12) {
        DisposableHelper.a(this.f402092b);
        return super.complete(t12);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th2) {
        DisposableHelper.a(this.f402092b);
        return super.completeExceptionally(th2);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        this.f402093c = null;
        this.f402092b.lazySet(DisposableHelper.f401986b);
        if (completeExceptionally(th2)) {
            return;
        }
        C47998a.b(th2);
    }

    public void onNext(T t12) {
        complete(t12);
    }
}
