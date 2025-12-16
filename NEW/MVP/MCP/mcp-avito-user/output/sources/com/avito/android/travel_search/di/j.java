package com.avito.android.travel_search.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelSearchItemsModule_ProvideAdapterPresenter$_avito_travel_search_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f303069a;

    public j(dagger.internal.u uVar) {
        this.f303069a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f303069a.get();
        i.f303068a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
