package com.avito.android.extended_profile_adverts.di;

/* compiled from: ProfileAdvertsAdapterModule_ProvideAdapterPresenter$_avito_extended_profile_adverts_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30493b f150795a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f150796b;

    public d(C30493b c30493b, dagger.internal.u uVar) {
        this.f150795a = c30493b;
        this.f150796b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f150796b.get();
        this.f150795a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
