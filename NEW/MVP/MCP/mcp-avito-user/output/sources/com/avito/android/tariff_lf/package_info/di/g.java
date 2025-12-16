package com.avito.android.tariff_lf.package_info.di;

import com.avito.android.tariff_lf.package_info.deeplink.TariffPackageInfoLink;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.m0;

/* compiled from: TariffPackageInfoFragmentMappingsModule_ProvideTariffPackageInfoFragmentMappingFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<A50.a> {

    /* compiled from: TariffPackageInfoFragmentMappingsModule_ProvideTariffPackageInfoFragmentMappingFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f299219a = new g();
    }

    public static g a() {
        return a.f299219a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f.f299218a.getClass();
        return new A50.a(m0.f406844a.b(TariffPackageInfoLink.class), new com.avito.android.tariff_lf.package_info.d());
    }
}
