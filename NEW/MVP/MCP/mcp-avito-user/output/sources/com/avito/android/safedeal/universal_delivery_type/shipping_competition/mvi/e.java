package com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeShippingCompetitionBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.domain.b f256843a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f256844b;

    /* renamed from: c, reason: collision with root package name */
    public final u f256845c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.safedeal.universal_delivery_type.beduin.a> f256846d;

    public e(com.avito.android.safedeal.universal_delivery_type.shipping_competition.domain.b bVar, Provider provider, u uVar, Provider provider2) {
        this.f256843a = bVar;
        this.f256844b = provider;
        this.f256845c = uVar;
        this.f256846d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.safedeal.universal_delivery_type.shipping_competition.domain.a) this.f256843a.get(), this.f256844b.get(), (com.avito.android.safedeal.universal_delivery_type.shipping_competition.a) this.f256845c.get(), this.f256846d.get());
    }
}
