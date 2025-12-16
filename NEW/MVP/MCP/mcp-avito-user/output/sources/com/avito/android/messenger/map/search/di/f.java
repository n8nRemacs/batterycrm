package com.avito.android.messenger.map.search.di;

import androidx.view.P0;
import com.avito.android.messenger.channels.mvi.di.N;
import com.avito.android.messenger.map.search.GeoSearchFragment;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GeoSearchFragmentModule_ProvideGeoSearchInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<com.avito.android.messenger.map.search.h> {

    /* renamed from: a, reason: collision with root package name */
    public final l f196559a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f196560b;

    public f(dagger.internal.f fVar, l lVar) {
        this.f196559a = lVar;
        this.f196560b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        GeoSearchFragment geoSearchFragment = (GeoSearchFragment) this.f196559a.f393949a;
        N n12 = (N) this.f196560b.get();
        int i12 = d.f196558a;
        return (com.avito.android.messenger.map.search.h) new P0(geoSearchFragment, n12).a(com.avito.android.messenger.map.search.l.class);
    }
}
