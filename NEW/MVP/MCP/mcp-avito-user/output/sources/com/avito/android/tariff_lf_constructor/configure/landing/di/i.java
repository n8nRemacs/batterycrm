package com.avito.android.tariff_lf_constructor.configure.landing.di;

import com.avito.android.tariff_lf_constructor.configure.landing.deeplink.TariffConfigureLandingLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffConstructorLandingMappingModule_ProvideTariffConstructorLandingHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_lf_constructor.configure.landing.deeplink.b f299680a;

    public i(com.avito.android.tariff_lf_constructor.configure.landing.deeplink.b bVar) {
        this.f299680a = bVar;
    }

    public static C43834a a(com.avito.android.tariff_lf_constructor.configure.landing.deeplink.b bVar) {
        h.f299679a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffConfigureLandingLink.class, new com.avito.android.tariff_lf_constructor.configure.landing.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffConfigureLandingLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f299680a);
    }
}
