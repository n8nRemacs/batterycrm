package com.avito.android.tariff_lf.package_info.di;

import com.avito.android.tariff_lf.package_info.deeplink.TariffPackageInfoLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffPackageInfoDeeplinkMappingsModule_ProvideTariffPackageInfoDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf.package_info.deeplink.b f299217a;

    public e(com.avito.android.tariff_lf.package_info.deeplink.b bVar) {
        this.f299217a = bVar;
    }

    public static C43834a a(com.avito.android.tariff_lf.package_info.deeplink.b bVar) {
        d.f299216a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffPackageInfoLink.class, new com.avito.android.tariff_lf.package_info.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffPackageInfoLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f299217a);
    }
}
