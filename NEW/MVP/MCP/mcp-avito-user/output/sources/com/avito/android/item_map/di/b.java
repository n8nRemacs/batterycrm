package com.avito.android.item_map.di;

import com.avito.android.deep_linking.links.DevelopmentsCatalogInfrastructureLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;
import oO.C44671b;

/* compiled from: DevelopmentsCatalogInfrastructureLinkHandlerModule_ProvideShowPinMapLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f173316a;

    /* renamed from: b, reason: collision with root package name */
    public final C44671b f173317b;

    public b(a aVar, C44671b c44671b) {
        this.f173316a = aVar;
        this.f173317b = c44671b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C44671b c44671b = this.f173317b;
        this.f173316a.getClass();
        return new C43834a(DevelopmentsCatalogInfrastructureLink.class, null, new C43834a.b.C11809b(c44671b));
    }
}
