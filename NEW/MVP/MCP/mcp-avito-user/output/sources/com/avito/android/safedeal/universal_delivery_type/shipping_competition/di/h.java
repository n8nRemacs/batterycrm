package com.avito.android.safedeal.universal_delivery_type.shipping_competition.di;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeShippingCompetitionModule_ProvideComponentsFormsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<com.avito.android.safedeal.universal_delivery_type.shipping_competition.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f256801a;

    public h(Provider<InterfaceC40691b> provider) {
        this.f256801a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = this.f256801a.get();
        d.f256794a.getClass();
        return new com.avito.android.safedeal.universal_delivery_type.shipping_competition.a(interfaceC40691b.j());
    }
}
