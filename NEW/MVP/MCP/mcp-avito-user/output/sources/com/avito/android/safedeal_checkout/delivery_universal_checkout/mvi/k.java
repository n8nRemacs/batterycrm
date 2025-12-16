package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import co0.InterfaceC27233b;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.DeliveryUniversalCheckoutData;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: DeliveryUniversalCheckoutBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f257165a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.b f257166b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f257167c;

    /* renamed from: d, reason: collision with root package name */
    public final u f257168d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f257169e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC27233b> f257170f;

    public k(dagger.internal.l lVar, com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.b bVar, Provider provider, u uVar, Provider provider2, Provider provider3) {
        this.f257165a = lVar;
        this.f257166b = bVar;
        this.f257167c = provider;
        this.f257168d = uVar;
        this.f257169e = provider2;
        this.f257170f = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((DeliveryUniversalCheckoutData) this.f257165a.f393949a, (com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.a) this.f257166b.get(), this.f257167c.get(), (com.avito.android.safedeal_checkout.delivery_universal_checkout.a) this.f257168d.get(), this.f257169e.get(), this.f257170f.get());
    }
}
