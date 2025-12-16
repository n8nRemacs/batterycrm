package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* compiled from: FlowableLastStageSubscriber.java */
/* loaded from: classes8.dex */
public final class i<T> extends l<T> {
    @Override // io.reactivex.rxjava3.internal.jdk8.l
    public final void a(org.reactivestreams.e eVar) {
        eVar.request(Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.d
    public final void e() {
        if (isDone()) {
            return;
        }
        T t12 = this.f402055c;
        this.f402055c = null;
        this.f402054b.lazySet(SubscriptionHelper.f404813b);
        if (t12 != null) {
            complete(t12);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.l, org.reactivestreams.d
    public final void onNext(T t12) {
        this.f402055c = t12;
    }
}
