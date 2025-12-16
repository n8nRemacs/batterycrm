package com.avito.android.position_in_search.stats.screen.position_in_search.di;

import com.avito.android.position_in_search.stats.deeplink.SearchPositionDetailsDeepLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SearchPositionDeepLinkModule_ProvideSearchPositionDetailsDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.b f221388a;

    public g(com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.b bVar) {
        this.f221388a = bVar;
    }

    public static C43834a a(com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.b bVar) {
        f.f221387a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SearchPositionDetailsDeepLink.class, new com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SearchPositionDetailsDeepLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f221388a);
    }
}
