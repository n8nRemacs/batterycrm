package com.avito.android.sx_address.selectaddresslist.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectAddressListModule_ProvideAdapterPresenter$_avito_sx_address_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f294055a;

    public e(u uVar) {
        this.f294055a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f294055a.get();
        d dVar = d.f294054a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
