package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* compiled from: ObservableLastStageObserver.java */
/* loaded from: classes8.dex */
public final class w<T> extends z<T> {
    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        if (isDone()) {
            return;
        }
        T t12 = this.f402093c;
        this.f402093c = null;
        this.f402092b.lazySet(DisposableHelper.f401986b);
        if (t12 != null) {
            complete(t12);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.z, io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        this.f402093c = t12;
    }
}
