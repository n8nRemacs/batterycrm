package io.reactivex.rxjava3.internal.subscribers;

import s41.C47998a;

/* compiled from: BlockingFirstSubscriber.java */
/* loaded from: classes8.dex */
public final class d<T> extends c<T> {
    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        if (this.f404779b != null) {
            C47998a.b(th2);
        }
        countDown();
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        if (this.f404779b == null) {
            this.f404779b = t12;
            this.f404780c.cancel();
            countDown();
        }
    }
}
