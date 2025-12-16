package com.avito.android.tariff_cpt.levels.di;

import com.avito.android.cpt.TariffCptLevelsLinkV3;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCptLevelsMappingsModule_ProvideTariffCptLevelsV3DeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.levels.deeplink.k f298601a;

    public i(com.avito.android.tariff_cpt.levels.deeplink.k kVar) {
        this.f298601a = kVar;
    }

    public static C43834a a(com.avito.android.tariff_cpt.levels.deeplink.k kVar) {
        g.f298599a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCptLevelsLinkV3.class, new com.avito.android.tariff_cpt.levels.deeplink.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCptLevelsLinkV3.class), kVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f298601a);
    }
}
