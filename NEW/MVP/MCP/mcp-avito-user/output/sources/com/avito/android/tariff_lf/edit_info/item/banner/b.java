package com.avito.android.tariff_lf.edit_info.item.banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffUpsellBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f298890a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f298891b;

    public b(u uVar, Provider provider) {
        this.f298890a = uVar;
        this.f298891b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f298890a.get(), this.f298891b.get());
    }
}
