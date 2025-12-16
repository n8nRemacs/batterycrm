package com.avito.android.saved_searches.di.core;

import com.avito.android.saved_searches.deeplinks.SearchSubscriptionControlLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;
import lv.C43834a;

/* compiled from: SavedSearchDeepLinkHandlerModule_ProvideSearchSubscriptionControlDeeplinkLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f258362a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.saved_searches.deeplinks.i f258363b;

    public g(e eVar, com.avito.android.saved_searches.deeplinks.i iVar) {
        this.f258362a = eVar;
        this.f258363b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f258363b.getClass();
        com.avito.android.saved_searches.deeplinks.h hVar = new com.avito.android.saved_searches.deeplinks.h();
        this.f258362a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        kotlin.reflect.d dVarB = m0.f406844a.b(SearchSubscriptionControlLink.class);
        c11807a.getClass();
        return C43834a.C11807a.a(dVarB, hVar);
    }
}
