package com.avito.android.publish.details.di;

import javax.inject.Provider;

/* compiled from: PublishDetailsListModule_ProvideDeliveryAddressesSlotBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class O implements dagger.internal.h<com.avito.android.publish.slots.delivery_addresses.item.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.delivery_addresses.item.d> f233648a;

    public O(Provider<com.avito.android.publish.slots.delivery_addresses.item.d> provider) {
        this.f233648a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.slots.delivery_addresses.item.d dVar = this.f233648a.get();
        B.f233608a.getClass();
        return new com.avito.android.publish.slots.delivery_addresses.item.a(dVar);
    }
}
