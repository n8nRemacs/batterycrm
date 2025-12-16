package com.avito.android.tariff_cpt.info.di;

import com.avito.android.tariff_cpt.info.deeplink.TariffCptInfoMonthsLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CptInfoDeeplinkMappingsModule_ProvideTariffCptInfoMonthsMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.info.deeplink.f f298164a;

    public c(com.avito.android.tariff_cpt.info.deeplink.f fVar) {
        this.f298164a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff_cpt.info.deeplink.f fVar = this.f298164a;
        a.f298162a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCptInfoMonthsLink.class, new com.avito.android.tariff_cpt.info.deeplink.i(), new C43834a.b.C11809b(fVar));
    }
}
