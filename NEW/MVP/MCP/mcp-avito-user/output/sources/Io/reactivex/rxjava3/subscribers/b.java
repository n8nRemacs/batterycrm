package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.g;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: DisposableSubscriber.java */
/* loaded from: classes8.dex */
public abstract class b<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<org.reactivestreams.e> f405038b = new AtomicReference<>();

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (g.c(this.f405038b, eVar, getClass())) {
            a();
        }
    }

    public void a() {
        this.f405038b.get().request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        SubscriptionHelper.a(this.f405038b);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f405038b.get() == SubscriptionHelper.f404813b;
    }
}
