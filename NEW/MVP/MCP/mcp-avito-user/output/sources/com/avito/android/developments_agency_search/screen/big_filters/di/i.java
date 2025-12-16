package com.avito.android.developments_agency_search.screen.big_filters.di;

import com.avito.android.search.filter.adapter.double_input.C34543b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BigFiltersModule_ProvideDoubleInputItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136596a;

    public i(u uVar) {
        this.f136596a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.adapter.double_input.u uVar = (com.avito.android.search.filter.adapter.double_input.u) this.f136596a.get();
        c.f136585a.getClass();
        return new C34543b(uVar);
    }
}
