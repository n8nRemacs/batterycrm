package com.avito.android.extended_profile_serp.di;

/* compiled from: ExtendedProfileSerpModule_ProvideAdapterPresenter$_avito_extended_profile_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f152858a;

    public m(dagger.internal.u uVar) {
        this.f152858a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f152858a.get();
        C30538h c30538h = C30538h.f152853a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
