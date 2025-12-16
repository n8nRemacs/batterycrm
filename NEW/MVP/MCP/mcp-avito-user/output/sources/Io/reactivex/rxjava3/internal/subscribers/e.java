package io.reactivex.rxjava3.internal.subscribers;

/* compiled from: BlockingLastSubscriber.java */
/* loaded from: classes8.dex */
public final class e<T> extends c<T> {
    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        this.f404779b = null;
        countDown();
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        this.f404779b = t12;
    }
}
