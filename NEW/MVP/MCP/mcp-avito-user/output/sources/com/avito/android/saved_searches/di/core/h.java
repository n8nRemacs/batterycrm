package com.avito.android.saved_searches.di.core;

import com.avito.android.libs.saved_searches.deeplinks.SearchSubscriptionOpenDeeplink;
import com.avito.android.saved_searches.deeplinks.n;
import com.avito.android.saved_searches.deeplinks.o;
import com.avito.android.saved_searches.deeplinks.p;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SavedSearchDeepLinkHandlerModule_ProvideSearchSubscriptionOpenDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f258364a;

    /* renamed from: b, reason: collision with root package name */
    public final p f258365b;

    /* renamed from: c, reason: collision with root package name */
    public final n f258366c;

    public h(e eVar, p pVar, n nVar) {
        this.f258364a = eVar;
        this.f258365b = pVar;
        this.f258366c = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f258365b.getClass();
        o oVar = new o();
        this.f258364a.getClass();
        return new C43834a(SearchSubscriptionOpenDeeplink.class, oVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SearchSubscriptionOpenDeeplink.class), this.f258366c));
    }
}
