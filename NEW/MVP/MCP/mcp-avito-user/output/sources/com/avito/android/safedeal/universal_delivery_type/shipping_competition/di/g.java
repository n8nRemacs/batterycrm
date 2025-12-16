package com.avito.android.safedeal.universal_delivery_type.shipping_competition.di;

import Zi.InterfaceC19564a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeShippingCompetitionModule_ProvideBeduinDeliveryMethodSelectTabActionHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.android.safedeal.universal_delivery_type.beduin.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19564a> f256800a;

    public g(Provider<InterfaceC19564a> provider) {
        this.f256800a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC19564a interfaceC19564a = this.f256800a.get();
        d.f256794a.getClass();
        return new com.avito.android.safedeal.universal_delivery_type.beduin.a(interfaceC19564a);
    }
}
