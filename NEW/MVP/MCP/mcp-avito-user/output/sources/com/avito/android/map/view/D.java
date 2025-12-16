package com.avito.android.map.view;

import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactory;
import com.avito.android.avito_map.resolvers.MarkerAnchorResolver;
import com.avito.android.avito_map.resolvers.MarkerZIndexResolver;
import dY.InterfaceC39638a;
import javax.inject.Provider;

/* compiled from: MapViewInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AvitoMarkerIconFactory> f185354a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC39638a> f185355b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.map_core.view.a> f185356c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<MarkerAnchorResolver> f185357d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<MarkerZIndexResolver> f185358e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f185359f;

    public D(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f185354a = provider;
        this.f185355b = provider2;
        this.f185356c = provider3;
        this.f185357d = provider4;
        this.f185358e = provider5;
        this.f185359f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C(this.f185354a.get(), this.f185355b.get(), this.f185356c.get(), this.f185357d.get(), this.f185358e.get(), (ZX.b) this.f185359f.get());
    }
}
