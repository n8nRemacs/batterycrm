package com.avito.android.search.filter.location_filter.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LocationFiltersAdapterModule_ProvideItemBinder$_avito_search_filter_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.adapter.inline_multiselect.a> f263600a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.adapter.select.a> f263601b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.adapter.multiselect.a> f263602c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.adapter.inline_select.b> f263603d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.adapter.switcher.a> f263604e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.search.filter.adapter.segment.c f263605f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.adapter.chips.n> f263606g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.adapter.chips.d> f263607h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.search.filter.adapter.suggest_location.a> f263608i;

    /* renamed from: j, reason: collision with root package name */
    public final u f263609j;

    public f(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, com.avito.android.search.filter.adapter.segment.c cVar, Provider provider6, Provider provider7, Provider provider8, u uVar) {
        this.f263600a = provider;
        this.f263601b = provider2;
        this.f263602c = provider3;
        this.f263603d = provider4;
        this.f263604e = provider5;
        this.f263605f = cVar;
        this.f263606g = provider6;
        this.f263607h = provider7;
        this.f263608i = provider8;
        this.f263609j = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.search.filter.adapter.inline_multiselect.a aVar = this.f263600a.get();
        com.avito.android.search.filter.adapter.select.a aVar2 = this.f263601b.get();
        com.avito.android.search.filter.adapter.multiselect.a aVar3 = this.f263602c.get();
        com.avito.android.search.filter.adapter.inline_select.b bVar = this.f263603d.get();
        com.avito.android.search.filter.adapter.switcher.a aVar4 = this.f263604e.get();
        com.avito.android.search.filter.adapter.segment.b bVar2 = (com.avito.android.search.filter.adapter.segment.b) this.f263605f.get();
        com.avito.android.search.filter.adapter.chips.n nVar = this.f263606g.get();
        com.avito.android.search.filter.adapter.chips.d dVar = this.f263607h.get();
        com.avito.android.search.filter.adapter.suggest_location.a aVar5 = this.f263608i.get();
        com.avito.android.search.filter.adapter.local_priority.a aVar6 = (com.avito.android.search.filter.adapter.local_priority.a) this.f263609j.get();
        int i12 = c.f263596a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(bVar);
        c10493a.b(aVar4);
        c10493a.b(bVar2);
        c10493a.b(nVar);
        c10493a.b(dVar);
        c10493a.b(aVar5);
        c10493a.b(aVar6);
        return c10493a.a();
    }
}
