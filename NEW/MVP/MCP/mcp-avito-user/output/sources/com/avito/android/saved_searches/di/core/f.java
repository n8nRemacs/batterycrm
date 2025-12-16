package com.avito.android.saved_searches.di.core;

import com.avito.android.libs.saved_searches.deeplinks.SavedSearchLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SavedSearchDeepLinkHandlerModule_ProvideSavedSearchDeepLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f258359a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.saved_searches.deeplinks.g f258360b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.saved_searches.deeplinks.d f258361c;

    public f(e eVar, com.avito.android.saved_searches.deeplinks.g gVar, com.avito.android.saved_searches.deeplinks.d dVar) {
        this.f258359a = eVar;
        this.f258360b = gVar;
        this.f258361c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f258360b.getClass();
        com.avito.android.saved_searches.deeplinks.f fVar = new com.avito.android.saved_searches.deeplinks.f();
        this.f258359a.getClass();
        return new C43834a(SavedSearchLink.class, fVar, new C43834a.b.C11809b(this.f258361c));
    }
}
