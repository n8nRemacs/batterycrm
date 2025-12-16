package com.avito.android.universal_map.map.mvi.actor;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PointInfoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map_mvi.domain.k> f305351a;

    public h(Provider<com.avito.android.universal_map.map_mvi.domain.k> provider) {
        this.f305351a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f305351a.get());
    }
}
