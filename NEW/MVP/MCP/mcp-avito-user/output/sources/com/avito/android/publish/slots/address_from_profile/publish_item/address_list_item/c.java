package com.avito.android.publish.slots.address_from_profile.publish_item.address_list_item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddressesFromProfileModule_ProvideAddressListItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<com.avito.android.publish.slots.address_from_profile.publish_item.l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f242858a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.d> f242859b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.publish.slots.address_from_profile.publish_item.c> f242860c;

    public c(Provider<com.avito.konveyor.adapter.a> provider, Provider<com.avito.konveyor.adapter.d> provider2, Provider<com.avito.android.publish.slots.address_from_profile.publish_item.c> provider3) {
        this.f242858a = provider;
        this.f242859b = provider2;
        this.f242860c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f242858a.get();
        com.avito.konveyor.adapter.d dVar = this.f242859b.get();
        com.avito.android.publish.slots.address_from_profile.publish_item.c cVar = this.f242860c.get();
        b.f242857a.getClass();
        return new com.avito.android.publish.slots.address_from_profile.publish_item.l(cVar, aVar, dVar);
    }
}
