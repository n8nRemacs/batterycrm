package com.avito.android.item_map.view;

import javax.inject.Provider;
import pO.InterfaceC46983a;

/* compiled from: ItemMapViewBottomSheetAdapter_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class T implements dagger.internal.h<S> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC46983a> f173535a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.item_map.amenity.h> f173536b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.item_map.routes.k> f173537c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f173538d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.important_addresses.presentation.c f173539e;

    /* renamed from: f, reason: collision with root package name */
    public final cv.e f173540f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.util.W f173541g;

    public T(Provider provider, Provider provider2, Provider provider3, Provider provider4, com.avito.android.important_addresses.presentation.c cVar, cv.e eVar, com.avito.android.util.W w12) {
        this.f173535a = provider;
        this.f173536b = provider2;
        this.f173537c = provider3;
        this.f173538d = provider4;
        this.f173539e = cVar;
        this.f173540f = eVar;
        this.f173541g = w12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new S(this.f173535a.get(), this.f173536b.get(), this.f173537c.get(), this.f173538d.get(), (JM.c) this.f173539e.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f173540f.get(), (com.avito.android.util.U) this.f173541g.get());
    }
}
