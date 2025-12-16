package com.avito.android.search.filter.di;

import androidx.recyclerview.widget.C;
import javax.inject.Provider;

/* compiled from: FiltersCoreModule_ProvideRedesignDataAwareAdapterPresenter$_avito_search_filter_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f263237a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f263238b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f263239c;

    public j(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f263237a = provider;
        this.f263238b = provider2;
        this.f263239c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f263237a.get();
        com.avito.konveyor.adapter.a aVar = this.f263238b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f263239c.get();
        f fVar = f.f263225a;
        return new com.avito.android.recycler.data_aware.d(dagger.internal.l.a(c12), aVar, eVar);
    }
}
