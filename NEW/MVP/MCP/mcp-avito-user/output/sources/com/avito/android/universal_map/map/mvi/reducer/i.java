package com.avito.android.universal_map.map.mvi.reducer;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MapViewReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f305681a;

    public i(Provider<j> provider) {
        this.f305681a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f305681a.get());
    }
}
