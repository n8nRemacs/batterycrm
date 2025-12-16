package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: FlowableStageSubscriber.java */
/* loaded from: classes8.dex */
abstract class l<T> extends CompletableFuture<T> implements InterfaceC41782o<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<org.reactivestreams.e> f402054b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    public T f402055c;

    @Override // org.reactivestreams.d
    public final void K(@j41.e org.reactivestreams.e eVar) {
        if (SubscriptionHelper.f(this.f402054b, eVar)) {
            a(eVar);
        }
    }

    public abstract void a(org.reactivestreams.e eVar);

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z12) {
        SubscriptionHelper.a(this.f402054b);
        return super.cancel(z12);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T t12) {
        SubscriptionHelper.a(this.f402054b);
        return super.complete(t12);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th2) {
        SubscriptionHelper.a(this.f402054b);
        return super.completeExceptionally(th2);
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        this.f402055c = null;
        this.f402054b.lazySet(SubscriptionHelper.f404813b);
        if (completeExceptionally(th2)) {
            return;
        }
        C47998a.b(th2);
    }

    public void onNext(T t12) {
        complete(t12);
    }
}
