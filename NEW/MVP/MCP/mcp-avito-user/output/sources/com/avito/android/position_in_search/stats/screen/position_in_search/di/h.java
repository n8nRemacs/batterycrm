package com.avito.android.position_in_search.stats.screen.position_in_search.di;

import com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.SearchPositionSortDeepLink;
import com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.i;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SearchPositionDeepLinkModule_ProvideSearchPositionSortDeepLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.f f221389a;

    public h(com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.f fVar) {
        this.f221389a = fVar;
    }

    public static C43834a a(com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.f fVar) {
        f.f221387a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SearchPositionSortDeepLink.class, new i(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SearchPositionSortDeepLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f221389a);
    }
}
