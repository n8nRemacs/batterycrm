package com.avito.android.search.filter.di;

import com.avito.android.search.filter.link.show.FiltersShowLink;
import lv.C43834a;

/* compiled from: FiltersShowLinkModule_ProvideFiltersShowLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.search.filter.link.show.c f263285a;

    public t(com.avito.android.search.filter.link.show.c cVar) {
        this.f263285a = cVar;
    }

    public static C43834a a(com.avito.android.search.filter.link.show.c cVar) {
        s.f263284a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FiltersShowLink.class, new com.avito.android.search.filter.link.show.d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(FiltersShowLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f263285a);
    }
}
