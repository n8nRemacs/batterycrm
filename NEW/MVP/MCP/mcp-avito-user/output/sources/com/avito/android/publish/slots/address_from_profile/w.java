package com.avito.android.publish.slots.address_from_profile;

import javax.inject.Provider;

/* compiled from: SelectAddressInListModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class w implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f242960a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f242961b;

    public w(Provider<com.avito.konveyor.adapter.a> provider, Provider<com.avito.konveyor.a> provider2) {
        this.f242960a = provider;
        this.f242961b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f242960a.get();
        com.avito.konveyor.a aVar2 = this.f242961b.get();
        q.f242954a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, com.avito.android.publish.slots.address_from_profile.publish_item.address_list_item.a.f242856a);
    }
}
