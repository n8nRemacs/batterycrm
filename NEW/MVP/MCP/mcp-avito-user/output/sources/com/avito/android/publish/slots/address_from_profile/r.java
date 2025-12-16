package com.avito.android.publish.slots.address_from_profile;

/* compiled from: SelectAddressInListModule_ProvideAdapterPresenter$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f242955a;

    public r(dagger.internal.u uVar) {
        this.f242955a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f242955a.get();
        q qVar = q.f242954a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
