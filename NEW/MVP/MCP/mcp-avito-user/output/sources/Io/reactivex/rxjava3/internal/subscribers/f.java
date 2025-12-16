package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BlockingSubscriber.java */
/* loaded from: classes8.dex */
public final class f<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T>, org.reactivestreams.e {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f404781b = null;
    private static final long serialVersionUID = -4875965440900746268L;

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (SubscriptionHelper.f(this, eVar)) {
            throw null;
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        if (SubscriptionHelper.a(this)) {
            throw null;
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        throw null;
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
        get().request(j12);
    }
}
