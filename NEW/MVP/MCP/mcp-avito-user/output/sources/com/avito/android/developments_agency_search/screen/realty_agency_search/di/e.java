package com.avito.android.developments_agency_search.screen.realty_agency_search.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentTooltipBottomSheetModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f138621a;

    public e(dagger.internal.u uVar) {
        this.f138621a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f138621a.get();
        c cVar = c.f138618a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
