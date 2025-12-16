package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingBaseSubscriber.java */
/* loaded from: classes8.dex */
public abstract class c<T> extends CountDownLatch implements InterfaceC41782o<T> {

    /* renamed from: b, reason: collision with root package name */
    public T f404779b;

    /* renamed from: c, reason: collision with root package name */
    public org.reactivestreams.e f404780c;

    public c() {
        super(1);
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.i(this.f404780c, eVar)) {
            this.f404780c = eVar;
            eVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        countDown();
    }
}
