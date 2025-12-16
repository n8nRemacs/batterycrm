package com.avito.android.tariff_cpt.level_feature.di;

import com.avito.android.tariff_cpt.level_feature.deeplink.TariffCptLevelFeatureLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TariffCptLevelFeatureDeeplinkMappingsModule_ProvideTariffCptLevelFeatureMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final BC0.b f298465a;

    public d(BC0.b bVar) {
        this.f298465a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        BC0.b bVar = this.f298465a;
        c.f298464a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCptLevelFeatureLink.class, new com.avito.android.tariff_cpt.level_feature.deeplink.a(), new C43834a.b.C11809b(bVar));
    }
}
