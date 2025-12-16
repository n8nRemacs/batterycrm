package com.avito.android.saved_searches.presentation.items.info;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchInfoBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f258495a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f258496b;

    public b(d dVar, Provider provider) {
        this.f258495a = dVar;
        this.f258496b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f258495a.getClass();
        return new a(new c(), this.f258496b.get());
    }
}
