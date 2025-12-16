package com.avito.android.category.di;

import com.avito.android.deep_linking.links.CategoriesLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CategoriesLinkHandlerModule_ProvideCategoriesLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f116540a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.category.b f116541b;

    public b(a aVar, com.avito.android.category.b bVar) {
        this.f116540a = aVar;
        this.f116541b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.category.b bVar = this.f116541b;
        this.f116540a.getClass();
        return new C43834a(CategoriesLink.class, null, new C43834a.b.C11809b(bVar));
    }
}
