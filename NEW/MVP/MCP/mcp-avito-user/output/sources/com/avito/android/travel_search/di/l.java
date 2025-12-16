package com.avito.android.travel_search.di;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelSearchItemsModule_ProvideDestroyableViewHolderBuilder$_avito_travel_search_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f303071a;

    public l(Provider<com.avito.konveyor.a> provider) {
        this.f303071a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f303071a.get();
        i.f303068a.getClass();
        return new C14699c(aVar);
    }
}
