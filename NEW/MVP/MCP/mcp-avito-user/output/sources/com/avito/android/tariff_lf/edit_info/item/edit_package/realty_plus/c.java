package com.avito.android.tariff_lf.edit_info.item.edit_package.realty_plus;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RealtyPlusEditPackageItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298946a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f298947b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f298948c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f298946a = uVar;
        this.f298947b = provider;
        this.f298948c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f298946a.get(), this.f298947b.get(), this.f298948c.get());
    }
}
