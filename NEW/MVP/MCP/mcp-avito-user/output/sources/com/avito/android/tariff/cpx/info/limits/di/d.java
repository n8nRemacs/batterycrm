package com.avito.android.tariff.cpx.info.limits.di;

import com.avito.android.tariff.cpx.info.limits.deeplink.TariffCpxInfoLimitsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCpxInfoLimitsDeeplinkMappingsModule_ProvideCpxConfigureLandingMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.info.limits.deeplink.c f296592a;

    public d(com.avito.android.tariff.cpx.info.limits.deeplink.c cVar) {
        this.f296592a = cVar;
    }

    public static C43834a a(com.avito.android.tariff.cpx.info.limits.deeplink.c cVar) {
        c.f296591a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCpxInfoLimitsLink.class, new com.avito.android.tariff.cpx.info.limits.deeplink.a(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCpxInfoLimitsLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f296592a);
    }
}
