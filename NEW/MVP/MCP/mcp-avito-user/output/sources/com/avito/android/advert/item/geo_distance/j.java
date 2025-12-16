package com.avito.android.advert.item.geo_distance;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import x5.InterfaceC49771a;

/* compiled from: AdvertDetailsAddressGeoDistanceItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class j implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f75706a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.component.toast.util.c> f75707b;

    /* renamed from: c, reason: collision with root package name */
    public final e f75708c;

    /* renamed from: d, reason: collision with root package name */
    public final n f75709d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC49771a> f75710e;

    public j(Provider provider, Provider provider2, e eVar, n nVar, Provider provider3) {
        this.f75706a = provider;
        this.f75707b = provider2;
        this.f75708c = eVar;
        this.f75709d = nVar;
        this.f75710e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f75706a.get();
        com.avito.android.component.toast.util.c cVar = this.f75707b.get();
        c cVar2 = (c) this.f75708c.get();
        this.f75709d.getClass();
        return new g(aVar, cVar, cVar2, new m(), this.f75710e.get());
    }
}
