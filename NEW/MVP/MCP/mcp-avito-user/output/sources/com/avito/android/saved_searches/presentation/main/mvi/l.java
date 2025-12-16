package com.avito.android.saved_searches.presentation.main.mvi;

import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SavedSearchMainBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f258706a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.libs.saved_searches.domain.a> f258707b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f258706a = lVar;
        this.f258707b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((SavedSearchParams) this.f258706a.f393949a, this.f258707b.get());
    }
}
