package com.avito.android.saved_searches.presentation.items.switcher;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchSwitcherBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f258563a;

    /* renamed from: b, reason: collision with root package name */
    public final h f258564b;

    public b(dagger.internal.l lVar, h hVar) {
        this.f258563a = lVar;
        this.f258564b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Y41.l) this.f258563a.f393949a, (f) this.f258564b.get());
    }
}
