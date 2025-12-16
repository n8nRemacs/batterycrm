package com.avito.android.developments_agency_search.screen.big_filters.di;

import com.avito.android.developments_agency_search.screen.big_filters.di.m;
import com.avito.android.search.filter.adapter.chips.o;
import com.avito.android.search.filter.adapter.chips.q;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.C49102c;
import ur.InterfaceC49101b;

/* compiled from: BigFiltersModule_ProvideChipsSingleSelectItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f136594a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f136595b;

    public h(u uVar, Provider provider) {
        this.f136594a = uVar;
        this.f136595b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = (q) this.f136594a.get();
        C49102c c49102cG = ((m.b.C4122b) this.f136595b).f136644a.G();
        c.f136585a.getClass();
        return new o(qVar, c49102cG);
    }
}
