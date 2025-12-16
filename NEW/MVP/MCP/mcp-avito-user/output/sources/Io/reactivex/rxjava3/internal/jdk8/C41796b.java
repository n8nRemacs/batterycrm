package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;

/* compiled from: CompletionStageConsumer.java */
/* renamed from: io.reactivex.rxjava3.internal.jdk8.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41796b<T> extends CompletableFuture<T> implements io.reactivex.rxjava3.core.t<T>, L<T>, InterfaceC41771d {
    @Override // io.reactivex.rxjava3.core.t
    public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
        DisposableHelper.e(null, dVar);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        DisposableHelper.a(null);
        throw null;
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T t12) {
        DisposableHelper.a(null);
        throw null;
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th2) {
        DisposableHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void e() {
        new NoSuchElementException("The source was empty");
        DisposableHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.t
    public final void onSuccess(@j41.e T t12) {
        throw null;
    }
}
