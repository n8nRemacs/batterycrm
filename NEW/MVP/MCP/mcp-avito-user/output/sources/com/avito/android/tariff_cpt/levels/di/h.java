package com.avito.android.tariff_cpt.levels.di;

import com.avito.android.tariff_cpt.levels.deeplink.TariffCptLevelSaveV3Link;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCptLevelsMappingsModule_ProvideTariffCptLevelSaveV3DeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.levels.deeplink.f f298600a;

    public h(com.avito.android.tariff_cpt.levels.deeplink.f fVar) {
        this.f298600a = fVar;
    }

    public static C43834a a(com.avito.android.tariff_cpt.levels.deeplink.f fVar) {
        g.f298599a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCptLevelSaveV3Link.class, new com.avito.android.tariff_cpt.levels.deeplink.g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(TariffCptLevelSaveV3Link.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f298600a);
    }
}
