package com.avito.android.developments_agency_search.screen.big_filters.di;

import com.avito.android.developments_agency_search.screen.big_filters.di.m;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.C49102c;
import ur.InterfaceC49101b;

/* compiled from: BigFiltersModule_ProvideChipsMultiSelectItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136592a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f136593b;

    public g(u uVar, Provider provider) {
        this.f136592a = uVar;
        this.f136593b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.adapter.chips.g gVar = (com.avito.android.search.filter.adapter.chips.g) this.f136592a.get();
        C49102c c49102cG = ((m.b.C4122b) this.f136593b).f136644a.G();
        c.f136585a.getClass();
        return new com.avito.android.search.filter.adapter.chips.e(gVar, c49102cG);
    }
}
