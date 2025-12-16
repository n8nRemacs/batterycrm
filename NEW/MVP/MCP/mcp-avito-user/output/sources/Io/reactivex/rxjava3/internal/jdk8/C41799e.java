package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* compiled from: FlowableFirstStageSubscriber.java */
/* renamed from: io.reactivex.rxjava3.internal.jdk8.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41799e<T> extends l<T> {
    @Override // io.reactivex.rxjava3.internal.jdk8.l
    public final void a(org.reactivestreams.e eVar) {
        eVar.request(1L);
    }

    @Override // org.reactivestreams.d
    public final void e() {
        if (isDone()) {
            return;
        }
        this.f402055c = null;
        this.f402054b.lazySet(SubscriptionHelper.f404813b);
        completeExceptionally(new NoSuchElementException());
    }
}
