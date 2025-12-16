package io.reactivex.rxjava3.internal.observers;

/* compiled from: BlockingLastObserver.java */
/* loaded from: classes8.dex */
public final class i<T> extends AbstractC41808f<T> {
    @Override // io.reactivex.rxjava3.core.G
    public final void onError(Throwable th2) {
        this.f402102b = null;
        this.f402103c = th2;
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(T t12) {
        this.f402102b = t12;
    }
}
