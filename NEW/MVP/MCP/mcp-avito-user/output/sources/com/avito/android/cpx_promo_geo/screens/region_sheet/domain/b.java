package com.avito.android.cpx_promo_geo.screens.region_sheet.domain;

import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ns.InterfaceC44470a;

/* compiled from: GetRegionSheetSubLocationsUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f128290a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44470a> f128291b;

    /* renamed from: c, reason: collision with root package name */
    public final l f128292c;

    public b(l lVar, Provider provider, Provider provider2) {
        this.f128290a = provider;
        this.f128291b = provider2;
        this.f128292c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f128290a.get(), (String) this.f128292c.f393949a, this.f128291b.get());
    }
}
