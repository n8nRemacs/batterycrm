package com.avito.android.search.filter.di;

import androidx.recyclerview.widget.C;

/* compiled from: FiltersCoreModule_ProvideRedesignListUpdateCallback$_avito_search_filter_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f263269a;

    public l(dagger.internal.u uVar) {
        this.f263269a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f263269a.get();
        f fVar = f.f263225a;
        return jVar;
    }
}
