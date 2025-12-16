package com.avito.android.travel_search.di;

import Oi0.InterfaceC14698b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelSearchItemsModule_ProvideListRecyclerAdapter$_avito_travel_search_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f303073a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f303074b;

    public n(dagger.internal.u uVar, Provider provider) {
        this.f303073a = provider;
        this.f303074b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f303073a.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f303074b.get();
        i.f303068a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, interfaceC14698b, null, 4, null);
    }
}
