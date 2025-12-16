package com.avito.android.widget_filters.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WidgetFiltersItemsModule_ProvideListRecyclerAdapter$_avito_widget_filters_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f329832a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f329833b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.widget_filters.ui.items.h f329834c;

    public g(u uVar, Provider provider, com.avito.android.widget_filters.ui.items.h hVar) {
        this.f329832a = uVar;
        this.f329833b = provider;
        this.f329834c = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f329832a.get();
        com.avito.konveyor.a aVar2 = this.f329833b.get();
        this.f329834c.getClass();
        com.avito.android.widget_filters.ui.items.g gVar = new com.avito.android.widget_filters.ui.items.g();
        d.f329829a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, gVar);
    }
}
