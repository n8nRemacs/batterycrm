package com.avito.android.tariff_cpt.info.di;

import com.avito.android.tariff_cpt.info.deeplink.TariffCptInfoLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CptInfoDeeplinkMappingsModule_ProvideTariffCptInfoMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.info.deeplink.b f298163a;

    public b(com.avito.android.tariff_cpt.info.deeplink.b bVar) {
        this.f298163a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.tariff_cpt.info.deeplink.b bVar = this.f298163a;
        a.f298162a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCptInfoLink.class, new com.avito.android.tariff_cpt.info.deeplink.c(), new C43834a.b.C11809b(bVar));
    }
}
