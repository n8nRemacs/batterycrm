package com.avito.android.search.filter.di;

import javax.inject.Provider;

/* compiled from: FiltersCoreModule_ProvideRedesignRecyclerAdapter$_avito_search_filter_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f263270a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f263271b;

    public m(dagger.internal.u uVar, Provider provider) {
        this.f263270a = uVar;
        this.f263271b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f263270a.get();
        com.avito.konveyor.a aVar2 = this.f263271b.get();
        f fVar = f.f263225a;
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
