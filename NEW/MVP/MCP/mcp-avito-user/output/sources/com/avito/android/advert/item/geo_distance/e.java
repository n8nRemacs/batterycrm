package com.avito.android.advert.item.geo_distance;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import x5.InterfaceC49771a;

/* compiled from: AdvertDetailsAddressGeoDistanceInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<DF0.c> f75687a;

    /* renamed from: b, reason: collision with root package name */
    public final u f75688b;

    public e(u uVar, Provider provider) {
        this.f75687a = provider;
        this.f75688b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f75687a.get(), (InterfaceC49771a) this.f75688b.get());
    }
}
