package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* compiled from: ObservableFirstStageObserver.java */
/* loaded from: classes8.dex */
public final class s<T> extends z<T> {
    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        if (isDone()) {
            return;
        }
        this.f402093c = null;
        this.f402092b.lazySet(DisposableHelper.f401986b);
        completeExceptionally(new NoSuchElementException());
    }
}
