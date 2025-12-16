package com.avito.android.saved_searches.presentation.items.banner;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f258429a;

    /* renamed from: b, reason: collision with root package name */
    public final d f258430b;

    public b(l lVar, d dVar) {
        this.f258429a = lVar;
        this.f258430b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Y41.l) this.f258429a.f393949a, (c) this.f258430b.get());
    }
}
