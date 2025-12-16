package com.avito.android.publish.items.location_addresses;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationAddressesModule_ProvideAddressListItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f237026a;

    public n(Provider<e> provider) {
        this.f237026a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f237026a.get();
        m.f237025a.getClass();
        return new c(eVar);
    }
}
