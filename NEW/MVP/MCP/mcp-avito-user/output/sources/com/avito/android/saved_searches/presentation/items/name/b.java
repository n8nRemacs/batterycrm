package com.avito.android.saved_searches.presentation.items.name;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.T;

/* compiled from: SavedSearchNameBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f258511a;

    /* renamed from: b, reason: collision with root package name */
    public final l f258512b;

    /* renamed from: c, reason: collision with root package name */
    public final l f258513c;

    /* renamed from: d, reason: collision with root package name */
    public final d f258514d;

    public b(Provider provider, l lVar, l lVar2, d dVar) {
        this.f258511a = provider;
        this.f258512b = lVar;
        this.f258513c = lVar2;
        this.f258514d = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = this.f258511a.get();
        T t12 = (T) this.f258512b.f393949a;
        Y41.l lVar = (Y41.l) this.f258513c.f393949a;
        this.f258514d.getClass();
        return new a(aVar, t12, lVar, new c());
    }
}
