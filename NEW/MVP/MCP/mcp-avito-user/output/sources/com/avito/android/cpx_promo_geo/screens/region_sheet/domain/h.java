package com.avito.android.cpx_promo_geo.screens.region_sheet.domain;

import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ns.InterfaceC44470a;

/* compiled from: RegionSheetSearchUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f128318a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC44470a> f128319b;

    /* renamed from: c, reason: collision with root package name */
    public final l f128320c;

    /* renamed from: d, reason: collision with root package name */
    public final u f128321d;

    public h(l lVar, u uVar, Provider provider, Provider provider2) {
        this.f128318a = provider;
        this.f128319b = provider2;
        this.f128320c = lVar;
        this.f128321d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f128318a.get(), this.f128319b.get(), (String) this.f128320c.f393949a, (com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a) this.f128321d.get());
    }
}
