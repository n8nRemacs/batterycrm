package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import m41.C43881c;

/* compiled from: ResourceSubscriber.java */
/* loaded from: classes8.dex */
public abstract class c<T> implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<org.reactivestreams.e> f405039b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    public final C43881c f405040c = new C43881c();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f405041d = new AtomicLong();

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        AtomicReference<org.reactivestreams.e> atomicReference = this.f405039b;
        if (g.c(atomicReference, eVar, getClass())) {
            AtomicLong atomicLong = this.f405041d;
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                eVar.request(andSet);
            }
            SubscriptionHelper.b(atomicReference, atomicLong, Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (SubscriptionHelper.a(this.f405039b)) {
            this.f405040c.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f405039b.get() == SubscriptionHelper.f404813b;
    }
}
