package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SubscriberResourceWrapper.java */
/* loaded from: classes8.dex */
public final class w<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d, org.reactivestreams.e {
    private static final long serialVersionUID = -8612022020200669122L;

    public w() {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.f(null, eVar)) {
            throw null;
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        SubscriptionHelper.a(null);
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        SubscriptionHelper.a(null);
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void e() {
        DisposableHelper.a(this);
        throw null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        DisposableHelper.a(this);
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        throw null;
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        if (SubscriptionHelper.h(j12)) {
            throw null;
        }
    }
}
