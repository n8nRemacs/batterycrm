package com.avito.android.search.filter.di;

import com.avito.android.search.filter.link.apply.FiltersApplyLink;
import lv.C43834a;

/* compiled from: FiltersApplyLinkModule_ProvideFiltersApplyLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.search.filter.link.apply.b f263224a;

    public d(com.avito.android.search.filter.link.apply.b bVar) {
        this.f263224a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.search.filter.link.apply.b bVar = this.f263224a;
        c.f263223a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FiltersApplyLink.class, new com.avito.android.search.filter.link.apply.e(), new C43834a.b.C11809b(bVar));
    }
}
