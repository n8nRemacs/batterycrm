package com.avito.android.search_suggest.di;

import com.avito.android.search_suggest.SearchSuggestInternalShowLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SearchSuggestInternalShowLinkModule_ProvideSearchSuggestInternalShowLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.search_suggest.link.c f264219a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.search_suggest.link.f f264220b;

    public f(com.avito.android.search_suggest.link.c cVar, com.avito.android.search_suggest.link.f fVar) {
        this.f264219a = cVar;
        this.f264220b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f264220b.getClass();
        com.avito.android.search_suggest.link.e eVar = new com.avito.android.search_suggest.link.e();
        com.avito.android.search_suggest.link.c cVar = this.f264219a;
        e.f264218a.getClass();
        return new C43834a(SearchSuggestInternalShowLink.class, eVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SearchSuggestInternalShowLink.class), cVar));
    }
}
