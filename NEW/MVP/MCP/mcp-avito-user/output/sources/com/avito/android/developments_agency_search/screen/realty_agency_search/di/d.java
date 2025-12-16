package com.avito.android.developments_agency_search.screen.realty_agency_search.di;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DevelopmentTooltipBottomSheetModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f138619a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f138620b;

    public d(dagger.internal.u uVar, Provider provider) {
        this.f138619a = uVar;
        this.f138620b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f138619a.get();
        com.avito.konveyor.a aVar2 = this.f138620b.get();
        c.f138618a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
