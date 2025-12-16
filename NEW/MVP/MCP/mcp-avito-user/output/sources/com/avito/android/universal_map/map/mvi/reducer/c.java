package com.avito.android.universal_map.map.mvi.reducer;

import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContextDependenciesImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map.common.marker.j> f305677a;

    /* renamed from: b, reason: collision with root package name */
    public final u f305678b;

    public c(u uVar, Provider provider) {
        this.f305677a = provider;
        this.f305678b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f305677a.get(), (AvitoMarkerIconFactory) this.f305678b.get());
    }
}
