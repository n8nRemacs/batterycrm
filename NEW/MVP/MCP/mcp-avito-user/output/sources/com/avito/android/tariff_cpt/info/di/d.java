package com.avito.android.tariff_cpt.info.di;

import com.avito.android.tariff_cpt.info.deeplink.TariffCptInfoRefreshLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CptInfoDeeplinkMappingsModule_ProvideTariffCptInfoRefreshMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.tariff_cpt.info.deeplink.k f298165a;

    public d(com.avito.android.tariff_cpt.info.deeplink.k kVar) {
        this.f298165a = kVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.f298162a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(TariffCptInfoRefreshLink.class, new com.avito.android.tariff_cpt.info.deeplink.l(), new C43834a.b.C11809b(this.f298165a));
    }
}
