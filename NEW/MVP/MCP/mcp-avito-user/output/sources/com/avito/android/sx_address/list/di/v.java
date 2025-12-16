package com.avito.android.sx_address.list.di;

/* compiled from: SxAddressListPromoAdapterModule_ProvideAdapterPresenter$_avito_sx_address_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class v implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f293116a;

    public v(dagger.internal.u uVar) {
        this.f293116a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f293116a.get();
        u uVar = u.f293115a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
