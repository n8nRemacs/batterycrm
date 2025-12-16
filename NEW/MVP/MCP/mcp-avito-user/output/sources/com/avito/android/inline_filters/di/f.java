package com.avito.android.inline_filters.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FiltersCalendarPickerModule_ProvideAdapterPresenter$_avito_inline_filters_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final LN.c f171114a;

    /* renamed from: b, reason: collision with root package name */
    public final u f171115b;

    public f(LN.c cVar, u uVar) {
        this.f171114a = cVar;
        this.f171115b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        LN.b bVar = (LN.b) this.f171114a.get();
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f171115b.get();
        e eVar = e.f171113a;
        return new com.avito.konveyor.adapter.h(bVar, aVar, null, 4, null);
    }
}
