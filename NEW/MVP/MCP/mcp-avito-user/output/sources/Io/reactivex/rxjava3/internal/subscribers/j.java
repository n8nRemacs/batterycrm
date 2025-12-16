package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ForEachWhileSubscriber.java */
/* loaded from: classes8.dex */
public final class j<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = -4403180040475402120L;

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        SubscriptionHelper.e(this, eVar, Long.MAX_VALUE);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        SubscriptionHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return get() == SubscriptionHelper.f404813b;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        C47998a.b(th2);
    }

    @Override // org.reactivestreams.d
    public final void e() {
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
    }
}
