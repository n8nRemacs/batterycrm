package com.avito.android.suggest_institutes_bottom_sheet.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestInstitutesModule_ProvideListRecyclerAdapter$_avito_job_suggest_institutes_bottom_sheet_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f292016a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f292017b;

    public k(u uVar, Provider provider) {
        this.f292016a = uVar;
        this.f292017b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f292016a.get();
        com.avito.konveyor.a aVar2 = this.f292017b.get();
        int i12 = e.f292008a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
